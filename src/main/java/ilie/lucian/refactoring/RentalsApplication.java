package ilie.lucian.refactoring;

public class RentalsApplication {

    public static void main(String[] args) {
        Customer me = new Customer("Lucian");

        me.addRental(new Rental(
                new Movie("Godfather 1", Movie.REGULAR), 7
        ));
        me.addRental(new Rental(
                new Movie("Shawshank Redemption", Movie.REGULAR), 7
        ));
        me.addRental(new Rental(
                new Movie("Beauty and the beast", Movie.CHILDRENS), 10
        ));
        me.addRental(new Rental(
                new Movie("Black Panther", Movie.NEW_RELEASE), 3
        ));

        System.out.println(me.statement());
    }
}
