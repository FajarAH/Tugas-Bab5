
public class Perhitungan {
    private static double hasil;
    
    public static double penjumlahan (double a, double b){
        hasil = a + b;
        return hasil;
    }
    public static double pengurangan (double a, double b){
        hasil = a - b;
        return hasil;
    }
    public double perkalian (double a, double b){
        hasil = a*b;
        return hasil;
    }
    public double pembagian (double a, double b){
        hasil = a / b;
        return hasil;
    }
    public void sederhana (int pemb, int peny){
        System.out.println("Pecahan sebelum disederhanakan\t= "+pemb+"/"+peny);
        int pembagiPemb = pemb;
        int pembagiPeny = peny;
        while (pembagiPemb != pembagiPeny) {
            if (pembagiPemb > pembagiPeny) {
                pembagiPemb = pembagiPemb - pembagiPeny;
            } else {
                pembagiPeny = pembagiPeny - pembagiPemb;
            }
        }
        int pembFinal = pemb / pembagiPemb;
        int penyFinal = peny / pembagiPeny;              
        System.out.println("Pecahan setelah disederhanakan\t= " + pembFinal + "/" + penyFinal);
    
    }
}
