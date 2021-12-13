package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

import Exam.BookData;

public class Address_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.println("[1]. 추가 [2]. 전체조회 [3]. 삭제 [4]. 검색 [5].종료 ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 전화번호부(AddressList)에 값을 추가할거임
				// 이름, 나이 , 전화번호를 입력받ㅇ아서 -> 객체로 만들어
				// addressList에 저장
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String call = sc.next();
				Address AD = new Address(name, age, call);
				addressList.add(AD);
			} else if (menu == 2) {
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.println((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "세)" + " : " + addressList.get(i).getNumber());
						System.out.println();
					}
				}

			} else if (menu == 3) {
				System.out.println("삭제할 번호를 입력하시오 : ");
				int delnum = sc.nextInt();
				addressList.remove(delnum - 1);
				for (int i = 0; i < addressList.size(); i++) {
					System.out.println((i + 1) + ". " + addressList.get(i).getName() + "(" + addressList.get(i).getAge()
							+ "세)" + " : " + addressList.get(i).getNumber());
					System.out.println();
				}

			} else if (menu == 4) {
				System.out.println("검색할 연락처를 입력하시오 : ");
				String selname = sc.next();
				int cnt = 0;
				boolean chice = false;
				for (int i = 0; i < addressList.size(); i++) {
					if (selname.equals(addressList.get(i).getName())) {
						System.out.println((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "세)" + " : " + addressList.get(i).getNumber());
						cnt++;

					}
				}
				if (cnt == 0) {
					System.out.println("검색한 연락처가 존재하지않습니다.");
				}
			} else if (menu == 5) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
	}
}
