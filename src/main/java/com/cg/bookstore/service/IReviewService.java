package com.cg.bookstore.service;

import java.util.List;

import com.cg.bookstore.entities.Book;
import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.entities.Review;

public interface IReviewService {

	public List<Review> listAllReviews();
	public Review addReview(Review review);
	public Review deleteReview(Review review);
	public Review updateReview(Review review);
	public Review viewReview(Review review);
	public List<Review> listAllReviewsByBook(Book book);
	public List<Review> listAllReviewsByCustomer(Customer c);
	public List<Book> listMostFavoredBooks();
<<<<<<< HEAD
	public List<Review> listAllReviewByCustomer(customer customer);
=======
	public List<Review> listAllReviewByCustomer(Customer customer);
>>>>>>> 9317396 ( book management project started)
}
