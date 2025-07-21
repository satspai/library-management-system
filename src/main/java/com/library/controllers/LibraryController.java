package com.library.controllers;

import com.library.services.LibraryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private LibraryManagementService libraryManagementService;
    @PostMapping("/return-book")
    public String returnBook (@RequestParam String bookId, @RequestParam String memberId) {
        return libraryManagementService.returnBook(bookId,memberId);
    }

}
