import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program penarikan tabungan dimana yang
 * memasukkan jumlah uang, dengan berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        int sisaTabungan;
        Scanner scanner;

        System.out.println("====Program Penarikan Uang ====");
        System.out.print("Masukkan Saldo Awal : ");
        scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        sisaTabungan = tabungan.ambilUang(scanner.nextInt());
        System.out.println("Saldo Anda Sekarang : " + sisaTabungan);

    }
}