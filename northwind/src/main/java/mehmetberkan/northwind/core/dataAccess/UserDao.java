package mehmetberkan.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import mehmetberkan.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
