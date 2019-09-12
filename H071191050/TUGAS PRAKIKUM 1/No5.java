import java.util.Scanner;
    public class No5{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Jumlah satuan detik = ");
            int detik = sc.nextInt();
            int jam = detik/3600;
            int sisaDetik1 = detik - (jam*3600);
            int menit = sisaDetik1/60;
            int sisaDetik2 = menit * 60;
            int sisaDetik3 = sisaDetik1 - sisaDetik2;
            System.out.print(jam + ":" + menit + ":" +sisaDetik3);

        }
    }