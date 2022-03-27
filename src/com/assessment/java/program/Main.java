package com.assessment.java.program;

public class Main {
	
	public static void main(String args[]) {
		
		AdminDepartment ad = new AdminDepartment();
		System.out.println("\n"+ad.departmentName()+"\n"+ad.getTodaysWork ()+"\n"+ad.getWorkDeadline()+"\n"+ad.isTodayAHoliday()+"\n");
		
		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName()+"\n"+hr.doActivity()+"\n"+hr.getTodaysWork()+"\n"+hr.getWorkDeadline()+"\n"+hr.isTodayAHoliday()+"\n");
		
		TechDepartment td = new TechDepartment();
			System.out.println(td.departmentName()+"\n"+td.getTodaysWork()+"\n"+td.getWorkDeadline()+"\n"+td.getTechStackInformation()+"\n"+td.isTodayAHoliday());	
		}
}
