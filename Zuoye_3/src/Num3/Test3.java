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
	   String path=JOptionPane.showInputDialog("请输入目录:");
	   File file=new File(path);
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("请输入Integer类型的字符:");
	   int a=sc.nextInt();
	   System.out.println("请输入Double类型的字符:");
	   Double b=sc.nextDouble();
	   System.out.println("请输入String类型的字符:");
	   String c=sc.next();
	   
	   String f = Integer.toBinaryString(a);
//	   System.out.println(f);//整形的二进制
	   
	   String res = "";
	   char[] chs = String.valueOf(b).toCharArray();//将b转换为String类型
	   for(char ch:chs) {
		   res += Integer.toBinaryString(ch)+" ";
	   }
//	   System.out.println(res);//小数类型的二进制
	   
	   String res1="";
	   char[] chs1=String.valueOf(c).toCharArray();
	   for(char ch:chs1) {
		   res1 += Integer.toBinaryString(ch)+" ";
	   }
//	   System.out.println(res1);//字符串类型的二进制
	   
	   FileOutputStream fos=new FileOutputStream(file,true);
	   BufferedOutputStream bos=new  BufferedOutputStream(fos);
	   
	   String row="Integer类型的二进制:"+f+"\r\n"+"Double类型的二进制:"+res+"\r\n"+"String类型的二进制:"+res1;
	   bos.write(row.getBytes());
	   
	   bos.flush();
	   
	   FileInputStream fis=new FileInputStream(file);
	   BufferedInputStream bis=new BufferedInputStream(fis);
      
	   System.out.println("文件读取内容如下:");
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
