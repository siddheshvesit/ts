package com.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.ProductListDao;
import com.dto.Product;


@Component
@Repository
public class ProductListDaoImp implements ProductListDao {
	
	private static final Logger log = LoggerFactory.getLogger(ProductListDaoImp.class.getName());


	String GET_ALL_RECORDS="SELECT * FROM PRODUCT_REGISTER";
	JdbcTemplate jtemp=new JdbcTemplate();
	//ProductListMapper plm;
	public class ProductListMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Product pro =new Product();
			pro.setProductUniqueId(rs.getInt("product_unique_code"));
			pro.setProductName(rs.getString("product_name"));
			pro.setProductCategory(rs.getString("product_category"));
			pro.setProductSubCategory(rs.getString("product_sub_category"));
			pro.setBrand(rs.getString("product_brand"));
			pro.setProductWeight(rs.getInt("product_weight"));
			pro.setProductPrice(rs.getInt("product_price"));
			
			
			return pro;
		}
		

	}
	@Override
	public List<Product> productListAllRecords() {
		// TODO Auto-generated method stub
		log.info("inside daoimpl");
		
		return jtemp.query(GET_ALL_RECORDS,new ProductListMapper());

		
	}

	

}

