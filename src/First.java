public class First extends Entity{
    private int id;

    public First(String author,String bookName,int year,int id)
    {
        super(author, bookName,year);
        this.id=id;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author:" + author + ",BookName:" + bookName + ",Year:" + year + ", id:"+ id);
    }

    @Override
    public void performAction() {
        int result=id*4;
            System.out.println("the result is"+result);

    }
}
