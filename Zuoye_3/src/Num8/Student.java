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
class UnderGraduate extends Student//����������
{
	   UnderGraduate(String name, int age) 
	   {
		super(name, age);
	   }
	public void specialty()//����һ��specialty����
	{	
		System.out.println("ѧλ:����");
		System.out.println("רҵ:��ҵ�Զ���");
	}
}

class Graduate extends Student//�����о�����
{
	 Graduate(String name,int age) 
	 {
		super(name, age);
	 }
	 public void studydirection()//����һ��studydirection����
	 {
		 System.out.println("ѧλ:˶ʿ");
		 System.out.println("רҵ:���缼��");
	 }
}
