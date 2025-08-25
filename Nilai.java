import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai Anda:");
        int nilai = input.nextInt();
        
        if (nilai >= 95 && nilai <= 100) { 
            System.out.println("Nilai Anda A+");
        } else if (nilai >= 90 && nilai < 95 ) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 85 && nilai < 90) {
            System.out.println("Nilai Anda A-");
        } else if
        (nilai >= 80 && nilai < 85) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Nilai Anda D");
         } else if (nilai < 60 && nilai >= 0) {
            System.out.println("Nilai Anda E");
        } else {
            System.out.println("================================");
            System.out.println("Nilai tidak valid. Masukkan nilai antara 0-100.");

        if (nilai >= 75 && nilai <= 100) {
            System.out.println("Selamat, Anda lulus!");
        } else if (nilai < 75 && nilai >= 0) {
            System.out.println("Maaf, Anda tidak lulus.");
        }
    }
}
}