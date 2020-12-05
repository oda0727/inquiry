package dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.InquiryEntity;

@Repository
public class InquiryDao{
	  @Autowired
	  EntityManager em;

	  public void inquiryInsert(InquiryEntity inquiryEntity) {
	    em.persist(inquiryEntity);
	  }
}
