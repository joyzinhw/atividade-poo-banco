package depressao;

public class Curso {
	

    private String nome_curso;
    private int carga_horaria;
    private String modalidade;
    private String nivel;
    private String data_de_inicio;
    private String data_de_fim;
    private String gratuito;
    private Professor professor;
}
    public Curso(String nome_curso, String nivel, int carga_horaria, Professor professor) {
    this.nome_curso = nome_curso;
    this.nivel = nivel;
    this.carga_horaria = carga_horaria;
    this.professor = professor;
    this.alunos = new ArrayList<>();
}

    public void realizarMatricula(Aluno aluno) {
    this.alunos.add(aluno);
}
    public void setNome(String nome_curso) {
    this.nome_curso = nome_curso;
}

    public void setCh(int carga_horaria) {
    this.carga_horaria = carga_horaria;
}

    public String getNome() {
    return this.nome_curso;
}

    public String getNivel() {
    return nivel;
}

    public int getCh() {
    return carga_horaria;
}
    public String getNomeProfessor() {
    return this.professor.getNome();
}

    public Professor getProfessor() {
    return professor;
}

    public List<Aluno> getAlunos() {
    return alunos;
}
} 

