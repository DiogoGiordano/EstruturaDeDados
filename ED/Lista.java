package ED;

public interface Lista {
    void insereInicio(Aluno info);

    void insereFim(Aluno info);

    boolean estaVazia();

    boolean remove(Aluno info);

    int tamanho();
}
