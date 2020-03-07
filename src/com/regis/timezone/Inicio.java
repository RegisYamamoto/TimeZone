package com.regis.timezone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Inicio {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-3"));
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String dataAtual = format.format(date);
		
		System.out.println(dataAtual);
	}

}