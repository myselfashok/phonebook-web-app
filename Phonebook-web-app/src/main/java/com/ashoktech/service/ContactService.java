package com.ashoktech.service;
import java.util.*;

import com.ashoktech.model.Contact;

public interface ContactService {

	boolean saveContact(Contact c);
	List<Contact> getAllContact();
	Contact getById(Integer cid);
	boolean updateContact(Integer cid);
	boolean deleteContact(Integer cid);
	
}
