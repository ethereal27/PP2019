import java.util.Scanner;
    public class No3{
        public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            int a;
            int b;
            System.out.print("Uang keseluruhan = Rp");
            a = sc.nextInt();
            b = a/100000;
            System.out.println("Jumlah uang Rp. 100.000 = " + b);
            a = a % 100000;
            b = a/50000;
            System.out.println("Jumlah uang Rp.50.000 = " + b);
            a = a % 50000;
            b = a/20000;
            System.out.println("Jumlah uang Rp 20.000 = " + b);
            a %= 20000;
            b = a/10000;
            System.out.println("Jumlah uang Rp 10.000 = " + b);
            a %= 10000;
            b = a/5000;
            System.out.println("Jumlah uang Rp 5.000 = " + b);
            a %= 5000;
            b = a/2000;
            System.out.println("Jumlah uang Rp 2.000 = " + b);
            a %= 2000;
            b = a/1000;
            System.out.println("Jumlah uang Rp 1.000 = " + b);
    }

}