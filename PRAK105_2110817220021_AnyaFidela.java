/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class PRAK105_2110817220021_AnyaFidela {
    public static void main(String[] args) {
        double jrjr, tggi, volume;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jrjr = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tggi = keyboard.nextDouble();
        
        volume = 3.14 * jrjr * jrjr * tggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jrjr + " cm ");
        System.out.println("dan tinggi " + tggi + " cm ");
        System.out.println("adalah " + df.format(volume) + " m3");
    }
}
