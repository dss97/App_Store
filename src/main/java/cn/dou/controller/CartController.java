package cn.dou.controller;

import cn.dou.po.Cart;
import cn.dou.service.CartService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/yMybatis/cart")
public class CartController {

	@Resource
	private  CartService cartService;

	@RequestMapping(value="/get_all",produces = "application/json; charset=utf-8",method= {RequestMethod.GET})
	@ResponseBody
	public Object getAll() throws IOException {
		List<Cart> results=cartService.getAll();
		ObjectMapper mapper=new ObjectMapper();
		String ret=mapper.writeValueAsString(results);
		return ret;
	}
	
	@RequestMapping(value = "/add", produces = "application/json; charset=utf-8", method = {RequestMethod.GET })
	@ResponseBody//警告: No mapping found for HTTP request with URI [/yMybatis/WEB-INF/jsp/cart/add.jsp] in DispatcherServlet with name 'springmvc'
	//这个警告无关紧要: No mapping found for HTTP request with URI [/yMybatis/] in DispatcherServlet with name 'springmvc'
	public void add(HttpServletRequest req) throws IOException {
		Integer goodId=Integer.valueOf(req.getParameter("goodId"));
		BigDecimal goodPrice=new BigDecimal(req.getParameter("goodPrice"));
		Cart cart=new Cart(goodId,req.getParameter("goodName"),goodPrice, req.getParameter("goodMainUrl"),req.getParameter("goodDetailUrls"));
		cartService.insert(cart);
	}
	
}
