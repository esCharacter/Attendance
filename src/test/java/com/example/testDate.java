package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
	static public void main(String args[]){
		Date today=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day=sdf.format(today);
		
		System.out.println(day);
	}

}
