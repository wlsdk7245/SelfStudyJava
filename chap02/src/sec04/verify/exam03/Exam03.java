package sec04.verify.exam03;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. 이름: ");
		String name = scanner.nextLine();

		System.out.print("2. 주민번호 앞 6자리: ");
		String num = scanner.nextLine();

		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();

		System.out.println(name);
		System.out.println(num);
		System.out.println(tel);
	}
}
