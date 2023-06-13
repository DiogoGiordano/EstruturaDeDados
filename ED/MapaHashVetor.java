package ED;

public class MapaHashVetor {
    private Aluno[] vetor;

    public MapaHashVetor() {
        this.vetor = new Aluno[20];
    }

    private int hash(int chave) {
        return chave % vetor.length;
    }

    public int get(int chave) {
        int hash = hash(chave);
        return vetor[hash].getMatricula();
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null ||
                    vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;

        }
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        return aluno;
    }

    public void priint(){
        for (int i = 0; i < vetor.length; i++)
            if(vetor[i] != null)
            System.out.println(vetor[i].getMatricula());
        else {
            System.out.println("vazio");
            }
    }

}

