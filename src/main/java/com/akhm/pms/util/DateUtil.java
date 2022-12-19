package com.akhm.pms.util;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.akhm.pms.exception.AdminDataCustomException;

@Component
public class DateUtil {
	public Date convertToStringToDate(String date) {
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date udate = sdf.parse(date);
			java.sql.Date sdate = new java.sql.Date(udate.getTime());
			return sdate;
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}

	public String convertDateToString(Date date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			return sdf.format(date);
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
	}
	public Date currentDate()
	{
		return new java.sql.Date(new java.util.Date().getTime());
	}
}