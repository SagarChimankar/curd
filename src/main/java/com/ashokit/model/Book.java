package com.ashokit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="BOOK_DTLS")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BOOK_ID")
	private Integer bid;
	
	@Column(name="BOOK_NAME")
	private String name;
	
	@Column(name="BOOK_PRISE")
	private Double prise;

}
