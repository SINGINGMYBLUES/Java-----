package superMarket;

import java.util.Scanner;

public class Manage {
	static Scanner in = new Scanner(System.in);

	public static void ma() {
		Menu.mainMenu01();
		int op = in.nextInt();
		switch (op) {

		case 1:
			Wares.wa(); // ��Ʒ����
			break;

		case 2:
			Member.me(); // ��Ա����
			break;

		case 3:
			Wares.Check();// ����
			break;

		case 4:
			System.out.println("��ӭ�´�ʹ��!");
			System.exit(0);
			break;

		default:
			System.out.println("�������������,�����ԡ�");

			break;

		}
	}
}
