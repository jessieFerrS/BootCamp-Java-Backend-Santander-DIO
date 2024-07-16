package dio.dio_spring_security.repository;

import dio.dio_spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; // para persistencia e realização de consulta
import org.springframework.data.repository.query.Param; // para persistencia e realização de consulta

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);
}
