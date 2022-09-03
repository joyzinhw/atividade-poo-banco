package depressao;

public class Test_curso {

public static void main(String[] args) {
    
    Curso curso = new Curso();
    
    curso.nome_curso = "Informatica";
    curso.carga_horaria= 124;
    curso.modalidade = "Presencial";
    curso.nivel = "Ensino Médio";
    curso.data_de_inicio = "20/9/2020";
    curso.data_de_fim = "25/12/2022";
    curso.gratuito = "Sim";

    curso.dadosCurso();
    
    Aluno aluno = new Aluno();  
    aluno.nome_aluno = "Victor Almeira";
    aluno.e_mail_alu = "vict0alm@e-mail";
    aluno.data_de_nascimento = "10/6/2003";

    aluno.dadosAluno();
    
    Professores professores = new Professores();
    professores.nome_prof =  "Mario ruan";
    professores.e_mail_prof = "mar11an@e-mail";
    professores.formação = "Ciência da Computação";

    professores.dadosProfessores();
    
    Certificado certificado = new Certificado();
    certificado.nome_aluno = "Victor Almeira";
    certificado.data_de_nascimento = "10/6/2003";
    certificado.nome_curso = "Informatica";
    certificado.carga_horaria= 124;
    certificado.modalidade = "Presencial";
    certificado.nivel = "Ensino Médio";
    certificado.data_de_inicio = "20/9/2020";
    certificado.data_de_fim = "25/12/2022";
    
    certificado.dadosCertificado();
    
    
}


}
