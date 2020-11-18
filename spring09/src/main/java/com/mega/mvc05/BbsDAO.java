package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;

	public int insert(BbsVO2 vo2) {
		int result=0;
		result = mybatis.insert("bbs.create",vo2);
		return result;
	}

	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete",vo);
	}

	public void update(BbsVO vo) {
		mybatis.update("bbs.delete",vo);
	}

	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one",vo);
		return vo2;
	}

	public List<BbsVO> list() {
		List<BbsVO> list = mybatis.selectList("bbs.list");
		return list;
	}
}
