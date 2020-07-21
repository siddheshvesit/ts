package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daoimpl.ProductListDaoImp;
import com.dto.Product;
import com.service.ProductListService;


@RestController
@RequestMapping("/product")
public class Controller {
	
	
	//ProductListService pls=null;

	ProductListDaoImp pldi=new ProductListDaoImp();
	
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public @ResponseBody List<Product>getAllProducts()
	{
		System.out.println("in controller");
		//return pls.productListAllRecords();
		return pldi.productListAllRecords();
	}
	

}
