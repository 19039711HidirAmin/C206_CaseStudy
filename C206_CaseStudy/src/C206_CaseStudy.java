
import java.util.ArrayList;

public class C206_CaseStudy {
	ArrayList<Members> memberList = new ArrayList<Members>();
	ArrayList<Course> courseList = new ArrayList<Course>();
	ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
	ArrayList<CourseSchedule> scheduleList = new ArrayList<CourseSchedule>();
	private static C206_CaseStudy run = new C206_CaseStudy();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		while (option != 6) {
			
			run.start();
			option = Helper.readInt("Select Option > ");
			
			
			//MEMBER 1 OPTIONS HIDIR
			if(option == 1) {
				int a_option = 0;
				while (a_option != 4) {
				
				Helper.line(30, "=");
				System.out.println("Member Management");
				Helper.line(30, "=");
				System.out.println("Option 1 - Add Member Account");
				System.out.println("Option 2 - View Member Account");
				System.out.println("Option 3 - Delete Member Account");
				System.out.println("Option 4 - Return");	
				
				a_option = Helper.readInt("Select Option > ");
				
				if (a_option == 1) {
					run.doAddMembers();
					
				}
				else if(a_option == 2) {
					run.doViewMembers();
					
				}
				else if (a_option == 4) {
					System.out.println("Thank you!");
				}
				
				}
				
					
			}
			// MEMBER 2 OPTIONS
			if(option == 2) {
				int a_option = 0;
				while (a_option != 4) {
					Helper.line(30, "=");
					System.out.println("Course Category Management");
					Helper.line(30, "=");
					System.out.println("Option 1 - Add Course Category");
					System.out.println("Option 2 - View Course Category");
					System.out.println("Option 3 - Delete Course Category");
					System.out.println("Option 4 - Return");	
					
					a_option = Helper.readInt("Selection Option > ");
					
					if (a_option == 1) {
						run.doAddCourseCategory();
					}
					
					else if (a_option == 2) {
						run.viewCourseCategory();
					}
					else if(a_option == 3) {
						run.deleteCourseCategory();
					}
					else if(a_option == 4) {
						System.out.println("Thank you!");
					}
				}
				
			}
			
			// MEMBER 3 OPTIONS
			if(option == 3) {
				int a_option = 0;
				while (a_option != 4) {
				
					Helper.line(30, "=");
					System.out.println("Course Management");
					Helper.line(30, "=");
					System.out.println("Option 1 - Add Course");
					System.out.println("Option 2 - View Course");
					System.out.println("Option 3 - Delete Course");
					System.out.println("Option 4 - Return");	
					
					a_option = Helper.readInt("Select Option > ");
					
					if (a_option == 1) {
						run.addCourse();
						
					}
					else if(a_option == 2) {
						run.ViewCourse();
						
					}
					else if (a_option == 3) {
						run.deleteCourse();
					}
					else if (a_option == 4) {
						System.out.println("Thank you!");
					}
				}
			}
			
			//MEMBER 4 OPTIONS
			if(option == 4) {
				int a_option = 0;
				while (a_option != 4) {
					
					Helper.line(30, "=");
					System.out.println("Course Schedule Management");
					Helper.line(30, "=");
					System.out.println("Option 1 - Add Course Schedule");
					System.out.println("Option 2 - View Course Schedule");
					System.out.println("Option 3 - Delete Course Schedule");
					System.out.println("Option 4 - Return");	
					
					a_option = Helper.readInt("Selection Option > ");
					
					if (a_option == 1) {
						run.doAddCourseSchedule();;
					}
					
					else if (a_option == 2) {
						run.viewCourseSchedule();;
					}
					else if(a_option == 3) {
						run.deleteCourseSchedule();;
					}
					else if(a_option == 4) {
						System.out.println("Thank you!");
					}
				}
				
				
			}
			
			//MEMBER 5 OPTIONS
			if(option == 5) {
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
			System.out.println("Option 6 - Exit");
			
			
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
	
	public void doDeleteMembers() {
		//Hidir will do this
	}
	
		
	
	//MEMBER 2 WEI JIE
	
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
        String output = String.format("%-25s %-200s\n", "Course Category Name","Course Category Description");
       
        for(CourseCategory category : categoryList) {
            output += String.format("%-25s %-200s \n", category.getCategoryName(),category.getCategoryDescription());
        }
        System.out.println(output);
    }
   
    public void deleteCourseCategory() {
        String deleteCategory = Helper.readString("Name of category to delete > ");
       
        for (int x = 0; x<categoryList.size();x++) {
            if (deleteCategory.equalsIgnoreCase(categoryList.get(x).getCategoryName())) {
                categoryList.remove(categoryList.get(x));
                System.out.println("Course Category successfully deleted");
            }else {
                System.out.println("Category does not exist!");
            }
        }
    }
	

	
	
	
	//MEMBER 3 MINGLOON
	public void addCourse() {
        String coursecode = Helper.readString("Add new course code : ");
        String title = Helper.readString("Couse title :");
        String categoryname = Helper.readString("Category name : ");
        String description = Helper.readString ("Course description : ");
        String duration = Helper.readString("Duration: ");
        String courseprerequisite = Helper.readString("Course pre-requisite :");
       
        for(Course course: courseList ) {
            if(course.getcoursecode().equalsIgnoreCase(coursecode)) {
                System.out.println("The course code is already use.Please enter again");
                coursecode = Helper.readString("Enter course code : ");
            }
           
        }
        
        Course addition = new Course(coursecode, title, categoryname, description, duration, courseprerequisite);
        courseList.add(addition);
	}
	
	public void ViewCourse() {
        String output = "";
       
        output += String.format("%-12s %-6s %-9s %-17s %-9s %s\n", "coursecode","title","categoryname","description","duration","courseprerequisite");
       
        for(Course i : courseList) {
            output += i.toString();
        }
        System.out.println(output);
    }
	
	
	public void deleteCourse() {
        String deleteCourse = Helper.readString("Enter course code to delete course :");
       
        for (int k = 0;k<courseList.size();k++) {
            if (deleteCourse.equalsIgnoreCase(courseList.get(k).getcoursecode())) {
                courseList.remove(courseList.get(k));
                System.out.println("Course successfully deleted");
            }else {
                System.out.println("Course does not exist!");
            }
        }
}

        
	
	
	//MEMBER 4 HAZIQ
	
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
	            output += String.format("\n %d %9.2f %20s %20s %10s", schedule.getId(),schedule.getPrice(),schedule.getstartDateTime(),schedule.getendDateTime(),schedule.getLocation());
	        }
	        System.out.println(output);
	    }
	   
	    public void deleteCourseSchedule() {
	        viewCourseSchedule();
	        int deleteSchedule = Helper.readInt("ID of schedule to delete > ");
	       
	        for (int i = 0;i<scheduleList.size();i++) {	        	
	            if (deleteSchedule == scheduleList.get(i).getId()) {
	                scheduleList.remove(scheduleList.get(i));
	                System.out.println("Schedule successfully deleted");
	            }else {
	                System.out.println("ID does not exist!");
	            }
	        }
	    }
	
	
	
	
	
	
	//MEMBER 5
		

}
