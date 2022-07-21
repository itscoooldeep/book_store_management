package com.cg.bookstore.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class AddressDTO {

    private int addressId;
    @NotBlank(message = "houseAddress cant be null")
    private String houseAddress;
    @Pattern(regexp = "^[A-Z][a-z]+( [A-Z][a-z]+)*$", message = "All names must start with a capital letter in State name.")
    @NotBlank(message = "city cant be null")
    private String state;
    @Pattern(regexp = "^[A-Z][a-z]+( [A-Z][a-z]+)*$", message = "All names must start with a capital letter in country name.")
    @NotBlank(message = "country cant be null")
    private String country;
    @Pattern(regexp = "^[1-9][\\d]{2}\\s?[\\d]{3}$", message = "pin code must have 6 digits only")
    @NotBlank(message = "pincode cant be null")
    private String pinCode;

    public AddressDTO() {
    }

    public AddressDTO(int addressId, String houseAddress, String state, String country, String pinCode) {
        this.addressId = addressId;
        this.houseAddress = houseAddress;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "addressId=" + addressId +
                ", houseAddress='" + houseAddress + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
