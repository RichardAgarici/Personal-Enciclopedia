package org.example.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrototypePatternTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.loadData();
        try {
            Customer customer1 = (Customer) customer.clone();
            Customer customer2 = (Customer) customer.clone();
            List<String> customerList1 = customer1.getCustomerList();
            customerList1.add("Customer7");
            List<String> customerList2 = customer2.getCustomerList();
            customerList2.remove("Customer4");
            System.out.println("Customer List:" + customer.getCustomerList());
            System.out.println("Customer1 List 1:" + customerList1);
            System.out.println("Customer1 List 2:" + customerList2);

            List<String> newList = new ArrayList<>(Arrays.asList("testabc", "sdf1", "xsd", "asa1a", "12sfd"));
            Stream stream = newList.stream().filter(s -> s.length() > 4).sorted().map(s -> s.length());
            System.out.println(stream.collect(Collectors.toList()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
