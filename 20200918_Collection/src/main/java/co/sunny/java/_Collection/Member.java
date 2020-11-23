/*
 * Member 관리 : Employer Table
 * sunny
 * 2020.09.18
 * ver 1.0
 */

package co.sunny.java._Collection;

public class Member {
	private String id;     //set,get을 통해서 값을 가져올수밖애없음
	private String name;
	private int age;
	private int salary;
    private double tax;
    
    
    public Member() {}//default construct  
    //DTO, VO객체(데이터 set을 만들려고 프라이빗 변수  getter, setter만 있는것. 실무에서 많이 씀)
    
    public Member(String id, String name, int age, int salary, double tax) {  
    		this.id = id;  //내 id에는  넘어온 id를
    		this.name = name;  //내 네임에는 넘어온 네임을
    	    this.age = age;
    		this.salary = salary;
    		this.tax = tax;
    	} 
    	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
