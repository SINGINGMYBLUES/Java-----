package superMarket;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class People {
	String MemID;
	String MemName;
	double MemPoint;
	String MemPhone;

	public String getMemID() {
		return MemID;
	}

	public void setMemID(String memID) {
		MemID = memID;
	}

	public String getMemName() {
		return MemName;
	}

	public void setMemName(String memName) {
		MemName = memName;
	}

	public double getMemPoint() {
		return MemPoint;
	}

	public void setMemPoint(double memPoint) {
		MemPoint = memPoint;
	}

	public String getMemPhone() {
		return MemPhone;
	}

	public void setMemPhone(String memPhone) {
		MemPhone = memPhone;
	}
}

public class Member {
	static HashMap<String, People> member = new HashMap<String, People>();
	static Scanner in = new Scanner(System.in);

	// 按q键返回上一级的方法
	static void back1() {
		String op = in.next();
		if (op.equalsIgnoreCase("Q")) {
			Menu.mainMenu03();
			me();
		}
	}

	public static void me() {
		Menu.mainMenu03();
		int op = in.nextInt();
		switch (op) {

		case 1:
			add();
			break;

		case 2:
			delete();
			break;

		case 3:
			Show();

			break;

		case 4:// 返回上一级
			Manage.ma();
			break;

		default:

			System.out.println("你输入的有问题,请重试.");

			break;

		}
	}

	// 添加会员
	public static void add() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		People peo = new People();
		System.out.print("会员编号：");
		peo.setMemID(in.next());
		System.out.print("会员姓名：");
		peo.setMemName(in.next());
		System.out.print("会员积分：");
		peo.setMemPoint(in.nextDouble());
		System.out.print("会员电话：");
		peo.setMemPhone(in.next());
		member.put(peo.getMemID(), peo);
		System.out.println("********************************************************************************\n");
		System.out.println("添加成功！按q键返回:");
		Member.back1();
	}

	// 删除会员
	public static void delete() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("请输入会员编号：");
		String m = in.next();
		System.out.println();
		if (member.containsKey(m)) {
			People peo = (People) member.get(m);
			System.out.print("找到该会员(按y键进行删除):");
			String op = in.next();
			if (op.equalsIgnoreCase("y")) {
				member.remove(m);
			}
			System.out.println("删除成功");

			System.out.println("按Q键,返回上一级");
			Member.back1();
			System.out.println("********************************************************************************\n");

		} else {
			System.out.print("没有找到对应的会员，请重新输入（按q键返回）");
			Member.back1();
			System.out.println("********************************************************************************\n");

		}
	}

	// 展示所有会员
	public static void Show() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		Set<Entry<String, People>> entrySet = member.entrySet();
		for (Entry<String, People> entry : entrySet) {
			People peo = (People) member.get(entry.getKey());
			System.out.println("编号\t姓名\t积分\t电话");
			System.out
					.println(entry.getKey() + "\t" + peo.MemName + "\t" + peo.getMemPoint() + "\t" + peo.getMemPhone());
		}
		System.out.println("********************************************************************************\n");
		System.out.println("按q键返回:");
		Member.back1();
	}
}
