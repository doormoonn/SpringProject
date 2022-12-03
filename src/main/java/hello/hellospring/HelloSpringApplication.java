package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello World");
        }



        //SpringApplication.run(HelloSpringApplication.class, args);
    }

}
