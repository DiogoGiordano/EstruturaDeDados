package ED;

public class Main{
    public static void main (String[] args){

        FilaVet f = new FilaVet(5);

        Aluno l = new Aluno();
        Aluno l1 = new Aluno();
        Aluno l2 = new Aluno();

        l.setNome("jesse");
        l1.setNome("ahti");
        l2.setNome("dylan");

        l.setNota(1);
        l1.setNota(3);
        l2.setNota(4);

        l.setIdade(20);
        l1.setIdade(22);
        l2.setIdade(33);

        f.add(l);
        f.add(l1);
        f.add(l2);

        f.printList();


    }

}