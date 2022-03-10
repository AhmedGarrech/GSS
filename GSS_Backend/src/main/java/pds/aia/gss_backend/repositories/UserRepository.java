package pds.aia.gss_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pds.aia.gss_backend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
