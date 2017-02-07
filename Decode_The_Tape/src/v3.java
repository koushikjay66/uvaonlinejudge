
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author koushik
 */
public class v3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CharBuffer cb = CharBuffer.allocate(60000000);
        int num = br.read(cb);
        br.close();
        int x[] = new int[112];
        x[111] = 2;
        x[32] = 0;
        x[46]=0;
        int t = 0;
        int number = 0;
        char[] ar = cb.array();
        for (int i = num - 1; i >= 0; i--) {
            if (ar[i] == '|' && ar[i] != '-') {
                i--;
                while (ar[i] != '|') {
                    
                    number = number + (int) Math.pow(x[(int) ar[i]], t);
                    System.out.println(number+"<<- for "+ (int)ar[i]+" and power would be"+Math.pow(t,x[(int) ar[i]]));
                    t++;
                    i--;
                }
                System.out.println(number);
                System.out.print((char)number);
                number=0;
                t=0;
            }
        }
    }

}
