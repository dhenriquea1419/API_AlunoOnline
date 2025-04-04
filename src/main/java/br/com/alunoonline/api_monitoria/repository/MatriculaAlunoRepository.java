package br.com.alunoonline.api_monitoria.repository;

import br.com.alunoonline.api_monitoria.model.MatriculaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long> {
    List<MatriculaAluno> findByAlunoIdAluno(Long idAluno);
}
