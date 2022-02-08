class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        while(num>=10)
        {
           num=getSum(num);
        }
        return num;
    }
    public static int getSum(int num)
    {
        int sum=0;
        while(num!=0){
            int r = num%10;
            sum=sum+r;
            num=num/10;            
        }
        return sum;
    }
    
    /** Without loops[Digital root Problem]
         public int addDigits(int num) {
            if (num == 0){
                return 0;
            }
            if (num % 9 == 0){
                return 9;
            }
            else {
                return num % 9;
            }
        }
    **/
    
    
    /** Recursion Method     
        public int sumDigits(int n){
        if(n==0)
            return 0;
        return (n%10) + sumDigits(n/10);
    }
    **/

}