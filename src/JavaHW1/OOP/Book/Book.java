package JavaHW1.OOP.Book;

import java.util.Scanner;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(){

    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {

        return authors;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){

        String authorList = "";
        for(int i=0;i<authors.length;i++) {
            if(i==0) authorList += "Authors" + (i + 1) + authors[i].toString();
            else authorList += ", " + "Authors" + (i+1) + authors[i].toString();
        }
        authorList +=")";
        return "Book(name=" + name + ",authors={" + authorList + "},price=" + price + ",qty=" + qty + ")";
    }

    public Book setBookManual() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название Книги:");
        this.name = in.nextLine();
        System.out.print("Введите цену за книгу:");
        this.price = in.nextDouble();
        System.out.print("Введите тираж книг:");
        this.qty =  in.nextInt();

        System.out.print("Введите количество авторов:");
        int m = in.nextInt();
        this.authors = new Author[m];

        for(int i=0;i<m;i++) {
            Scanner on = new Scanner(System.in);
            System.out.print("Введите имя Автора" + (i+1) + ":");
            String nameOfAuthor = on.nextLine();
            System.out.print("Введите email Автора" + (i+1) + ":");
            String emailOfAuthor = on.nextLine();
            System.out.print("Введите пол Автора" + (i+1) + ":");
            char genderOfAuthor = on.next().charAt(0);

            authors[i] = new Author(nameOfAuthor, emailOfAuthor, genderOfAuthor);
            if(i==m-1) on.close();
            //         on.close();
        }
        in.close();
        return this;
    }

}

