package ED;

public class ListSimpEnc implements Lista {

    private NoAl ini;
    private int total;

    public ListSimpEnc() {
        this.ini = null;
    }

    public void insereInicio(Aluno info) {
        NoAl novo = new NoAl(info);
        if (ini == null) {
            ini = novo;
        }
        else {
            novo.setProx(ini);
            ini = novo;
        }

    }

    public NoAl getInicio(){
        return ini;
    }

    public void insereFim(Aluno info) {
        NoAl novo = new NoAl(info);
        if (ini == null)
            ini = novo;
        else {
            NoAl ultimo = null;
            for (NoAl i = ini; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
        }
    }

    public boolean estaVazia() {
        if (ini == null)
            return true;
        else
            return false;
    }

    public boolean remove(Aluno info) {
        NoAl ant = null, p;
        p = ini;
        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProx();
        }
        if (p == null)
            return false;
        if (ant == null)
            ini = p.getProx();
        else
            ant.setProx(p.getProx());
        return true;

    }

    public int tamanho() {
        if (ini == null)
            return 0;

        else {
            int tamanho = 0;
            for (NoAl i = ini; i != null; i = i.getProx())
                tamanho++;

            return tamanho;
        }

    }

    public String dado() {
        return "Matricula: [" +  ini.getInfo().getMatricula() + "] " + "Nome: [" +  ini.getInfo().getNome() + "] " + "Idade: [" +  ini.getInfo().getIdade() + "] " + "Nota: [" +  ini.getInfo().getNota() + "] ";
    }

}