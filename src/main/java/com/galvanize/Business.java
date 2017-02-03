package com.galvanize;

import java.util.*;

public class Business implements Addressable {
  private final String name;
  private final ArrayList<Address> addresses = new ArrayList();

  public Business(String nName) {
    name = nName;
  }

  public String getName() { return name; }

  @Override
  public List<Address> getAddresses(){
    return this.addresses;
  }

  @Override
  public void addAddress(Address address) {
    this.addresses.add(0, address);
  }
}
