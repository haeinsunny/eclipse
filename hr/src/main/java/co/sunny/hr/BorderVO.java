package co.sunny.hr;

import java.sql.Date;

public class BorderVO {
    private int borderid ;
    private String borderwriter;
    private String bodertitle; 
    private String bordercontent;
    private Date borderdate;
    private int borderhit;
    
    public BorderVO() {
    	
    }

	public int getBorderid() {
		return borderid;
	}

	public void setBorderid(int borderid) {
		this.borderid = borderid;
	}

	public String getBorderwriter() {
		return borderwriter;
	}

	public void setBorderwriter(String borderwriter) {
		this.borderwriter = borderwriter;
	}

	public String getBodertitle() {
		return bodertitle;
	}

	public void setBodertitle(String bodertitle) {
		this.bodertitle = bodertitle;
	}

	public String getBordercontent() {
		return bordercontent;
	}

	public void setBordercontent(String bordercontent) {
		this.bordercontent = bordercontent;
	}

	public Date getBorderdate() {
		return borderdate;
	}

	public void setBorderdate(Date borderdate) {
		this.borderdate = borderdate;
	}

	public int getBorderhit() {
		return borderhit;
	}

	public void setBorderhit(int borderhit) {
		this.borderhit = borderhit;
	}

	public String toString() {     //java에서 출력할 구문을 만들어줌
		System.out.print(borderid + " ");
		System.out.print(borderwriter + " ");
		System.out.print(bodertitle + " ");
		System.out.print(bordercontent + " ");
		System.out.print(borderdate + " ");
		System.out.println(borderhit + " ");
		return null;
	}
}
