package telran.blocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class AnalyzerAppl {

	public static void main(String[] args) {
		SpringApplication.run(AnalyzerAppl.class, args);

	}

}
