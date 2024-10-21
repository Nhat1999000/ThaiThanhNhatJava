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
public class De2_ThaiThanhNhat_cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("nhap so N (so luong Fibonacci hien thi): ");
        int N = scanner.nextInt();

       
        ArrayList<Integer> fibonacciList = new ArrayList<>();

        
        if (N > 0) {
            fibonacciList.add(0); // F(0)
        }
        if (N > 1) {
            fibonacciList.add(1); // F(1)
        }
        
        for (int i = 2; i < N; i++) {
            int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }

      
        System.out.println("day so Fibonacci:");
        for (int number : fibonacciList) {
            System.out.print(number + " ");
        }
        System.out.println();

       
        int sum = 0;
        for (int number : fibonacciList) {
            sum += number;
        }

       
        System.out.println("tong cua day so: " + sum);
    }
}
