package messenger;

/**
 *
 * @author Aysia
 */
public class Sender {
    public static void main(String[] args) {
        var std = new stdMessenger(); 
        var Mail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("---> Test_Std_Messenger_Started <---");
        System.out.println("Sending a Messege");
        std.sendMessege("Septi", "Pesan Singkat", "Septi Sedang Apa?");
        System.out.println("---> Test_Std_Messenger_Finished <---\n");
        
        
//        Mail Messenger Test
        System.out.println("---> Test_Mail_Messenger_Started <---");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        Mail.sendMessege("Ica", "Pesan Singkat", "Halo ca!Apa Kabar?");
        
        Mail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        Mail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        Mail.sendMessege("Ica", "Pesan Singkat", "Halo ca!Apa Kabar?");
        System.out.println("---> Test_Mail_Messenger_Finished <---");
    }
}