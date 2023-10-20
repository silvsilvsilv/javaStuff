public class stringParsingTokenization 
{
    public static void main(String[] args)
    {
        String txt = "Hello World!";
        
        txt = txt + " ";
        int numbOfSpace = 0;

        // ? Initialize number of spaces for the tokens
        for(int i = 0; i < txt.length(); i++)
        {
            if(txt.charAt(i) == ' ')
            {
                numbOfSpace++;
            }
        }

        int numbOfWords = numbOfSpace + 1;

        String[] tokens = new String[numbOfWords];
        String token = "";
        int j = 0;
        
        // ? Handles the adding of the words to the 'tokens' array
        for(int i = 0; i < txt.length(); i++)
        {
            if(txt.charAt(i) != ' ')
            {
                token = token + txt.charAt(i);
            }
            else if(txt.charAt(i) == ' ')
            {
                tokens[j] = token;
                token = "";
                j++;
            }
        }

        // ? Outputs the tokens array
        int i = 0;
        while(i < tokens.length - 1)
        {
            System.out.println(tokens[i]);
            i++;
        }
    }
}
