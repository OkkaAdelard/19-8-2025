import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai Anda:");
        int nilai = input.nextInt();
        
        if (nilai >= 95) {
            System.out.println("Nilai Anda A+");
        } else if (nilai >= 90) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 85) {
            System.out.println("Nilai Anda A-");
        } else if
        (nilai >= 80) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 60) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
        
        System.out.println("============================");

        input.close();
        if (nilai < 75) {
            System.out.println("Anda harus mengulang ujian.");
        } 
        else {
            System.out.println("Selamat, Anda lulus ujian!");
    }
}
}