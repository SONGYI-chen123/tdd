import java.util.regex.*;

public class Mommifier {

    public String convert(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        int vowel_number = count_vowel(string);
        int num =(int) (0.3*string.length());
        if(vowel_number> num){
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
        }else {
            return string;
        }
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

    public static int count_vowel(String string){
        int vowel_number = 0;
        for(int i=0 ; i<string.length();i++){
            char ch = string.charAt(i);
            if(isvowel(ch)){
                vowel_number = vowel_number+1;
            }
        }
        return vowel_number;
    }

}
