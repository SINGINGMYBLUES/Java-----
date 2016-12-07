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

	// ��q��������һ���ķ���
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

		case 4:// ������һ��
			Manage.ma();
			break;

		default:

			System.out.println("�������������,������.");

			break;

		}
	}

	// �����Ʒ
	public static void add() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		Project pro = new Project();
		System.out.print("��Ʒ���ƣ�");
		pro.setWarID(in.next());
		System.out.print("��Ʒ������");
		pro.setWarNum(in.nextInt());
		System.out.print("��Ʒ�����ۣ�");
		pro.setWarPrice(in.nextDouble());
		wares.put(pro.getWarID(), pro);
		System.out.println("********************************************************************************\n");
		System.out.println("��ӳɹ�����q������:");
		Wares.back();
	}

	// ɾ����Ʒ
	public static void delete() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("��������Ʒ���ƣ�");
		String m = in.next();
		if (wares.containsKey(m)) {
			Project pro = (Project) wares.get(m);
			System.out.print("�ҵ�����Ʒ(��y������ɾ��):");
			String op = in.next();
			if (op.equalsIgnoreCase("y")) {
				wares.remove(m);
			}
			System.out.println("ɾ���ɹ�");

			System.out.println("��Q��,������һ��");
			Wares.back();
			System.out.println("********************************************************************************\n");

		} else {
			System.out.print("û���ҵ���Ӧ����Ʒ�����������루��q�����أ�");
			Wares.back();
			System.out.println("********************************************************************************\n");

		}
	}

	// չʾ������Ʒ
	public static void Show() {
		int i = 1;
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		Set<Entry<String, Project>> entrySet = wares.entrySet();
		for (Entry<String, Project> entry : entrySet) {
			Project pro = (Project) wares.get(entry.getKey());
			System.out.println(i + "." + entry.getKey() + "\t\t���" + pro.getWarNum() + "��,����" + pro.getWarPrice()
					+ "Ԫ,�ϼ�" + pro.getWarNum() * pro.getWarPrice() + "Ԫ");
			i++;
		}
		System.out.println("********************************************************************************\n");
		System.out.println("��q������:");
		Wares.back();
	}

	public static void Check() {
		int a = 1, i = 0;
		double add = 0.00;
		String[] str = new String[10];
		int[] number = new int[10];
		double[] price = new double[10];
		while (a != 0) {
			System.out.println("������Ҫ�������Ʒ���ƣ�");
			str[i] = in.next();
			if (wares.containsKey(str[i])) {
				Project pro = (Project) wares.get(str[i]);
				System.out.println("�ҵ�����Ʒ");
				System.out.println("������Ҫ����ļ�����");
				number[i] = in.nextInt();
				price[i] = pro.getWarPrice();
				add = add + (price[i] * number[i]);
				System.out.println("��ѡ���Ƿ�������򣿣��ǣ�1/��0��");
				a = in.nextInt();
				i++;

			} else {
				System.out.print("û���ҵ���Ӧ����Ʒ�����������루��q�����أ�");
				Wares.back();
			}
		}
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("��Ʒ����\t����\t����\tӦ��");
		for (int j = 0; j < i; j++) {
			System.out.println(str[j] + "\t" + number[j] + "\t" + price[j] + "\t" + number[j] * price[j]);
		}
		System.out.println("============================\n");
		System.out.println("�ϼƣ�" + "\t\t\t" + add);
		System.out.println("********************************************************************************\n");
		System.out.println("������죡��ӭ�´�������");
		System.out.println("��q��������һ��:");
		Wares.back();
	}
}