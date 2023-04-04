package idea.tad;

import java.util.Objects;

public class VetAluno implements Ialuno{

    private Aluno[] alunos;
    private int totalAlunos;


    public VetAluno(int tamanho){
        alunos = new Aluno[tamanho];
    }

    public int tamanho() {
        return totalAlunos;
    }

    public boolean contem(String nome) {
        for (int i = 0; i < alunos.length; i++){
            if (nome.equals(alunos[i].getNome())) {
                return true;
            }
            break;
        }
        return false;

    }

    public boolean cheio() {
        if (totalAlunos == alunos.length)
            return true;
        return false;
    }

    public void aumentaEpaco(){

        if(cheio()){
            Aluno[] novosAlunos = new Aluno[alunos.length + 1];
            for(int i = 0; i < alunos.length; i++) {
                novosAlunos[i] = alunos[i];
            }
            alunos = novosAlunos;
        }
    }

    public void adicionar(Aluno al){
        aumentaEpaco();
        alunos[totalAlunos] = al;
        totalAlunos++;
    }

}
