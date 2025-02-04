package modelo.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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
                    novoUsuario();
                    // alterarUsuario(1L, "Djalminha", "djamilnha@lanche.com");
                    return null;
                } catch (Exception e) {
                    action.setRollbackOnly();
                    throw e;
                }
            });
        };
    }

    public void novoUsuario() {
        Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");
        entityManager.merge(novoUsuario);
        System.out.println("Novo Usuário:" + novoUsuario.getNome());
    }

    public void alterarUsuario(Long id, String nome, String email) {
        Query query = entityManager.createQuery("FROM Usuario WHERE id = :id",
                Usuario.class);
        query.setParameter("id", id);
        Usuario usuario;
        try {
            usuario = (Usuario) query.getSingleResult();

        } catch (NoResultException e) {
            usuario = null;
        }
        if (usuario != null) {
            usuario.setNome(nome);
            usuario.setEmail(email);
            entityManager.merge(usuario);
        }
    }

}
