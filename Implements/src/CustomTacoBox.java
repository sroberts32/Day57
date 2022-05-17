package day57.Implements.src;

public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
