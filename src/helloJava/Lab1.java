package helloJava;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		B1
		System.out.println("Bai 1");
		System.out.println("Nhap ten sinh vien: ");
		String name = scanner.nextLine();
		System.out.println("Nhap so diem: ");
		int score = scanner.nextInt();
		System.out.println("Sinh vien " + name + " duoc " + score + " diem!");
//		B2
		System.out.println("Bai 2");
		System.out.println("Canh thu nhat: ");
		int a = scanner.nextInt();
		System.out.println("Canh thu hai: ");
		int b = scanner.nextInt();
		System.out.println("Chu vi hinh chu nhat: " + (a + b) * 2);
		System.out.println("Dien tich hinh chu nhat: " + (a * b));
		System.out.println("Canh nho hon la: " + Math.min(a, b));
//		B3
		System.out.println("Bai 3");
		System.out.println("Canh cua khoi lap phuong: ");
		int c = scanner.nextInt();
		System.out.println("The tich hinh lap phuong: " + Math.pow(c, 3));
		scanner.close();
	}
}
