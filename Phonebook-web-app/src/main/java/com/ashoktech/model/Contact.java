package com.ashoktech.model;

import java.util.Date;

import lombok.Data;

@Data
public class Contact {

	
	private Integer contact_id;
	private String contact_name;
	private String contact_email;
	private String contact_mobile;
	private Date created_at;
	private Date updated_at;
}
