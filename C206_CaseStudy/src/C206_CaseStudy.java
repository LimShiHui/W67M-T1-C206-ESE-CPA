import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject subject1 = new subject(1, "English");
		subject subject2 = new subject(2, "Mathematics");
		subject subject3 = new subject(3, "Pure Biology");
		subject subject4 = new subject(4, "Pure Chemistry");
		subject subject5 = new subject(5, "Pure Physics");
		subject subject6 = new subject(6, "Mothertongue");
		ArrayList<subject> subjectlist = new ArrayList<subject>();
		subjectlist.add(subject1);
		subjectlist.add(subject2);
		subjectlist.add(subject3);
		subjectlist.add(subject4);
		subjectlist.add(subject5);
		subjectlist.add(subject6);

		user user = new user("user", "test", "student", "test@gmail.com", "test123"); // username is user,
																						// password is
																						// test123
		boolean tocontinue = true;
		while (tocontinue) {
			C206_CaseStudy.loginMenu();
			int options = Helper.readInt("Enter choice > ");
			switch (options) {
			case 1:
				System.out.println("Career Planning Application - REGISTRATION");
				user updateduser = user;
				String rMail = Helper.readString("Enter email > ");
				String rName = Helper.readString("Enter new username > ");
				String rPassword = Helper.readString("Enter new password > ");
				updateduser.setUsername(new String(rName));
				updateduser.setPassword(new String(rPassword));
				break;
			case 2:
				String uName = Helper.readString("Enter username > ");
				String uPassword = Helper.readString("Enter password > ");
				boolean isUser = C206_CaseStudy.userLogin(user, uName, uPassword);
				if (isUser == false) {

					System.out.println("Either your username or password was incorrect. Please try again!");
					break;

				}

				while (isUser) {
					C206_CaseStudy.MainMenu();
					int choice = Helper.readInt("Enter choice > ");
					switch (choice) {
					case 1:
						break;
					case 2:
						C206_CaseStudy.SMenu();
						int subjectOptions = Helper.readInt("Enter choice > ");
						switch (subjectOptions) {
						case 1:
							int subjectId = Helper.readInt("Enter subject ID > ");
							String subjectName = Helper.readString("Enter the subject you want to add > ");
							subject newsubject = new subject(subjectId, subjectName);
							boolean result = C206_CaseStudy.addSubject(subjectlist, newsubject);
							if (result == true) {
								System.out.println("Subject added!");
							} else {
								System.out.println("Subject not added!");
							}
							break;
						case 2:
							String allsubjects = C206_CaseStudy.subjectListToString(subjectlist);
							System.out.println(allsubjects);
							break;
						case 3:
							String deleteSubjectName = Helper.readString("Enter subject you would like to delete > ");
							String subjectdetails = C206_CaseStudy.getSubject(subjectlist, deleteSubjectName);
							if (!subjectdetails.isEmpty()) {
								System.out.println(subjectdetails);
								char toDelete = Helper.readChar("Do you wish to delete this subject?(y/n) > ");
								switch (toDelete) {
								case 'y':
									boolean deleted = C206_CaseStudy.removeSubject(subjectlist, deleteSubjectName);
									if (deleted == true) {
										System.out.println(String.format("Subject %s was deleted successfully.",
												deleteSubjectName));
									} else {
										System.out.println("Something went wrong, subject was not deleted.");
									}
								case 'n':
									break;
								}

							} else {
								System.out.println("That subject does not exist!");
							}
							break;
						case 4:
							break;
						}
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						isUser = false;
						System.out.println("Goodbye!");
						break;
					}

				}

			}
		}
	}

	public static user register(user user) {
		user updateduser = user;
		String rName = Helper.readString("Enter username > ");
		String rPassword = Helper.readString("Enter password > ");
		updateduser.setUsername(new String(rName));
		updateduser.setPassword(new String(rPassword));

		return updateduser;
	}

	public static void loginMenu() {
		System.out.println("1. Register");
		System.out.println("2. Login");
	}

	public static void MainMenu() {

		Helper.line(20, "-");
		System.out.println("Main Menu");
		Helper.line(20, "-");
		System.out.println("Welcome! \nWhat would you like to do?");
		System.out.println("1. View pre-requisite information");
		System.out.println("2. View my subjects or add new ones");
		System.out.println("3. View pathways");
		System.out.println("4. Account Settings");
		System.out.println("5. Search");
		System.out.println("6. Log out");

	}

	public static void SMenu() {

		System.out.println("1. Add subject");
		System.out.println("2. View my subjects");
		System.out.println("3. Delete subject");
		System.out.println("4. Return back to main menu");

	}

	public static boolean userLogin(user user, String uName, String uPassword) {

		if (user.getUserid().equals(uName) && user.getPassword().equals(uPassword)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean addSubject(ArrayList<subject> subjectlist, subject subject) {

		if (subject.getSubjectName() != null) {
			if (!subject.getSubjectName().isEmpty()) {
				subjectlist.add(subject);
				return true;
			}
		}
		return false;
	}

	public static String subjectListToString(ArrayList<subject> subjectlist) {

		String output = "";
		output += String.format("%-10s\n", "LIST OF SUBJECTS");
		for (int i = 0; i < subjectlist.size(); i++) {
			output += String.format("%-10s\n", subjectlist.get(i).getSubjectName());
		}
		return output;
	}

	public static boolean removeSubject(ArrayList<subject> subjectlist, String subjectname) {

		for (int i = 0; i < subjectlist.size(); i++) {
			if (subjectlist.get(i).getSubjectName() == subjectname) {
				subjectlist.remove(i);
				return true;
			}

		}
		return false;
	}

	public static String getSubject(ArrayList<subject> subjectlist, String subjectnames) {

		String output = "";

		for (int i = 0; i < subjectlist.size(); i++) {
			subject s = subjectlist.get(i);

			if (s.getSubjectName() == subjectnames) {
				output += String.format("%-10s\n", "Subject");
				output += String.format("%-10s\n", s.getSubjectName());
				break;
			}
		}

		return output;
	}

}

//Welcome! 
//A
//Are you a new student?
//1. Yes, I want to learn more about my future pathways
//2. No, I'm already a member
//Enter choice > 1 // take user to B.1
//Enter choice > 2 // take user to B.2
//
////B.1
//Great, let's register
// name > Eng Lim
//Email > englim@gmail.com
//Password > XXX123
//Verify password > XXX123 // remember to check password/verify password are the same! // take user to C.1
//
////B.2
//Please login
//Enter email > englim@gmail.com
//Enter password > XXX123
////if user exists and details are incorrect, take user to B.3 otherwise go to B.5
//
////B.3
//Your email exists but the password you've entered was incorrect
//enter password > XXX123
//
////B.4
//Your email or password is incorrect, please try again // take user back to B.2
//
////B.5.
//Welcome back Eng Lim,
//What would you like to do?
//1. Add or change my prerequisites
//2. View my subjects or add new ones
//3. Search for careers
//> Enter choice 
//
////C.1
//Can you confirm the following details are correct?
//My name is Eng Lim
//My email address is englim@gmail.com
//I am a student
//
//1. Yes, the details are correct // take user to D.1
//2. No, please let me re-enter // take user to B.1
//> Enter choice
//
////D.1
//Thanks Eng Lim,
//Please enter the subjects you are studying or plan to study...
//You can note multiple subjects by typing "1,5,6,4" without the " symbols
//1. Physics      | 6. English
//2. Maths        | 7. Drama
//3. Biology      | 8. History
//4. Chemistry    | 9. Geography
//5. Art          | 10. IT
//Enter subjects > 1 // take user to D.2
//Enter subjects > 10, 2 // take user to D.3
//
////D.2
//You only selected Physics, do you want to add more subjects?
//1. Yes, add Physics and I'll add more // take user to D.1
//2. No, add Physics and I've finished adding my subjects // take user to D.4 (Non-existent)
//3. No, I made a mistake, let me choose a different subject. // take user to D.1
//Enter choice > 
//
////D.3
//You selected multiple subjects, do you want to add more subjects?
//Subjects selected:
//IT, Maths
//1. Yes, I want add more subjects // take user to D.1
//2. No, those are the only subjects // take user to D.4
//Enter choice >