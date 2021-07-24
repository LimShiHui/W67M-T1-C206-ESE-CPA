public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String options = Helper.readString("\nCareer Planning Application\n \nAre you a member? (Y/N)");
			if (options == "N") {

			}
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
//Great, let me know about you so you can login again!
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