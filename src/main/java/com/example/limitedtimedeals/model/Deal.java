package com.example.limitedtimedeals.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Deal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int Id;
	@ManyToOne
    @JoinColumn(name="p_id", nullable=false)
    Product p;
	@ManyToOne
    @JoinColumn(name="s_id", nullable=false)
    Seller s;
	int MaxCount;
	int Duration;
	Date StartTime;
}
