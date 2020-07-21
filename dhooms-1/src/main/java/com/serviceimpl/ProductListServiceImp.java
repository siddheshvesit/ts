package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.ProductListDao;
import com.dto.Product;
import com.service.ProductListService;
import org.apache.logging.log4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
@Service
public class ProductListServiceImp implements ProductListService {

@Autowired
 ProductListDao productlistdao;
private static final Logger log = LoggerFactory.getLogger(ProductListServiceImp.class.getName());

	@Override
	public List<Product> productListAllRecords() {
		// TODO Auto-generated method stub
		
		log.info("in service imple");
		return productlistdao.productListAllRecords();
	}
	

}
