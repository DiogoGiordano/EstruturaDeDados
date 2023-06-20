package ED;

public interface IPilha {

    boolean push(Aluno info);
    Aluno pop();
    Aluno top();
    boolean isEmpty();
    int size();


}
