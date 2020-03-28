package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Employee;
import model.FullTime;
import model.PartTime;


public class ManagerFunction {
	
	private List<Employee> listEmployee = new ArrayList<Employee>();
	
	public ManagerFunction() {}
	
	public void input(Scanner scanner) {
		Employee employee;
		System.out.println("1.Full Time || 2.Part Time"); // lua chon 1 | 2 sao cho phu doi tuong can them vao

		System.out.print("select: ");

		int choose = scanner.nextInt();

		if (choose == 1) {

			employee = new FullTime();  //khoi tao doi tuong employee la 1 nhan vien full time

			employee.input(scanner);

			listEmployee.add(employee);
			
		} else if (choose == 2) {

			employee = new PartTime();  //khoi tao doi tuong employee la 1 nhan vien part time

			employee.input(scanner);

			listEmployee.add(employee);
		} else {
			System.out.println("khong co chuc nang nay...");
		}
	}
	
	//show tat ca thong tin nhan vien trong list
	public void showAllEmployee() {
		for (Employee employee : listEmployee) {
			employee.showInfor();
			System.out.println("==============");
		}
	}
	
	//update employee
	public void updateEmployeeById(Scanner scanner) {
		System.out.print("Input Id: ");
		int id = scanner.nextInt();
		
		for (Employee employee : listEmployee) {
			if(employee.getmId() == id) {
				System.out.print("Name: ");
				employee.setmName(scanner.next());
				System.out.print("Date Of Birth: ");
				employee.setmDateOfBirth(scanner.next());
			}
		}
	}
	
	//xoa 1 phan tu trong arraylist
	public void deleteEmployeeByID(Scanner scanner) {
		System.out.print("Input Id: ");
		int id = scanner.nextInt();
		for (int i = 0; i < listEmployee.size(); i++) {
			if(listEmployee.get(i).getmId() == id ) {
				listEmployee.remove(i);
			}
		}
	}
	
	//sap xep ten
	public void sortName() {
		Collections.sort(listEmployee,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getmName().compareTo(o2.getmName());
			}
		});
	}
	
	//tra ve tong so tien luong can tra
	public void getTotalSalaryOfAllEmployee() {
		int totalSalary = 0;
		for (Employee employee : listEmployee) {
			totalSalary+= employee.getmSalary();
		}
		System.out.println("Total Salary Of All Employee: "+totalSalary);
	}
	
	// in ra bang luong
		public void payrollList() {
			System.out.println("===============");
			for (Employee employee : listEmployee) {
				System.out.println(employee.getmName() + "\t" + employee.getmSalary() + "\n");
			}
			System.out.println();
		}
}
