package br.com.picpay_desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@SpringBootApplication
@EnableJdbcAuditing
public class PicpayDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpayDesafioApplication.class, args);
	}

}
