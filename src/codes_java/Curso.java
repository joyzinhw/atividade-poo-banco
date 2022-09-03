package depressao;

public class Curso {
	

String nome_curso;
int carga_horaria;
String modalidade;
String nivel;
String data_de_inicio;
String data_de_fim;
String gratuito;

    void dadosCurso() {
        System.out.println("Nome do curso: " + nome_curso);
        System.out.println("Carga Horaria: " + carga_horaria);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Nivel: " + nivel);
        System.out.println("Data de Inicio: " + data_de_inicio);
        System.out.println("Data de Fim: " + data_de_fim);
        System.out.println("Gratuito: " + gratuito + "\n");
    }

}
