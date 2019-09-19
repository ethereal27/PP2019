import java.util.Scanner;
class TP3{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        switch(a){
            case "vertebrado" :
            switch (b){
                case "ave" :
                switch (c){
                    case "carnivoro" : 
                        System.out.println("agula");break;
                    case "onivoro" :
                        System.out.println("pomba");break;
                }break;
                case "mamifero" :
                switch(c){
                    case "onivoro" :
                        System.out.println("homem");break;
                    case "herbivoro" :
                        System.out.println("vaca");break;
                }break;
            }
            case "invertebrado" :
            switch (b){
                case "inseto" :
                switch (c){
                    case "hematofago":
                    System.out.println("pulga");break;
                    case "herbivoro" :
                    System.out.println("lagarta");break;
                }break;
                case "anelideo" :
                switch (c){
                    case "hematofago" :
                    System.out.println("sanguessuga");break;
                    case "onivoro" :
                    System.out.println("minhoca");break;
                }break;
            }
            
        
        }
    
        

    }
}