import java.util.Scanner;
public class No4{
    public static void main (String[]args){
        Scanner we = new Scanner(System.in);
        int a = we.nextInt();
        int b = we.nextInt();

        boolean kelipatan; 
        kelipatan = b%a==0 || a%b==0;


        System.out.print("Apakah " + a + " kelipatan " + b + "?" + kelipatan );
        //System.out.printf(“%d kelipatan %d? %b, a, b, aB || bA); untuk menampilkan output boolean true or false dimana ada dua kondisi dimana jika a > b(aB) dan b > a (bA) dengan menggunakan operator logika OR (||).
    }
}