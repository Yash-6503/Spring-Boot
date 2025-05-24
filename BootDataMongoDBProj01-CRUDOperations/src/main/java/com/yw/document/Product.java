package com.yw.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Product {
	@Id
	private String prodId;
	private String prodName;
	private Double prodPrice;
	private Integer prodQty;
	private String prodStatus;
	private LocalDate date;
}
