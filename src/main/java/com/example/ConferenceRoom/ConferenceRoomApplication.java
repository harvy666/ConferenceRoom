package com.example.ConferenceRoom;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceRoomApplication {

	public static void main(String[] args) {
		Flyway flyway = Flyway.configure()
				.dataSource("jdbc:h2:mem:conference", "sa", null)
				.locations("db/migration")
				.load();

		flyway.migrate();

		SpringApplication.run(ConferenceRoomApplication.class, args);
	}

}
