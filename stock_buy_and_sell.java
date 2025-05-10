
//Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to 
//sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
class stock_buy_and_sell{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int profit_now=0;
        int buy=a[0];
        for(int i =1;i<a.length;i++){
            int sell=a[i];
            int profit=sell-buy;

            //check the profit and profit_now and select the max as the profit_now
            if(profit_now<profit){
                profit_now=profit;
            }

            //check the current buy and sell which is minimum and choose that as the buy for next ieration
            //so that the min of the array will be the buy 
            buy=Math.min(sell,buy);
        }

        System.out.println(profit_now);
    }
}