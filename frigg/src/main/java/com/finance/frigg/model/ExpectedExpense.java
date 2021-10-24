package com.finance.frigg.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expected_expense")
public class ExpectedExpense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean payed;

	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate creationDate;

	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dischargeDate;

	private Double value;

}
