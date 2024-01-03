package com.chandra.oops;

public class FastTrackBatchStudent extends Student {
	public double calculateFee(String course) {
		double fee = 0.0d;
		double fastTrackFee = 5000;
		if (course.equals("Java")) {
			fee = 18000;
		} else if (course.equals("UI")) {
			fee = 15000;
		} else if (course.equals("framework")) {
			fee = 14000;
		}
		return fee+fastTrackFee;
	}
}
