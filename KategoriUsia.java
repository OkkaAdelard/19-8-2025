import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan usia Anda:");
        int usia = input.nextInt();
        
        if (usia > 5 & usia < 9){
            System.out.println("Anda masih bocil");
        } else if (usia >= 10 & usia <= 18){
        System.out.println("Anda masih remaja");
        } else if (usia >= 19 & usia <= 59){
        
        System.out.println("Anda sudah dewasa");   
        
        } else {
            System.out.println("Anda sudah terlalu tua");
        } 
    }
}