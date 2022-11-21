package lesson194;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lesson194.service", "lesson194.repositories"})
public class ProjectConfig {
}
