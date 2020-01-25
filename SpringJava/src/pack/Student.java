package pack;

public class Student {
	private int sid;
	private String sname;
	private Address a;
	public Student(int sid,String sname, Address a)
	{
		this.sid=sid;
		this.sname=sname;
		this.a=a;
	}
	public void display()
	{
		System.out.println("sid:"+this.sid+"\n"+"sname:"+this.sname+"\n"+""+ this.a);
	}
	
}
