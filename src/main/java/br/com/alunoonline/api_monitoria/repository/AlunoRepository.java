package br.com.alunoonline.api_monitoria.repository;

import br.com.alunoonline.api_monitoria.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
