package ED;

public class Main{
    public static void main (String[] args){

        FilaVet f = new FilaVet(5);

        f.add(5);
        f.add(6);
        f.add(7);
        f.add("normal");
        f.add(88);

        f.printList();


    }

}