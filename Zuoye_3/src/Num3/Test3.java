package Num3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test3 {
   public static void main(String[] args) throws IOException
   {
	   String path=JOptionPane.showInputDialog("������Ŀ¼:");
	   File file=new File(path);
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("������Integer���͵��ַ�:");
	   int a=sc.nextInt();
	   System.out.println("������Double���͵��ַ�:");
	   Double b=sc.nextDouble();
	   System.out.println("������String���͵��ַ�:");
	   String c=sc.next();
	   
	   String f = Integer.toBinaryString(a);
//	   System.out.println(f);//���εĶ�����
	   
	   String res = "";
	   char[] chs = String.valueOf(b).toCharArray();//��bת��ΪString����
	   for(char ch:chs) {
		   res += Integer.toBinaryString(ch)+" ";
	   }
//	   System.out.println(res);//С�����͵Ķ�����
	   
	   String res1="";
	   char[] chs1=String.valueOf(c).toCharArray();
	   for(char ch:chs1) {
		   res1 += Integer.toBinaryString(ch)+" ";
	   }
//	   System.out.println(res1);//�ַ������͵Ķ�����
	   
	   FileOutputStream fos=new FileOutputStream(file,true);
	   BufferedOutputStream bos=new  BufferedOutputStream(fos);
	   
	   String row="Integer���͵Ķ�����:"+f+"\r\n"+"Double���͵Ķ�����:"+res+"\r\n"+"String���͵Ķ�����:"+res1;
	   bos.write(row.getBytes());
	   
	   bos.flush();
	   
	   FileInputStream fis=new FileInputStream(file);
	   BufferedInputStream bis=new BufferedInputStream(fis);
      
	   System.out.println("�ļ���ȡ��������:");
	   byte[] arr=new byte[fis.available()];
	   int length=0;
	   while((length=bis.read(arr))!=-1)
	   {
	    
       }
       System.out.println(new String(arr));
       fis.close();
       bis.close();
	   

	   
   }
}
