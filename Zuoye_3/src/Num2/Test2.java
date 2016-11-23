package Num2;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Test2 {
   public static void main(String[] args) throws IOException
   {
       String path=JOptionPane.showInputDialog("请输入目录路径:");
	   File file=new File(path);//根据用户输入的路径创建文件
	   file.mkdirs();//可以创建多级文件夹
	   
	   long time = file.lastModified();//返回文件最后修改时间，是以个long型毫秒数
	   String ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time));
	   System.out.println("用户创建目录的日期为:");	   
	   System.out.println(ctime);
	
	   
	   String path1=JOptionPane.showInputDialog("请输入目录下的文件名:");
	   String path2= path+"/"+path1;
	   File file1=new File(path2);
	   file1.createNewFile();//文件不存在,创建文件
	   
	   //此时用的是字符流
	   FileWriter fw=new FileWriter(path2);//文件写的操作
	   FileReader fr=new FileReader(path2);//文件读的操作
	   
	   fw.write("abcdefghijk你好啊");
	   fw.close();
	
	   System.out.println("文件的内容如下:");
	   int ch=0;
	   while((ch=fr.read())!=-1)
	   {
		   System.out.print((char)ch);//将写入的数据进行读出
	   }
	   fr.close();
   }
}
