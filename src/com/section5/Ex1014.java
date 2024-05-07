package com.section5;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex1014 {
	public static void main(String[] args) {
		Date today = new Date();
        System.out.println("현재 날짜" + today);

        String dateToStr = DateFormat.getInstance().format(today);
        System.out.println("DateFormat.getInstance() : " + dateToStr);

        dateToStr = DateFormat.getDateInstance().format(today);
        System.out.println("DateFormat.getDateInstance() : " + dateToStr);

        dateToStr = DateFormat.getTimeInstance().format(today);
        System.out.println("DateFormat.getTimeInstance() : " + dateToStr);

        dateToStr = DateFormat.getDateTimeInstance().format(today);
        System.out.println("DateFormat.getDateTimeInstance() : " + dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(today);
        System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM) : " + dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(today);
        System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT) : " + dateToStr);

        //#1
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = formatter.format(date);
        System.out.println("yyy/MM/dd : " + strDate);

        //#2
        formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("yyyy-mm-dd hh:mm:ss : " + strDate);

        //#3
        formatter = new SimpleDateFormat("dd MMMM yy");
        strDate = formatter.format(date);
        System.out.println("dd MMMM yy : " + strDate);

        //#4
        formatter = new SimpleDateFormat("dd M yy zzzz");
        strDate = formatter.format(date);
        System.out.println("dd M yy zzzz : " + strDate);

	}
}
