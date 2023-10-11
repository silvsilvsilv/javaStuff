public class test {

    public static class NewClass
    {
        private int x;

        public NewClass()
        {
            x = 1;
        }

        public void getX()
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        NewClass x = new NewClass();

        x.getX();
    }
}
