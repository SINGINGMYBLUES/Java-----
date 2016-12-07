package superMarket;

import java.util.Scanner;

public class Manage {
	static Scanner in = new Scanner(System.in);

	public static void ma() {
		Menu.mainMenu01();
		int op = in.nextInt();
		switch (op) {

		case 1:
			Wares.wa(); // 商品管理
			break;

		case 2:
			Member.me(); // 会员管理
			break;

		case 3:
			Wares.Check();// 结账
			break;

		case 4:
			System.out.println("欢迎下次使用!");
			System.exit(0);
			break;

		default:
			System.out.println("你输入的有问题,请重试。");

			break;

		}
	}
}
