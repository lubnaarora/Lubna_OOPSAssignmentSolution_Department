package com.glearning.departments.client;

import java.util.Scanner;

import com.glearning.departments.model.SuperDepartment;

public class DepartmentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your option");
		System.out.println("Admin : 0");
		System.out.println("Tech : 1");
		System.out.println("HR : 2");
		
		int option = scanner.nextInt();
		
		switch(option) {
		case 0:
			System.out.println(" Admin ");
			Admin_Department obj_AdminDepartment = new Admin_Department();
			System.out.println(obj_AdminDepartment.departmentName());
			System.out.println(obj_AdminDepartment.getTodaysWork());
			System.out.println(obj_AdminDepartment.getWorkDeadline());
			System.out.println(obj_AdminDepartment.isTodayAHoliday());
			break;
			
		case 1:
			TechDepartment obj_TechDepartment = new TechDepartment();
			System.out.println(" Tech ");
			System.out.println(obj_TechDepartment.departmentName());
			System.out.println(obj_TechDepartment.getTodaysWork());
			System.out.println(obj_TechDepartment.getWorkDeadline());
			System.out.println(obj_TechDepartment.getTechStackInformation());
			System.out.println(obj_TechDepartment.isTodayAHoliday());
			break;
			
		case 2:
			HR_Department obj_HR_Department = new HR_Department();
			System.out.println(" HR ");
			System.out.println(obj_HR_Department.departmentName());
			System.out.println(obj_HR_Department.doActivity());
			System.out.println(obj_HR_Department.getTodaysWork());
			System.out.println(obj_HR_Department.getWorkDeadline());
			System.out.println(obj_HR_Department.isTodayAHoliday());
			break;
		}
		
		scanner.close();
	}

}
