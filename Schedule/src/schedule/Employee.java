package schedule;
import java.util.ArrayList;



/**
 * Class holds information on an employee. Mostly important for their
 * availability, but also has their name and rank
 * 
 * @author Miles
 *
 */
public class Employee {
	private int MAX_TIME = 36; // 36 hours is the most hours allowed
	String name;
	private Rank rank;
	private Week week;
	private boolean minor;
	private ArrayList<Deployment> knownDeployments;

	/**
	 * Constructor takes a name and a rank
	 * 
	 * @param name:
	 *            The employee's name
	 * @param rank:
	 *            The employee's rank
	 */
	public Employee(String name, Rank rank) {
		this.name = name;
		this.rank = rank;
		this.week = new Week();
		this.minor = false;
		this.knownDeployments = new ArrayList<Deployment>();
	}

	/**
	 * Sets the employee's name
	 * 
	 * @param name:
	 *            name to set employee to
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the employee's rank
	 * 
	 * @param rank:
	 *            the rank to be set to
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	/**
	 * Sets whether or not the employee is a minor
	 * 
	 * @param minor
	 *            whether or not they are a minor
	 */
	public void setMinor(boolean minor) {
		this.minor = minor;
	}
	
	/**
	 * 
	 */
	public void setKnownDeployments(Deployment d) {
		knownDeployments.add(d);
	}

	/**
	 * Returns the employee's name
	 * 
	 * @return the employee's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the employee's rank
	 * 
	 * @return the employee's rank
	 */
	public Rank getRank() {
		return rank;
	}

	public boolean getMinor() {
		return minor;
	}

	/**
	 * Returns availability on specific day passed as parameter day
	 * 
	 * @param day:
	 *            the day being inquired
	 * @return the shifts available that day
	 */
	public String getAvailability(DayOfWeek day) {
		return week.getDay(day).toString();
	}

	/**
	 * 
	 * @param day
	 */
	public void setDayOff(DayOfWeek day) {
		week.setDayOff(day);
	}

	/**
	 * 
	 * @param dayOfWeek
	 * @param shiftType
	 */
	public void setShiftOff(DayOfWeek dayOfWeek, ShiftType shiftType) {
		week.setShiftOff(dayOfWeek, shiftType);
	}

	/**
	 * Returns availability for the whole week
	 * 
	 * @return the availability for the whole week
	 */
	public String getAvailability() {
		return week.toString();
	}
	
	/**
	 * 
	 */
	public String toString() {
		return name;
	}
}
