package co.joeportilla.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class loggerApplication {

	private static Logger logger = LoggerFactory.getLogger(loggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(loggerApplication.class, args);

		logger.debug("Mi mensaje debug.\n(Oculto por defecto, su visibilidad se ajusta en application)");
		logger.info("Mi mensaje info");
		logger.warn("Mi mensaje warn");
		logger.error("Mi mensaje error");
	}

}
