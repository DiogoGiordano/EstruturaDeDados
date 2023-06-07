package ED;

public interface Lista {
    void insereInicio(Object info);

    void insereFim(Object info);

    boolean estaVazia();

    boolean remove(Object info);

    int tamanho();
}
