package Num5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentSystem {
	String stuinfo[][]=new String[3][4];//3����,3�ųɼ�
	int num[]={0,0,0};//3���˵�ѧ��
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
		File file=new File("F:/�½��ļ���/Zuoye_3/bin/Num5/StudentScore.txt");
		FileOutputStream fos=new FileOutputStream(file,true);
		BufferedOutputStream bos=new  BufferedOutputStream(fos);
		
		
		for(int i=0;i<stuinfo.length;i++)
		{		
			System.out.println("����������:");
			stuinfo[i][0]=sc.next();//���ÿ��ѧ��������
			
			System.out.println("������ѧ��:");
			num[i]=sc.nextInt();//���ѧ��
			
			for(int j=1;j<stuinfo[i].length;j++)//j=1,j<4;ÿ����һ�������ſεĳɼ�
			{
				System.out.println("�������"+j+"��Ŀ�ĳɼ�");
				stuinfo[i][j]=sc.next();//���ÿ��ѧ���ĳɼ�			
				
				String row=stuinfo[i][0]+"  ѧ����:"+num[i]+"   ��"+j+"�ſ� �ĳɼ���:"+stuinfo[i][j]+"\r\n";
				bos.write(row.getBytes());//ʹ��ƽ̨��Ĭ���ַ������ַ�������Ϊ byte���У���������洢��һ���µ� byte�����С�							
			}
		}
		
		int score[]={0,0,0,};
		for(int i=0;i<stuinfo.length;i++)
		{
			for(int j=1;j<stuinfo[i].length;j++)
			{
				score[i]+=Integer.parseInt(stuinfo[i][j]);//�õ�ÿ��ѧ�����ܷ�
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
		String row1="���ſγ̵���߷�"+score[0]+"\r\n"+"���ſγ̵���ͷ�"+score[2];
		bos.write(row1.getBytes());
		
		bos.flush();
    }
	
	public void CalStuInfo() throws FileNotFoundException//�����ܳɼ�
	{
		
		int score[]={0,0,0,};//�����ܳɼ����鲢���г�ʼ��
		for(int i=0;i<stuinfo.length;i++)
		{
			for(int j=1;j<stuinfo[i].length;j++)
			{
				score[i]+=Integer.parseInt(stuinfo[i][j]);//�õ�ÿ��ѧ�����ܷ�
			}
			System.out.println(stuinfo[i][0]+"���ܷ���:"+score[i]);
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
						/*replace(stuinfo[j1][0], name);//Jav������replace�������ַ����ĸ���,
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
			System.out.println("��"+n+"����:"+stuinfo[m][0]+"  �ɼ���:"+score[m]);
		}
		System.out.println();
		
		System.out.println("��߷���:"+score[0]);
		System.out.println("��ͷ���:"+score[2]);
	}
	
	public void exit()//�˳�ϵͳ
	{
		System.out.println("�Ƿ�Ҫ�˳���ϵͳ?(Y/N)");
		String op=sc.next();
		if(op.equalsIgnoreCase("Y"))
	    System.exit(0);
				
	}
}
