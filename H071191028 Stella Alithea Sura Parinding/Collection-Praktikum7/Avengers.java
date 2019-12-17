import java.util.*;

class Avengers{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> film = new ArrayList<ArrayList<String>>();
        Scanner sc = new Scanner(System.in);
        Boolean bool = true;


        //pakai while loop agar program terus berjalan sampai program dihentikan.
        while(bool == true){
            System.out.println("Favourite Movie");
            
            for (int i = 0; i < film.size(); i++) {
                System.out.println(i+ " " + film.get(i).get(0));//untuk tiap indeks ke i film, tampilkan judul tiap film
            }
                
            System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            String pilihan = sc.next();//pilihan opsi di atas
            
            if(pilihan.equals("d")){
                int indeks = sc.nextInt();//pilih film urutan ke berapa

                System.out.println("Judul   : " + film.get(indeks).get(0));
                System.out.println("Rilis   : " + film.get(indeks).get(1));
                System.out.println("Durasi  : " + film.get(indeks).get(2));
                System.out.println("Genre   : " + film.get(indeks).get(3));
                System.out.println("Sinopsis: " + film.get(indeks).get(4));
                System.out.println("Cast    : " + film.get(indeks).get(5));

                System.out.println();

            }
            else if(pilihan.equals("s")){
                String cari = sc.next();
                Boolean ditemukan = false;
                for (int i = 0; i < film.size(); i++) {
                    for (int  j = 0; j < film.get(i).size(); j++) {
                        if(film.get(i).get(j).equals(cari)){
                            System.out.println("ditemukan di film " + film.get(i).get(0));
                            ditemukan = true;
                            // Tampilkan satu
                            break;
                        }
                    }
                }

                if(ditemukan == false) System.out.println("Tidak ditemukan");
                    
            }
            else if(pilihan.equals("a")){
                ArrayList<String> film1 = new ArrayList<String>();
                String judul, rilis, durasi, genre, sinopsis, cast;
                
                System.out.print("Judul : "); judul = sc.next();
                System.out.print("Rilis : "); rilis = sc.next();
                System.out.print("Durasi : "); durasi = sc.next();
                System.out.print("Genre : "); genre = sc.next();
                System.out.print("Sinopsis : "); sinopsis = sc.next();
                System.out.print("Cast : "); cast = sc.next();

                film1.add(judul); film1.add(rilis); film1.add(durasi);
                film1.add(genre); film1.add(sinopsis); film1.add(cast);

                film.add(film1);

                System.out.println();
            }
            else if(pilihan.equals("r")){
                int hapus = sc.nextInt();
                film.remove(hapus);
            }
        }

        sc.close();
    }
}