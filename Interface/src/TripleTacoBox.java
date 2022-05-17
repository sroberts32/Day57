package day57.Interface.src;

public class TripleTacoBox implements TacoBox{
        private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        System.out.println("Nom, Nom, I eat the tacos.");
    }

    
}
