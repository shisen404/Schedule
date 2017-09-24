package schedule;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Behaves like a deck. An ArrayList with Days, which hold the shifts available
 * that day.
 * 
 * @author Miles
 *
 */
public class Week implements Iterable<Day> {
	private ArrayList<Day> week;

	/**
	 * Constructor
	 */
	public Week() {
		week = new ArrayList<Day>();

		/**
		 * Goes through Monday-Sunday and adds all shifts as available
		 */
		for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
			week.add(new Day(dayOfWeek));
		}
	}

	/**
	 * Implements Iteratable.iterator(), delegates to ArrayList<> iterator
	 * 
	 * @return: ArrayList<> iterator
	 */
	public Iterator<Day> iterator() {
		Iterator<Day> itr = week.iterator();
		return itr;
	}

	/**
	 * 
	 * @param dayOfWeek
	 */
	public void setDayOff(DayOfWeek dayOfWeek) {
		Iterator<Day> itr = week.iterator();

		while (itr.hasNext()) {
			Day d = itr.next();
			if(d.getDayOfWeek().equals(dayOfWeek)) {
				itr.remove();
			}
		}
	}
	
	public void setShiftOff(DayOfWeek dayOfWeek, ShiftType shiftType) {
		Iterator<Day> itr = week.iterator();

		while (itr.hasNext()) {
			Day d = itr.next();
			if(d.getDayOfWeek().equals(dayOfWeek)) {
				d.setShiftOff(shiftType);
			}
		}
	}

	/**
	 * 
	 * @param dayOfWeek
	 * @return
	 */
	public Day getDay(DayOfWeek dayOfWeek) {
		for (Day day : this.week) {
			if (day.getDayOfWeek().equals(dayOfWeek)) {
				return day;
			}
		}
		throw new RuntimeException("This error should never occur");

	}

	/**
	 * Overrides toString() method
	 */
	public String toString() {
		String string = "";
		for (Day dayOfWeek : this.week) {
			if (string != "") {
				string = string + "\n" + dayOfWeek;
			} else {
				string = string + dayOfWeek;
			}
		}
		return string;

	}
}
