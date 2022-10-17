package com.xpinjection.conference;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

class LocalConferenceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConferenceApplication.class)
				.initializers(new StandaloneApplicationContextInitializer())
				.profiles("local")
				.run(args);
	}

}
