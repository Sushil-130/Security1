package studyeasy.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class Security1Application {

	public static void main(String[] args) {
		SpringApplication.run(Security1Application.class, args);
	}

}
