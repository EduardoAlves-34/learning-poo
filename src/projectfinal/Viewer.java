package projectfinal;

public class Viewer extends Person {
    private String login;
    private int totalwatching;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getWatching() {
        return totalwatching;
    }

    public void setWatching(int watching) {
        this.totalwatching = watching;
    }


    public Viewer(String name, int age, String sex, String login) {
        super(name, age, sex);
        this.login = login;
        this.totalwatching = 0;
    }

    public void addView() {

    }
    protected void acquireExp() {

    }
}
