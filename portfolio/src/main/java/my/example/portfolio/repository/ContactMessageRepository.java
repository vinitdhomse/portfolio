package my.example.portfolio.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import my.example.portfolio.model.ContactMessage;



public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {

    
}
