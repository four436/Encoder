
import textio.TextIO;

public class encoder {
    public static void main(String[] args){
        String select;
        char chr;
                String ln;
                int l;
                int i;
                String chrc;
        System.out.println("criptezi sau traduci?");
        select=TextIO.getlnWord();
        switch(select){
            case "criptez":
            case "criptare":
            case "cripteaza":
                System.out.println("Ce fisier doresti sa criptezi?");
                
                TextIO.readUserSelectedFile();
                System.out.println("In ce fisier doresti sa fie scrisa criptarea?");
                
                TextIO.writeUserSelectedFile();
                while(!TextIO.eof()){
                    ln=TextIO.getln();
                    l=ln.length();
                    for( i=0; i<=l; i++){
                        chr=ln.charAt(i);
                        switch(chr){
                            case 'a':chrc="0111"; break;
                            case 'b':chrc="0121"; break;
                            case 'c':chrc="0131"; break;
                            case 'd':chrc="0141"; break;
                            case 'e':chrc="0151"; break;
                            case 'f':chrc="0161"; break;
                            case 'g':chrc="0171"; break;
                            case 'h':chrc="0421"; break;
                            case 'i':chrc="0411"; break;
                            case 'j':chrc="0101"; break;
                            case 'k':chrc="0211"; break;
                            case 'l':chrc="0221"; break;
                            case 'm':chrc="0231"; break;
                            case 'n':chrc="0241"; break;
                            case 'o':chrc="0251"; break;
                            case 'p':chrc="0261"; break;
                            case 'q':chrc="0271"; break;
                            case 'r':chrc="0371"; break;
                            case 's':chrc="0401"; break;
                            case 't':chrc="0301"; break;
                            case 'u':chrc="0311"; break;
                            case 'v':chrc="0321"; break;
                            case 'w':chrc="0331"; break;
                            case 'x':chrc="0341"; break;
                            case 'y':chrc="0351"; break;
                            case 'z':chrc="0361"; break;
        
                            case 'A':chrc="0112"; break;
                            case 'B':chrc="0122"; break;
                            case 'C':chrc="0132"; break;
                            case 'D':chrc="0142"; break;
                            case 'E':chrc="0152"; break;
                            case 'F':chrc="0162"; break;
                            case 'G':chrc="0172"; break;
                            case 'H':chrc="0422"; break;
                            case 'I':chrc="0412"; break;
                            case 'J':chrc="0102"; break;
                            case 'K':chrc="0212"; break;
                            case 'L':chrc="0222"; break;
                            case 'M':chrc="0232"; break;
                            case 'N':chrc="0242"; break;
                            case 'O':chrc="0252"; break;
                            case 'P':chrc="0262"; break;
                            case 'Q':chrc="0272"; break;
                            case 'R':chrc="0372"; break;
                            case 'S':chrc="0402"; break;
                            case 'T':chrc="0302"; break;
                            case 'U':chrc="0312"; break;
                            case 'V':chrc="0322"; break;
                            case 'W':chrc="0332"; break;
                            case 'X':chrc="0342"; break;
                            case 'Y':chrc="0352"; break;
                            case 'Z':chrc="0362"; break;
        
                            case '0':chrc="0103"; break;
                            case '1':chrc="0113"; break;
                            case '2':chrc="0123"; break;
                            case '3':chrc="0133"; break;
                            case '4':chrc="0143"; break;
                            case '5':chrc="0153"; break;
                            case '6':chrc="0163"; break;
                            case '7':chrc="0173"; break;
                            case '8':chrc="0443"; break;
                            case '9':chrc="0543"; break;
            
                            case '!':chrc="0004"; break;
                            case '@':chrc="0014"; break;
                            case '#':chrc="0024"; break;
                            case '$':chrc="0034"; break;
                            case '%':chrc="0044"; break;
                            case '^':chrc="0054"; break;
                            case '&':chrc="0064"; break;
                            case '*':chrc="0074"; break;
                            case '(':chrc="0104"; break;
                            case ')':chrc="0114"; break;
                            case '-':chrc="0124"; break;
                            case '_':chrc="0134"; break;
                            case '=':chrc="0144"; break;
                            case '+':chrc="0154"; break;
                            case '`':chrc="0164"; break;
                            case '~':chrc="0174"; break;
                            case '[':chrc="0204"; break;
                            case ']':chrc="0214"; break;
                            case '{':chrc="0224"; break;
                            case '}':chrc="0234"; break;
                            case ';':chrc="0244"; break;
                            case ':':chrc="0254"; break;
                            case ' ':chrc="0000"; break;
                            case '"':chrc="0264"; break;
                            case '\\':chrc="0274"; break;
                            case '|':chrc="0304"; break;
                            case '/':chrc="0314"; break;
                            case '?':chrc="0324"; break;
                            case ',':chrc="0334"; break;
                            case '.':chrc="0344"; break;
                            case '<':chrc="0354"; break;
                            case '>':chrc="0364"; break;
                            case '\'':chrc="0374"; break;
                            default: chrc="?";
                        }
                            TextIO.put(chrc+" "); 
                    }
                }
            break;
        case "traduc":
        case "traducere":
        case "traduce":
            
             System.out.println("Ce fisier doresti sa traduci?");
                
                TextIO.readUserSelectedFile();
                System.out.println("In ce fisier doresti sa fie scrisa traducerea?");
                
                TextIO.writeUserSelectedFile();
                while(!TextIO.eof()){
                    chrc=TextIO.getWord();
                        switch(chrc){
                            case "0111":chr='a'; break;
                            case "0121":chr='b'; break;
                            case "0131":chr='c'; break;
                            case "0141":chr='d'; break;
                            case "0151":chr='e'; break;
                            case "0161":chr='f'; break;
                            case "0171":chr='g'; break;
                            case "0421":chr='h'; break;
                            case "0411":chr='i'; break;
                            case "0101":chr='j'; break;
                            case "0211":chr='k'; break;
                            case "0221":chr='l'; break;
                            case "0231":chr='m'; break;
                            case "0241":chr='n'; break;
                            case "0251":chr='o'; break;
                            case "0261":chr='p'; break;
                            case "0271":chr='q'; break;
                            case "0371":chr='r'; break;
                            case "0401":chr='s'; break;
                            case "0301":chr='t'; break;
                            case "0311":chr='u'; break;
                            case "0321":chr='v'; break;
                            case "0331":chr='w'; break;
                            case "0341":chr='x'; break;
                            case "0351":chr='y'; break;
                            case "0361":chr='z'; break;
        
                            case "0112":chr='A'; break;
                            case "0122":chr='B'; break;
                            case "0132":chr='C'; break;
                            case "0142":chr='D'; break;
                            case "0152":chr='E'; break;
                            case "0162":chr='F'; break;
                            case "0172":chr='G'; break;
                            case "0422":chr='H'; break;
                            case "0412":chr='I'; break;
                            case "0102":chr='J'; break;
                            case "0212":chr='K'; break;
                            case "0222":chr='L'; break;
                            case "0232":chr='M'; break;
                            case "0242":chr='N'; break;
                            case "0252":chr='O'; break;
                            case "0262":chr='P'; break;
                            case "0272":chr='Q'; break;
                            case "0372":chr='R'; break;
                            case "0402":chr='S'; break;
                            case "0302":chr='T'; break;
                            case "0312":chr='U'; break;
                            case "0322":chr='V'; break;
                            case "0332":chr='W'; break;
                            case "0342":chr='X'; break;
                            case "0352":chr='Y'; break;
                            case "0362":chr='Z'; break;
        
                            case "0103":chr='0'; break;
                            case "0113":chr='1'; break;
                            case "0123":chr='2'; break;
                            case "0133":chr='3'; break;
                            case "0143":chr='4'; break;
                            case "0153":chr='5'; break;
                            case "0163":chr='6'; break;
                            case "0173":chr='7'; break;
                            case "0443":chr='8'; break;
                            case "0543":chr='9'; break;
            
                            case "0004":chr='!'; break;
                            case "0014":chr='@'; break;
                            case "0024":chr='#'; break;
                            case "0034":chr='$'; break;
                            case "0044":chr='%'; break;
                            case "0054":chr='^'; break;
                            case "0064":chr='&'; break;
                            case "0074":chr='*'; break;
                            case "0104":chr='('; break;
                            case "0114":chr=')'; break;
                            case "0124":chr='-'; break;
                            case "0134":chr='_'; break;
                            case "0144":chr='='; break;
                            case "0154":chr='+'; break;
                            case "0164":chr='`'; break;
                            case "0174":chr='~'; break;
                            case "0204":chr='['; break;
                            case "0214":chr=']'; break;
                            case "0224":chr='{'; break;
                            case "0234":chr='}'; break;
                            case "0244":chr=';'; break;
                            case "0254":chr=':'; break;
                            case "0000":chr=' '; break;
                            case "0264":chr='"'; break;
                            case "0274":chr='\\'; break;
                            case "0304":chr='|'; break;
                            case "0314":chr='/'; break;
                            case "0324":chr='?'; break;
                            case "0334":chr=','; break;
                            case "0344":chr='.'; break;
                            case "0354":chr='<'; break;
                            case "0364":chr='>'; break;
                            case "0374":chr='\''; break;
                            default: chr='?';
                        }
                        if(chr=='?'){
                            TextIO.put(chr+" ");
                        }else{
                            TextIO.put(chr+" ");
                        }
                    
                }
            break;
        }
    
        

    }
}
