import java.util.Scanner;
public class Tugasprak2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jam, menit, detik;
    int a = sc.nextInt();
    jam = a / 3600;
    menit = (a % 3600) / 60;
    detik = (a % 3600) % 60;
    System.out.printf("%02d : %02d : %02d\n", jam, menit, detik);


       
    }
}