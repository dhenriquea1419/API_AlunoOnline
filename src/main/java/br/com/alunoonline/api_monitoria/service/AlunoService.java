package br.com.alunoonline.api_monitoria.service;

import br.com.alunoonline.api_monitoria.model.Aluno;
import br.com.alunoonline.api_monitoria.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void createAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

}
