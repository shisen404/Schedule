package schedule;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * An ArrayList that will hold available shifts.
 * 
 * @author Miles
 *
 */
public class Day implements Iterable<ShiftType> {

	private ArrayList<ShiftType> shiftType;
	private DayOfWeek dayOfWeek;
	private String day;
	
	/**
	 * Constructor that takes param dayOfWeek
	 * @param dayOfWeek
	 */
	public Day(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
		day = dayOfWeek.toString();
		shiftType = new ArrayList<ShiftType>();
		
		/**
		 * Adds every shift to be available
		 */
		for (ShiftType shiftType : ShiftType.values()) {
			this.shiftType.add(shiftType);
		}
	}
	
	/**
	 * Implements Iteratable.iterator(), delegates to ArrayList<> iterator
	 * 
	 * @return: ArrayList<> iterator
	 */
	public Iterator<ShiftType> iterator() {
		Iterator<ShiftType> itr = shiftType.iterator();
		return itr;
	}
	
	/**
	 * 
	 * @return
	 */
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	
	/**
	 * 
	 * @param shiftType
	 */
	public void setShiftOff(ShiftType shiftType) {
		Iterator<ShiftType> itr = this.shiftType.iterator();

		while (itr.hasNext()) {
			ShiftType s = itr.next();
			if(s.equals(shiftType)) {
				itr.remove();
			}
		}
	}
	
	/**
	 * Overrides toString() method
	 */
	public String toString() {
		String string = day;
		for(ShiftType shiftType : this.shiftType) {
			if(string != day) {
				string = string + ", " + shiftType;
			} else {
				string = string + ": " + shiftType;
			}

		}
		return string;
	}
}
