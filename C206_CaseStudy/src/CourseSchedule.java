
public class CourseSchedule {
	private int id;
	private double price;
	private String startDateTime;
	private String endDateTime;
	private String Location;
	public CourseSchedule(int id, double price, String startDateTime, String endDateTime, String location) {
		super();
		this.id = id;
		this.price = price;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		Location = location;
	}
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public String getstartDateTime() {
		return startDateTime;
	}
	public String getendDateTime() {
		return endDateTime;
	}
	public String getLocation() {
		return Location;
	}
	
	
}
