package tugaspbo;
import java.util.Scanner;
public class luaslingkarankhairullahh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double getPhi = 3.14;
        int getJarijari;
        double getLuas;

        System.out.print("Masukkan jari-jari: ");
        getJarijari = input.nextInt();
        System.out.println();
        getLuas = (getPhi * getJarijari * getJarijari);

        System.out.println("Hasil dari menghitung luas lingkaran");
        System.out.println("jari-jari: " +getJarijari);
        System.out.println("luas: " +(int)getLuas);
    }
}
