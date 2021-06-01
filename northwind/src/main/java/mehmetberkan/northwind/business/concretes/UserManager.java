package mehmetberkan.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mehmetberkan.northwind.business.abstracts.UserService;
import mehmetberkan.northwind.core.dataAccess.UserDao;
import mehmetberkan.northwind.core.entities.User;
import mehmetberkan.northwind.core.utilities.results.DataResult;
import mehmetberkan.northwind.core.utilities.results.Result;
import mehmetberkan.northwind.core.utilities.results.SuccessDataResult;
import mehmetberkan.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}

}
