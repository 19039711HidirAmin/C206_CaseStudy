/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * cheemingloon, 9 June 2019 9:15:00 AM
 */

/**
 * @author 19030194
 *
 */
public class Course {
	
	private String coursecode;
	private String title;
	private String categoryname;
	private String description;
	private String duration ;
	private String courseprerequisite;

	public Course(String coursecode,String title,String categoryname,String description,String duration,String courseprerequisite) {
    this.coursecode=coursecode;
    this.title=title;
    this.categoryname=categoryname;
    this.description = description;
    this.duration = duration;
    this.courseprerequisite = courseprerequisite;
	}
    
    public String getcoursecode() {
        return coursecode;
    }
    
    public String gettitle() {
        return title;
        
    }
    
    public String getcategoryname() {
        return categoryname;
    }
    
    public String getdescription() {
        return description;
    }
    
    public String getduration() {
        return duration;
    }
    
    public String getcourseprerequisite() {
        return courseprerequisite;
    }

 


	

	
}
