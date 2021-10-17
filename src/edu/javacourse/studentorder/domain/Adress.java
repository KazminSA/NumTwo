package edu.javacourse.studentorder.domain;

public class Adress {
    private String pastCode;
    private String street;
    private String building;
    private String extension;
    private String apartment;

    public String getPastCode() {
        return pastCode;
    }
    public void setPastCode(String pastCode) {
        this.pastCode = pastCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
