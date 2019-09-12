import java.util.Scanner;
    public class No2{
        public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean kelipatan;
            kelipatan = b%a==0 || a%b==0;
            System.out.print("apakah " + a + " kelipatan " + b +"? " + kelipatan);
    }
}