package ED;

public class MapaHashLSE {
    private ListSimpEnc[] vetorLista;
    private int total;
    public MapaHashLSE() {
        vetorLista = new ListSimpEnc[20];
    }

    private int hash(int chave) {
        int hash = (int)(((chave * 0.63274838) % 1) * vetorLista.length);
        return hash;
    }

    public String get(int chave) {
        int hash = hash(chave);
        return vetorLista[hash].dado();
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);
        if(total == vetorLista.length)
            reSize();
        ListSimpEnc alunos_lista = vetorLista[hash];
        if (alunos_lista == null) {
            alunos_lista = new ListSimpEnc();
            alunos_lista.insereFim(valor);
            vetorLista[hash] = alunos_lista;
            total++;
        }
        else {
            for (NoAl n = alunos_lista.getInicio(); n != null; n = n.getProx()) {
                if (n.getInfo().getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);
            total++;
        }
    }

    public ListSimpEnc remove(int chave) {
        int hash = hash(chave);
        ListSimpEnc lista = vetorLista[hash];
        vetorLista[hash] = null;
        total--;
        return lista;
    }

    public void reSize(){
        ListSimpEnc[] vetorListaNew = new ListSimpEnc[vetorLista.length * 2];
        reHash(vetorListaNew);
    }

    public void reHash(ListSimpEnc[] listSimpEncNew){
        for(int i = 0; i < vetorLista.length; i++)
            listSimpEncNew[i] = vetorLista[i];
        vetorLista = listSimpEncNew;
    }


    public void print(){
        for(int i = 0; i < vetorLista.length; i++) {
            if (vetorLista[i] != null)
                System.out.println(vetorLista[i].dado() + " ");
        }
    }

}

