package com.yedam.hi;

public class FullCalendar {
private String title;
private String startDate;
private String endDate;

public FullCalendar(String title, String startDate, String endDate) {  //생성자
	super();
	this.title = title;
	this.startDate = startDate;
	this.endDate = endDate;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}


}
