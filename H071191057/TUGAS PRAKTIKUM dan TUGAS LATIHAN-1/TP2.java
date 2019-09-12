import java.util.Scanner;
class TP2{
    public static void main(String[] args){
        Scanner apa = new Scanner(System.in);
        int detik = apa.nextInt();
        int jam = detik/3600;
        int menit = (detik%3600)/60;
        int detikk = (detik%3600)%60;

        System.out.printf("%02d:%02d:%02d", jam ,menit ,detikk);
    }
}