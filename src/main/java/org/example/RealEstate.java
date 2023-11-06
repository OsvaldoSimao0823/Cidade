package org.example;

public class RealEstate implements PanelInterface, Comparable <RealEstate> {
    private String city;
    private double price;
    private int sqm;
    private int numberOfRooms;
    private Genre genre;

    public RealEstate(String city, double price, int sqm, int numberOfRooms, Genre genre) {
        this.city = city;
        this.price = price;
        this.sqm = sqm;
        this.numberOfRooms = numberOfRooms;
        this.genre = genre;
    }

    public void discount(int percentage) {
        setPrice(price-=(price*percentage/100.0));
    }

    public int totalPrice() {
        int basePrice = (int)(price*sqm);
        switch (city) {
            case "Budapest": return (int) (basePrice*1.3);
            case "Debrecen": return (int) (basePrice*1.2);
            case "Nyiregyhaza": return (int) (basePrice*1.15);
            default: return basePrice;
        }
    }

    public double average() {
        return sqm/numberOfRooms;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSqm() {
        return sqm;
    }

    public void setSqm(int sqm) {
        this.sqm = sqm;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "RealEstate{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", sqm=" + sqm +
                ", numberOfRooms=" + numberOfRooms +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean hasSameAmount() {
        return false;
    }

    @Override
    public boolean hasSameAmount(RealEstate realEstate) {
        return false;
    }

    @Override
    public int roomprice() {
        return 0;
    }

    @Override
    public int compareTo(RealEstate o) {
        return 0;
    }
}
