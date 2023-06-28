package polymorphism;

public class Kangaroo extends Mammal {
    @Override
    public void moveAround() {
        System.out.println("Saltando");
    }
    public void usePurse() {
        System.out.println("Usando bolsa");
    }
}
