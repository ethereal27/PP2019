import java.util.Scanner;

public class Modul2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String karakter = "";

        for (int i = 0; i < input.length(); i++) {
            if(i%2==1){
                karakter = karakter + Character.codePointAt(input, i);
                //mengembalikan kode ASCII dari sebuah char yang di ambil dari String yang bersangkutan
            }
            else{
                karakter = karakter + input.charAt(i);
                //mengembalikan Karakter yang ada di sebuah string bersangkutan sesuai dengan index ke i
            }
        }

        while(karakter.length()%16!=0){
            //karakter kalimat baru dibagi jadi matriks 4x4 yg sama rata, jika masih kosong/tdk cukup, diisi dgn "?"
            karakter = karakter + "?";
        }

        int elemenMatriks = karakter.length()/16;
        String tampung = "";

        for (int i = 0, j = elemenMatriks; i < karakter.length(); i+=elemenMatriks) {
            tampung = tampung + karakter.substring(i, j ) + "%";
            // Substring yang dihasilkan akan dimulai dari karakter pada indeks ke i sampai dengan karakter pada indeks ke j
            j+=elemenMatriks;
            
        }

        String [] arr = tampung.split("%");

        String [][] matrix = new String[4][4];
        for (int i = 0, k = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = arr[k];
                k++;
            }
            
        }
        for (int i = 0, k = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}