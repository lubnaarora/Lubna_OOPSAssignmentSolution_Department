package com.glearning.departments.client;

import com.glearning.departments.model.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	public String departmentName(){
		return "Welcome to Tech Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "core Java";
	}
}
