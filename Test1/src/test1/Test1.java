/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;
public class Test1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien ban can tinh: " );
        int n = sc.nextInt();
        int money;
        if(0 < n && n <= 50){
            money = 1678 * n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(51 <= n && n <= 100){
            money = 1678 * 50 + 1734 * (n - 50);           
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(101 <= n && n <= 200){
            money = 1678 * 50 + 1734 * 50 + 2014 * (n-100);
            
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(201 <= n && n <= 300){
            money = 1678 * 50 + 1734 * 50 + 2014 * 100 + 2536 * (n-200);
            
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(301 <= n && n <= 400){
            money = 1678 * 50 + 1734 * 50 + 2014 * 100 + 2536 * 100 + 2834 * (n - 300) ;         
            
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(n >= 401){
            money = 1678 * 50 + 1734 * 50 + 2014 * 100 + 2536 * 100 + 2834 * 100 + 2927 *(n-400);                      
            System.out.println("So tien ban phai tra la: " + money);
        }
    }
    
}
