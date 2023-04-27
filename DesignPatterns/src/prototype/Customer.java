package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Cloneable{
    private List<String> customerList;

    public Customer() {
        customerList = new ArrayList<>();
    }

    public Customer(List<String> customerList) {
        this.customerList = customerList;
    }

    public void loadData(){
        customerList.add("Customer1");
        customerList.add("Customer2");
        customerList.add("Customer3");
        customerList.add("Customer4");
        customerList.add("Customer5");
        customerList.add("Customer6");
    }

    public List<String> getCustomerList() {
        return customerList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for(String s : this.getCustomerList()) {
            temp.add(s);
        }
        return new Customer(temp);
    }
}
