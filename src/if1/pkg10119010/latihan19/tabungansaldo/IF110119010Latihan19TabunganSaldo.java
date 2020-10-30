/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan19.tabungansaldo;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     Saldo Tabungan selama 6 bulan
 */
public class IF110119010Latihan19TabunganSaldo {

    /**
     * @param args the command line arguments
     */
    public static int saldo, lama=6;
    public static Double bunga, jmlBunga;
    
    public static double hitungBunga(double bunga, int saldo) {
        jmlBunga = bunga * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo) {
        for (int i = 1; i <= lama; i++) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,d%n", saldo);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilSaldo(0.15, 2500000);
    }
    
}
