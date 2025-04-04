package br.com.alunoonline.api_monitoria.dto;

import br.com.alunoonline.api_monitoria.enums.MatriculaAlunoStatusEnum;
import lombok.Data;

@Data
public class DisciplinasAlunoResponseDTO {

    private String nomeDisciplina;
    private String nomeProfessor;
    private Double nota1;
    private Double nota2;
    private Double media;
    private MatriculaAlunoStatusEnum status;
}
