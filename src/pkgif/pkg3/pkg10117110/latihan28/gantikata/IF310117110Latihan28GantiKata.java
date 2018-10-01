

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Menghganti kata pada kalimat yang telah di inputkan
 */
package pkgif.pkg3.pkg10117110.latihan28.gantikata;

import java.util.Scanner;


public class IF310117110Latihan28GantiKata {


    public static void main(String[] args) {
        
        
        String Kalimat, Ganti,Menjadi;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukan Kalimat\t: ");
        Kalimat = scan.nextLine();
        
        StringBuilder ganti = new StringBuilder(Kalimat);
        
        System.out.print("Ganti Kata\t: ");
        Ganti = scan.nextLine();
        
        int id = Kalimat.indexOf(Ganti);
        
        System.out.print("Menjadi Kata\t: ");
        Menjadi = scan.nextLine();
        
        StringBuffer man = new StringBuffer(Menjadi);
        
        System.out.println("====Hasil Formating====");
        System.out.println("Kalimat Awal\t: " +Kalimat);
        int id1 = Ganti.length();
        ganti.delete(id,id+id1);
        ganti.insert(id, man);
        

        System.out.print("Kalimat Baru\t: ");
        System.out.println(ganti.toString());
        
      

    }
    
}
