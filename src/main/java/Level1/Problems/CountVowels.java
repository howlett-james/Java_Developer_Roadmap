package Level1.Problems;

public class CountVowels {
    /*
    * START
    Read a string
    Set count = 0

    FOR each character in the string
        IF character is a vowel
            Increase count by 1
        END IF
    END FOR

    Print count
    STOP
*/
    public static void main(String[] args) {
        String s = "hello world";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count =0;
        for(int i =0;i<s.length();i++){
            for(int j =0;j<vowels.length;j++){
                if(s.charAt(i) == vowels[j]){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
