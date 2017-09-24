package schedule;
import javax.swing.JOptionPane;

/**
 * Acting as test method
 * 
 * @author Miles
 *
 */
public class Schedule {
	public static void main(String[] args) {
		Employee miles = new Employee("Miles", Rank.crew);
		EmployeeList list = new EmployeeList();
		list.addEmployee(miles);
		list.addEmployee(new Employee("Will", Rank.crew));
		//CHANGE SHIFT TYPE TO HOURS AVAILABLE?
		
		miles.setShiftOff(DayOfWeek.monday, ShiftType.close);
		miles.setDayOff(DayOfWeek.wednesday);
		System.out.println(list);
		System.out.println(miles.getAvailability());
	}
}