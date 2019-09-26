import java.util.Scanner;
class Tugas3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        int x = input.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<x-2;i++){
            System.out.print((a+b)+" ");
            c=a;
            a=b; 
            b=c+b;
        }
        System.out.println();
    }
}