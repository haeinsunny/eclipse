package com.yedam.todo;

public class ToDo {
	private int title_no;
	private String title;
	private String appoint_time;
	private String meeting_place;
	private String content;
	
	public int getTitle_no() {
		return title_no;
	}
	public void setTitle_no(int title_no) {
		this.title_no = title_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAppoint_time() {
		return appoint_time;
	}
	public void setAppoint_time(String appoint_time) {
		this.appoint_time = appoint_time;
	}
	public String getMeeting_place() {
		return meeting_place;
	}
	public void setMeeting_place(String meeting_place) {
		this.meeting_place = meeting_place;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ToDo [title_no=" + title_no + ", title=" + title + ", appoint_time=" + appoint_time + ", meeting_place="
				+ meeting_place + ", content=" + content + "]";
	}
}
