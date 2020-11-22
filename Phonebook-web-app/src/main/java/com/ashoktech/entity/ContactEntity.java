package com.ashoktech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_DETAILS")
public class ContactEntity {

	@Id
	@Column(name = "CONTACT_ID")
	@SequenceGenerator(name = "cid_seq_gen", sequenceName = "CONTACT_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "cid_seq_gen", strategy = GenerationType.SEQUENCE)
	private Integer contact_id;

	@Column(name = "contact_name")
	private String contact_name;

	@Column(name = "CONTACT_EMAIL")
	private String contact_email;
	@Column(name = "CONTACT_MOBILE")
	private String contact_mobile;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date created_at;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updated_at;
}
