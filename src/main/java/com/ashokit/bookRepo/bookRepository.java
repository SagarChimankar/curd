package com.ashokit.bookRepo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.model.Book;

@Repository
public interface bookRepository extends JpaRepository<Book, Integer> {

}
