package heritage;

public class Scholar extends Student{

    private Double handbag;

    public Double getHandbag() {
        return handbag;
    }

    public void setHandbag(Double handbag) {
        this.handbag = handbag;
    }

    public void renewBag() {
        System.out.println("Renovando bolsa de " + this.getName());
    }
    @Override
    public void payTuition() {
        System.out.println(this.getName() + " É bolsista! pagamento facilitado");
    }

}
