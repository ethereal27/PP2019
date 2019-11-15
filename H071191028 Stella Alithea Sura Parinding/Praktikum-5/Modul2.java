import java.util.Scanner;

import jdk.nashorn.api.tree.ForOfLoopTree;

import java.util.Random;

public class Modul2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String serialNumber = generalSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generalSerial(int n, int m) {
        Random number = new Random();
        String hasil = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // hasil += (char)(number.nextInt(9) + '0');
                hasil += number.nextInt(10);
            }
            hasil += i < n - 1 ? "-" : "";
        }
        return hasil;
    }
}