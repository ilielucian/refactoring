package ilie.lucian.refactoring;

import java.util.List;
import java.util.Vector;

class Customer {
    private String name;
    private List<Rental> rentals = new Vector<>();

    public Customer (String name){
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName (){
        return name;
    }

    public String getPrintedStatement() {
        // add header
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		// add body
		for (Rental rental : rentals) {
			result.append("\t").append(rental.getMovie().getTitle())
                    .append("\t").append(String.valueOf(rental.getCharge())).append("\n");
		}

		// add footer
		result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
		result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");
		return result.toString();
    }

    public String getHtmlStatement() {
        // add header
        StringBuilder result = new StringBuilder("<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n");

        // add body
        for (Rental rental : rentals) {
            result.append(rental.getMovie().getTitle()).append(": ")
                    .append(String.valueOf(rental.getCharge())).append("<BR>\n");
        }

        // add footer lines
        result.append("<P>You owe <EM>").append(String.valueOf(getTotalCharge())).append("</EM><P>\n");
        result.append("On this rental you earned <EM>").append(String.valueOf(getTotalFrequentRenterPoints())).append("</EM> frequent renter points<P>");
        return result.toString();
    }

    private double getTotalCharge() {
        double totalCharge = 0;
        for (Rental rental : rentals) {
            totalCharge += rental.getCharge();
        }
        return totalCharge;
    }

    private int getTotalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }
}
