import java.util.Scanner;
class ArrayMenampilkanEror{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a [] = new int[10]; 
        
        int jumlah = 0;

        for (int i = 0; i < 10; i++) {
            a [i] = scan.nextInt();
            jumlah += a[i];
        }
        double rata2 = jumlah/10;
        double error [] = new double[10];
        
        System.out.println("________________________________________________");
        System.out.println("\tNo\t|\tData\t|\tError\t");
        System.out.println("________________________________________________");
        for (int i = 0; i < 10; i++) {
            error[i] = Math.sqrt(Math.pow(rata2 - a[i], 2));
            
            System.err.printf( "|\t%d\t|\t%d\t|\t%.2f\t|\n" ,i+1, a[i],error[i] );
            
        }
    }
}