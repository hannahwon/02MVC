package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;



public class UpdateProductViewAction extends Action{

	@Override
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		
		int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		System.out.println(prodNo);
		
		ProductService service=new ProductServiceImpl();
		Product productVO=service.getProduct(prodNo);
		System.out.println(productVO);
		
		request.setAttribute("ProductVO", productVO);
		
		return "forward:/product/updateProductView.jsp";
	}
}
