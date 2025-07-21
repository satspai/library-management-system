package com.library.services;

import com.library.models.Book;
import com.library.models.Member;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryManagementService {
    private static Map<String, Book> bookDatabase = new HashMap<>();
    private static Map<String, Member> memberDatabase = new HashMap<>();

    static {
        bookDatabase.put("B001", new Book("B001","The Alchemist","PC","BORROWED","M001"));
        bookDatabase.put("B002", new Book("B002","1984","RR","AVAILABLE",null));

        memberDatabase.put("M001",new Member("M001","Alice"));
        memberDatabase.put("M002",new Member("M002","Bob"));


    }

        public String returnBook(String bookId, String memberId) {
            Book book = bookDatabase.get(bookId);
            Member member = memberDatabase.get(memberId);

        }
}
