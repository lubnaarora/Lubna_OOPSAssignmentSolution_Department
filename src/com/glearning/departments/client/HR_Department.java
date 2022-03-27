package com.glearning.departments.client;

import com.glearning.departments.model.SuperDepartment;

public class HR_Department extends SuperDepartment{

	public String departmentName(){
		return "Welcome to HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
