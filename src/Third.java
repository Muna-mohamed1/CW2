public class Third extends Entity {
    private double filesize;

    public Third(String author, String bookName, int year, double filesize) {
        super(author, bookName, year);
        this.filesize = filesize;
    }


    @Override
    public void displayInfo() {
        System.out.println("Author:"+ author +",BookName:"+ bookName +",Year:"+ year+",filesize:" +filesize);
    }



    @Override
    public void performAction() {
            System.out.println("the file size is"+filesize);
        }
    }

