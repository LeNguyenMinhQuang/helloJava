package helloJava;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		Variable
		int a = 6;
		int b;
		b = 9;
		int c = a + b;
		System.out.println("Sum: " + c);
		System.out.printf("Sum = %d", c); // %d: số nguyên; %f: số thực; %.3f:lấy đến sau dấu phải 3 số; %s: string
		String name = "Quang";
		int age = 26;
		System.out.println("\nName: " + name + ", age: " + age);
//		Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name1 = scanner.nextLine(); // nextLine():nhập chuỗi
		System.out.println("Your age is: ");
		int age1 = scanner.nextInt(); // nextInt(): nhập số, nextDouble()
		System.out.println("My name is " + name1 + ", age = " + age1);
		scanner.close(); // đóng scanner lại cho đỡ tốn bộ nhớ
//		Math
		int d = Math.max(a, b);
		System.out.println("d= Max(a,b)= " + d);
//		Data type: Primitive: byte, short, int, long, float, double, boolean, char
//		non-Primitive:  String, Array, Class
//		if else, switch case
//		for, do, while
	}
}
