
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author koushik
 */
public class v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stream t = br.lines();
        CharBuffer cb = CharBuffer.allocate(60000000);
        int num = br.read(cb);
        br.close();
        char[] ar = cb.array();
        String number = "";
        for (int i = 0; i < num; i++) {
            // System.out.println(ar[i]);
            if (ar[i] == '|' && ar[i] != '-') {
                i++;
                while (ar[i] != '|') {
                    if (ar[i] == 'o') {
                        //System.out.print(1);
                        number = number + "1";
                    } else if (ar[i] == ' ') {
                        number = number + "0";
                        // System.out.print(0);
                    }
                    i++;
                }
                System.out.print((char) Integer.parseInt(number, 2));
                number = "";
            }

        }
    }

}
