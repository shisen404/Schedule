package schedule;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList implements Iterable<Employee> {
	private ArrayList<Employee> employeeList;
	
	/**
	 * 
	 */
	public EmployeeList() {
		employeeList = new ArrayList<Employee>();
		
	}
	
	/**
	 * Implements Iteratable.iterator(), delegates to ArrayList<> iterator
	 * 
	 * @return: ArrayList<> iterator
	 */
	public Iterator<Employee> iterator() {
		Iterator<Employee> itr = employeeList.iterator();
		return itr;
	}
	
	/**
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Employee getEmployee(String name) {
		for(Employee e : employeeList) {
			if(e.getName().equals(name)) {
				return e;
			}
		}
		throw new RuntimeException("Employee does not exist.");
	}
	
	/**
	 * 
	 */
	public String toString() {
		String string = "";
		
		for (Employee e : this.employeeList) {
			if (string != "") {
				string = string + "\n" + e;
			} else {
				string = string + e;
			}
		}
		return string;
	}
	
	
	
}
