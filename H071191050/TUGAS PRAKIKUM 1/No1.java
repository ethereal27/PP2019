import java.util.Scanner;
    public class No1{
        public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Informasi");
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Tinggi badan : ");
            int tb = sc.nextInt();
            System.out.print("Berat badan : ");
            int bb = sc.nextInt();
            double presentasi = (double) 10/100;
            double bbi = tb - 100 - presentasi;
            double target = bbi - bb;
            System.out.println("berat badan ideal : " + bbi +" kg");
            System.out.printf("target berat badan ideal : %.1fkg\n" , target);
        
    }
}