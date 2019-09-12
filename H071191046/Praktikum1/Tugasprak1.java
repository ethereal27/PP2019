import java.util.Scanner;
public class Tugasprak1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int waktu = sc.nextInt();
    int kecepatan = sc.nextInt();
    double efisiensi = 14;
    double hasil = (waktu * kecepatan) / efisiensi;
    System.out.printf("Bensin yang terpakai %.3f L\n" , hasil);    
    }
}