
import java.util.Scanner;


public class MainPerhitungan {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int pil,pilih;
         double bil1, bil2;
        Perhitungan user = new Perhitungan();
        do{
            System.out.println("\t\tMesin Perhitungan");
            System.out.println("Daftar Menu: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.print("Masukkan pilihan anda\t: ");
            pil = in.nextInt();
             switch (pil) {
                case 1:
                    System.out.print("Masukkan bilangan 1\t: ");
                    bil1 = in.nextDouble();
                    System.out.print("Masukkan bilangan 2\t: ");
                    bil2 = in.nextDouble();
                    System.out.println("Hasil Penjumlahan\t: " + bil1 + " + " + bil2 + " = " + Perhitungan.penjumlahan(bil1, bil2));
                    break;
                case 2:
                    System.out.print("Masukkan bilangan 1\t: ");
                    bil1 = in.nextDouble();
                    System.out.print("Masukkan bilangan 2\t: ");
                    bil2 = in.nextDouble();
                    System.out.println("Hasil Pengurangan\t: " + bil1 + " - " + bil2 + " = " + Perhitungan.pengurangan(bil1, bil2));
                    break;
                case 3:
                    System.out.print("Masukkan bilangan 1\t: ");
                    bil1 = in.nextDouble();
                    System.out.print("Masukkan bilangan 2\t: ");
                    bil2 = in.nextDouble();
                    System.out.println("Hasil Perkalian\t: " + bil1 + " * " + bil2 + " = " + user.perkalian(bil1, bil2));
                    break;
                case 4:
                    System.out.print("Masukkan bilangan 1\t: ");
                    bil1 = in.nextDouble();
                    System.out.print("Masukkan bilangan 2\t: ");
                    bil2 = in.nextDouble();
                    System.out.println("Hasil Perkalian\t: " + bil1 + " / " + bil2 + " = " + user.pembagian(bil1, bil2));
                    break;
                case 5:
                    System.out.print("Masukkan pembilang\t: ");
                    int pemb = in.nextInt();
                    System.out.print("Masukkan penyebut\t: ");
                    int peny = in.nextInt();
                    user.sederhana(pemb, peny);
                    break;                
                default:
                    System.out.println("Maaf pilihan yang anda masukkan salah, silahkan coba lagi.\n");                   
            }
              System.out.println("Ingin melakukan perhitungan lagi?\n"
                                    + "1. Ya\n"
                                    + "2. Tidak");
            System.out.print("Pilihan anda\t: ");
            pilih = in.nextInt();
            
    }while(pilih!=2);
            
    }
}
