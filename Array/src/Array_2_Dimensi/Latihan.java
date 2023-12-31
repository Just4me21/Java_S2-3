package Array_2_Dimensi;

public class Latihan {

	public static void main(String[] args) {
		
int [][] data = {{7,3,8},{4,2,5}};
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j+=2) {
				System.out.print(data[i][j] +" ");
			}
			System.out.println();
		}

	}

}
