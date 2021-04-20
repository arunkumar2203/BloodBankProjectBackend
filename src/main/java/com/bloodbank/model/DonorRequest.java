package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Donor_request_mstr")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DonorRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	private String patientName;
	@Column
	private String patientAge;
	@Column
	private String reason;
	@Column
	private String bloodGroup;
	@Column
	private float units;
	@Column
	private String status;
	@Column
	private String fileName;
	

}
