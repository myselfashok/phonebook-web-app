package com.ashoktech.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashoktech.entity.ContactEntity;

@Repository
public interface ContactDetailsRepo extends JpaRepository<ContactEntity, Serializable> {

}
