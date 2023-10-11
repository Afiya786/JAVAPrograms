public class Evendigits {
    public static void main(String[] args){
        int[][] accounts ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(MaxWealth(accounts));
    }


    static int MaxWealth(int[][] accounts) {
        int ans =Integer.MIN_VALUE;
        for(int person=0; person <accounts.length; person++){
            System.out.println(person);
            int sum=0;
            for(int account=0; account<accounts[person].length; account++){
                 sum  = sum + accounts[person][account];
                 System.out.println(account);
                 System.out.println(sum);
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
