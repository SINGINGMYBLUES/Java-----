package Num8;

public class Test8 {
	
	  public static void main(String[] args)
	  {
		  UnderGraduate ug=new UnderGraduate("����",23);
		  System.out.println("����:"+ug.getName());
		  System.out.println("����:"+ug.getAge());
		  ug.specialty();
		  
		  System.out.println();
		  
		  Graduate gd=new Graduate("����", 27);
		  System.out.println("����:"+gd.getName());
		  System.out.println("����:"+gd.getAge());
		  gd.studydirection();
	  }
}
