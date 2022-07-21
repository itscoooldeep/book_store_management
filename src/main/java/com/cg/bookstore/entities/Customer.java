package com.cg.bookstore.entity;


import javax.persistence.*;
import javax.validation.Valid;


@Entity
public class Customer extends User {


    private String fullName;


    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private Address address;
    private String mobileNumber;


    public Customer() {
        super();
    }


    public Customer(String fullName, Address address, String mobileNumber) {
        super();
        this.fullName = fullName;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", address=" + address +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}

