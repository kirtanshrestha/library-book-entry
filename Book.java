
public  class Book {
    String name;
    String author;
    String publisher;
    double price;
    int pages;
    long ISBN;

 

    Book(String name, String author, String publisher, double price, int pages, long ISBN) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return name;
    }


    public  void displayTable() {
       
    }

    public void displayTotal() {
       
    }
}
