package idea.tad;


public interface Lista {
    public void insereInicio(int info);

    public void insereFim(int info);

    public boolean estaVazia();

    public boolean remove(int info);

    public int tamanho();
}
