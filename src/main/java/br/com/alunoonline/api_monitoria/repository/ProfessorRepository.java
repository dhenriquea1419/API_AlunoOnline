package br.com.alunoonline.api_monitoria.repository;

import br.com.alunoonline.api_monitoria.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
