
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koushik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lab = new Scanner(System.in);
        int time=lab.nextInt();
        System.out.println(time/3600+":"+(time/60)%60+":"+time%60);
        
        
    }
    
}
