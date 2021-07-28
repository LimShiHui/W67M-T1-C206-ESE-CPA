import java.util.ArrayList;

public class CPA_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userOption=-1;
		ArrayList<user> userList = new ArrayList<user>();
		
		
		while (userOption!=0) { //user did not chose exit
			CPA_Main.MainMenu();//Print main menu
			userOption=Helper.readInt("Enter your option: ");
			Helper.line(30, "-");

			
			if (userOption==1) { //add new user account
				int userID=Helper.readInt("Enter your id: ");
				String userName=Helper.readString("Enter user name: ");
				String userRole=Helper.readString("Enter user role: ");
				String userEmail=Helper.readString("Enter email: ");
				String userPassword=Helper.readString("Enter user password: ");
				
				user newUser=new user(userID,userName,userRole,userEmail,userPassword);
				
				
				
				if (newUser.getUserid()!=0 && !newUser.getName().isEmpty() &&!newUser.getRole().isEmpty() && !newUser.getemail().isEmpty() && !newUser.getPassword().isEmpty()) {
					userList.add(newUser);
					System.out.println("Account has been created");	
					
				}else {
					System.out.println("You did not fill up all required field, add acount failed.");	
				}
			}
			
			else if (userOption == 2) { // add new academic cluster 
				
			}
			
			else if (userOption == 3) { // add new career information
				int careerId = Helper.readInt("Enter ID of career: ");
				String careerName = Helper.readString("Enter the name of career: ");
				String careerInfo = Helper.readString("Enter the information of the career: ");
				
				
				
				if (careerId != 0 && !careerName.isEmpty() && !careerInfo.isEmpty()) {
					career newCareer = new career(careerId, careerName, careerInfo);
					System.out.println("New career has been added successfully");
				} else {
					System.out.println("Unsuccessful adding. All input is required. Please try again");
				}
			} 
			
			else if (userOption == 4) { // add new subject
				
			}
			
			else if (userOption == 5) { // add new pathway
				
			}
			
			else if (userOption == 6) { // add new career information
				
			}
			
			else if(userOption==7) { // show all user
				if (userList.size()>0) {
					for(int i=0;i<userList.size();i++) {
						System.out.println("User no. "+i);
						userList.get(i).showAlluser();
						Helper.line(30, "-");
					}
					
					
				}else {
					System.out.println("There is no user in the account list.");

				}
			}
			else if(userOption==0) {
				System.out.println("Goodbye!");
				
			}
			else {
				System.out.println("Invalid option");
			}
		}
		
		
		

	}
	public static void MainMenu() {

		Helper.line(30, "-");
		System.out.println("CARERR PLANNING APPLICATION - MAIN");
		Helper.line(30, "-");

		// can add on if needed 
		System.out.println("1. Add new user account");
		System.out.println("2. Add new academic cluster");
		System.out.println("3. Add new career information");
		System.out.println("4. Add new subject");
		System.out.println("5. Add new prerequisites");
		System.out.println("6. Add new pathway");
		System.out.println("7. Show all user");
		System.out.println("8. Show all academic cluster");
		System.out.println("0. Exit");
		Helper.line(30, "-");

	}

}
