package customer;

import address.Address;

public class Customer {
    private int customerId;
    private String email;
    private String phone;
    private String name;
    private String aadharNumber;
    private Address address;
    public Customer(int customerId, String email, String phone, String name, String aadharNumber, Address address) {
        this.customerId = customerId;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    
}
