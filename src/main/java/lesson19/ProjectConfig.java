package lesson19;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson19.service", "lesson19.repositories"})
public class ProjectConfig {
}
