package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap vao chieu dai chieu rong hinh chu nhat
		System.out.println("Nhap vao chieu dai, chieu rong");
		int cd = sc.nextInt();
		int cr = sc.nextInt();
		
		//xuat kq
		System.out.println("Chu vi hinh chu nhat la: " + (2 * cd + cr * 2));
		System.out.println("Dien tich hinh chu nhat la: " + cd*cr);
		
	
	}

}
