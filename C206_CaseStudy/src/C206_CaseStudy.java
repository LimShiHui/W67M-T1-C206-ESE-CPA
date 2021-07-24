public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user user = new user("user", "test", "student", "test@gmail.com", "test123"); // username is user, password is
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
					case 4:
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
		System.out.println("1. Add or change my prerequisites");
		System.out.println("2. View my subjects or add new ones");
		System.out.println("3. Search for careers");
		System.out.println("4. Log out");

	}

	public static boolean userLogin(user user, String uName, String uPassword) {

		if (user.getUserid().equals(uName) && user.getPassword().equals(uPassword)) {
			return true;
		} else {
			return false;
		}

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