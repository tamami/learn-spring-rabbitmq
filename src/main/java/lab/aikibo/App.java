package lab.aikibo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{

    @Autowired
    Sender sender;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    public void run(String... args) {
        sender.send("Hi semua!");
    }
}
