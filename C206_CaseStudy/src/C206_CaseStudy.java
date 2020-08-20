
import java.util.ArrayList;


public class C206_CaseStudy {
	ArrayList<Members> memberList = new ArrayList<Members>();
	ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
	ArrayList<CourseSchedule> scheduleList = new ArrayList<CourseSchedule>();
	private static C206_CaseStudy run = new C206_CaseStudy();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run.start();
		
		int option = Helper.readInt("Selection Option > ");
		
		while (option != 7) {
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
				
					
				
					
					
			}else if(option==2) {
				
				
			}else if(option==3) {
				
			}else if(option==4) {
				Helper.line(30, "=");
				System.out.println("Course Schedule Management");
				Helper.line(30, "=");
				System.out.println("Option 1 - Add Course Schedule");
				System.out.println("Option 2 - View Course Schedule");
				System.out.println("Option 3 - Delete Course Schedule");
				System.out.println("Option 4 - Return");
				
				int select = Helper.readInt("Selection Option > ");
						
				if(select == 1) {
					run.doAddCourseSchedule();
				}
				else if(select == 2) {
					run.viewCourseSchedule();
				}
				else if(select == 3) {
					run.deleteCourseSchedule();
				}else {
					run.start();
					
				}
			}else if(option==5) {
				
			}else {
				System.out.println("Session End.");
			}
		}
	}

	// MEMBER 1 - HIDIR
	
	public void start() {
			System.out.println("===========================");
			System.out.println("Course Management");
			System.out.println("===========================");
			System.out.println("Option 1 - Members");
			System.out.println("Option 2 - Course Category");
			System.out.println("Option 3 - Course");
			System.out.println("Option 4 - Course Schedule");
			System.out.println("Option 5 - Register for a course Schedule");
			System.out.println("Option 6 - End");
			
			
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
	public void doAddCourseCategory(){
		String categoryName = Helper.readString("Enter category name > ");
		String categoryDescription = Helper.readString("Enter category description > ");
		
		for (CourseCategory category:categoryList) {
			if (categoryName.equalsIgnoreCase(category.getCategoryName())) {
				System.out.println("The category name is already exist.");
				categoryName = Helper.readString("Enter category name > ");
			}
		}
		
		CourseCategory newCategory = new CourseCategory(categoryName,categoryDescription);
		categoryList.add(newCategory);
	}
	
	public void viewCourseCategory() {
		String output = String.format("%s %s", "Course Category Name","Course Category Description");
		
		for(CourseCategory category : categoryList) {
			output += String.format("%s %s", category.getCategoryName(),category.getCategoryDescription());
		}
		System.out.println(output);
	}
	
	public void deleteCourseCategory() {
		String deleteCategory = Helper.readString("Name of category to delete > ");
		
		for (CourseCategory category:categoryList) {
			if (deleteCategory.equalsIgnoreCase(category.getCategoryName())) {
				categoryList.remove(category);
			}
		}
	}
	
	//MEMBER 3
	
	
	
	
	
	//MEMBER 4 - Haziq Hilman
	public void doAddCourseSchedule(){
		int scheduleID = Helper.readInt("Enter course schedule id > ");
		double price = Helper.readInt("Enter course  price > ");
		String startDateTime = Helper.readString("Enter start date and time(DD/MM/YYYY 00:00) >");
		String endDateTime = Helper.readString("Enter end date and time(DD/MM/YYYY 00:00) >");
		String location = Helper.readString("Enter Course location > ");
		
		for (CourseSchedule schedule:scheduleList) {
			if (scheduleID == schedule.getId()) {
				System.out.println("This course schedule is already exist.");
				run.doAddCourseSchedule();
			}
		}
		
		CourseSchedule newSchedule = new CourseSchedule(scheduleID,price,startDateTime,endDateTime,location);
		scheduleList.add(newSchedule);
	}
	
	public void viewCourseSchedule() {
		String output = String.format("%s %5s %10s %10s %5s", "Schedule ID","Price","Start Date & Time","End Date & Time","Location");
		
		for(CourseSchedule schedule:scheduleList) {
			output += String.format("\n %d %5f %10s %10s %s", schedule.getId(),schedule.getPrice(),schedule.getstartDateTime(),schedule.getendDateTime(),schedule.getLocation());
		}
		System.out.println(output);
	}
	
	public void deleteCourseSchedule() {
		viewCourseSchedule();
		int deleteSchedule = Helper.readInt("ID of schedule to delete > ");
		
		for (CourseSchedule schedule:scheduleList) {
			if (deleteSchedule == schedule.getId()) {
				scheduleList.remove(schedule);
			}else {
				System.out.println("ID does not exist!");
			}
		}
	}
	
	
	
	
	
	//MEMBER 5
		

}
