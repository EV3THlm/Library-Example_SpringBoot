package com.test.library.repository;

import com.test.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
