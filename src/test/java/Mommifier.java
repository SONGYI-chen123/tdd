import java.util.regex.*;

public class Mommifier {

    public String convert(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        for(int i =0 ;i<string.length();i++)
        {
            char ch = string.charAt(i);
            if(i==0){
                if(isvowel(ch)){
                    stringBuilder.insert(i+1,"mommy");
                }
            }else{
                char chi = string.charAt(i-1);
                if(isvowel(ch)&&!(isvowel(chi))){
                    stringBuilder.insert(i+1,"mommy");
                }else{
                    continue;
                }
            }

        }
        string = stringBuilder.toString();
        return string;
    }

    public static boolean isvowel(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
