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
  int num = 0;//���ڵ�һ��˵���ѡ��
  int num1 = 0;//���ڵڶ���˵���ѡ��
  do {
   System.out.println("1����д�����");
   System.out.println("2���鿴�����");
   System.out.print("��ѡ���ܺţ�");
   Scanner in = new Scanner(System.in);
   num = in.nextInt();
  } while (num != 1 && num != 2);//����������ֲ�Ϊ1��2�������ѡ��
  if (num == 1) {
   do {
    System.out.println("1:����");
    System.out.println("2:�¼�");
    System.out.print("��ѡ���ܺţ�");
    Scanner in = new Scanner(System.in);
    num1 = in.nextInt();
   } while (num1 != 1 && num1 != 2);
   return num1;
  } else {//���������2���鿴��������������ⷵ��һ��ֵ��
   return 0;
  }
 }

 private static void viewLetter() {//�鿴�����
  File letter = new File("c:\\Letter\\Letter.txt");
  try {
   FileInputStream view = new FileInputStream(letter);
   byte b[] = new byte[view.available()];
   
   while (view.read(b) != -1) {
    FilterOutputStream viewContain=new FilterOutputStream(System.out); 
    System.out.println("�����������£�");
    viewContain.write(b);
    viewContain.close();
   }
   view.close();
  } catch (FileNotFoundException e) {
   System.out.println("�ļ������ڣ�����");
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }

 }

 private static void writeLetter(int num1) {//д�����
  String str = new String();
  if (num1 == 1)
   str = "�����գ����һ�� ";
  else
   str = "�μӻ�����4.10���һ��";
  File letter = new File("c:\\Letter\\Letter.txt");
  StringBuilder contain = new StringBuilder();
  Scanner in = new Scanner(System.in);
  System.out.print("�����˵�ַ��");
  contain.append("�����˵�ַ��" + in.nextLine() + "\r\n");
  System.out.print("�ռ��˵�ַ��");
  contain.append("�ռ��˵�ַ��" + in.nextLine() + "\r\n");
  System.out.print("ǩ����");
  contain.append("ǩ����" + in.nextLine() + "\r\n");
  System.out.print("���ڣ�");
  contain.append("���ڣ�" + in.nextLine() + "\r\n");
  contain.append(str);
  byte[] input = contain.toString().getBytes();
  try {
   FileOutputStream out = new FileOutputStream(letter);
   out.write(input, 0, input.length);
   System.out.println("��������ɳɹ�������");
   out.close();
  } catch (FileNotFoundException e) {
   System.out.println("�ļ������ڣ�����");
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
