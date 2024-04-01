/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calista;

/**
 *
 * @author calista
 * tgl:2024-03-31
 */
import java.util.Scanner;
public class Calista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        
                double luas = (alas * tinggi) / 2;
                
                System.out.println("Luas segitiga dengan alas " + alas + "dan tinggi" + tinggi + "adalah" + luas);
                
        scanner.close();
        
    }
}


    
    
        


