package Looping_for;

import java.util.Scanner;

public class Looping_for_range {

	public static void main(String[] args) {
		Scanner masuk = new Scanner (System.in);
		int awal, akhir;
		System.out.println("Range Angka");
		System.out.print("awal   : ");
		awal = masuk.nextInt();
		System.out.print("akhir  : ");
		akhir = masuk.nextInt();
		for(int a = awal; a <= akhir; a++) {
			System.out.println(a);
		}
				
	}

}
