import java.util.Scanner;

class Tugas2 {
	// Menerima sebuah input integer i, j, k yang merupakan ukuran dari dua
	// buah array 2D (matriks) A_ij dan B_jk diikuti input integer
	// elemen-elemennya. Buatlah program perkalian matriks A_ij x B_jk
	// sehingga menghasilkan sebuah matriks yang berordo C_ik
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		if (i < 1 || j < 1 || k < 1) {
			
			return;
		}

		int a[][] = new int[i][j];
		int b[][] = new int[j][k];

		// Input matriks A
		for (int l = 0; l < i; l++) {
			for (int m = 0; m < j; m++) {
				a[l][m] = sc.nextInt();
			}
		}

		// Input matriks B
		for (int l = 0; l < j; l++) {
			for (int m = 0; m < k; m++) {
				b[l][m] = sc.nextInt();
			}
		}

		for (int l = 0; l < i; l++) {
			for (int m = 0; m < k; m++) {
				int sum = 0;
				for (int o = 0; o < j; o++) {
					sum += a[l][o] * b[o][m];
				}

				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}