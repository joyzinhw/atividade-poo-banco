package depressao;


import java.util.Date;

//ta certo
public class Curso {
    

    private String nome_curso;
    private int carga_horaria;
    private String modalidade;
    private String nivel;
    private Date data_de_inic;
    private Date data_de_fim;
    private Boolean gratuito;
    private Professor professor;
    


        
        public Curso(String nome_curso, int carga_horaria, String modalidade) {
          this.nome_curso = nome_curso;
          this.carga_horaria = carga_horaria;
          this.modalidade = modalidade; 
    
}
        public Curso(String nivel, Boolean gratuito) { 

          this.nivel = nivel;
          this.gratuito = gratuito;
          

 }         
        public Curso(Date data_de_inic, Date data_de_fim ){
          this.data_de_inic = data_de_inic;
          this.data_de_fim = data_de_fim;
         
    }
        public Date getData_De_Inc() {
        return data_de_inic;
    }
        public Date getData_De_Fim() {
         return data_de_fim;
    }
        public String getNome_Curso() {
          return nome_curso;
    }
        public int getCarga_Horaria() {
         return carga_horaria;
    }
         public String getModalidade() {
          return modalidade;
    }
        public String getNivel() {
          return nivel;
    }
    
        public boolean isGratuito() {
          return gratuito;
    }
        public Professor getProfessor() {
        return professor;
    }

    }
