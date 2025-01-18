package helloJava;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		B4
		System.out.println("Choose");
		System.out.println("1: B1");
		System.out.println("2: B2");
		System.out.println("3: B3");
		System.out.println("4: End");
		System.out.println("You choose: ");
		int k = scanner.nextInt();
		switch (k) {
		case 1:

//			B1
			System.out.println("Bai 1");
			System.out.println("a= ");
			int a1 = scanner.nextInt();
			System.out.println("b= ");
			int b1 = scanner.nextInt();
			if (a1 == 0) {
				if (b1 == 0) {
					System.out.println("Phuong trinh vo so nghiem.");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				System.out.println("x= " + (-b1 / a1));
			}
			break;
		case 2:

//			B2
			System.out.println("Bai 2");
			System.out.println("a= ");
			int a2 = scanner.nextInt();
			System.out.println("b= ");
			int b2 = scanner.nextInt();
			System.out.println("c= ");
			int c2 = scanner.nextInt();
			int d2 = b2 * b2 - 4 * a2 * c2;
			if (d2 < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (d2 == 0) {
				System.out.println("Phuong trinh co nghiem kep: " + (-b2 / (2 * a2)));
			} else {
				System.out.println("Phuong trinh co 2 nghiem: x1 = " + ((-b2 - Math.sqrt(d2)) / (2 * a2)) + ", x2 = "
						+ ((-b2 + Math.sqrt(d2)) / (2 * a2)));
			}
			break;
		case 3:

//			B3
			System.out.println("Bai 3");
			System.out.println("Nhap vao so dien: ");
			int n = scanner.nextInt();
			if (n >= 0 && n <= 100) {
				System.out.println("Tien dien: " + n * 1000);
			} else if (n >= 150) {
				System.out.println("Tien dien: " + (100 * 1000 + (n - 100) * 1500));
			}
			break;
		default:

			System.out.println("End");
			System.exit(0);
		}
		scanner.close();
	}
}
