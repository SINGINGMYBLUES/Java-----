package Num8;

public class Student {
   private String name;
   private int age;
   
   public Student(String name,int age) {

	   this.age=age;
	   this.name=name;
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
	   
}
class UnderGraduate extends Student//创建本科类
{
	   UnderGraduate(String name, int age) 
	   {
		super(name, age);
	   }
	public void specialty()//定义一个specialty属性
	{	
		System.out.println("学位:本科");
		System.out.println("专业:工业自动化");
	}
}

class Graduate extends Student//创建研究生类
{
	 Graduate(String name,int age) 
	 {
		super(name, age);
	 }
	 public void studydirection()//定义一个studydirection属性
	 {
		 System.out.println("学位:硕士");
		 System.out.println("专业:网络技术");
	 }
}
