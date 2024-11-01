public class Second extends Entity{
    private String country;

    public Second(String author,String bookName,int year,String country)
    {
        super(author, bookName,year);
        this.country=country;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author:" + author + ",BookName:" + bookName + ",Year:" + year + ",country:" +country);

    }

    @Override
    public void performAction() {
        System.out.println(" Country is being USA");
    }
}
