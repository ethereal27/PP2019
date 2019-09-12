import java.util.Scanner;
public class Tugasprak4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a/100000);
        int sisa = a % 100000;
        int c = (sisa / 50000);
        sisa = sisa % 50000;
        int d = (sisa / 20000);
        sisa = sisa % 20000;
        int e = (sisa / 10000);
        sisa = sisa % 10000;
        int f = (sisa / 5000);
        sisa = sisa % 5000;
        int g = (sisa / 2000);
        sisa = sisa % 2000;
        int h = (sisa / 1000);

        System.out.println("Jumlah Uang Rp. 100.000 = " + b );
        System.out.println("Jumlah Uang Rp. 50.000 = " + c);
        System.out.println("Jumlah Uang Rp. 20.000 = " + d);
        System.out.println("Jumlah Uang Rp. 10.000 = " + e);
        System.out.println("Jumlah Uang Rp. 5.000 = " + f);
        System.out.println("Jumlah Uang Rp. 2.000 = " + g);
        System.out.println("Jumlah Uang Rp. 1.000 = " + h);

    }
}