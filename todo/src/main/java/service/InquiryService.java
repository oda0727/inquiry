package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.InquiryDao;
import entity.InquiryEntity;

@Service
@Transactional

public class InquiryService {

	@Autowired
	InquiryDao inquiry;

	public void inquiryInsert(InquiryEntity inquiryEntity) {
		inquiry.inquiryInsert(inquiryEntity);
	  }
}
