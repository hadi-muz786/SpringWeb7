package pack7.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import paccck7.ProductService;
import pacck7.ProductDso;

@Controller
public class ProductController {
	private ProductService proservice;

	@RequestMapping(value = "producter", method = RequestMethod.GET)
	public ModelAndView showPage() {
		System.out.println("This is the Products");

		ProductDso pr = proservice.AllinService();
		System.out.println(pr.toString());

		ModelAndView mn = new ModelAndView("producter");
		mn.addObject("ant", pr);
		mn.addObject("name", "Abdul Hadi");

		return mn;

	}

	public ProductService getProservice() {
		return proservice;
	}

	public void setProservice(ProductService proservice) {
		this.proservice = proservice;
	}

}
