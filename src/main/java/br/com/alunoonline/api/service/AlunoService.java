package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void createAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

    public List<Aluno> listAllAlunos(){
        return alunoRepository.findAll();
    }

    public Optional<Aluno> searchAlunoById(Long idAluno){
        return alunoRepository.findById(idAluno);
    }

    public void deleteAlunoById(Long idAluno){
        alunoRepository.deleteById(idAluno);
    }

    public void updateAlunoById(Long idAluno, Aluno aluno){
        //Primeiro passo: ver se o aluno existe no bd;
        Optional<Aluno> alunoDataBase = searchAlunoById(idAluno);
        //E se não existir esse aluno?

        if (alunoDataBase.isEmpty()){
            //lança uma nova exceção
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado do banco de dados");
        }
        // Se chegar aqui, significa que existe aluno com esse id.
        //vou armazena-lo em uma variavel para depois edita-lo
        Aluno alunoEdit = alunoDataBase.get();

        //Com esse aluno para ser editado acima, faço os sets necessários para atualizar os atributos dele.

        alunoEdit.setNomeAluno(aluno.getNomeAluno());
        alunoEdit.setCpfAluno(aluno.getCpfAluno());
        alunoEdit.setEmailAluno(aluno.getEmailAluno());

        //com o aluno totalmente editado acima, eu DEVOLVO ele atualizado para o bd
        alunoRepository.save(alunoEdit);
    }

}