import java.util.Scanner;
public class No3{
    public static void main(String[]args){
        Scanner kapal = new Scanner(System.in);
        float h = kapal.nextFloat();
        float a = kapal.nextFloat();
        float b = kapal.nextFloat();
        
        double sudut1  = Math.tan(Math.toRadians(a));
        double alas1 = sudut1*h;
        double sudut2 = Math.tan(Math.toRadians(b));
        double alas2 = sudut2*h;
        double panjang = alas1-alas2;

        System.out.printf("Panjang Kapal : %.1f m ", panjang);
    }
}