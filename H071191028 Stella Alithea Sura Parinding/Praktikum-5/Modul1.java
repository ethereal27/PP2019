import java.util.Scanner;

public class Modul1{
        //menghitung FPB
        static int menghitungFPB(int a, int b) {
            for (int i = a < b ? a : b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
            return 1;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if ( a <= 0 ) {
                System.out.println("Inputan Tidak Valid");
                return;
            }
            int b = sc.nextInt();
            if( b <= 0 ) {
                System.err.println("Inputan Tidak Valid");
                return;
            }
            System.out.println("FPB dari " + a + " dan " + b + " = " + menghitungFPB(a, b));
        }
}