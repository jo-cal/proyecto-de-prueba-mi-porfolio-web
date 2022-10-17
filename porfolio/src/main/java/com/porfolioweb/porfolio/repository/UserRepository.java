
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository<User, Integer>   {
    Optional<User>findByEmail(String email);

    
}
