/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<News> newlist = new ArrayList<>();
        News news = new News();
        while (true) {
            System.out.println("1 – Insert news");
            System.out.println("2 – View list news");
            System.out.println("3 – Average rate");
            System.out.println("4 – Exit ");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    news.setTittle("Derby Lodon");
                    news.setPublishDate("20/09/2021");
                    news.setAuthor("Tu");
                    news.setContent("Tot 0-3 Chel");
                    newlist.add(news);
                    System.out.println("Ban hay cho toi 3 danh gia: ");
                    int[] a = news.rateList;
                    for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                    }
                    break;
                }
                case "2": {
                    news.display();
                    break;
                }
                case "3": {
                    news.calculate();
                    news.display();
                    break;
                }
                case "4": {
                    return;
                }
            }
        }
    }
}
