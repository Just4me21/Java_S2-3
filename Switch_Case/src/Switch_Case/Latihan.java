package Switch_Case;

public class Latihan {

	public static void main(String[] args) {
		
		char nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Wow, kamu hebat!");
                break;
            case 'B':
                System.out.println("Kamu pintar!");
                break;
            case 'C':
                System.out.println("Belajar lagi ya!");
                break;
            case 'D':
                System.out.println("Kamu mungkin kurang belajar!");
                break;
            default:
                System.out.println("Nilai tidak terdaftar!");
        }
	}
}