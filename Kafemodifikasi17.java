import java.util.Scanner;

public class Kafemodifikasi17 {
    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan nilai input
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        // Membaca input dari user
        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        // Tentukan harga menu dengan switch-case
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia!");
                hargaMenu = 0;
                break;
        }

        // Hitung total harga awal
        double totalHarga = hargaMenu * jumlah;

        // Update total harga berdasarkan ukuran cup yang dipilih
        boolean ukuranValid = true;
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran cup '" + ukuranCup + "' tidak tersedia!");
                System.out.println("   Silakan pilih ukuran: S (Small), M (Medium), atau L (Large)");
                ukuranValid = false;
                break;
        }

        // Jika ukuran tidak valid, keluar dari program
        if (!ukuranValid) {
            System.out.println("Program dibatalkan karena input tidak valid.");
            sc.close();
            return;
        }

        // Tentukan nilai diskon berdasarkan status keanggotaan kemudian hitung nominal bayar
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        // Tampilkan ringkasan item yang dibeli serta nominal bayar
        System.out.println("\n=== RINGKASAN PEMBELIAN ===");
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        if (keanggotaan) {
            System.out.println("Status: Member (Diskon 10%)");
        }
        System.out.println("Nominal bayar: Rp " + nominalBayar);

        sc.close();
    }
}