
import java.util.Scanner;


public class MainPerusahaan {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Perusahaan user = new Perusahaan();
        int pilih,jumlah,pilihan;
        do{
        user.displayMessage();
         System.out.print("Pilihan Anda\t: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Banyak Jaket\t: ");
                    jumlah = in.nextInt();
                    user.setA(jumlah);
                    break;
                case 2:
                    System.out.print("Banyak Jaket\t: ");
                    jumlah = in.nextInt();
                    user.setB(jumlah);
                    break;
                case 3:
                    System.out.print("Banyak Jaket\t: ");
                    jumlah = in.nextInt();
                    user.setC(jumlah);
                    break;
                default:
                    System.out.println("MAAF MENU YANG ANDA MASUKKAN TIDAK TERDAFTAR SILAHKAN COBA LAGI.");
            }
             System.out.println("Ingin membeli lagi?\n"
                    + "1. Ya\n"
                    + "2. Tidak");
            System.out.print("Pilihan anda\t: ");
            pilihan = in.nextInt();
        }while(pilihan !=2 );
        user.displayLast();
    }
}
