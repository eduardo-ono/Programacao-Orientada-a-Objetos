import javax.swing.JOptionPane;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String args[]) {
        String msg = "Ol\u00E1 mundo!";
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg);

        String msg2 = "Olá mundo!";
        ByteBuffer buffer = StandardCharsets.UTF_8.encode(msg2); 
        String utf8Msg = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println(utf8Msg);
        JOptionPane.showMessageDialog(null, utf8Msg);

        String msg3 = "Olá mundo!";
        System.out.println(msg3);
        JOptionPane.showMessageDialog(null, msg3);
    }

}

