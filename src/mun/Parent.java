package mun;

abstract class Parent  {

    protected String name;
    protected String type;


    public Parent(String name,String type)
    {
        this.name=name;
        this.type=type;

    }
    public abstract void Info();
    public abstract void performAct();

}




