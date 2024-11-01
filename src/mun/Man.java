package mun;

public class Man extends Parent {
    private int rating;

    public Man(String name, String type, int rating) {
        super(name, type);
        this.rating = rating;
    }

    @Override
    public void Info() {
        System.out.println("Name: " + name + ", Type:" + type + ",Rating:" + rating);
    }

    @Override
    public void performAct() {
        System.out.println("The rating is"+rating);
    }
}