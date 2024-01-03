package com.chandra.oops;

import java.util.Scanner;

public class OnlineTraining {

	public static void main(String[] args) {
		FastTrackBatchStudent fbs = new FastTrackBatchStudent();
		CorporateBatchStudent cbs = new CorporateBatchStudent();
		WeekendBatchStudent wbs = new WeekendBatchStudent();
		CorporateWeekendBatchStudent cwbs = new CorporateWeekendBatchStudent();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------");
			System.out.println("|     ONLINE TRAINING        |");
			System.out.println("------------------------------");
			System.out.println("|   1. FAST TRACK BATCH       |");
			System.out.println("|   2. CORPORATE BATCH        |");
			System.out.println("|   3. WEEKEND BATCH          |");
			System.out.println("|   4. CORPORATE WEEKEND BATCH|");
			System.out.println("|   5. EXIT                   |");
			System.out.println("---------------------------------");
			System.out.println("Enter Your choice ?");
			int choice = sc.nextInt();
			double fee = 0.0d;
			switch (choice) {
			case 1:
				System.out.println("Enter Student Id ?");
				fbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				fbs.setName(sc.next());
				System.out.println("Enter Student Mobile No?");
				fbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				fbs.setAddress(sc.next());
				System.out.println("Select Your Course : 1. JAVA 2. UI 3. FRAMEWORKS");
				int ch = sc.nextInt();
				if (ch == 1) {
					fee = fbs.calculateFee("Java");
				} else if (ch == 2) {
					fee = fbs.calculateFee("UI");
				} else if (ch == 3) {
					fee = fbs.calculateFee("framework");
				} else {
					System.out.println("Please select your choice only 1-3");
				}
				System.out.println("Student Id     :  " + fbs.getStudentId());
				System.out.println("Student Name   :  " + fbs.getName());
				System.out.println("Student MobileNo" + fbs.getMobileNo());
				System.out.println("Student Address: " + fbs.getAddress());
				System.out.println("Course Amount  : " + fee);
				// fee = 0.0d;
				break;
			case 2:
				System.out.println("Enter Student Id ?");
				cbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cbs.setName(sc.next());
				System.out.println("Enter Student Mobile No?");
				cbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cbs.setAddress(sc.next());
				System.out.println("Select Your Course : 1. JAVA 2. UI 3. FRAMEWORKS");
				int ch1 = sc.nextInt();
				if (ch1 == 1) {
					fee = cbs.calculateFee("Java");
				} else if (ch1 == 2) {
					fee = cbs.calculateFee("UI");
				} else if (ch1 == 3) {
					fee = cbs.calculateFee("framework");
				} else {
					System.out.println("Please select your choice only 1-3");
				}
				System.out.println("Student Id     :  " + cbs.getStudentId());
				System.out.println("Student Name   :  " + cbs.getName());
				System.out.println("Student MobileNo" + cbs.getMobileNo());
				System.out.println("Student Address: " + cbs.getAddress());
				System.out.println("Course Amount  : " + fee);
				// fee = 0.0d;
				break;
			case 3:
				System.out.println("Enter Student Id ?");
				wbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				wbs.setName(sc.next());
				System.out.println("Enter Student Mobile No?");
				wbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				wbs.setAddress(sc.next());
				System.out.println("Select Your Course : 1. JAVA 2. UI 3. FRAMEWORKS");
				int ch2 = sc.nextInt();
				if (ch2 == 1) {
					fee = wbs.calculateFee("Java");
				} else if (ch2 == 2) {
					fee = wbs.calculateFee("UI");
				} else if (ch2 == 3) {
					fee = wbs.calculateFee("framework");
				} else {
					System.out.println("Please select your choice only 1-3");
				}
				System.out.println("Student Id     :  " + wbs.getStudentId());
				System.out.println("Student Name   :  " + wbs.getName());
				System.out.println("Student MobileNo" + wbs.getMobileNo());
				System.out.println("Student Address: " + wbs.getAddress());
				System.out.println("Course Amount  : " + fee);
				// fee = 0.0d;
				break;
			case 4:
				System.out.println("Enter Student Id ?");
				cwbs.setStudentId(sc.nextInt());
				System.out.println("Enter Student Name ?");
				cwbs.setName(sc.next());
				System.out.println("Enter Student Mobile No?");
				cwbs.setMobileNo(sc.nextLong());
				System.out.println("Enter Student Address ?");
				cwbs.setAddress(sc.next());
				System.out.println("Select Your Course : 1. JAVA 2. UI 3. FRAMEWORKS");
				int ch3 = sc.nextInt();
				if (ch3 == 1) {
					fee = cwbs.calculateFee("Java");
				} else if (ch3 == 2) {
					fee = cwbs.calculateFee("UI");
				} else if (ch3 == 3) {
					fee = cwbs.calculateFee("framework");
				} else {
					System.out.println("Please select your choice only 1-3");
				}
				System.out.println("Student Id     :  " + cwbs.getStudentId());
				System.out.println("Student Name   :  " + cwbs.getName());
				System.out.println("Student MobileNo" + cwbs.getMobileNo());
				System.out.println("Student Address: " + cwbs.getAddress());
				System.out.println("Course Amount  : " + fee);
				// fee = 0.0d;
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-5 only");

			}
		}

	}

}
