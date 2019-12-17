import java.util.Scanner;
import java.util.HashMap;
class Morse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String morse = sc.nextLine();
        // String code = sc.nextLine();

        HashMap <String, Character> codes = new HashMap<>();

        String [] space = morse.split(" ");
        System.out.println("\"");
        codes.put(".-", 'A');
        codes.put("-...", 'B');
        codes.put("-.-", 'C');
        codes.put("-..", 'D');
        codes.put(".", 'E');
        codes.put("..-.", 'F');
        codes.put("--.", 'G');
        codes.put("....", 'H');
        codes.put("..", 'I');
        codes.put(".---", 'J');
        codes.put("-.-", 'K');
        codes.put(".-..", 'L');
        codes.put("--", 'M');
        codes.put("-.", 'N');
        codes.put("---", 'O');
        codes.put(".--.", 'P');
        codes.put("--.-", 'Q');
        codes.put(".-.", 'R');
        codes.put("...", 'S');
        codes.put("-", 'T');
        codes.put("..-", 'U');
        codes.put("...-", 'V');
        codes.put(".--", 'W');
        codes.put("-..-", 'X');
        codes.put("-.--", 'Y');
        codes.put("--..", 'Z');
        codes.put("----", ' ');//spasi

        
        for (String tes : space) {
            codes.get(tes);
            System.out.println(codes.get(tes));
        }       
    }
}
