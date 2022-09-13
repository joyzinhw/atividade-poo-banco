package depressao;
import java.util.Date;
public class Aluno {

// certo
	private String nome_aluno;
	private String email_alu;
	private Date data_de_nascimento;
	
	    public Aluno(String nome_aluno, String email_alu, Date data_de_nascimento) {
        this.nome_aluno = nome_aluno;
        this.email_alu = email_alu;
        this.data_de_nascimento = data_de_nascimento;
       
    }
    public String getNome_Aluno() {
          return nome_aluno;
    }
    public String getEmail_Aluno() {
	  return email_alu;
    }

    public Date getData_de_Nascimento() {
          return data_de_nascimento;
 
    }
 }
