package ilie.lucian.refactoring;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    double getCharge() {
        double calculatedChargeForRental = 0;
        //determine amounts for each line
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                calculatedChargeForRental += 2;
                if (getDaysRented() > 2)
                    calculatedChargeForRental += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                calculatedChargeForRental += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                calculatedChargeForRental += 1.5;
                if (getDaysRented() > 3)
                    calculatedChargeForRental += (getDaysRented() - 3) * 1.5;
                break;
        }
        return calculatedChargeForRental;
    }

    int getFrequentRenterPoints() {
		if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
			return 2;
		} else {
			return 1;
		}
    }
}
