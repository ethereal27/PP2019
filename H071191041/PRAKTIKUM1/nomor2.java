import java.util.Scanner;
class nomor2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        
        boolean kelipatan;
        kelipatan = b%a==0 || a%b==0;
        System.out.println("apakah " + a + " kelipatan dari " + b + "? " + kelipatan);
    } 
}