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
        if(0< n && n <= 50){
            money = 1678*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(51<= n && n <=100){
            money = 1734*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(101<= n && n <=200){
            money = 2014*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(201<= n && n <=300){
            money = 2536*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(301<= n && n <=400){
            money = 2834*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
        if(n>=401){
            money = 2927*n;
            System.out.println("So tien ban phai tra la: " + money);
        }
    }
    
}
