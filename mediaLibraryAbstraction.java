
public class mediaLibraryAbstraction 
{
    public static abstract class MediaItem
    {
        protected String title;
        protected int year;

        public int getYear()
        {
            return year;
        }
        
        abstract void displayInfo();
    }

    public static class Book extends MediaItem
    {
        private String author;
        private int bookNumber;

        public Book(String t, int yr, String auth, int booknum)
        {
            this.title = t;
            this.year = yr;
            this.author = auth;
            this.bookNumber = booknum;
        }

        public void displayInfo()
        {
            System.out.println("Title: " + title + "\nYear: " + year);
            System.out.println("Author: " + author);
            System.out.println("Book Number: " + bookNumber);
        }
    }

    public static class Movie extends MediaItem
    {
        private String director;
        private String genre;

        public Movie(String t, int yr, String dir, String gen)
        {
            this.title = t;
            this.year = yr;
            this.director = dir;
            this.genre = gen;
        }

        public void displayInfo()
        {
            System.out.println("Title: " + title + "\nYear: " + year);
            System.out.println("Director: " + director);
            System.out.println("Genre: " + genre);
        }
    }

    public static class MusicAlbum extends MediaItem
    {
        private String artist;
        private String genre;

        public MusicAlbum(String t, int yr, String artist, String genre)
        {
            this.title = t;
            this.year = yr;
            this.artist = artist;
            this.genre = genre;
        }

        public void displayInfo()
        {
            System.out.println("Title: " + title + "\nYear: " + year);
            System.out.println("Artist: " + artist);
            System.out.println("Genre: " + genre);
        }
    }

    public static void searchByYear(MediaItem[] lib,int year)
    {
        System.out.println("Searching by year: " + year + "\n");

        for(int i = 0; i < lib.length; i++)
        {
            if(lib[i].getYear() == year)
            {
                lib[i].displayInfo();
                System.out.println("===========");
            }
        }
    }
    
    public static void main(String[] args)
    {
        MediaItem[] library = {};

        library = new MediaItem[3];

        library[0] = new Book("Book 1", 2012, "Author Smith", 1);
        library[1] = new Movie("Django Unchained", 2012, "Quentin Tarantino", "Comedy");
        library[2] = new MusicAlbum("Igor", 2015, "Tyler the Creator", "HipHop");

        searchByYear(library, 2012);
    }
}