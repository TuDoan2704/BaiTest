/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
import java.util.Scanner;

public class Square extends Description {

    private float a;
    public void createInf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh hinh vuong: ");
        a = sc.nextFloat();
    }
    @Override
    public void disEdge() {
        System.out.println("Canh cua hinh vuong la: " + a);
    }

    @Override
    public void disPerimeter() {
        perimeter = 4 * a;
        System.out.print("\n Chu vi hinh vuong la: " + perimeter);
    }

    @Override
    public void disArea() {
        area = a * a;
        System.out.println("Dien tich hinh vuong la: " + area);
    }

    @Override
    public void display() {
        System.out.println("\n Dien tich cua hinh vuong la: " + area);
        System.out.println("\n Chu vi cua hinh vuong la: " + perimeter);

    }

}
