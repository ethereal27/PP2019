import java.util.Scanner;

class Tugas1 {
	// Diberikan sebuah array dengan panjang n input integer, diikuti input
	// integer elemen-elemennya. Kemudian dengan perulangan sebanyak (n-1)!,
	// print masing-masing setiap dua element yang saling relatif prima satu sama lain.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		

		int elem[] = new int[n];

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp < 2) {
				System.out.println( (i + 1));
				return;
			}
			elem[i] = temp;
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// Syarat bilangan a dan b saling relatif prima jika FPBnya 1
				
				int a = elem[i];
				int b = elem[j];
				int temp;

				while (b != 0) {
					temp = a % b;
					a = b;
					b = temp;
				}

				// Bil. a dan b saling relatif prima jika FPB(a, b) = 1
				if (a == 1) {
					System.out.println(elem[i] + " " + elem[j]);
				}
			}
		}
	}
}