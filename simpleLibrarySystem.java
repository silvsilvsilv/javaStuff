public class simpleLibrarySystem 
{
    public static class LibraryBook
    {
        private String title;
        private String author;
        private String number;

        public LibraryBook(String t, String auth, String num)
        {
            this.title = t;
            this.author = auth;
            this.number = num;
        }

        public void get_title()
        {
            System.out.println("Book title: "+this.title);
        }

        public void get_author()
        {
            System.out.println("Book author: "+this.author);
        }

        public void get_bookNo()
        {
            System.out.println("Book Number: "+this.number);
        }

    }

    public static class Patron
    {
        private String name;
        private String libCardNum;
        
        public Patron(String name, String cardNum)
        {
            this.name = name;
            this.libCardNum = cardNum;
        }

        public void get_name()
        {
            System.out.println("Patron name: " + this.name);
        }

        public void get_library_card_number()
        {
            System.out.println("Patron Library Card Number: " + this.libCardNum);
        }
    }
    public static void main(String[] args)
    {
        LibraryBook book1 = new LibraryBook("Harry Potter", "JK Rowling", "1");
        LibraryBook book2 = new LibraryBook("Percy Jackson", "Rick Riordan", "2");

        Patron p1 = new Patron("John Silva", "1");
        Patron p2 = new Patron("Lorie Ann Mae", "2");

        book1.get_title();
        book2.get_title();

        p1.get_name();
        p2.get_name();

    }
}
