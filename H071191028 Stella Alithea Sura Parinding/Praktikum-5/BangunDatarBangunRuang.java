import java.util.Scanner;



public class BangunDatarBangunRuang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println();
        System.out.println("Luas Persegi =  " + luasPersegi (a,b) );
        System.out.println("Luas Segitiga = " + luasSegitiga (a,b) );
        System.out.println("Luas Trapesium = " + luasTrapesium (a,b,c) );
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang (a,b) );
        System.out.println("Luas Lingkaran = " + luasLingkaran (a) );
        System.out.println("Luas Jajar Genjang = " + luasJajarGenjang (a,b) );
        System.out.println("Luas Belah Ketupat = " + luasBelahKetupat (a,b) );
        System.out.println("Luas Layang-layang = " + luasLayangLayang (a,b) );
    }
    static int luasPersegi ( int a, int b ) {
        return a*b;
    }
    static double luasSegitiga ( int a, int b ) {
        double luasSegitiga = (a*b)/2;
        return luasSegitiga;
    }
    static double luasTrapesium ( int a, int b, int c ) {
        double luasTrapesium = (a+b)/2*c;
        return luasTrapesium;
    }
    static int luasPersegiPanjang ( int a, int b ) {
        int luasPersegiPanjang = a*b;
        return luasPersegiPanjang;
    }
    static double luasLingkaran ( int a ) {
        double luasLingkaran = 3.14*a*a;
        return luasLingkaran;
    }
    static int luasJajarGenjang ( int a, int b ) {
        int luasJajarGenjang = a*b;
        return luasJajarGenjang;
    }
    static double luasBelahKetupat ( int a, int b ) {
        double luasBelahKetupat = (a*b)/2;
        return luasBelahKetupat;
    }
    static double luasLayangLayang ( int a, int b ) {
        double luasLayangLayang = (a*b)/2;
        return luasLayangLayang;
    }
}