package Else_If;

import java.util.Scanner;

public class Latihan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai: ");
		int nilai = input.nextInt();
		
		if (nilai >= 85 && nilai <= 100) {
			System.out.println("Nilai anda: A");
		}else if (nilai >= 70 && nilai <= 84) {
			System.out.println("Nilai anda: B");
		}else if (nilai >= 55 && nilai <= 69) {
			System.out.println("Nilai anda: C");
		}else if (nilai >= 30 && nilai <= 54) {
			System.out.println("Nilai anda: D");	
		}else if (nilai >= 0 && nilai <= 29) {
			System.out.println("Nilai anda: E");
		}else {
			System.out.println("Nilai anda salah!Silahkan inputkan nilai kembali");
		}
	}
}
