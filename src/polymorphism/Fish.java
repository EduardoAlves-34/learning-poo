package polymorphism;

public class Fish extends Animal {

    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void moveAround() {
        System.out.println("Nadando");
    }
    @Override
    public void toFeed() {
        System.out.println("Comendo subistâncias");
    }
    @Override
    public void makeSound() {
        System.out.println("Peixe não faz Som");
    }
    public void dropBubble() {
        System.out.println("Soltou uma bolha");
    }

}
