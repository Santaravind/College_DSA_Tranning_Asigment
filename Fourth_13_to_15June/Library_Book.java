package Assigment.Fourth_13_to_15June;

class Library{
    private String title;
    private  String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display(){
        System.out.println("Library book title : "+ title);
        System.out.println("Library book author name  : "+ author);
        System.out.println("Library book price : "+ price);
    }

}
public class Library_Book {
    public static void main(String[] args) {
          Library lb=new Library();
          lb.setTitle("Godan");
          lb.setAuthor("Munsi Prem Chandra");
          lb.setPrice(699.00);
          lb.display();
    }
}
