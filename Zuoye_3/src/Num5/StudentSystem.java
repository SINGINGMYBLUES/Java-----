package Num5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentSystem {
	String stuinfo[][]=new String[3][4];//3个人,3门成绩
	int num[]={0,0,0};//3个人的学号
	Scanner sc=new Scanner(System.in);
	
	
	public void startSystem() throws IOException
	{
		String isContinue = "y";
		do {
			Menu.systemMenu();
			int select=0;
			select=sc.nextInt();
			
			switch (select) {
			case 1:
				addStuInfo();
				break;
                     
			case 2:
				CalStuInfo();
				break;
        
			case 3:
	            exit();
				break;
         
			default:
				break;
			}
		} while (isContinue.equalsIgnoreCase("y"));
	}
	
	public void addStuInfo() throws IOException
	{
		File file=new File("F:/新建文件夹/Zuoye_3/bin/Num5/StudentScore.txt");
		FileOutputStream fos=new FileOutputStream(file,true);
		BufferedOutputStream bos=new  BufferedOutputStream(fos);
		
		
		for(int i=0;i<stuinfo.length;i++)
		{		
			System.out.println("请输入姓名:");
			stuinfo[i][0]=sc.next();//获得每个学生的姓名
			
			System.out.println("请输入学号:");
			num[i]=sc.nextInt();//获得学号
			
			for(int j=1;j<stuinfo[i].length;j++)//j=1,j<4;每个人一共有三门课的成绩
			{
				System.out.println("请输入第"+j+"科目的成绩");
				stuinfo[i][j]=sc.next();//获得每个学生的成绩			
				
				String row=stuinfo[i][0]+"  学号是:"+num[i]+"   第"+j+"门课 的成绩是:"+stuinfo[i][j]+"\r\n";
				bos.write(row.getBytes());//使用平台的默认字符集将字符串编码为 byte序列，并将结果存储到一个新的 byte数组中。							
			}
		}
		
		int score[]={0,0,0,};
		for(int i=0;i<stuinfo.length;i++)
		{
			for(int j=1;j<stuinfo[i].length;j++)
			{
				score[i]+=Integer.parseInt(stuinfo[i][j]);//得到每个学生的总分
			}
		}
		int temp=0;
		for(int i1=0;i1<2;i1++)
		{
			for(int j1=i1+1;j1<3;j1++)
			{
				if(score[i1]<score[j1])
				{
					temp=score[j1];
					score[j1]=score[i1];
					score[i1]=temp;
				}
		     }
		}
		String row1="三门课程的最高分"+score[0]+"\r\n"+"三门课程的最低分"+score[2];
		bos.write(row1.getBytes());
		
		bos.flush();
    }
	
	public void CalStuInfo() throws FileNotFoundException//计算总成绩
	{
		
		int score[]={0,0,0,};//定义总成绩数组并进行初始化
		for(int i=0;i<stuinfo.length;i++)
		{
			for(int j=1;j<stuinfo[i].length;j++)
			{
				score[i]+=Integer.parseInt(stuinfo[i][j]);//得到每个学生的总分
			}
			System.out.println(stuinfo[i][0]+"的总分是:"+score[i]);
		}
		System.out.println();
		int temp=0;
		String name="null";
		for(int i1=0;i1<2;i1++)
			{
				for(int j1=i1+1;j1<3;j1++)
				{
					if(score[i1]<score[j1])
					{
						/*replace(stuinfo[j1][0], name);//Jav中是用replace来进行字符串的复制,
						replace(stuinfo[i1][0], stuinfo[j1][0]);
						replace(name, stuinfo[i1][0]);*/
				       
					    name=stuinfo[j1][0];
					    stuinfo[j1][0]=stuinfo[i1][0];
					    stuinfo[i1][0]=name;
						
						temp=score[j1];
						score[j1]=score[i1];
						score[i1]=temp;
					}
				}
			}
		for(int m=0;m<3;m++)
		{
			int n=m+1;
			System.out.println("第"+n+"名是:"+stuinfo[m][0]+"  成绩是:"+score[m]);
		}
		System.out.println();
		
		System.out.println("最高分是:"+score[0]);
		System.out.println("最低分是:"+score[2]);
	}
	
	public void exit()//退出系统
	{
		System.out.println("是否要退出该系统?(Y/N)");
		String op=sc.next();
		if(op.equalsIgnoreCase("Y"))
	    System.exit(0);
				
	}
}
