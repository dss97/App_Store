package cn.dou.controller;

import cn.dou.po.Cart;
import cn.dou.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/yMybatis/order")
public class OrderController {

	@Resource
	private OrderService orderService;
	
	@RequestMapping(value="/get_all",produces = "application/json; charset=utf-8",method= {RequestMethod.GET})
	@ResponseBody
	public Object getAll() throws IOException {
		List<Cart> results=orderService.getAll();
		ObjectMapper mapper=new ObjectMapper();
		String ret=mapper.writeValueAsString(results);
		System.out.println("/order/get_all:ORDER:"+ret);
		return ret;
	}
	
	/*@RequestMapping(value = "/add", produces = "application/json; charset=utf-8", method = {RequestMethod.GET })
	@ResponseBody//警告: No mapping found for HTTP request with URI [/yMybatis/WEB-INF/jsp/cart/add.jsp] in DispatcherServlet with name 'springmvc'
	//这个警告无关紧要: No mapping found for HTTP request with URI [/yMybatis/] in DispatcherServlet with name 'springmvc'
	public void add(HttpServletRequest req) throws IOException {
		Integer goodId=Integer.valueOf(req.getParameter("goodId"));
		BigDecimal goodPrice=new BigDecimal(req.getParameter("goodPrice"));
		Cart cart=new Cart(goodId,req.getParameter("goodName"),goodPrice, req.getParameter("goodMainUrl"),req.getParameter("goodDetailUrls"));
		orderOperation.insert(cart);
	}*/
}
