/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PRAK101_2110817220021_AnyaFidela {
    public static void main(String[] args) {
        String name, bornplace;
        int date, month, year, height;
        float berat;
        
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Masukkan Nama Lengkap: ");
    name = input.nextLine();
    
    System.out.print("Masukkan Tempat Lahir: ");
    bornplace = input.nextLine();
    
    System.out.print("Masukkan Tanggal Lahir: ");
    date = input.nextInt();
    
    System.out.print("Masukkan Bulan Lahir: ");
    month = input.nextInt();

    System.out.print("Masukkan Tahun Lahir: ");
    year = input.nextInt();
    
    System.out.print("Masukkan Tinggi Badan: ");
    height = input.nextInt();
    
    System.out.print("Masukkan Berat Badan: ");
    berat = input.nextFloat();
    
    String namabulan = null;
        switch (month) {
            case 1 -> namabulan = "Januari";
            case 2 -> namabulan = "Februari";
            case 3 -> namabulan = "Maret";
            case 4 -> namabulan = "April";
            case 5 -> namabulan = "Mei";
            case 6 -> namabulan = "Juni";
            case 7 -> namabulan = "Juli";
            case 8 -> namabulan = "Agustus";
            case 9 -> namabulan = "September";
            case 10 -> namabulan = "Oktober";
            case 11 -> namabulan = "November";
            case 12 -> namabulan = "Desember";
            default -> System.out.println("Unknown");
        }
    
    System.out.println("Data Telah Ditambahkan");
        System.out.print("Nama Lengkap " + name);
        System.out.print(", Lahir di " + bornplace);
        System.out.println(" pada Tanggal " + date +" "+ namabulan +" "+ year );
        System.out.println("Tinggi Badan " + height + " cm" + " dan Berat Badan " + berat + " kilogram");
    }    
}
