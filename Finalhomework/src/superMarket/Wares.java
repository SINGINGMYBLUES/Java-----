package superMarket;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Project {
	String WarID;
	double WarNum;
	double WarPrice;

	public String getWarID() {
		return WarID;
	}

	public void setWarID(String warID) {
		this.WarID = warID;
	}

	public double getWarNum() {
		return WarNum;
	}

	public void setWarNum(double warNum) {
		WarNum = warNum;
	}

	public double getWarPrice() {
		return WarPrice;
	}

	public void setWarPrice(double warPrice) {
		this.WarPrice = warPrice;
	}

	public Object entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class Wares {
	static HashMap<String, Project> wares = new HashMap<String, Project>();
	static Scanner in = new Scanner(System.in);

	// 按q键返回上一级的方法
	static void back() {
		String op = in.next();
		if (op.equalsIgnoreCase("Q")) {
			wa();
		}
	}

	public static void wa() {
		Menu.mainMenu02();
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

	// 添加商品
	public static void add() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		Project pro = new Project();
		System.out.print("商品名称：");
		pro.setWarID(in.next());
		System.out.print("商品数量：");
		pro.setWarNum(in.nextInt());
		System.out.print("商品名单价：");
		pro.setWarPrice(in.nextDouble());
		wares.put(pro.getWarID(), pro);
		System.out.println("********************************************************************************\n");
		System.out.println("添加成功！按q键返回:");
		Wares.back();
	}

	// 删除商品
	public static void delete() {
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("请输入商品名称：");
		String m = in.next();
		if (wares.containsKey(m)) {
			Project pro = (Project) wares.get(m);
			System.out.print("找到该商品(按y键进行删除):");
			String op = in.next();
			if (op.equalsIgnoreCase("y")) {
				wares.remove(m);
			}
			System.out.println("删除成功");

			System.out.println("按Q键,返回上一级");
			Wares.back();
			System.out.println("********************************************************************************\n");

		} else {
			System.out.print("没有找到对应的商品，请重新输入（按q键返回）");
			Wares.back();
			System.out.println("********************************************************************************\n");

		}
	}

	// 展示所有商品
	public static void Show() {
		int i = 1;
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		Set<Entry<String, Project>> entrySet = wares.entrySet();
		for (Entry<String, Project> entry : entrySet) {
			Project pro = (Project) wares.get(entry.getKey());
			System.out.println(i + "." + entry.getKey() + "\t\t库存" + pro.getWarNum() + "个,单价" + pro.getWarPrice()
					+ "元,合计" + pro.getWarNum() * pro.getWarPrice() + "元");
			i++;
		}
		System.out.println("********************************************************************************\n");
		System.out.println("按q键返回:");
		Wares.back();
	}

	public static void Check() {
		int a = 1, i = 0;
		double add = 0.00;
		String[] str = new String[10];
		int[] number = new int[10];
		double[] price = new double[10];
		while (a != 0) {
			System.out.println("请输入要购买的商品名称：");
			str[i] = in.next();
			if (wares.containsKey(str[i])) {
				Project pro = (Project) wares.get(str[i]);
				System.out.println("找到该商品");
				System.out.println("请输入要购买的件数：");
				number[i] = in.nextInt();
				price[i] = pro.getWarPrice();
				add = add + (price[i] * number[i]);
				System.out.println("请选择是否继续购买？（是：1/否：0）");
				a = in.nextInt();
				i++;

			} else {
				System.out.print("没有找到对应的商品，请重新输入（按q键返回）");
				Wares.back();
			}
		}
		System.out.println("\n\n\t\t\t欢迎使用丰翼超市管理系统\n" + "\t\t\t" + "你好！admin");
		System.out.println("********************************************************************************\n");
		System.out.println("商品名称\t数量\t单价\t应收");
		for (int j = 0; j < i; j++) {
			System.out.println(str[j] + "\t" + number[j] + "\t" + price[j] + "\t" + number[j] * price[j]);
		}
		System.out.println("============================\n");
		System.out.println("合计：" + "\t\t\t" + add);
		System.out.println("********************************************************************************\n");
		System.out.println("购物愉快！欢迎下次再来！");
		System.out.println("按q键返回上一级:");
		Wares.back();
	}
}