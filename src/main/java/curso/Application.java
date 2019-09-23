package curso;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

//@SpringBootApplication Inicia a aplicação Java dentro de um container WEB embutido (tomcat)

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages= {"dados"}) // para encontrar controlers que não estejam na mesma hierarquia de pasta do Application 
public class Application {

    public static void main(String[] args) {

    	// inicia a aplicação na porta 8080, acesse: http://localhost:8080
    	new SpringApplication(Application.class).run(args);
    	    	 
    	// para iniciar em uma porta diferente da 8080
    	
    	/*
        SpringApplication app = new SpringApplication(Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
        app.run(args);
        */
        
    }
    
    
    

}

