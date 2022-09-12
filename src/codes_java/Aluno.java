package depressao;

import java.util.Date;

public class Aluno {
	private String nome_aluno;
	private String email_alu;
	private Date data_de_nascimento;
	
        public Aluno(String nome_aluno, String email_alu, Date data_de_nascimento) {
          this.nome_aluno = nome_aluno;
          this.email_alu = email_alu;
          this.data_de_nascimento = data_de_nascimento;
}
    public Aluno( Date data_de_nascimento ){
         this.data_de_nascimento = data_de_nascimento;
         
}
        public String getNome_aluno() {
          return nome_aluno;
    }
        public void setNome_aluno(String nome_aluno) {
         this.nome_aluno = nome_aluno;
    }
        public String getEmail_aluno() {
	  return email_alu;
}
        public void setEmail_aluno(String email_alu) {
           this.email_alu = email_alu;
    }
         public Date getData_de_nascimento() {
          return data_de_nascimento;
    }
        public void setData_de_nascimento(Date data_de_nascimento) {
         this.data_de_nascimento = data_de_nascimento;
    }
}

//
