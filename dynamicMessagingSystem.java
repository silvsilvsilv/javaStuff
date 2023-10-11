public class dynamicMessagingSystem 
{
    public static abstract class Message 
    {
        protected String sender, recipient;

        abstract void displayMessage();

        public Message(String sender, String recip)
        {
            this.sender = sender;
            this.recipient = recip;
        }
    }    

    public static class TextMessage extends Message
    {
        private String text;

        public TextMessage(String sender, String recip, String text)
        {
            super(sender, recip);
            this.text = text;
        }
    
        public void displayMessage()
        {
            System.out.println("The text message is:\n"+this.text+"\nFrom: "+this.sender);
        }
    }

    public static class EmailMessage extends Message
    {
        private String subject, body;

        public EmailMessage(String sender, String recip, String subject, String body)
        {
            super(sender,recip);
            this.subject = subject;
            this.body = body;
        }

        public void displayMessage()
        {
            System.out.println("Subject: "+this.subject+"\nBody:\n"+this.body+"\nFrom: "+this.sender);
        }
    }

    public static class VoiceMessage extends Message
    {
        private String audio;

        public VoiceMessage(String sender, String recip, String audio)
        {
            super(sender,recip);
            this.audio = audio;
        }

        public void displayMessage()
        {
            System.out.println("The voice message was: "+this.audio+"\nFrom: "+this.sender);
        }
    }

    ////TOD: implement constructors for each subclass to init respective attributes

    public static void main(String[] args)
    {
        EmailMessage email = new EmailMessage("Sender Smith", "Receiver Rick", "Enquiry", "Shit");

        email.displayMessage();
    }
}

