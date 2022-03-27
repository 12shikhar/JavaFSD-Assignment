package com.gl.superdepartment;

public class Driver {

	public static void main (String args[]) {
		
		SuperDepartment obj =new AdminDepartment();
			obj.departmentname();
			obj.getTodaysWork();
			obj.getWorkDeadline();
			obj.isTodayAHoliday();
			
			System.out.println("*****************");
		    
		SuperDepartment obj1 = new HRDepartment();
		obj1.departmentname();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		((HRDepartment) obj1).doactivity();
		obj1.isTodayAHoliday();
		
		System.out.println("*****************");
		
	   SuperDepartment obj2= new TechDepartment();
	   obj2.departmentname();
	   obj2.getTodaysWork();
	   obj2.getWorkDeadline();  
	   ((TechDepartment) obj2).getStackInformation();
	   obj2.isTodayAHoliday();
	}
}
