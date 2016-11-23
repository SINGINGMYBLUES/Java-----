package Num1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
 public static void main(String[] args) throws IOException {
  int select = 0;
  select = welcome();
  if (select == 1 || select == 2) {
   writeLetter(select);
  } else {
   viewLetter();
  }
 }

 private static int welcome() {
  int num = 0;//用于第一层菜单的选择
  int num1 = 0;//用于第二层菜单的选择
  do {
   System.out.println("1：编写请假条");
   System.out.println("2：查看请假条");
   System.out.print("请选择功能号：");
   Scanner in = new Scanner(System.in);
   num = in.nextInt();
  } while (num != 1 && num != 2);//若输出的数字不为1或2，则继续选择
  if (num == 1) {
   do {
    System.out.println("1:病假");
    System.out.println("2:事假");
    System.out.print("请选择功能号：");
    Scanner in = new Scanner(System.in);
    num1 = in.nextInt();
   } while (num1 != 1 && num1 != 2);
   return num1;
  } else {//当输入的是2（查看请假条），则任意返回一个值。
   return 0;
  }
 }

 private static void viewLetter() {//查看请假条
  File letter = new File("c:\\Letter\\Letter.txt");
  try {
   FileInputStream view = new FileInputStream(letter);
   byte b[] = new byte[view.available()];
   
   while (view.read(b) != -1) {
    FilterOutputStream viewContain=new FilterOutputStream(System.out); 
    System.out.println("假条内容如下：");
    viewContain.write(b);
    viewContain.close();
   }
   view.close();
  } catch (FileNotFoundException e) {
   System.out.println("文件不存在！！！");
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }

 }

 private static void writeLetter(int num1) {//写请假条
  String str = new String();
  if (num1 == 1)
   str = "我因发烧，请假一天 ";
  else
   str = "参加婚礼，于4.10请假一天";
  File letter = new File("c:\\Letter\\Letter.txt");
  StringBuilder contain = new StringBuilder();
  Scanner in = new Scanner(System.in);
  System.out.print("寄信人地址：");
  contain.append("寄信人地址：" + in.nextLine() + "\r\n");
  System.out.print("收件人地址：");
  contain.append("收件人地址：" + in.nextLine() + "\r\n");
  System.out.print("签名：");
  contain.append("签名：" + in.nextLine() + "\r\n");
  System.out.print("日期：");
  contain.append("日期：" + in.nextLine() + "\r\n");
  contain.append(str);
  byte[] input = contain.toString().getBytes();
  try {
   FileOutputStream out = new FileOutputStream(letter);
   out.write(input, 0, input.length);
   System.out.println("请假条生成成功！！！");
   out.close();
  } catch (FileNotFoundException e) {
   System.out.println("文件不存在！！！");
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
