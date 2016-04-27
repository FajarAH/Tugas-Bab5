
import java.util.Scanner;


public class MainPerhitungan {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int pil;
        Perhitungan user = new Perhitungan();
        
            System.out.println("\t\tMesin Perhitungan");
            System.out.println("Daftar Menu: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.print("Masukkan pilihan anda\t: ");
            pil = in.nextInt();
    }
}
