
import java.util.ArrayList;


public class C206_CaseStudy {
	ArrayList<Members> memberList = new ArrayList<Members>();
	private static C206_CaseStudy run = new C206_CaseStudy();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run.start();
		
		int option = Helper.readInt("Selection Option > ");
		
		while (option != 6) {
			if(option == 1) {
				
				Helper.line(30, "=");
				System.out.println("Member Management");
				Helper.line(30, "=");
				System.out.println("Option 1 - Add Member Account");
				System.out.println("Option 2 - View Member Account");
				System.out.println("Option 3 - Delete Member Account");
				System.out.println("Option 4 - Return");
				
				int select = Helper.readInt("Selection Option > ");
						
				if(select == 1) {
					run.doAddMembers();
				}
				else if(select == 2) {
					run.doViewMembers();
				}
				else if(select == 3) {
						//Delete Function
				}
				
					
				
					
					
			}
		}
	}

	// MEMBER 1 - HIDIR
	
	public void start() {
			System.out.println("===========================");
			System.out.println("Course Management");
			System.out.println("===========================");
			System.out.println("Option 1 - Add Members");
			System.out.println("Option 2 - Add Course Category");
			System.out.println("Option 3 - Add Course");
			System.out.println("Option 4 - Add Course Schedule");
			System.out.println("Option 5 - Register for a course Schedule");
			
			
	}

	public void doAddMembers(){
		String name = Helper.readString("Add Name : ");
		String gender = Helper.readString("Enter Gender (Male/Female) : ");
		int mobile = Helper.readInt("Enter Mobile : ");
		String email = Helper.readString("Enter Email: ");
		String dob = Helper.readString("Enter Date of Birth(DD/MM/YYYY) : ");
		String country = Helper.readString("Enter Country: ");
		
		for(Members user : memberList) {
			if(user.getEmail().equalsIgnoreCase(email)) {
				System.out.println("The email is already in use. Please enter again.");
				email = Helper.readString("Enter Email: ");
			}
		}
		
		Members addition = new Members(name, gender, mobile, email, dob, country);
		memberList.add(addition);
	}
	
	public void doViewMembers() {
		String output = "";
		
		output += String.format("%-12s %-6s %-9s %-17s %-9s %s\n", "NAME","GENDER","MOBILE","EMAIL","DOB","COUNTRY");
		
		for(Members i : memberList) {
			output += i.toString();
		}
		System.out.println(output);
	}
	
		
	
	//MEMBER 2
	
	
	
	
	
	
	//MEMBER 3
	
	
	
	
	
	//MEMBER 4 - Haziq Hilman
	
	
	
	
	
	
	//MEMBER 5
		

}
