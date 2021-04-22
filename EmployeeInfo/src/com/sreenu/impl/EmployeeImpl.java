package com.sreenu.impl;

import com.sreenu.bean.Employee;

public class EmployeeImpl {
	public void display(Employee e)
	{
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getSalary());
	}
	public static void main(String[] args)
	{
		EmployeeImpl emp=new EmployeeImpl();
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Balu");
		e.setSalary(35000);
		emp.display(e);
	}

}
