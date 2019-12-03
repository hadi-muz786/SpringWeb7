package paccck7;

import org.springframework.stereotype.Service;

import pacck7.ProductDso;

@Service
public class ProductService {

	public ProductDso AllinService() {

		ProductDso pr = new ProductDso();
		pr.setName("Phone");
		pr.setColour("DarkBlack");
		pr.setBrand("Samsung");

		return pr;

	}

}
