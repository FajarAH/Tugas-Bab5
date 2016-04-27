
public class Perusahaan {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private static int jumlahA = 0;
    private static int jumlahB = 0;
    private static int jumlahC = 0;
     private static int banyakA = 0;
    private static int banyakB = 0;
    private static int banyakC = 0;
    
    
    
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
     public void setA(int n){
        banyakA+=n;
    }
    public void setB(int n){
        banyakB+=n;
    }
    public void setC(int n){
        banyakC+=n;
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
     public void displayLast(){
        int z=0;
        System.out.println("====================================================");
        System.out.printf("%31s \n","CV. LABKOMDAS");
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.printf("|%-5s |%-20s |%-6s |%-12s | \n", "NO", "JENIS JAKET", "BANYAK","HARGA");
        System.out.println("====================================================");
        if(banyakA != 0){
            z++;
            System.out.printf("|%-5s |%-20s |%-6s |Rp.%9s | \n", z, "JAKET BAHAN A",banyakA,totalA(banyakA));
        }
        if(banyakB != 0){
            z++;
            System.out.printf("|%-5s |%-20s |%-6s |Rp.%9s | \n", z, "JAKET BAHAN B",banyakB,totalB(banyakB));
        }
        if(banyakC != 0){
            z++;
            System.out.printf("|%-5s |%-20s |%-6s |Rp.%9s | \n", z, "JAKET BAHAN C",banyakC,totalC(banyakC));
        }
        System.out.println("====================================================");
        System.out.printf("|%-35s |Rp.%9s | \n",  "TOTAL HARGA",(jumlahA+jumlahB+jumlahC));
        System.out.println("====================================================");
        System.out.printf("%31s \n","TERIMA KASIH");
        System.out.println("====================================================");
    }
}
