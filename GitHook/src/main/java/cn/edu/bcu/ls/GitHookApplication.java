package cn.edu.bcu.ls;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "cn.edu.bcu.ls" })
@SpringBootApplication
public class GitHookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHookApplication.class, args);
	}

}
