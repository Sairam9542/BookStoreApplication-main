package com.BookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
