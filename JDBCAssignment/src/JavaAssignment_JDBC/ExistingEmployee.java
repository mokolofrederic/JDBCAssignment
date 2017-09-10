package JavaAssignment_JDBC;

import java.util.Date;

public class ExistingEmployee extends Employee {

	public ExistingEmployee(int employeeNo) {
		super(firstName, firstName);
		this.employeeNum = employeeNo;

	}

	public ExistingEmployee(int employeeNo, int menuItem) {

		super(firstName, firstName);
		this.employeeNum = employeeNo;

	}

	void clockIn(int empNumber) {

		// initialize current date
		Date date = new Date();

		// set the date equal to a string temporarily
		String curTime = date.toString();

		setTimeIn(curTime);

	}

	private void setTimeIn(String curTime) {
		// TODO Auto-generated method stub
		
	}

	void clockOut(int empNumber) {

		// initialize current date
		Date date = new Date();

		// set the date equal to a string temporarily
		String curTime = date.toString();

		setTimeIn(curTime);

	}

}