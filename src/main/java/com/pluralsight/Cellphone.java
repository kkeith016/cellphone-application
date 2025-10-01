package com.pluralsight;

class CellPhone {


    // Data members
    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Parameterless constructor (default values)
    public CellPhone() {
        this.serialNumber = "";
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }


    //Getters
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getModel() {
        return model;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;

    }
}



