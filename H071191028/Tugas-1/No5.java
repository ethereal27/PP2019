import java.util.Scanner;
public class No5{
    public static void main(String[]args){
       Scanner duit = new Scanner(System.in);
     
       int uang = duit.nextInt();

       int seratusRibu = (int)(uang / 100000);
       int sisa = uang % 100000;
       int limapuluhRibu = (int) (sisa / 50000);
       sisa = sisa % 50000;
       int duapuluhRibu = (int)(sisa / 20000);
       sisa =  sisa % 20000;
       int sepuluhRibu = (int)(sisa / 10000);
        sisa = sisa % 10000;
       int limaRibu = (int) (sisa /5000);
       sisa = sisa % 5000;
       int duaRibu = (int) (sisa /2000);
       sisa = sisa % 2000;
       int seribu = (int) (sisa /1000);
       sisa = sisa % 1000;

        System.out.println("Jumlah uang Rp.100.000 = " + seratusRibu);
        System.out.println("Jumlah uang Rp.50.000 = " + limapuluhRibu);
        System.out.println("Jumlah uang Rp.20.000 = " + duapuluhRibu);
        System.out.println("Jumlah uang Rp.10.000 = " + sepuluhRibu);
        System.out.println("Jumlah uang Rp.5.000 = " + limaRibu);
        System.out.println("Jumlah uang Rp.2.000 = " + duaRibu);
        System.out.println("Jumlah uang Rp.1.000 = " + seribu);



    }
}