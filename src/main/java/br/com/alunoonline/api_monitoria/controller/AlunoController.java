package br.com.alunoonline.api_monitoria.controller;

import br.com.alunoonline.api_monitoria.model.Aluno;
import br.com.alunoonline.api_monitoria.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAluno(@RequestBody Aluno aluno){
        alunoService.createAluno(aluno);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> listAllAlunos(){
        return alunoService.listAllAlunos();
    }

    @GetMapping("/{idAluno}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> searchAlunoById(@PathVariable Long idAluno){
        return alunoService.searchAlunoById(idAluno);
    }
}
