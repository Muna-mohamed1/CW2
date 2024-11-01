abstract class Entity {
    protected String author;
    protected String bookName;
    protected int year;

      public Entity(String Author,String BookName,int Year)
      {
          this.author=Author;
          this.bookName=BookName;
          this.year=Year;

      }
      public abstract void displayInfo();
    public abstract void performAction();

}

