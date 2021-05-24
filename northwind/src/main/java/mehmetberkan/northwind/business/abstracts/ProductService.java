package mehmetberkan.northwind.business.abstracts;

import java.util.List;

import mehmetberkan.northwind.core.utilities.results.DataResult;
import mehmetberkan.northwind.core.utilities.results.Result;
import mehmetberkan.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
