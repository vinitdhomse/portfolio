package my.example.portfolio.controller;

import my.example.portfolio.model.ContactMessage;
import my.example.portfolio.repository.ContactMessageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") // Allows frontend to call API

public class ContactController {



    private final ContactMessageRepository repository;

    public ContactController(ContactMessageRepository repository) {
        this.repository = repository;
    }

    // Handle contact form submission
    @PostMapping("/contact")
    public String handleContact(@RequestBody ContactMessage message) {
        repository.save(message);
        return "Thank you " + message.getName() + "! Your message has been received.";
    }

    // Admin API to view all messages
    @GetMapping("/messages")
    public List<ContactMessage> getMessages() {
        return repository.findAll();
    }
}
