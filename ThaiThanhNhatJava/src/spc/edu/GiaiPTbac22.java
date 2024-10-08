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
public class GiaiPTbac22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NHAP HE SO A: ");
        double a = scanner.nextDouble();
        System.out.print("NHAP HE SO B: ");
        double b = scanner.nextDouble();
        System.out.print("NHAP HE SO C: ");
        double c = scanner.nextDouble();

        giaiPhuongTrinhBac2(a, b, c);
    }

    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PHUONG TRINH CO VO SO NGHIEM.");
                } else {
                    System.out.println("PHUONG TRINH VO NGHIEM.");
                }
            } else {
                System.out.println("NGHIEM CUA PHUONG TRINH LA: x = " + (-c / b));
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("PHUONG TRINH CO 2 NGHIEM PHAN BIET: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("PHUONG TRINH CO MOT NGHIEM KEP: x = " + root);
            } else {
                System.out.println("PHUONG TRINH VO NGHIEM.");
            }
        }
    }
}
