package depressao;


		public class Certificado {
       
       private Professor professor;
       private  Aluno aluno;
       private  Curso curso;
		
		public Certificado(Professor professor, Curso curso, Aluno aluno) {
        this.professor= professor;
        this.curso = curso;
        this.aluno = aluno;
    }

        public Professor getProfessor() {
          return professor;
    }
        public Aluno getAluno() {
          return aluno;
    }
        public Curso getCurso() {
          return curso;
    }
	
}
