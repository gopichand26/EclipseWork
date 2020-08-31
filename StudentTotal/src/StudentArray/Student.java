package StudentArray;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	String branch;
	int sub1 ;
	int sub2 ;
	int sub3 ;
	String mobile ;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String branch, int sub1, int sub2, int sub3, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.mobile = mobile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + ", mobile=" + mobile + "]";
	}
	public int getTotal() {
		int total ;
		total = sub1 + sub2 + sub3 ;
		return total;
	}

	@Override
	public int compareTo(Student o) {
		return mobile.compareTo(o.getMobile()) ;
	}
	
	

}
