import java.util.Scanner;

public class KategoriUmurLatihanIndividu17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        if (umur >= 0 && umur <= 12)
            System.out.println("Kategori umur anda adalah anak-anak");

        else if (umur >= 13 && umur <= 19)
            System.out.println("Kategori umur anda adalah remaja");
        else if (umur >= 20 && umur <= 64)
            System.out.println("Kategori umur anda adalah dewasa");
        else if (umur >= 65)
            System.out.println("Kategori umur anda adalah lansia");
        else if (umur < 0)
            System.out.println("Input umur tidak valid, masukkan umur yang benar");
        else
            System.out.println("Input umur tidak dikenal, masukkan umur yang benar");
    }
}