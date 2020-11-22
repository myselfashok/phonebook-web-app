package com.ashoktech.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashoktech.entity.ContactEntity;
import com.ashoktech.model.Contact;
import com.ashoktech.repo.ContactDetailsRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDetailsRepo contactDetailsRepo;
	
	@Override
	public boolean saveContact(Contact c) {
		
		//creating objects of Entity class cz converting dto to entity
		ContactEntity entity=new ContactEntity();		
		BeanUtils.copyProperties(c, entity);		
		ContactEntity savedEntity=contactDetailsRepo.save(entity);
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
