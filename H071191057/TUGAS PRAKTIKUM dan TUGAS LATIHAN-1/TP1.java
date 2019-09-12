import java.util.Scanner;
class TP1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double efisiensi = 14;
        int waktuTempuh = sc.nextInt();
        int percepatan = sc.nextInt();
        double hasil = (waktuTempuh * percepatan) / efisiensi;
        System.out.printf("Bensin yang digunakan : %.3f L" , hasil);
    }
}