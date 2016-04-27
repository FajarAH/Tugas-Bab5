
public class Perusahaan {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    
     public void displayMessage() {
        System.out.println("==========================================");
        System.out.printf("%27s \n","CV. LABKOMDAS");
        System.out.println("==========================================");
        System.out.printf("|%-5s |%-20s |%-11s | \n", "NO", "JENIS JAKET", "HARGA");
        System.out.println("==========================================");
        System.out.printf("|%-5s |%-20s |%5s | \n", "1", "JAKET BAHAN A", "Rp. 100.000");
        System.out.printf("|%-5s |%-20s |%5s | \n", "2", "JAKET BAHAN B", "Rp. 125.000");
        System.out.printf("|%-5s |%-20s |%5s | \n", "3", "JAKET BAHAN C", "Rp. 175.000");
        System.out.println("==========================================");
    }
}
