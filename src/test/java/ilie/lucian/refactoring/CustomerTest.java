package ilie.lucian.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testStatement() throws Exception {
        Customer me = getTestCustomer();

        assertEquals(getExpectedStatement(), me.getPrintedStatement());
    }

    @Test
    public void testHtmlStatement() {
        Customer me = getTestCustomer();

        assertEquals(getExpectedHtmlStatement(), me.getHtmlStatement());
    }

    private Customer getTestCustomer() {
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
        return me;
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

    private static String getExpectedHtmlStatement() {
        return "<H1>Rentals for <EM>Lucian</EM></H1><P>\n" +
                "Godfather 1: 9.5<BR>\n" +
                "Shawshank Redemption: 9.5<BR>\n" +
                "Beauty and the beast: 12.0<BR>\n" +
                "Black Panther: 9.0<BR>\n" +
                "<P>You owe <EM>40.0</EM><P>\n" +
                "On this rental you earned <EM>5</EM> frequent renter points<P>";
    }
}