package fight;

public class Character {

    private String name;
    private String sex;
    private String male;
    private String female;
    private int age;
    private Double height;
    private Double weight;
    private String nationality;
    private String category;
    private int victorys;
    private int draws;
    private int defeats;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        setMale();
        setFemale();
    }

    public String getMale() {
        return male;
    }

    public void setMale() {
        if(this.sex == this.getMale()) {
            this.sex = this.getMale();
            System.out.println("approved");
        } else {
            System.out.println("different sex");
        }
    }

    public String getFemale() {
        return female;
    }

    public void setFemale() {
        if(this.sex == this.getFemale()) {
            this.sex = getFemale();
            System.out.println("approved");
        } else {
            System.out.println("different sex");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getHeight() {
        return height;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
        setCategory();
    }
    public Double getWeight() {
        return weight;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }
    public void setCategory() {
        if(weight < 52.2) {
            category = "invalid";
        } else if(weight <= 70.3) {
            category = "Lightweight";
        } else if(weight <= 83.9) {
            category = "Middleweight";
        } else if(weight <= 120.2) {
            category = "Heavyweight";
        } else {
            category = "invalid";
        }
    }
    public String getCategory() {
        return category;
    }
    public void setVictorys(int victorys) {
        this.victorys = victorys;
    }
    public int getVictorys() {
        return victorys;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }
    public int getDraws() {
        return draws;
    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
    public int getDefeats() {
        return defeats;
    }



    public Character(String nm,String nt,String sx,int ag,Double hg,Double wg,int vt,int dw,int df) {
        name = nm;
        sex = sx;
        nationality = nt;
        age = ag;
        height = hg;
        setWeight(wg);
        victorys = vt;
        draws = dw;
        defeats = df;
    }

    public void present() {
        System.out.println("fighter " + this.getName());
        System.out.println(this.getAge() + " age");
        System.out.println(this.getHeight() + " feet tall" );
        System.out.println("weighing " + this.getWeight() + " lb");
        System.out.println("origin " + this.getNationality());
        System.out.println("it won " + this.getVictorys());
        System.out.println("tied "+ this.getDraws());
        System.out.println("it lost " + this.getDefeats());
    }

    public void status() {
        System.out.println(getName());
        System.out.println(getSex());
        System.out.println("it's a weight " + this.getCategory());
        System.out.println(this.getVictorys() + " Victory");
        System.out.println(this.getDraws() + " Draws");
        System.out.println(this.getDefeats() + " Defeats");
    }

    public void winFight() {
        this.setVictorys(this.getVictorys() + 1);
    }

    public void drawFight() {
        this.setDraws(this.getDraws() + 1);
    }

    public void defeatFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
}
