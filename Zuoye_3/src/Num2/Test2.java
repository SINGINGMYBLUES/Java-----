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
       String path=JOptionPane.showInputDialog("������Ŀ¼·��:");
	   File file=new File(path);//�����û������·�������ļ�
	   file.mkdirs();//���Դ����༶�ļ���
	   
	   long time = file.lastModified();//�����ļ�����޸�ʱ�䣬���Ը�long�ͺ�����
	   String ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time));
	   System.out.println("�û�����Ŀ¼������Ϊ:");	   
	   System.out.println(ctime);
	
	   
	   String path1=JOptionPane.showInputDialog("������Ŀ¼�µ��ļ���:");
	   String path2= path+"/"+path1;
	   File file1=new File(path2);
	   file1.createNewFile();//�ļ�������,�����ļ�
	   
	   //��ʱ�õ����ַ���
	   FileWriter fw=new FileWriter(path2);//�ļ�д�Ĳ���
	   FileReader fr=new FileReader(path2);//�ļ����Ĳ���
	   
	   fw.write("abcdefghijk��ð�");
	   fw.close();
	
	   System.out.println("�ļ�����������:");
	   int ch=0;
	   while((ch=fr.read())!=-1)
	   {
		   System.out.print((char)ch);//��д������ݽ��ж���
	   }
	   fr.close();
   }
}
