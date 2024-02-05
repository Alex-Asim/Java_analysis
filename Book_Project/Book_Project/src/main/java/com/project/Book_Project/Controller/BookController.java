package com.project.Book_Project.Controller;

import com.project.Book_Project.Dto.BookDto;
import com.project.Book_Project.Service.BookService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/projectBooks")
public class BookController {

    private BookService bookService;

    @PostMapping()
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody BookDto bookDto){
        return new ResponseEntity<>(bookService.createBook(bookDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable (name="id") long id) {
        return new ResponseEntity<BookDto>(bookService.getBookById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDto> updateBook(@PathVariable (name="id") long id, @RequestBody BookDto updateBook){
//      Book Service has already a method for updating a book.
        return new ResponseEntity<BookDto>(bookService.updateBook(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable(name = "id") long id) {
        bookService.deleteMovieById(id);
        return new ResponseEntity<>("The book has been succesfully deleted.",HttpStatus.OK);
    }

}
