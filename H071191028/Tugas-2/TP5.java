import java.util.Scanner;
class TP5{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("** menu **");
        System.out.println("1. Mencari Luas bangun datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int a = sc.nextInt();
        switch (a){
            case 1  : 
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                int b = sc.nextInt();
                switch (b){
                    case 1 : 
                        System.out.println("input sisi");
                        int sisi = sc.nextInt();
                        System.out.println("luas persegi = " + (sisi*sisi));
                        break;
                    case 2 :
                        System.out.println("input panjang");
                        int panjang = sc.nextInt();
                        System.out.println("input lebar");
                        int lebar = sc.nextInt();
                        System.out.println("luas persegi panjang = " + (panjang*lebar));
                        break;
                    case 3 :
                        System.out.println("input alas");
                        int alas = sc.nextInt();
                        System.out.println("input tinggi");
                        int tinggi = sc.nextInt();
                        System.out.println("luas segitiga = " + (alas*tinggi/2));
                        break;
                    case 4 :
                        System.out.println("input r");
                        int r = sc.nextInt();
                        System.out.println("luas lingkaran = " + (Math.PI*Math.pow(r,2)));
                        break;
                    case 5 :
                        System.out.println("input alas");
                        int alass = sc.nextInt();
                        System.out.println("input tinggi");
                        int tinggii = sc.nextInt();
                        System.out.println("luas jajar genjang = " + (alass*tinggii)/2);
                        break;
                    case 6 :
                        System.out.println("input sisi yang lebih panjang");
                        int sisiYanglebihPanjang = sc.nextInt();
                        System.out.println("input sisi yang lebih pendek");
                        int sisiYanglebihPendek = sc.nextInt();
                        System.out.println("input tinggi");
                        int tinggi4 = sc.nextInt();
                        System.out.println("luas trapesium = " + ((sisiYanglebihPanjang+sisiYanglebihPendek)*tinggi4/2));
                        break;
                    case 7 : 
                        System.out.println("input diagonal1");
                        int diagonal1 = sc.nextInt();
                        System.out.println("input diagonal2 ");
                        int diagonal2 = sc.nextInt();
                        System.out.println("luas belah ketupat = " + (diagonal1*diagonal2)/2);
                        break;
                    case 8 :
                        System.out.println("input d1");
                        int d1 = sc.nextInt();
                        System.out.println("input d2");
                        int d2 = sc.nextInt();
                        System.out.println("luas layang-layang = " + (d1*d2)/2);
                        break;
                    default:
                        break;
                        
                }    break;
                case 2 :
                    System.out.println("kubus");
                    System.out.println("balok");
                    System.out.println("tabung");
                    System.out.println("limas segiempat");
                    System.out.println("prisma segitiga");
                    System.out.println("kerucut");
                    System.out.println("bola");
                    System.out.println("limas segi enam beraturan");
                    int c = sc.nextInt();
                    switch (c){
                        case 1 : 
                            System.out.println("input sisi");
                            int sisi = sc.nextInt();
                            System.out.println("volume kubus = " + (sisi*sisi*sisi));
                            break;
                        case 2 :
                            System.out.println("input panjang");
                            int panjang = sc.nextInt();
                            System.out.println("input lebar");
                            int lebar = sc.nextInt();
                            System.out.println("input tinggi");
                            int tinggi = sc.nextInt();
                            System.out.println("volume balok = " + (panjang*lebar*tinggi));
                            break;
                        case 3 :
                            System.out.println("input r");
                            int r = sc.nextInt();
                            System.out.println("input tinggi");
                            int tinggii = sc.nextInt();
                            System.out.println("volume tabung = " + (Math.PI*Math.pow(r,2)*tinggii));
                            break;
                        case 4 : 
                            System.out.println("input luas alas");
                            int luasAlas = sc.nextInt();
                            System.out.println("input tinggi");
                            int tinggiii = sc.nextInt();
                            System.out.println("volume limas segiempat = " + (luasAlas*tinggiii)/3);
                            break;
                        case 5 :
                            System.out.println("input L alas");
                            int lAlas = sc.nextInt();
                            System.out.println("input tinggi2");
                            int tinggi2 = sc.nextInt();
                            System.out.println("volume prisma segitiga = " + (lAlas*tinggi2));
                            break;
                        case 6 :
                            System.out.println("input r1");
                            int r1 = sc.nextInt();
                            System.out.println("input tinggi3");
                            int tinggi3 = sc.nextInt();
                            System.out.println("volume kerucut = " + (Math.PI*Math.pow(r1,2)*tinggi3));
                            break;
                        case 7 : 
                            System.out.println("input r2");
                            int r2 = sc.nextInt();
                            System.out.println("volume bola = " + (4*Math.PI*Math.pow(r2,3))/3);
                            break;
                        case 8 :
                            System.out.println("input S");
                            int S2 = sc.nextInt();
                            System.out.println("input tinggi prisma");
                            int tPrisma = sc.nextInt();
                            System.out.println("volume prisme segienam beraturan = " + (3*Math.pow(S2,2)*Math.sqrt(3)*tPrisma/2));
                            break;
                    }
                            break;

                    } 
                

                }
            }