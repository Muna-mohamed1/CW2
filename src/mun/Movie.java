package mun;

public class Movie extends Parent {
        private int length;

    public Movie(String name, String type, int length) {
        super(name, type);
        this.length=length;
    }

    @Override
    public void Info() {
        System.out.println("Name: " + name + ", Type:" + type +", length: "+ length +"minutes");
    }

    @Override
    public void performAct() {
        System.out.println(name +"is playing for " + length +"minutes");

    }
}
