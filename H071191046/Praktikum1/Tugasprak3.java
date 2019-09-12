import java.util.Scanner;
public class Tugasprak3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    // h = ketinggian menara
    // a = sudut elevasi pengamat terhadap ujung depan kapal
    // b = sudut elevasi pengamat terhadap ujung belakang kapal

    double alas = Math.tan(Math.toRadians(a))*h;
    double alas1 = Math.tan(Math.toRadians(b))*h;
    double alas2 = alas-alas1;
    
    System.out.printf("Panjang Kapal = %.1f m\n", alas2 );
    }
}