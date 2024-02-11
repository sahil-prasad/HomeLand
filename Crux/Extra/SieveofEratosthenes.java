package Extra;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n =40;
        boolean [] prime =new boolean[n+1];
        System.out.println(prime[0]);
        sieve(n,prime);
    }
    static void sieve(int n ,boolean []prime){
        // false in array mean array is prime
        for (int i = 2; i*i<=n ; i++) {
            if(!prime[i]){
                for (int j = 2*i; j <=n ; j+=i) {
                        prime[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!prime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
