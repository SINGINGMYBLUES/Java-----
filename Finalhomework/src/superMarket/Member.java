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

	// ��q��������һ���ķ���
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

		case 4:// ������һ��
			Manage.ma();
			break;

		default:

			System.out.println("�������������,������.");

			break;

		}
	}

	// ��ӻ�Ա
	public static void add() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		People peo = new People();
		System.out.print("��Ա��ţ�");
		peo.setMemID(in.next());
		System.out.print("��Ա������");
		peo.setMemName(in.next());
		System.out.print("��Ա���֣�");
		peo.setMemPoint(in.nextDouble());
		System.out.print("��Ա�绰��");
		peo.setMemPhone(in.next());
		member.put(peo.getMemID(), peo);
		System.out.println("********************************************************************************\n");
		System.out.println("��ӳɹ�����q������:");
		Member.back1();
	}

	// ɾ����Ա
	public static void delete() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		System.out.println("�������Ա��ţ�");
		String m = in.next();
		System.out.println();
		if (member.containsKey(m)) {
			People peo = (People) member.get(m);
			System.out.print("�ҵ��û�Ա(��y������ɾ��):");
			String op = in.next();
			if (op.equalsIgnoreCase("y")) {
				member.remove(m);
			}
			System.out.println("ɾ���ɹ�");

			System.out.println("��Q��,������һ��");
			Member.back1();
			System.out.println("********************************************************************************\n");

		} else {
			System.out.print("û���ҵ���Ӧ�Ļ�Ա�����������루��q�����أ�");
			Member.back1();
			System.out.println("********************************************************************************\n");

		}
	}

	// չʾ���л�Ա
	public static void Show() {
		System.out.println("\n\n\t\t\t��ӭʹ�÷����й���ϵͳ\n" + "\t\t\t" + "��ã�admin");
		System.out.println("********************************************************************************\n");
		Set<Entry<String, People>> entrySet = member.entrySet();
		for (Entry<String, People> entry : entrySet) {
			People peo = (People) member.get(entry.getKey());
			System.out.println("���\t����\t����\t�绰");
			System.out
					.println(entry.getKey() + "\t" + peo.MemName + "\t" + peo.getMemPoint() + "\t" + peo.getMemPhone());
		}
		System.out.println("********************************************************************************\n");
		System.out.println("��q������:");
		Member.back1();
	}
}
