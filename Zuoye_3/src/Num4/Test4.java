package Num4;

import java.util.Hashtable;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args){
      Hashtable map=new Hashtable();		//创建一个HashMap表
      
      map.put("张三",2600);
      map.put("李小华", 2200);
      map.put("小明", 1880);
      map.put("Samth", 1900);
      map.put("Bob", 1600);
      map.put("Bill", 2300);

      Scanner sc=new Scanner(System.in);
      System.out.println("请输入您想要查询的账户");
      String a=sc.next();
   
      if(map.containsKey(a))
      {
    	  System.out.println(a+"的账户余额为:"+map.get(a));//通过get来得到所对应的Value值
      }
      else
      {
    	  System.out.println("您输入的用户不存在!");
      }
	}

}
