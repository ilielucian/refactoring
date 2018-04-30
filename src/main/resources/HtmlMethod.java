package ilie.lucian.refactoring;

import java.util.Enumeration;

public class HtmlMethod {

//    public String htmlStatement() {
//        Enumeration rentals = _rentals.elements();
//        String result = "<H1>Rentals for <EM>" + getName() + "</EM></ H1><P>\n";
//        while (rentals.hasMoreElements()) {
//            Rental each = (Rental) rentals.nextElement();
//            //show figures for each rental
//            result += each.getMovie().getTitle()+ ": " +
//                    String.valueOf(each.getCharge()) + "<BR>\n";
//        }
//
//        //add footer lines
//        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) +
//                "</EM><P>\n";
//        result += "On this rental you earned <EM>" +
//                String.valueOf(getTotalFrequentRenterPoints()) +
//                "</EM> frequent renter points<P>";
//        return result;
//    }

    private static String getExpectedHtmlStatement() {
        return "<H1>Rentals for <EM>Lucian</EM></ H1><P>\n" +
                "Godfather 1: 9.5<BR>\n" +
                "Shawshank Redemption: 9.5<BR>\n" +
                "Beauty and the beast: 12.0<BR>\n" +
                "Black Panther: 9.0<BR>\n" +
                "<P>You owe <EM>40.0</EM><P>\n" +
                "On this rental you earned <EM>5</EM> frequent renter points<P>";
    }
}
