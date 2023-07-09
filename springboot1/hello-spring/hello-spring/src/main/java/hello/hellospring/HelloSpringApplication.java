package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

//	메인 메서드를 실행해서 서버를 실행. 톰캣이라는 웹서버를 내장하고 있음.
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
