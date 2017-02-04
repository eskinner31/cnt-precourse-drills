package com.galvanize;


public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String nStreet, String nCity, String nState, String nZip) {
    street = nStreet;
    city = nCity;
    state = nState;
    zip = nZip;
  }
  public String getStreet() { return street;}
  public String getCity() { return city;}
  public String getState() { return state;}
  public String getZip() { return zip;}


  public void setStreet(String newStreet) {
    street = newStreet;
  }

  public void setCity(String newCity) {
    city = newCity;
  }

  public void setState(String newState) {
    state = newState;
  }

  public void setZip(String newZip) {
    zip = newZip;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append(this.getStreet() + ", ");
    result.append(this.getCity() + ", ");
    result.append(this.getState() + " ");
    result.append(this.getZip());

    return result.toString();
  }
}
