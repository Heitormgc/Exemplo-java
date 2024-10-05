
package Exemplos;

public class Matricula {
    private int numero;
    private Aluno aluno;
    private Turma turma;
    
    Matricula(int numero, Aluno aluno, Turma turma){
        this.numero = numero;
        this.aluno = aluno;
        this.turma = turma;
    
    }

    public Aluno getAluno() {
        return this.aluno;
    }
    
   public Turma getTurma() {
        return this.turma;
    }
}
