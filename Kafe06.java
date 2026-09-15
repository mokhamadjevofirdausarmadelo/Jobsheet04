import java.util.Scanner;

    public class Kafe06 {
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
        System.out.print("Masukkan ukuran cup: ");
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
        }

        // Hitung total harga awal
        double totalHarga = hargaMenu * jumlah;

        // Update total harga berdasarkan ukuran cup yang dipilih
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        }

        // Tentukan nilai diskon berdasarkan status keanggotaan kemudian hitung nominal bayar
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        // Tampilkan ringkasan item yang dibeli serta nominal bayar
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);

        sc.close();
    }
}