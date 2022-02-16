package br.com.projetoagencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.projetoagencia.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	//Cliente findByIdCliente(Long id);
	
	
	@Query("Select c from Cliente c where c.email = ?1 and c.senha = ?2")
	Cliente findByEmailAndSenha(@Param("email") String email, @Param("senha") String password);
	
	@Query("Select c from Cliente c where c.nome = ?1")
	Cliente findByNome(@Param("nome") String nome);
}
