package com.mega.mvc08;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	public void insert(ProductVO vo) {
		mybatis.insert("product.insert",vo);
	}
	
	public void update(ProductVO vo) {
		mybatis.update("product.update",vo);
	}
	
	public void delete(ProductVO vo) {
		mybatis.delete("product.delete",vo);
	}
	
	public ProductVO one(ProductVO vo) {
		return mybatis.selectOne("product.one",vo);
	}
	
	public List<ProductVO> list() {
		List<ProductVO> list = mybatis.selectList("product.list");
		return list;
	}
}
