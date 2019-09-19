import java.util.Scanner;
class TP4{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String an = scan.next();
        scan.nextLine();
        String b = scan.next();
        String bn = scan.next();
        
        if(an.equals("fire")&&bn.equals("fire") ||an.equals("water")&&bn.equals("water") ||an.equals("electric")&&bn.equals("electric")||an.equals("ice")&&bn.equals("ice")||an.equals("ground")&&bn.equals("ground")){
            System.out.println("draw");
        }
        else if(an.equals("fire")&&bn.equals("water")){
            System.out.println(b + " menang ");
        }
        else if(an.equals("fire")&&bn.equals("ice")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("fire")&&bn.equals("electric")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("fire")&&bn.equals("ground")){
            System.out.println(b + " menang ");
        }
        else if(an.equals("water")&&bn.equals("fire")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("water")&&bn.equals("ice")||bn.equals("electric")){
            System.out.println(b + " menang ");
        }
        else if(an.equals("water")&&bn.equals("ground")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("ice")&&bn.equals("fire")||bn.equals("electric")){
            System.out.println(b + " menang ");
        }
        else if(an.equals("ice")&&bn.equals("water")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("ice")&&bn.equals("ground")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("electric")&&bn.equals("fire")||bn.equals("ground")){
            System.out.println(b + " menang ");
        }
        else if(an.equals("electric")&&bn.equals("water")||bn.equals("ice")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("ground")&&bn.equals("fire")||bn.equals("electric")){
            System.out.println(a + " menang ");
        }
        else if(an.equals("ground")&&bn.equals("ice")||bn.equals("water")){
            System.out.println(b + " menang ");
        }

    }
}