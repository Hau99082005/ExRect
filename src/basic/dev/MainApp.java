package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap vao chieu dai chieu rong hinh chu nhat
		System.out.println("Nhap vao chieu dai, chieu rong");
		int chieuDai = sc.nextInt();
		int chieuRong = sc.nextInt();
		
		//tinhtoan
		int chuVi = 2 * (chieuDai + chieuRong);
		int dienTich = chieuDai * chieuRong;
		
		//xuat kq
		System.out.println("Chu vi hinh chu nhat la: " +chuVi);
		System.out.println("Dien tich hinh chu nhat la: " +dienTich);
		
	
	}

}
