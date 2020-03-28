package main;

import java.util.Scanner;

import utils.ManagerFunction;


public class RunMain {
	

	public static void main(String[] args) {
		ManagerFunction managerFunction = new ManagerFunction();
		
		Scanner scanner = new Scanner(System.in);
		int choose;
		do {
			menu();
			System.out.print("choose: ");
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				managerFunction.input(scanner);;
				break;
			case 2:
				managerFunction.payrollList();
				break;
			case 3:
				managerFunction.updateEmployeeById(scanner);
				break;
			case 4:
				managerFunction.deleteEmployeeByID(scanner);
				break;
			case 5:
				managerFunction.getTotalSalaryOfAllEmployee();
				break;
			case 6:
				System.out.println("thanks..!!");
			}
		} while (choose != 6);

		System.out.println();
	}

	public static void menu() {
		System.out.println("\t\t=== Employee Management ===");
		System.out.println("1.Input employee (Full-time and part-time)");
		System.out.println("2.Show payroll list");
		System.out.println("3.Update or edit of an employee by Id");
		System.out.println("4.Delete of an employee by Id");
		System.out.println("5.Show total salary");
		System.out.println("6.Exit");
	}
}
