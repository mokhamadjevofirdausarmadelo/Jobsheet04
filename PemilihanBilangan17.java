import java.util.Scanner;

public class PemilihanBilangan17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan masukkan angka yang anda inginkan:");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) 
        {
            System.out.println("Angka" + angka + "termasuk bilangan genap");
        } 
        else
        {
            System.out.println("Angka" + angka + "termasuk bilangan ganjil");
        }
        scanner.close();
    }   

}