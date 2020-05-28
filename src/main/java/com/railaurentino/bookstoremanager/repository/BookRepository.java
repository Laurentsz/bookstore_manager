package com.railaurentino.bookstoremanager.repository;

import com.railaurentino.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
