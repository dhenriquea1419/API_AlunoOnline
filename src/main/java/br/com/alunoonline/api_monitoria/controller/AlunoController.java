package br.com.alunoonline.api_monitoria.controller;

import br.com.alunoonline.api_monitoria.model.Aluno;
import br.com.alunoonline.api_monitoria.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
}
