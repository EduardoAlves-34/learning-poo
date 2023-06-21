package polymorphism;

public class Mammal extends Animal {

    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void moveAround() {
        System.out.println("Correndo");
    }
    @Override
    public void toFeed() {
        System.out.println("Mamando");
    }
    @Override
    public void makeSound() {
        System.out.println("Som de Mamífero");
    }

}
