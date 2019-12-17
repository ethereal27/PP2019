import java.util.HashMap;
import java.util.Scanner;

public class HM{
    public static void main(String[] args) {
        HashMap <Integer, String> days = new HashMap<>();
        days.put(1, "Senin");
        days.put(2, "Selasa");
        days.put(3, "Rabu");
        days.put(4, "Kamis");
        days.put(5, "Jum'at");
        days.put(6, "Sabtu");
        days.put(7, "Minggu");

        // for(String string : args){
        //     System.out.println(string.toUpperCase());
        // }
        // System.out.println(args[0]);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(days.get(n));
        days.forEach((k, v) -> {
            v = v.toUpperCase();
            System.out.println(v);
        });
    }
}