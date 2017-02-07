
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
 class Main {

    /**
     * @param args the command line arguments
     */
     

    /*
    List of all changes from quetry keyboard to dalvic keyboard
     */
     static void main(String[] args) {
        // TODO code application logic here
        char[] list_ar = new char[128];
        /*
        First Line without shift
         */
        list_ar[96]='`';
        list_ar[49]='1';
        list_ar[50]='2';
        list_ar[51]='3';
        list_ar[52]='q';
        list_ar[53]='j';
        list_ar[54]='l';
        list_ar[55]='m';
        list_ar[56]='f';
        list_ar[57]='p';
        list_ar[48]='/';
        list_ar[45]='[';
        list_ar[61]=']';
        
        /*
        First Line with shift
         */
        list_ar[126]='~';
        list_ar[33]='!';
        list_ar[64]='@';
        list_ar[35]='#';
        list_ar[36]='Q';
        list_ar[37]='J';
        list_ar[94]='L';
        list_ar[38]='M';
        list_ar[42]='F';
        list_ar[40]='P';
        list_ar[41]='?';
        list_ar[95]='{';
        list_ar[43]='}';
        
        
        

 /*
        Second Line without shift
         */
        list_ar[113] = '4';
        list_ar[119] = '5';
        list_ar[101] = '6';
        list_ar[114] = '.';
        list_ar[116] = 'o';
        list_ar[121] = 'r';
        list_ar[117] = 's';
        list_ar[105] = 'u';
        list_ar[111] = 'y';
        list_ar[112] = 'b';
        list_ar[91] = ';';
        list_ar[93] = '=';
        list_ar[92] = '\\';

        /*
        Second Line with shift
         */
        list_ar[81] = '$';
        list_ar[87] = '%';
        list_ar[69] = '^';
        list_ar[82] = '>';
        list_ar[84] = 'O';
        list_ar[89] = 'R';
        list_ar[85] = 'S';
        list_ar[73] = 'U';
        list_ar[79] = 'Y';
        list_ar[80] = 'B';
        list_ar[123] = ':';
        list_ar[125] = '+';
        list_ar[124] = '|';

        /*
        Third  Line without shift
         */
        list_ar[97] = '7';
        list_ar[115] = '8';
        list_ar[100] = '9';
        list_ar[102] = 'a';
        list_ar[103] = 'e';
        list_ar[104] = 'h';
        list_ar[106] = 't';
        list_ar[107] = 'd';
        list_ar[108] = 'c';
        list_ar[59] = 'k';
        list_ar[39] = '-';

        /*
        Fourth  Line without shift
         */
        list_ar[122] = '0';
        list_ar[120] = 'z';
        list_ar[99] = 'x';
        list_ar[118] = ',';
        list_ar[98] = 'i';
        list_ar[110] = 'n';
        list_ar[109] = 'w';
        list_ar[44] = 'v';
        list_ar[46] = 'g';
        list_ar[47] = '\'';
        /*
        Third list with shift
         */

        list_ar[65] = '&';
        list_ar[83] = '*';
        list_ar[68] = '(';
        list_ar[70] = 'A';
        list_ar[71] = 'E';
        list_ar[72] = 'H';
        list_ar[74] = 'T';
        list_ar[75] = 'D';
        list_ar[76] = 'C';
        list_ar[58] = 'K';
        list_ar[34] = '_';
        /*
        Fourth  Line with shift
         */
        list_ar[90] = ')';
        list_ar[88] = 'Z';
        list_ar[67] = 'X';
        list_ar[86] = '<';
        list_ar[66] = 'I';
        list_ar[78] = 'N';
        list_ar[77] = 'W';
        list_ar[60] = 'V';
        list_ar[62] = 'G';
        list_ar[63] = '"';
        
        /*
        Fifth row
        */
        list_ar[32]=' ';
        list_ar[9]=(char)9;
        list_ar[10]='\n';
        list_ar[11]=(char)11;
        list_ar[12]=(char)12;
        list_ar[13]=(char)13;
        list_ar[14]=(char)14;
        list_ar[15]=(char)15;
        
        
        Scanner lab = new Scanner(System.in);
        char t[];
        
        while(true){
            t=lab.nextLine().toCharArray();
            
            for (int i = 0; i < t.length; i++) {
                System.out.print(list_ar[(int)t[i]]);
            }
            System.out.println("");
        }
        
        
    }

}
