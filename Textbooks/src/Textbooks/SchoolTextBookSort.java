package Textbooks;

import javax.swing.*;

public class SchoolTextBookSort {
    public static SchoolTextBook[] schoolTextBooks = new SchoolTextBook[5];

    public static void main(String[] args) {
        initSchoolTextBooks();
        String sortOption = JOptionPane.showInputDialog(null, "What field do you want to sort by: author, title, pageCount, iSBN, price");
        if(sortOption.equalsIgnoreCase("author")){
            bubbleSortAuthor(schoolTextBooks);
        }
        else if(sortOption.equalsIgnoreCase("title")){
            bubbleSortTitle(schoolTextBooks);
        }
        else if(sortOption.equalsIgnoreCase("pageCount")){
            bubbleSortPageCount(schoolTextBooks);
        }
        else if(sortOption.equalsIgnoreCase("iSBN")){
            bubbleSortISBN(schoolTextBooks);
        }
        else if(sortOption.equalsIgnoreCase("price")){
            bubbleSortPrice(schoolTextBooks);
        }
        printSchoolTextBooks();
    }

    public static void initSchoolTextBooks(){
        schoolTextBooks[0] = new SchoolTextBook("Bob Jones","Chemistry 101",10,1,700.00);
        schoolTextBooks[1] = new SchoolTextBook("Donald Trump","Art of the Deal",1,2,100000.00);
        schoolTextBooks[2] = new SchoolTextBook("Sally Jones","Chemistry 102",100,3,70.00);
        schoolTextBooks[3] = new SchoolTextBook("Steve Jones","Chemistry 103",200,4,80.00);
        schoolTextBooks[4] = new SchoolTextBook("Bill Shakespeare","Hamlet",300,5,10.00);
    }

    public static void printSchoolTextBooks(){
        for(int i = 0; i < schoolTextBooks.length; i++){
            System.out.println(printSchoolTextBook(schoolTextBooks[i]) + "\n");
        }
    }

    public static String printSchoolTextBook(SchoolTextBook book){
        return "School Text Book: " + " Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Page Count: " + book.getPageCount() + " ISBN: " + book.getiSBN() + " Price: " + book.getPrice();
    }

    public static void bubbleSortAuthor(SchoolTextBook[] array) {
        boolean swapped = true;
        int j = 0;
        SchoolTextBook tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                String author1 = ((SchoolTextBook)array[i]).getAuthor();
                String author2 = ((SchoolTextBook)array[i+1]).getAuthor();
                if (author1.compareToIgnoreCase(author2)>=0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static void bubbleSortTitle(SchoolTextBook[] array) {
        boolean swapped = true;
        int j = 0;
        SchoolTextBook tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                String title1 = ((SchoolTextBook)array[i]).getTitle();
                String title2 = ((SchoolTextBook)array[i+1]).getTitle();
                if (title1.compareToIgnoreCase(title2)>=0) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static void bubbleSortPageCount(SchoolTextBook[] array) {
        boolean swapped = true;
        int j = 0;
        SchoolTextBook tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (((SchoolTextBook)array[i]).getPageCount() > ((SchoolTextBook)array[i + 1]).getPageCount()) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static void bubbleSortISBN(SchoolTextBook[] array) {
        boolean swapped = true;
        int j = 0;
        SchoolTextBook tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (((SchoolTextBook)array[i]).getiSBN() > ((SchoolTextBook)array[i + 1]).getiSBN()) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static void bubbleSortPrice(SchoolTextBook[] array) {
        boolean swapped = true;
        int j = 0;
        SchoolTextBook tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (((SchoolTextBook)array[i]).getiSBN() > ((SchoolTextBook)array[i + 1]).getiSBN()) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public static class SchoolTextBook {

        public String author;
        public String title;
        public int pageCount;
        public int iSBN;
        public double price;

        public SchoolTextBook(String author, String title, int pageCount, int iSBN, double price){
            this.author = author;
            this.title = title;
            this.pageCount = pageCount;
            this.iSBN = iSBN;
            this.price = price;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getiSBN() {
            return iSBN;
        }

        public void setiSBN(int iSBN) {
            this.iSBN = iSBN;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

    }

}
