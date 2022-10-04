/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PRAK102_2110817220021_AnyaFidela {
    public static void main(String[] args) {
        int number, bilangan;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        number = keyboard.nextInt();
        
        int i = 7;
        while (i >= 0) {            
            if (number % 2 == 0){
                bilangan = (number / 2) - 1;
            } else {
                bilangan = number;
            }
            
            if (i == 7){
               System.out.print(bilangan);
            } else {
                System.out.print(", " + bilangan);
            }
            
            number++;
            i--;
        }
    } 
}
