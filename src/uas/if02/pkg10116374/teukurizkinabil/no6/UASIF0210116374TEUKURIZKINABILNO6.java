package uas.if02.pkg10116374.teukurizkinabil.no6;
import java.util.Scanner;

    /**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * TANGGAL              : 10 FEBRUARY 2021
 * NO SOAL              : 6
 *
 */
public class UASIF0210116374TEUKURIZKINABILNO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukkan Angka ke-1 : ");
        
        
        Scanner input = new Scanner(System.in);
        kalkulator.value1 = input.nextDouble();
        
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = input.nextDouble();
        
      
        System.out.println("Hasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalkulatorian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilagan());
        System.out.println("(Developed by : Aufa Ilyasha)");
        
    }
    
}
