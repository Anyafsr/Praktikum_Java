/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PRAK103_2110817220021_AnyaFidela {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        number = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (number % 7 != 0){
                if (i == 5){
                   System.out.print(number);
                } else {
                    System.out.print(", " + number);
                }
            }
            
            number--;
            i--;
        } while (i > 0);
    }
}
