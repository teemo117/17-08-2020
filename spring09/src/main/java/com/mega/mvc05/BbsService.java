package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	@Autowired
	BbsDAO dao;
	
	public BbsVO one(BbsVO vo) {
		return dao.select(vo);
	}
	
	public List<BbsVO> list() {
		return dao.list();
	}
}