import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan("co.com.infrastructure")
@EnableJpaRepositories("co.com.infrastructure")
@EntityScan("co.com.infrastructure")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
