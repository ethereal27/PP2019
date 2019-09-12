import java.util.Scanner;
public class No1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int kecepatanRata = input.nextInt();
        int jarak = kecepatanRata*t;
        double  n = 14;
        double bensin = jarak/n;

        System.out.printf("Bensin yang digunakan : %.3f L ", bensin);
    }
}