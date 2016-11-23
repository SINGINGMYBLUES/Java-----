package Num7;


class Student//定义一个Student的类
{
	int num;
	int classNum;
	String name;
	String sex;
	int age;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Student()//对变量进行初始化
	{
	  
	}
	
	
	boolean setStudentAge(int newAge)//定义一个修改年龄的函数
	{
		
		if (newAge>1&&newAge<100)
		{
			System.out.println("原来的年龄是:"+getAge());
			System.out.println("修改后的年龄是:"+newAge);
			return true;
		}
		else
		{
			System.out.println("要修改的年龄是:"+newAge+"它是非法的年龄");
		    return false;
		}
	}
}

public class Test7 {
  public static void main(String[] args)
  {
	    Student stu=new Student();
		stu.setAge(19);
		System.out.println("第一个人的年龄是:"+stu.getAge());
		stu.setStudentAge(120);
		stu.setAge(20);
		System.out.println("第二个人的年龄是:"+stu.getAge());
		stu.setStudentAge(30);

  }
}
