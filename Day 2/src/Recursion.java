public class Recursion {
   static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumofdigit(n/10);
    }
  static int countdigit(int n) {
      if (n == 0) {
          return 0;
      }
      return 1 + countdigit(n / 10);
  }

  static int reverse(int n,int rev){
      if(n==0){
          return rev;
      }
      return reverse(n/10,rev*10+n%10);
  }
  static int power(int x,int n){
       if(n==0){
           return 1;
       }
       return x*power(x,n-1);
  }
  static int fib(int n){
       if(n<=1){
           return n;
       }
       return fib(n-1)+fib(n-2);
  }
  static int fact(int n){
       if(n<=1){
           return 1;
       }
       return n*fact(n-1);
  }
    public static void main(String[] args){
        System.out.println(sumofdigit(523));
        System.out.println(countdigit(534));
        System.out.println(reverse(1234,0));
        System.out.println(power(2,5));
        System.out.println(fib(5));
        System.out.println(fact(10));
    }
}