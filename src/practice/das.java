package practice;
import javax.swing.JOptionPane;
    public class das{
        public static void reverseString (String str){
            StringBuffer stringBuffer = new StringBuffer (str);

            System.out.print(stringBuffer.reverse());
        }

        public static void main (String args[]){
            String originalString;

            originalString = JOptionPane.showInputDialog("Please input a String: ");

            reverseString (originalString);
        }
    }

