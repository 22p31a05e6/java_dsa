class Solution {
    public int countPrimes(int n) {
         if(n<=1){
            return 0;
         }
        Boolean []primes = new Boolean[n];
        for(int i=0;i<n;i++){
            primes[i] = false;
        }
        int count =0;
        for(int i=2 ; i*i<n;i++){
            if(!primes[i]){
                
                for(int j = i+i;j<n;j+=i){
                       primes[j] = true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!primes[i]){
                count++;
            }
        }
        return count;
    }
}