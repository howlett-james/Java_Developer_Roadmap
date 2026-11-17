package Level1.Problems;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(7) ? "Prime" : "Not a prime");
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=2) return true;
        for(int i =3;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
