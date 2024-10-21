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
public class ThaiThanhNhat_KiemTra_ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap canh c: ");
        double c = scanner.nextDouble();

      
        double perimeter = a + b + c;
        System.out.println("chu vi tam giac: " + perimeter);

       
        if (a + b > c && a + c > b && b + c > a) {
          
            double s = perimeter / 2; 
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("dien tich cua tam giac: " + area);
        } else {
            System.out.println("ba canh ko tao thanh tam giac.");
        }
    }
}
