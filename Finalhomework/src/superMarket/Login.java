package superMarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
	static Scanner in = new Scanner(System.in);

	public static void in()

	{
		System.out.println("\t\t\t\t登录系统\n");

		Map map = new HashMap(); // 定义Map对象
		map.put("admin", "用户名"); // 向集合中添加对象
		map.put("123456", "密码");
		String id;
		while (true) {

			System.out.print("\t\t\t\t请输入用户名：");
			id = in.next();
			boolean a = map.containsKey(id); // 判断是否包含指定的键值
			if (a) { // 如果条件为真
				System.out.print("\t\t\t\t请输入密码：");
				String password = in.next();
				boolean b = map.containsKey(password);
				if (b) {
					System.out.println("\t\t\t\t登陆成功!\n");
					System.out.println(id);
					break;
				} else {
					System.out.println("密码输入错误");
				}
			} else {
				System.out.println("用户名不存在");
			}
		}
	}

}
