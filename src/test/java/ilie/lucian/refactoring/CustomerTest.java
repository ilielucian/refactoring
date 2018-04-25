package ilie.lucian.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testStatement() throws Exception {
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

        assertEquals(getExpectedStatement(), me.statement());
    }

    private static String getExpectedStatement() {
        return "Rental Record for Lucian\n" +
                "\tGodfather 1\t9.5\n" +
                "\tShawshank Redemption\t9.5\n" +
                "\tBeauty and the beast\t12.0\n" +
                "\tBlack Panther\t9.0\n" +
                "Amount owed is 40.0\n" +
                "You earned 5 frequent renter points";
    }
}