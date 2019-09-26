import java.util.Scanner;
class Tugas2{
    public static void main(String[]args){
    Scanner ea = new Scanner(System.in);
    int x = ea.nextInt();
    int y = ea.nextInt();
    
    for(int i=1; i<=y; i++){
        System.out.print(i + " ");
        if (i%x==0){
            System.out.println();
        }
        
    }
    }
}