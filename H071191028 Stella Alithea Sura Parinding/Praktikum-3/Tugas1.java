import java.util.Scanner;
class Tugas1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(b < a){
            int c = a;
            a = b;
            b = c;

            
        }for(int i = a; i <= b ; i++){
            if(i%2 == 0 && i>0){
                System.out.println(i + " Genap Positif");
            }else if(i%2 == 0 && i<0){
                System.out.println(i + " Genap Negatif");
            }else if(i%2!=0 && i<0){
                System.out.println(i + " Ganjil Positif");
            }else if(i%2!=0 && i>0){
                System.out.println(i + " Ganjil Negatif");
            }else{
                System.out.println(i + " nol");
            }
        }
    }
}