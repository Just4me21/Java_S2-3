package Else_If;

public class Latihan1 {

	public static void main(String[] args) {
		
		int tunjangan = 800000;
        int gajiPokok = 2500000;
        double pajak = 0.05;
        double bpjs = 0.03;
        int banyakBulan = 12;

        double gapokTunjangan = gajiPokok + tunjangan;
        double pajakBulan = pajak * gapokTunjangan;
        double bpjsBulan = bpjs * gapokTunjangan;
        double gajiBersih = (gajiPokok + tunjangan) - (pajakBulan + bpjsBulan) * banyakBulan;
        
        System.out.println("Besar Gaji Bersih Toni dalam setahun: " + gajiBersih);
        
        if (gajiBersih > 12000000) {
            System.out.println("Golongan: C");
        } else if (gajiBersih >= 5000000 && gajiBersih <= 11900001) {
            System.out.println("Golongan: B");
        } else {
            System.out.println("Golongan: A");
        }
	}
}
