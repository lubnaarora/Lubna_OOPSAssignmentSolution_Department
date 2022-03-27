package com.glearning.departments.client;

import com.glearning.departments.model.SuperDepartment;

public class Admin_Department extends SuperDepartment{

	
	public String departmentName(){
		return "Welcome to Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
