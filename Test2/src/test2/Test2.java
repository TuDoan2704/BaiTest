/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Doan Tu
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square sq = new Square();
        Area ar = new Area();
        sq.createInf();
        sq.disEdge();
        sq.disPerimeter();
        sq.disArea();
        sq.display();
    }
    
}
