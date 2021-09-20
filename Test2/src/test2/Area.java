/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
import java.util.Scanner;

public class Area extends Description {

    private float a;
    private float b;
    public void createInf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri chieu dai: ");
        a = sc.nextFloat();
        System.out.print("Nhap gia tri chieu rong: ");
        b = sc.nextFloat();
    }
    @Override
    public void disEdge() {
        System.out.println("Cac canh cua hinh chu nhat la: " + a + " " + b);
    }

    @Override
    public void disPerimeter() {
        perimeter = 2 * (a + b);
        System.out.print("\n Chu vi hinh chu nhat la: " + perimeter);
    }

    @Override
    public void disArea() {
        area = a * b;
        System.out.print("\n Dich tich hinh chu nhat la: " + area);
    }

    @Override
    public void display() {
        System.out.println("\n Dien tich cua hinh chu nhat la: " + area);
        System.out.println("\n Chu vi cua hinh chu nhat la: " + perimeter);

    }

}
