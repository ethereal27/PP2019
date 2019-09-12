import java.util.Scanner;
class nomor5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satuan detik = ");
        int detik = input.nextInt();
        int jam = detik/3600;
        int detik1 = detik - (jam*3600);
        int menit = detik1/60;
        int detik2 = menit * 60;
        int detik3 = detik1 - detik2;
        System.out.print(jam + ":" + menit + ":" +detik3);
    }
}