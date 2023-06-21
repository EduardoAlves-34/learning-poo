package polymorphism;

public class Reptilian extends Animal {

    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void moveAround() {
        System.out.println("Rastejando");
    }
    @Override
    public void toFeed() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void makeSound() {
        System.out.println("Som de Réptil");
    }
}
