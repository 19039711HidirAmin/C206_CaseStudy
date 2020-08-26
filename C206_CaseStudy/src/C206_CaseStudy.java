
import java.util.ArrayList;

public class C206_CaseStudy {
	ArrayList<Members> memberList = new ArrayList<Members>();
	ArrayList<Course> courseList = new ArrayList<Course>();
	ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
	static ArrayList<CourseSchedule> scheduleList = new ArrayList<CourseSchedule>();
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
				while (a_option != 6) {
					
					Helper.line(30, "=");
					System.out.println("Course Schedule Management");
					Helper.line(30, "=");
					System.out.println("Option 1 - Add Course Schedule");
					System.out.println("Option 2 - View Course Schedule");
					System.out.println("Option 3 - Delete Course Schedule");
					System.out.println("Option 4 - Search Course Schedule");
					System.out.println("Option 5 - Update Course Schedule");
					System.out.println("Option 6 - Return");	
					
					a_option = Helper.readInt("Selection Option > ");
					
					if (a_option == 1) {
						CourseSchedule CS = inputCourseSchedule();
						C206_CaseStudy.addCourseSchedule(scheduleList, CS);
					}
					
					else if (a_option == 2) {
						C206_CaseStudy.viewAllCourseSchedule(scheduleList);
					}
					else if(a_option == 3) {
						C206_CaseStudy.viewAllCourseSchedule(scheduleList);
						int id  = Helper.readInt("Enter schedule Id to delete > ");
						C206_CaseStudy.deleteCourseSchedule(scheduleList, id);
					}
					else if(a_option == 4) {
						int id  = Helper.readInt("Enter schedule Id to search > ");
						C206_CaseStudy.searchCourseSchedule(scheduleList, id);
					}else if(a_option == 5) {
						C206_CaseStudy.viewAllCourseSchedule(scheduleList);
						int id  = Helper.readInt("Enter schedule Id to update > ");
						C206_CaseStudy.updateCourseSchedule(scheduleList, id);
					}else if(a_option ==6) {
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
       
        output += String.format("%-12s %-12s %-14s %-50s %-15s %-20s\n", "coursecode","title","categoryname","description","duration","courseprerequisite");
       
        for(Course i : courseList) {
        	output += String.format("%-12s %-12s %-14s %-50s %-15s %-20s\n", i.getcoursecode(),i.gettitle(),
        			i.getcategoryname(),i.getdescription(),
        			i.getduration(),i.getcourseprerequisite());
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
	
	 public static CourseSchedule inputCourseSchedule(){
	        int scheduleID = Helper.readInt("Enter course schedule id > ");
	        double price = Helper.readInt("Enter course  price > ");
	        String startDateTime = Helper.readString("Enter start date and time(DD/MM/YYYY 00:00) >");
	        String endDateTime = Helper.readString("Enter end date and time(DD/MM/YYYY 00:00) >");
	        String location = Helper.readString("Enter Course location > ");
	        
	        for (int i = 0;i<scheduleList.size();i++) {	        	
	            if (scheduleID == scheduleList.get(i).getId()) {
	                System.out.println("Sorry! ID already exist.");
	            }
	        }
	        
	        CourseSchedule newSchedule = new CourseSchedule(scheduleID,price,startDateTime,endDateTime,location);
	        return newSchedule;
	        
	    }




	static void addCourseSchedule(ArrayList<CourseSchedule> scheduleList, CourseSchedule newSchedule) {
		
		scheduleList.add(newSchedule);
//		System.out.println("Course Schedule Added");
	}
	   
	    public static void viewAllCourseSchedule(ArrayList<CourseSchedule> scheduleList) {
	        String output = String.format("%-10s %-10s %-20s %-20s %-10s\n", "Schedule ID","Price","Start Date & Time","End Date & Time","Location");
	       
	        output += retrieveAllCourseSchedule(scheduleList);
	        System.out.println(output);
	    }




		public static String retrieveAllCourseSchedule(ArrayList<CourseSchedule> scheduleList ) {
			String output = "";
			for(CourseSchedule schedule:scheduleList) {
	            output += String.format("%-10d %-10.2f %-20s %-20s %-10s", schedule.getId(),schedule.getPrice(),schedule.getstartDateTime(),schedule.getendDateTime(),schedule.getLocation());
	        }
			return output;
		}
	   
	    public static void deleteCourseSchedule(ArrayList<CourseSchedule> scheduleList,int id) {
	       
	        for (int i = 0;i<scheduleList.size();i++) {	        	
	            if (id == scheduleList.get(i).getId()) {
	                scheduleList.remove(scheduleList.get(i));
//	                System.out.println("Schedule successfully deleted");
	            }else {
	                System.out.println("ID does not exist!");
	            }
	        }
	    }
	
	    public static void searchCourseSchedule(ArrayList<CourseSchedule> scheduleList,int id) {
	    	for (int i = 0;i<scheduleList.size();i++) {	        	
	            if (id == scheduleList.get(i).getId()) {
	            	String output = String.format("%-10s %-10s %-20s %-20s %-10s\n", "Schedule ID","Price","Start Date & Time","End Date & Time","Location");  
	            	output += String.format("%-10d %-10.2f %-20s %-20s %-10s", scheduleList.get(i).getId(),scheduleList.get(i).getPrice(),scheduleList.get(i).getstartDateTime(),scheduleList.get(i).getendDateTime(),scheduleList.get(i).getLocation());
	            	System.out.println(output);
	            }else {
	                System.out.println("ID does not exist!");
	            }
	        }
	    }
	    public static void updateCourseSchedule(ArrayList<CourseSchedule> scheduleList,int id) {
	    	
	        for (int i = 0;i<scheduleList.size();i++) {	        	
	            if (id == scheduleList.get(i).getId()) {
	            	double price = Helper.readInt("Enter course  price > ");
	            	String startDateTime = Helper.readString("Enter start date and time(DD/MM/YYYY 00:00) >");
	            	String endDateTime = Helper.readString("Enter end date and time(DD/MM/YYYY 00:00) >");
	            	String location = Helper.readString("Enter Course location > ");
	            	
	            	scheduleList.get(i).setPrice(price);
	            	scheduleList.get(i).setStartDateTime(startDateTime);
	            	scheduleList.get(i).setEndDateTime(endDateTime);
	            	scheduleList.get(i).setLocation(location);
	            	System.out.println("Course Schedule " + scheduleList.get(i).getId()+ " has been updated");
	            }else {
	                System.out.println("ID does not exist!");
	            }
	        }
	    }
	
	
	
	//MEMBER 5
		

}
