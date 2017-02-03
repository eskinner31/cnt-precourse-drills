package com.galvanize;

import java.util.*;

public interface Addressable {

  List<Address> getAddresses();

  void addAddress(Address address);
}
