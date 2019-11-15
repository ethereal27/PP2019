import java.util.Scanner;
class TugasTambahan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int angka = input.nextInt();
        char arr[] = name.toCharArray();
        int b;
        char nameDone;

        for (int i=0; i< arr.length; i++) {
            b = (int)arr[i];
            if (b >= 65 && b <= 90) {
                b = b + (angka%26);
                if(b <65) {
                    b = b + 26;
                }
                else if (b > 90) {
                    b = b - 26;
                }
            }
            else if (b >= 97 && b <= 122) {
                b = b + (angka % 26);
                if (b < 97){
                    b = b + 26;
                }
                else if (b > 122) {
                    b = b - 26;
                }
            }

            nameDone = (char) b;
            System.out.print(nameDone);
        }
    }
}