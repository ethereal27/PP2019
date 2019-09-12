import java.util.Scanner;
    public class No6{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("nilai h = ");
            double h = sc.nextDouble();
            System.out.print("nilai a = ");
            double a = sc.nextDouble();
            System.out.print("nilai b = ");
            double b = sc.nextDouble();
            double x1 = Math.tan(Math.toRadians(a))*h;
            double x2 = Math.tan(Math.toRadians(b))*h;
            double panjangKapal = (x1 - x2);
            System.out.printf("panjang kapal = %.1f m", panjangKapal);
    }
}