package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping
    public String sendMail(@RequestBody ContactForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("tonemail@domaine.com");
        message.setSubject("Message de " + form.name);
        message.setText(form.message + "\n\nEmail: " + form.email);
        mailSender.send(message);
        return "Envoyé";
    }

    static class ContactForm {
        public String name;
        public String email;
        public String message;
    }
}
