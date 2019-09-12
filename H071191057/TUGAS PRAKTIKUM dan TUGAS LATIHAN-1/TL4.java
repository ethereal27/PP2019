import java.util.Scanner;
class TL4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int seratus = a / 100000;
        int sisa1 = a % 100000;

        int limaPuluh = sisa1 / 50000;
        sisa1 = sisa1 % 50000;

        int duaPuluh = sisa1 / 20000;
        sisa1 = sisa1 % 20000;

        int sePuluh = sisa1 / 10000;
        sisa1 = sisa1 % 10000;

        int lima = sisa1 / 5000;
        sisa1 = sisa1 % 5000;

        int dua = sisa1 / 2000;
        sisa1 = sisa1 % 2000;

        int seribu = sisa1 / 1000;

        System.out.println("Jumlah uang Rp.100.000 = " + seratus);
        System.out.println("Jumlah uang Rp.50.000 = " + limaPuluh);
        System.out.println("Jumlah uang Rp.20.000 = " + duaPuluh);
        System.out.println("Jumlah uang Rp.10.000 = " + sePuluh);
        System.out.println("Jumlah uang Rp.5.000 = " + lima);
        System.out.println("Jumlah uang Rp.2.000 = " + dua);
        System.out.println("Jumlah uang Rp.1.000 = " + seribu);
    }
}