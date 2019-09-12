import java.util.Scanner;
class nomor4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int efisiensi = 14;
        System.out.print("Waktu yang ditempuh = ");
        int Waktu = input.nextInt();
        System.out.print("Kecepatan rata-rata = ");
        int kecepatan = input.nextInt();
        float jarak = Waktu * kecepatan;
        float bensin = jarak/efisiensi;
        System.out.printf("Bensin Yang Digunakan = %.3fL", bensin);
    }
}