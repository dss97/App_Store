package cn.dou.controller;

import cn.dou.service.CartService;
import cn.dou.service.CategoryService;
import cn.dou.service.GoodService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.dou.po.Category;
import cn.dou.po.FullCategory;
import cn.dou.po.Good;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/yMybatis/category")
public class CategoryController {

	@Resource
	private CategoryService categoryService;

	@Resource
	private GoodService goodService;

	@RequestMapping(value = "/get_all", produces = "application/json; charset=utf-8", method = { RequestMethod.GET })
	@ResponseBody
	public Object getAll() throws IOException {
		List<Category> results = categoryService.getAll();
		List<FullCategory> full_results=new ArrayList<FullCategory>();
		for (Category category : results) {
			List<Good> goods = goodService.getByType(category.getCatType());
			FullCategory fullCategory=new FullCategory(category, goods);
			full_results.add(fullCategory);
		}
		ObjectMapper mapper = new ObjectMapper();
		String ret = mapper.writeValueAsString(full_results);
		System.out.println(ret);
		return ret;
	}
}
