package com.registration.repository;

import com.registration.model.EmailConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailConfirmationTokenRepository extends JpaRepository<EmailConfirmationToken, Long> {
	EmailConfirmationToken findByConfirmationToken(String confirmationToken);
}
