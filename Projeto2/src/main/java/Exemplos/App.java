
package Exemplos;

public class App {
    public static void main(String[] args) {
        Aluno a = new Aluno(100, "Fulano");
        Aluno a2 = new Aluno(200, "Ciclano");
        
        Curso c1 = new Curso("Sistemas", 8);
        Curso c2 = new Curso("Química", 8);
        
        Turma t1 = new Turma("2° Período", c1);
        
        Matricula m1 = new Matricula(20241, a, t1);
        Matricula m2 = new Matricula(20242, a2, t1);
        
        System.out.println(m1.getAluno().getNome());
        System.out.println(m1.getTurma().getDescricao());
    }
    
}
