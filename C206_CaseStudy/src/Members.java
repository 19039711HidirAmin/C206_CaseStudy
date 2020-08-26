import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Members {

	private String name;
	private String gender;
	private int mobile;
	private String email;
	private LocalDate dob;
	private String country;
	
	public Members(String name, String gender, int mobile, String email, String dob, String country) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dob, formatter);
		this.dob = date;
	
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getMobile() {
		return mobile;
	}

	public String getEmail() {
		
		
		return email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getCountry() {
		return country;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatDate = dob.format(formatter);
		String output = "";
		output += String.format("%-12s %-6s %-9s %-8s %-9s %s\n", name, gender, mobile, email, formatDate, country);
		
		return output;	
		}
	
	 

}
