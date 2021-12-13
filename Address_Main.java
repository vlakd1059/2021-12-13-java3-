package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

import Exam.BookData;

public class Address_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]. �߰� [2]. ��ü��ȸ [3]. ���� [4]. �˻� [5].���� ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// ��ȭ��ȣ��(AddressList)�� ���� �߰��Ұ���
				// �̸�, ���� , ��ȭ��ȣ�� �Է¹ޤ��Ƽ� -> ��ü�� �����
				// addressList�� ����
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String call = sc.next();
				Address AD = new Address(name, age, call);
				addressList.add(AD);
			} else if (menu == 2) {
				if (addressList.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "��)" + " : " + addressList.get(i).getNumber());
						System.out.println();
					}
				}

			} else if (menu == 3) {
				System.out.println("������ ��ȣ�� �Է��Ͻÿ� : ");
				int delnum = sc.nextInt();
				addressList.remove(delnum - 1);
				for (int i = 0; i < addressList.size(); i++) {
					System.out.println((i + 1) + ". " + addressList.get(i).getName() + "(" + addressList.get(i).getAge()
							+ "��)" + " : " + addressList.get(i).getNumber());
					System.out.println();
				}

			} else if (menu == 4) {
				System.out.println("�˻��� ����ó�� �Է��Ͻÿ� : ");
				String selname = sc.next();
				int cnt = 0;
				boolean chice = false;
				for (int i = 0; i < addressList.size(); i++) {
					if (selname.equals(addressList.get(i).getName())) {
						System.out.println((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "��)" + " : " + addressList.get(i).getNumber());
						cnt++;

					}
				}
				if (cnt == 0) {
					System.out.println("�˻��� ����ó�� ���������ʽ��ϴ�.");
				}
			} else if (menu == 5) {
				System.out.println("���α׷� ����.");
				break;
			}
		}
	}
}
