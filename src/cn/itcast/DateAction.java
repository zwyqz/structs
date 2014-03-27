package cn.itcast;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateAction extends ActionSupport{
	private Date year;

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
}
