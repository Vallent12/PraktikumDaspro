package jobsheet5;
import java.util.Scanner;

public class SistemLoginWIFI03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String JenisPengguna;
        int SKS;

        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        JenisPengguna = sc.nextLine();

        if (JenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WIFI diberikan (Dosen)");
        }
        else if (JenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS");
            SKS = sc.nextInt();

            if (SKS >= 12) {
                System.out.println("Akses WIFI diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Akses WIFI ditolak, SKS < 12");
            }
        }
        else {
            System.out.println("Akses ditolak");
        }    

    }
}
