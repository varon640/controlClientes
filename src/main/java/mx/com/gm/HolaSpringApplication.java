package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HolaSpringApplication {

	public static void main(String[] args) {
            log.info("Ejecutando el controlador rest");
		SpringApplication.run(HolaSpringApplication.class, args);
	}

}
