package Num4;

import java.util.Hashtable;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args){
      Hashtable map=new Hashtable();		//����һ��HashMap��
      
      map.put("����",2600);
      map.put("��С��", 2200);
      map.put("С��", 1880);
      map.put("Samth", 1900);
      map.put("Bob", 1600);
      map.put("Bill", 2300);

      Scanner sc=new Scanner(System.in);
      System.out.println("����������Ҫ��ѯ���˻�");
      String a=sc.next();
   
      if(map.containsKey(a))
      {
    	  System.out.println(a+"���˻����Ϊ:"+map.get(a));//ͨ��get���õ�����Ӧ��Valueֵ
      }
      else
      {
    	  System.out.println("��������û�������!");
      }
	}

}
