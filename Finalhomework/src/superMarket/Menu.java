package superMarket;

import java.util.Scanner;

public class Menu {

	// 登陆
	public static void mainMenu() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.登陆系统\n");
		System.out.println("\t\t\t\t2.退出系统\n");
		System.out.println("\t\t\t\t\t\t\t\t制作者：刘宗璇\n\t\t\t\t\t\t\t\t2016.12.4");
		System.out.println("********************************************************************************\n");
		System.out.print("请输入您的选择：");
	}

	// 登陆系统
	public static void mainMenu01() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.商品管理\n");
		System.out.println("\t\t\t\t2.会员管理\n");
		System.out.println("\t\t\t\t3.结账\n");
		System.out.println("\t\t\t\t4.退出系统\n");
		System.out.println("********************************************************************************\n");
		System.out.print("请输入您的选择：");
	}

	// 商品管理
	public static void mainMenu02() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.添加商品\n");
		System.out.println("\t\t\t\t2.删除商品\n");
		System.out.println("\t\t\t\t3.显示所有商品\n");
		System.out.println("\t\t\t\t4.返回上一级\n");
		System.out.println("********************************************************************************\n");
		System.out.print("请输入您的选择：");
	}

	// 会员管理界面
	public static void mainMenu03() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("\t\t\t\t1.添加会员\n");
		System.out.println("\t\t\t\t2.删除会员\n");
		System.out.println("\t\t\t\t3.显示所有会员\n");
		System.out.println("\t\t\t\t4.返回上一级\n");
		System.out.println("********************************************************************************\n");
		System.out.print("请输入您的选择：");
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
			System.out.println("欢迎下次使用!");
			System.exit(0);
		}
	}
}
