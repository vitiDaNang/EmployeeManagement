package model;

import java.util.Scanner;

public abstract class Employee {
	private int mId;
	private String mName;
	private String mDateOfBirth;
	private int mSalary;
	
	public Employee() {}
	
	public Employee(int mId, String mName, String mDateOfBirth, int mSalary) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mDateOfBirth = mDateOfBirth;
		this.mSalary = mSalary;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmDateOfBirth() {
		return mDateOfBirth;
	}

	public void setmDateOfBirth(String mDateOfBirth) {
		this.mDateOfBirth = mDateOfBirth;
	}

	public int getmSalary() {
		return mSalary;
	}

	public void setmSalary(int mSalary) {
		this.mSalary = mSalary;
	}
	
	//nhap thong tin nhan vien
	public void input(Scanner scanner) {
		System.out.println("=== Input Information ===");
		System.out.print("Id: ");
		mId = scanner.nextInt();
		System.out.print("Name: ");
		mName = scanner.next();
		scanner.nextLine();
		System.out.print("Date Of Birth: ");
		mDateOfBirth = scanner.next();
	}
	
	public abstract void getSalary();
	
	public abstract void showInfor();
	
}
