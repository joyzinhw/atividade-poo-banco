package depressao;

public class Professores {
	
	private String nome_prof;
	private String email_prof;
	private String formacao;

       public Professor(String nome_prof){
        this.nome_prof = nome_prof;
    }

    public String getNome() {
        return nome_prof;
    }
    public String getFormacao() {
        return formacao;
    }
    public String getEmail() {
        return email_prof;
    }


}
