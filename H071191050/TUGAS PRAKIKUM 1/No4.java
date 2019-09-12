import java.util.Scanner;
    public class No4{
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int efisiensi = 14;
            System.out.print("Waktu =  ");
            int waktu = sc.nextInt();
            System.out.print("Kecepatan rata rata = "); 
            int kecepatanRataRata = sc.nextInt();
            float jarak = waktu*kecepatanRataRata;
            float penggunaanBensin = jarak/efisiensi;
            System.out.printf("Bensin yang terpakai = %.3fL", penggunaanBensin);
        }
 }