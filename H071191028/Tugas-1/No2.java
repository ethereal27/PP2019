import java.util.Scanner;
public class No2{
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int detik = input.nextInt();
    int jam = (int) (detik/3600);
    int sisa = detik % 3600;
    int menit = (int) (sisa/60);
    sisa = sisa % 60;
    int sekon = (int) sisa;

    System.out.println(jam + ":" + menit + ":" + sekon);
}
}
