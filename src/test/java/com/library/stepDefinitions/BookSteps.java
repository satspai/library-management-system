package com.library.stepDefinitions;

import com.library.models.Book;
import com.library.services.LibraryManagementService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class BookSteps {
    @Autowired
    private LibraryManagementService libraryManagementService;

    private String retrunMessage;
    private Book testBook;

    @Given("a book with ID {string} is issued to member {string}")
    public void a_book_is_issued(String bookId, String memberId) {
        testBook = new Book(bookId,"Dummy Title","Dummy Author","AVAILABLE", memberId);
        LibraryManagementService.getBookDatabase().put(bookId,testBook);
    }

    @When("the member with ID {string} returns book with ID {string}")
    public void member_returns_book(String bookId, String memberId) {
        libraryManagementService.returnBook(bookId,memberId);
    }

    @Then("the book status should be {string}")
    public void check_book_status(String expectedBookStatus) {
        Book returnedBook = LibraryManagementService.getBookDatabase().get(testBook.getId());
        Assert.assertEquals(expectedBookStatus, returnedBook.getStatus());
    }

    @And("the book should not be assigned to any member")
    public void check_book_not_assined(){
        Book returnedBook = LibraryManagementService.getBookDatabase().get(testBook.getId());
        Assert.assertNull(returnedBook.getStatus());
    }

}
