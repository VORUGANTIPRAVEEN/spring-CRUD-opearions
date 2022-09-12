package com.example.RestApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApi.entity.Product;
import com.example.RestApi.respository.ProductRespository;

@Service
public class ProductService {
    @Autowired
	private ProductRespository productrepository;
	
    public Product saveProduct(Product products) {
		return productrepository.save(products);
    	
    }
    public List<Product> saveProducts(List<Product> products) {
		return productrepository.saveAll(products);
    	
    }
    public List<Product> Allproducts() {
		return productrepository.findAll();
    	
    }
	public Product getProductByid(int id) {
    	return productrepository.findById(id).orElse(null);
    }

    public String deleteProductByid(int id) {
    	 productrepository.deleteById(id);
    	 return "deleted this id data"+id;
    }
    public Product Updateid(Product product){
    	
		Product oldproduct=productrepository.findById((product.getId())).orElse(null);
		oldproduct.setName(product.getName());
		oldproduct.setPrice(product.getPrice());
		oldproduct.setQuantity(product.getQuantity());
		
		return productrepository.save(oldproduct);
    }
}
