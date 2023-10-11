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
            System.out.println("Title: " + title + " Year: " + year);
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
            System.out.println("Title: " + title + " Year: " + year);
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
            System.out.println("Title: " + title + " Year: " + year);
            System.out.println("Artist: " + artist);
            System.out.println("Genre: " + genre);
        }
    }

    public static void appendArr(MediaItem[] a, MediaItem element)
    {
        MediaItem[] arr = a;
        MediaItem[] arrNew = new MediaItem[arr.length + 1];
            
        int i;
        for(i = 0; i < arr.length;i++)
        {
            arrNew[i] = arr[i];
        }

        arrNew[i] = element;        
        a = arr;
    }

    public static void appendArr(String[] a, String element)
    {
        String[] arr = a;
        String[] arrNew = new String[arr.length + 1];

        int i;

        for(i = 0; i < arr.length; i++)
        {
            arrNew[i] = arr[i];
        }
        arrNew[i] = element;

        a = arr;
    }

    //TODO: saon mani oy
    // public void searchByYear(int year, MediaItem lib[])
    // {
    //     MediaItem a[] = {};

    //     for(int i = 0; i < lib.length; i++)
    //     {
    //         if(lib[i].getYear() == year)
    //         {
    //             // TODO: push array chuchu, so that it stores the media items with corresponding year
    //             appendArr(a, lib[i]);
    //         }
    //     }
    // }

    public static void searchByYear(int year, MediaItem lib)
    {
        MediaItem[] a = {};

        appendArr(a, lib);
        //TODO: make the append arr actually manipulate the "a" array

        System.out.println(a[0].title);
    }
    
    public static void main(String[] args)
    {
       
        // Book b = new Book("Sample Title", 2012, "Sample Author", 12);

        // b.displayInfo();

        // Movie m = new Movie("Django Unchained", 2012, "Quentin Tarantino", "Comedy");

        // m.displayInfo();

        // MusicAlbum a = new MusicAlbum("Igor", 2017, "Tyler the Creator", "Hip Hop");

        // a.displayInfo();

        // MediaItem album[] = {b,m,a};
        // System.out.println(album);

        // Book b = new Book("Title", 2001, "Juan", 2);

        // MediaItem[] album = {b};

        // searchByYear(2001,album[0]);
        Book b = new Book("Title", 2222, "A", 123);

        System.out.println(b.getYear());
        
    }
}