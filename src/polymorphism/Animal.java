package polymorphism;

public abstract class Animal {

    protected Double Weight;
    protected int age;
    protected int members;

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public abstract void moveAround();

    public abstract void toFeed();

    public abstract void makeSound();

}
