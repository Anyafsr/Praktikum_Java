/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PRAK104_2110817220021_AnyaFidela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kartu Andi : ");
        int kt1andi = input.nextInt();
        int kt2andi = input.nextInt();
        int kt3andi = input.nextInt();
        
        System.out.print("Kartu Budi : ");
        int kt1budi = input.nextInt();
        int kt2budi = input.nextInt();
        int kt3budi = input.nextInt();
                
        int andi = kt1andi + kt2andi + kt3andi;
        int budi = kt1budi + kt2budi + kt3budi;
        
        if (andi > budi){
            System.out.println("Andi");
        } else if (andi == budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
        }
    }
}
