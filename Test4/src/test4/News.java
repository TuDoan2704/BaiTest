/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author Doan Tu
 */
public class News implements INews {
    private int id;
    private String tittle;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "News{" + "tittle=" + tittle + ", publishDate=" + publishDate + ", author=" + author + ", content=" + content + ", averageRate=" + averageRate + '}';
    }
    
    int rateList[] = new int[3];
    public float calculate(){
        float total = 0;
        for(int i = 0; i < rateList.length; i++){
            total += rateList[i];
        }
        averageRate = total/rateList.length;
        return averageRate;
    }
    
}
