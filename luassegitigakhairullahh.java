package tugaspbo;
import java.util.Scanner;
public class luassegitigakhairullahh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int getAlas, getTinggi;
        double getLuas;

        System.out.print("Masukkan Alas: ");
        getAlas = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        getTinggi = input.nextInt();
        System.out.println();
        getLuas = (1.2 * getAlas * getTinggi);

        System.out.println("Hasil dari menghitung luas segitiga");
        System.out.println("Alas: " +getAlas);
        System.out.println("Tinggi: " +getTinggi);
        System.out.println("Luas: " +(int)getLuas);
    }
}
