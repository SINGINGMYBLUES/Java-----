package Num7;


class Student//����һ��Student����
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


	public Student()//�Ա������г�ʼ��
	{
	  
	}
	
	
	boolean setStudentAge(int newAge)//����һ���޸�����ĺ���
	{
		
		if (newAge>1&&newAge<100)
		{
			System.out.println("ԭ����������:"+getAge());
			System.out.println("�޸ĺ��������:"+newAge);
			return true;
		}
		else
		{
			System.out.println("Ҫ�޸ĵ�������:"+newAge+"���ǷǷ�������");
		    return false;
		}
	}
}

public class Test7 {
  public static void main(String[] args)
  {
	    Student stu=new Student();
		stu.setAge(19);
		System.out.println("��һ���˵�������:"+stu.getAge());
		stu.setStudentAge(120);
		stu.setAge(20);
		System.out.println("�ڶ����˵�������:"+stu.getAge());
		stu.setStudentAge(30);

  }
}
