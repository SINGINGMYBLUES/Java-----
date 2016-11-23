package Num8;

public class Test8 {
	
	  public static void main(String[] args)
	  {
		  UnderGraduate ug=new UnderGraduate("王军",23);
		  System.out.println("姓名:"+ug.getName());
		  System.out.println("年龄:"+ug.getAge());
		  ug.specialty();
		  
		  System.out.println();
		  
		  Graduate gd=new Graduate("刘君", 27);
		  System.out.println("姓名:"+gd.getName());
		  System.out.println("年龄:"+gd.getAge());
		  gd.studydirection();
	  }
}
