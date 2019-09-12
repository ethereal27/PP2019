import java.util.Scanner;
class nomor1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String nama = input.nextLine();
        int tinggBadan = input.nextInt();
        int beratBadan = input.nextInt();
        int persentase = input.nextInt();

        int beratBlumFix = tinggBadan - 100;
        double beratMasihBelumFIx = (beratBlumFix * persentase) / (double) 100; 
        double beratBadanIdeal = beratBlumFix - beratMasihBelumFIx;
        double target = beratBadanIdeal - beratBadan;

        System.out.println("INFORMASI");
        System.out.println("NAMA : "+nama);
        System.out.println("TINGGI : "+ tinggBadan);
        System.out.println("BERAT : "+ beratBadan);
        System.out.println("BERAT IDEAL : "+beratBadanIdeal);
        System.out.printf("TARGET : %.1f",target);
    }
}