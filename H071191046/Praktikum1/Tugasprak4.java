import java.util.Scanner;
public class Tugasprak4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean kelipatan;
        if(b > a) {
            kelipatan = b % a  == 0;
        } else {
            kelipatan = a % b == 0;
        }
        System.out.println("Apakah " + a + " kelipatan " + b + " ? " + kelipatan);
    }
}