package superMarket;

import java.util.Scanner;

public class Menu {

	// ��½
	public static void mainMenu() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.��½ϵͳ\n");
		System.out.println("\t\t\t\t2.�˳�ϵͳ\n");
		System.out.println("\t\t\t\t\t\t\t\t�����ߣ������\n\t\t\t\t\t\t\t\t2016.12.4");
		System.out.println("********************************************************************************\n");
		System.out.print("����������ѡ��");
	}

	// ��½ϵͳ
	public static void mainMenu01() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.��Ʒ����\n");
		System.out.println("\t\t\t\t2.��Ա����\n");
		System.out.println("\t\t\t\t3.����\n");
		System.out.println("\t\t\t\t4.�˳�ϵͳ\n");
		System.out.println("********************************************************************************\n");
		System.out.print("����������ѡ��");
	}

	// ��Ʒ����
	public static void mainMenu02() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.�����Ʒ\n");
		System.out.println("\t\t\t\t2.ɾ����Ʒ\n");
		System.out.println("\t\t\t\t3.��ʾ������Ʒ\n");
		System.out.println("\t\t\t\t4.������һ��\n");
		System.out.println("********************************************************************************\n");
		System.out.print("����������ѡ��");
	}

	// ��Ա�������
	public static void mainMenu03() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.��ӻ�Ա\n");
		System.out.println("\t\t\t\t2.ɾ����Ա\n");
		System.out.println("\t\t\t\t3.��ʾ���л�Ա\n");
		System.out.println("\t\t\t\t4.������һ��\n");
		System.out.println("********************************************************************************\n");
		System.out.print("����������ѡ��");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		mainMenu();
		String x = in.next();
		if (x.equals("1")) {
			Login.in();
			Manage.ma();

		} else {
			System.out.println("��ӭ�´�ʹ��!");
			System.exit(0);
		}
	}
}
