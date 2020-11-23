package co.sunny.singletonclass;

public class Member {
	private String id;
	private String password;
	private String name;
	private String tel;
	private String addr;
	private int age;
	
	public Member() {
		
	}
	public Member(String id, String password, String name, String tel, 
		   String addr, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
	} //private 변수에 값을 생성자를 통해서 전달하는 방법
	
	public String toString() {
		System.out.println("id : " + id + " ");
		System.out.println("password : " + password + " ");
		System.out.println("name : " + name + " ");
		System.out.println("tel : " + tel + " ");
		System.out.println("addr : " + addr + " ");
		System.out.println("age : " + age + " ");
		return null;
		
	}
	
	public void setId(String id) {  //setter
		this.id = id;
	}
	
	public String getId() {   //getter //값을 가져옴
        return id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
