package pds.aia.gss_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pds.aia.gss_backend.entities.User;
import pds.aia.gss_backend.repositories.UserRepository;

@SpringBootApplication
public class GssBackendApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(GssBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("ahmed","garrech");
        User user2 = new User("walid","garrech");
        User user3 = new User("wassim","garrech");
        User user4 = new User("douja","garrech");
        User user5 = new User("lotfi","garrech");
         userRepository.save(user1);
         userRepository.save(user2);
         userRepository.save(user3);
         userRepository.save(user4);
         userRepository.save(user5);
    }
}
