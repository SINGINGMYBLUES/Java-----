package superMarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
	static Scanner in = new Scanner(System.in);

	public static void in()

	{
		System.out.println("\t\t\t\t��¼ϵͳ\n");

		Map map = new HashMap(); // ����Map����
		map.put("admin", "�û���"); // �򼯺�����Ӷ���
		map.put("123456", "����");
		String id;
		while (true) {

			System.out.print("\t\t\t\t�������û�����");
			id = in.next();
			boolean a = map.containsKey(id); // �ж��Ƿ����ָ���ļ�ֵ
			if (a) { // �������Ϊ��
				System.out.print("\t\t\t\t���������룺");
				String password = in.next();
				boolean b = map.containsKey(password);
				if (b) {
					System.out.println("\t\t\t\t��½�ɹ�!\n");
					System.out.println(id);
					break;
				} else {
					System.out.println("�����������");
				}
			} else {
				System.out.println("�û���������");
			}
		}
	}

}
