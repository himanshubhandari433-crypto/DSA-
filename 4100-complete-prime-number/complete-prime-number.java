class Solution {
 

    public boolean completePrime(int num) {

        String s = String.valueOf(num);

        // Check all prefixes
        int prefix = 0;
        for (int i = 0; i < s.length(); i++) {
            prefix = prefix * 10 + (s.charAt(i) - '0');

            if (!isPrime(prefix)) {
                return false;
            }
        }

        // Check all suffixes
        int suffix = 0;
        int power = 1;

        for (int i = s.length() - 1; i >= 0; i--) {

            suffix = (s.charAt(i) - '0') * power + suffix;
            power *= 10;

            if (!isPrime(suffix)) {
                return false;
            }
        }

        return true;
    }

    private boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}