package polymorphism;

public class Dog extends Wolf {
    @Override
    public void makeSound() {
        System.out.println("Som de Cachorro");
    }
    public void react(String msg) {
        if(msg.equals("toma comida") || msg.equals("Olá")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void react(int hour,int min) {
        if(hour < 12) {
            System.out.println("Abanar");
        } else if (hour >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }
    public void react(Boolean owner) {
        if(owner == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
    public void react(int age,Double weight) {
        if(age < 5) {
            if(weight < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(weight < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
