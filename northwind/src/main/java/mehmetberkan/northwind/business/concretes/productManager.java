package mehmetberkan.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mehmetberkan.northwind.business.abstracts.ProductService;
import mehmetberkan.northwind.core.utilities.results.DataResult;
import mehmetberkan.northwind.core.utilities.results.Result;
import mehmetberkan.northwind.core.utilities.results.SuccessDataResult;
import mehmetberkan.northwind.core.utilities.results.SuccessResult;
import mehmetberkan.northwind.dataAccess.abstracts.ProductDao;
import mehmetberkan.northwind.entities.concretes.Product;

@Service
public class productManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired 
	public productManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override 
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Product product) {
	    this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}
 
}
