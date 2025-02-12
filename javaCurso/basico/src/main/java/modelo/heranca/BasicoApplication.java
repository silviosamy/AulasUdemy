package modelo.heranca;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootApplication

public class BasicoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicoApplication.class, args);
    }

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return (args) -> {
            transactionTemplate.execute(action -> {
                try {
                    //novoUsuario();
                    alterarUsuario(1L, "Djalminha", "djamilnha@lanche.com");
                    return null;
                } catch (Exception e) {
                    action.setRollbackOnly();
                    throw e;
                }
            });
        };
    }
}
