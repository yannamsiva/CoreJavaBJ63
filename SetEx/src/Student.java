
public class Student {

	int sno;
	String sname;
	
	
	public Student(int sno, String sname) {
				this.sno = sno;
		this.sname = sname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stu=new Student(100,"shiva");

	stu.setSname("rani");
	System.out.println(stu.getSno()+"\t"+stu.getSname());
	
	
	
	
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}

}
