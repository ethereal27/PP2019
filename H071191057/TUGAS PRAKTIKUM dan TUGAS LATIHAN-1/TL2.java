import java.util.Scanner;
class TL2{
    public static void main(String[] args){
    Scanner apa = new Scanner(System.in);
    String nama = apa.nextLine();
    double tb = apa.nextDouble();
    double bb = apa.nextDouble();
    double p = apa.nextDouble();

    double ideal = (tb-100) - ((tb-100) * (p/100));
    double target = ideal-bb;
    System.out.println("Informasi");
    System.out.println("Nama : " + nama);
    System.out.println("Tinggi Badan : " + tb);
    System.out.println("Berat Badan Anda : " + bb + "kg");
    System.out.println("Berat Badan Ideal Anda : " + ideal + "kg");
    System.out.printf("Target Berat Badan Ideal Anda : %.1f kg " , target );
}
}