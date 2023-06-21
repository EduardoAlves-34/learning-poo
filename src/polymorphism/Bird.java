package polymorphism;

public class Bird extends Animal {

    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void moveAround() {
        System.out.println("Voando");
    }
    @Override
    public void toFeed() {
        System.out.println("Comendo Frutas");
    }
    @Override
    public void makeSound() {
        System.out.println("Som de Ave");
    }
    public void makeNest() {
        System.out.println("Construiu um ninho");
    }

}
