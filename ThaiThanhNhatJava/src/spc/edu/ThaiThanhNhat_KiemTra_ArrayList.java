/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class ThaiThanhNhat_KiemTra_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Nhap so (nhap 'stop' de dung):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le hoac 'stop' de dung.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("ban chua nhap so nao.");
            return;
        }

        double max = numbers.get(0);
        double min = numbers.get(0);
        double sum = 0;

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double average = sum / numbers.size();

        System.out.println("so lon nhat: " + max);
        System.out.println("so nho nhat: " + min);
        System.out.println("tong cua day so: " + sum);
        System.out.println("trung binh cua day so: " + average);
    }
}
