public class Tour {

    private String name;
    private double price;
    private float durationOfTour;
    private boolean isMostPopular;
    private int quantityOfBookings;
    private String languageOfTour;

    public Tour(String name, double price,
                float durationOfTour, boolean isMostPopular,
                int quantityOfBookings,
                String languageOfTour) {
        this.name = name;
        this.price = price;
        this.durationOfTour = durationOfTour;
        this.isMostPopular = isMostPopular;
        this.quantityOfBookings = quantityOfBookings;
        this.languageOfTour = languageOfTour;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getDurationOfTour() {
        return durationOfTour;
    }

    public boolean isMostPopular() {
        return isMostPopular;
    }

    public int getQuantityOfBookings() {
        return quantityOfBookings;
    }

    public String getLanguageOfTour() {
        return languageOfTour;
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Price: " + getPrice() + " euro" + "\n" +
                "Duration of Tour: " + getDurationOfTour() + " hour" + "\n" +
                "Quantity of bookings: " + getQuantityOfBookings() + "\n" +
                "Language of Tour: " + getLanguageOfTour() + "\n" +
                "The most popular tour: " + isMostPopular() + "\n";
    }
}