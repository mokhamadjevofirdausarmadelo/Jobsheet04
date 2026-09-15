import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Input Data Mahasiswa
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        String kelas = sc.next();
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        // 2. Input Nilai
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double ujian = sc.nextDouble();

        // 3. Hitung Nilai Akhir
        double nilaiAkhir = (kuis + tugas + ujian) / 3;

        // 4. Deklarasi untuk hasil
        String huruf;
        String kualifikasi;

        // 5. Cek Nilai (If - Else)
        if (nilaiAkhir > 80) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            huruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60) {
            huruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39) {
            huruf = "D";
            kualifikasi = "Kurang";
        } else {
            huruf = "E";
            kualifikasi = "Gagal";
        }

        // 6. Output Hasil
        System.out.println(
        "Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + huruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}