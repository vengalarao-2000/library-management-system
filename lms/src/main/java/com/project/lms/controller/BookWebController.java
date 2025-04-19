package com.project.lms.controller;


import com.project.lms.entity.Book;
import com.project.lms.entity.User;
import com.project.lms.service.BookService;
import com.project.lms.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookWebController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("users", userService.findAll());
        return "books/form";
    }

    @PostMapping
    public String saveBook(@ModelAttribute("book") Book book) {
        if (!book.isBorrowed()) {
            book.setBorrowedBy(null);
        }
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("users", userService.findAll());
        return "books/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }

    @PostMapping("/{bookId}/borrow")
    public String borrowBook(@PathVariable Long bookId, @RequestParam Long userId) {
        bookService.borrowBook(bookId, userId);
        return "redirect:/books";
    }

    @PostMapping("/{bookId}/return")
    public String returnBook(@PathVariable Long bookId) {
        bookService.returnBook(bookId);
        return "redirect:/books";
    }
}
