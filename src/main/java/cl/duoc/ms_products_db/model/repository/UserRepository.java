package cl.duoc.ms_products_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.ms_products_db.model.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
