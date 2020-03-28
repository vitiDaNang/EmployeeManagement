package model;

import java.util.Scanner;

public class PartTime extends Employee{
	private int mWorkDay;

	public int getmWorkDay() {
		return mWorkDay;
	}

	public void setmWorkDay(int mWorkDay) {
		this.mWorkDay = mWorkDay;
	}
	
	//override va chinh sua 
	@Override
	public int getmSalary() {
		// TODO Auto-generated method stub
		return (mWorkDay * 500000);
	}
	
	//tra ve tien luong nhan vien
	@Override
	public void getSalary() {
		System.out.println("salary: "+getmSalary());
	}
	
	//ham in ra thong tin nhan vien
	@Override
	public void showInfor() {
		System.out.println("=== Part Time ===");
		System.out.println("id: "+getmId());
		System.out.println("name: "+getmName());
		System.out.println("date of birth: "+getmDateOfBirth());
		System.out.println("work day: "+getmWorkDay());
		getSalary();
	}
	
	//nhap thong tin nhan vien co them work day
	@Override
	public void input(Scanner scanner) {
		// TODO Auto-generated method stub
		super.input(scanner);
		
		System.out.print("Work Day: ");
		mWorkDay = scanner.nextInt();
	}
	
}
