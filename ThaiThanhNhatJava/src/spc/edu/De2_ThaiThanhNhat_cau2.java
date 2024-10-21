/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class De2_ThaiThanhNhat_cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhap ban kinh hinh cau: ");
        double radius = scanner.nextDouble();

      
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2); 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); 

       
        System.out.printf("dien tich hinh cau: %.2f\n", surfaceArea);
        System.out.printf("the tich hinh cau: %.2f\n", volume);
    }
}
