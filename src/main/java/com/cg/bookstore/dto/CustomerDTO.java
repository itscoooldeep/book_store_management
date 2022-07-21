package com.cg.bookstore.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;


public class CustomerDTO extends UserDTO {


    @NotNull(message = "fullName cant be null")
    @Size(min = 2, max = 30)
    @Pattern(regexp = "^[A-Za-z ]+", message = "full name should only consist alphabet!")
    private String fullName;


    @Valid
    @NotNull(message = "address cant be null")
    private AddressDTO address;

    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should only consist 10 digits")
    @NotBlank(message = "mobile number cant be null")
    private String mobileNumber;

    public CustomerDTO() {
        super();
    }


    public CustomerDTO(String fullName, AddressDTO address, String mobileNumber) {
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
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
        return "CustomerDTO{" +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
