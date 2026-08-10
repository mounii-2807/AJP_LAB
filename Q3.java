
class Author {
    String aname ;
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    String email ;
    char gender ;

    public Author(String name, String email, char gender) {
        this.aname = name;
        this.email = email;
        this.gender = gender;
    }
}

class Book extends Author {
    String bname ;
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQytInStock() {
        return qytInStock;
    }

    public void setQytInStock(int qytInStock) {
        this.qytInStock = qytInStock;
    }

    double price ;
    int qytInStock ;

    public Book(String bname, double price, int qytInStock, String name, String email, char gender) {
        super(name, email, gender);
        this.bname = bname;
        this.price = price;
        this.qytInStock = qytInStock;
    }

                 
    
}

public class Q3 {
    public static void main(String[] args) {
        Book b = new Book("Atomic Habits", 260, 45, "Karna", "alice@emial", 'M') ;
        System.out.println(b.aname);
        System.out.println(b.bname);
        System.out.println(b.email);
        System.out.println(b.gender);
        System.out.println(b.price);
        System.out.println(b.qytInStock);
    }
}
