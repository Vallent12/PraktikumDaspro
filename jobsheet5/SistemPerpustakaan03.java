package jobsheet5;
import java.util.Scanner;

public class SistemPerpustakaan03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean KartuMahasiswa;
        boolean RegistOnline;

        System.out.print("Apakah memiliki kartu mahasiswa? (true/false): ");
        KartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        RegistOnline = sc.nextBoolean();

        if (KartuMahasiswa == true || RegistOnline == true) {
            System.out.println("Boleh masuk perpustakaan");
        } else {
            System.out.println("Ditolak masuk perpustakaan");
        }    
    }
}
