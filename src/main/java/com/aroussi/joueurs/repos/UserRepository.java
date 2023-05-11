package com.aroussi.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aroussi.joueurs.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
