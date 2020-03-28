package model;

import java.util.Scanner;

public class FullTime extends Employee{
	
	private int mWorkDay;
	

	public FullTime() {
		super();
		}

	public FullTime(int mId, String mName, String mDateOfBirth, int mSalary, int mWorkDay) {
		super(mId, mName, mDateOfBirth, mSalary);
		this.mWorkDay = mWorkDay;
	}

	public int getmWorkDay() {
		return mWorkDay;
	}

	public void setmWorkDay(int mWorkDay) {
		this.mWorkDay = mWorkDay;
	}
	
	//override phuong thuc getmsalary() de chinh sua
	@Override
	public int getmSalary() {
		// TODO Auto-generated method stub
		return (mWorkDay * 1200000 + 800000);
	}
	
	//ham tra ve tien luong nhan vien
	@Override
	public void getSalary() {
		System.out.println("salary: "+getmSalary());
	}
	
	@Override
	public void input(Scanner scanner) {
		// TODO Auto-generated method stub
		super.input(scanner);
		
		System.out.print("Work Day: ");
		mWorkDay = scanner.nextInt();
	}
	
	//ham in ra thong tin nhan vien
	@Override
	public void showInfor() {
		System.out.println("=== Full Time ===");
		System.out.println("id: "+getmId());
		System.out.println("name: "+getmName());
		System.out.println("date of birth: "+getmDateOfBirth());
		System.out.println("work day: "+getmWorkDay());
		getSalary();
	}
	

}
