package com.chandra.oops;

public class CorporateBatchStudent extends Student {
	public double calculateFee(String course) {
		double fee = 0.0d;
		double corporateFee = 10000d;
		if (course.equals("Java")) {
			fee = 18000;
		} else if (course.equals("UI")) {
			fee = 15000;
		} else if (course.equals("framework")) {
			fee = 14000;
		}
		return fee+corporateFee;
	}
}
