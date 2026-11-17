package Level1.Problems;

public class CountVowels {
    public static void main(String[] args) {
        String s = "hello world";
        int count =0;
        char[] c = s.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0;i<c.length;i++){
            for(int j =0;j<vowels.length;j++){
                if(c[i]==vowels[j]){
                    count +=1;
                }
            }
        }
        System.out.println(count);
    }
}
