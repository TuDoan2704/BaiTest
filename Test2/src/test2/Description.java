/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.util.Scanner;

public class Description {

    private float a;
    private float b;
    private float area;
    private float perimeter;
    Scanner sc = new Scanner(System.in);

    public Description(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void disEdge() {
        if (a == b) {
            System.out.println("Canh cua hinh vuong la: " + a);
        } else {
            System.out.println("Cac canh cua hinh chu nhat la: " + a + " " + b);
        }

    }

    public void disPerimeter() {

        perimeter = 2 * (a + b);
        if (a == b) {
            System.out.print("\n Chu vi hinh vuong la: " + perimeter);
        } else {
            System.out.print("\n Chu vi hinh chu nhat la: " + perimeter);
        }

    }

    public void disArea() {

        area = a * b;
        if (a == b) {
            System.out.print("\n Dien tich hinh vuong la: " + area);
        } else {
            System.out.print("\n Dich tich hinh chu nhat la: " + area);
        }
    }

    public void display() {
        if (a == b) {
            System.out.println("\n Dien tich cua hinh vuong la: " + area);
            System.out.println("\n Chu vi cua hinh vuong la: " + perimeter);
        } else {
            System.out.println("\n Dien tich cua hinh chu nhat la: " + area);
            System.out.println("\n Chu vi cua hinh chu nhat la: " + perimeter);
        }

    }
    public static void main(String[] args) {
        Description st = new Description(4 , 5);
        
        st.disEdge();
        st.disPerimeter();
        st.disArea();
        st.display();
    }
}
