package mehmetberkan.northwind.business.abstracts;

import mehmetberkan.northwind.core.entities.User;
import mehmetberkan.northwind.core.utilities.results.DataResult;
import mehmetberkan.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
