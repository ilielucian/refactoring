package ilie.lucian.refactoring;

public class RentalsApplication {

    public static void main(String[] args) {
        Customer me = new Customer("Lucian");

        me.addRental(new Rental(
                new Movie("Godfather 1", 0), 7
        ));
        me.addRental(new Rental(
                new Movie("Shawshank Redemption", 0), 7
        ));
        me.addRental(new Rental(
                new Movie("Beauty and the beast", 2), 10
        ));
        me.addRental(new Rental(
                new Movie("Black Panther", 1), 3
        ));

        System.out.println(me.statement());
    }
}
