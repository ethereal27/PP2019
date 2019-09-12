import java.util.Scanner;
class nomor6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        double jarak1 = Math.tan(Math.toRadians(a))*h;
        double jarak2 = Math.tan(Math.toRadians(b))*h;
        double jarak = jarak1 - jarak2;
        System.out.printf("Panjang Kapal : %.1f m/n", jarak);
    }
}