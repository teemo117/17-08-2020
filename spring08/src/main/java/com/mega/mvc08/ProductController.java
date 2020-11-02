package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping("insert.do")
	public void insert(ProductVO productVO) {
		service.insert(productVO);
	}
	
	@RequestMapping("update.do")
	public void update(ProductVO productVO) {
		service.update(productVO);
	}
	
	@RequestMapping("delete.do")
	public void delete(ProductVO productVO) {
		service.delete(productVO);
	}
	
	@RequestMapping("one.do")
	public ProductVO one(ProductVO productVO) {
		return service.one(productVO);
	}
	
	@RequestMapping("list.do")
	public void list(Model model) {
		 //List<ProductVO> list = service.list(); list로 넘겨도돼
		 model.addAttribute("list",service.list());
	}
}
