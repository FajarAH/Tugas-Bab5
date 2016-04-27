
public class Perusahaan {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private static int jumlahA = 0;
    private static int jumlahB = 0;
    private static int jumlahC = 0;
    
    
    
    public int totalA(int jumlah) {
        if (jumlah > 100) {
            jumlahA = jumlah * (jaketA - 5000);
        } else {
            jumlahA = jumlah * jaketA;
        }
        return jumlahA;
    }

    public int totalB(int jumlah) {
        if (jumlah > 100) {
            jumlahB = jumlah * (jaketB - 5000);
        } else {
            jumlahB = jumlah * jaketB;
        }
        return jumlahB;
    }
    public int totalC(int jumlah){
        if(jumlah>100){
            jumlahC = jumlah * (jaketC - 15000);
        }
        else{
            jumlahC = jumlah * jaketC;
        }
        return jumlahC;
    }
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
