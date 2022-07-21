package com.cg.bookstore.dto;

import com.cg.bookstore.constant.Category;
//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class BookDTO {
    /**
     * Unique Book Number given by company.
     * Eg: ISBN number
     */
//    @ApiModelProperty(value = "Book Unique Id")
    private int id;

    /**
     * title of the book
     */
//    @ApiModelProperty(value = "Title of the book")
    @NotEmpty(message = "title should be given.")
    private String title;

    /**
     * author of the book
     */
//    @ApiModelProperty(value = "Author of the book")
    @NotEmpty(message = "author should be given .")
    private String author;

    /**
     * category of the book
     * Eg: Novel, Fiction, etc
     */
//    @ApiModelProperty(value = "Category of the book")
//    @NotEmpty(message = "category should be given. ")
    private Category category;

    /**
     * price of the book
     */
//    @ApiModelProperty(value = "Price of the book")
    @Min(value = 0, message = "Price should be positive value.")
    private float price;

    /**
     * Amount of book available
     */
//        @ApiModelProperty(value="Copies of book available on the store")
//        @Min(value = 0, message = "Total Count should be positive value.")
    private String description;

    private int quantity;

    public BookDTO() {
        super();

    }

    public BookDTO(int id, String title, String author, Category category, float price, String description , int quantity ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.description = description;
        this.quantity =quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", description='" + description + '\'' + ", quantity='" + quantity + '\'' +
                '}';
    }
}

