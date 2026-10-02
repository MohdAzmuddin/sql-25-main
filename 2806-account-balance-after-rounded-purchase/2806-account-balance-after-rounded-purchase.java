class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount<5) return 100-0;
        else if(purchaseAmount>=5 && purchaseAmount<15) return 100-10;
        else if(purchaseAmount>=15 && purchaseAmount<25) return 100-20;
        else if(purchaseAmount>=25 && purchaseAmount<35) return 100-30;
        else if(purchaseAmount>=35 && purchaseAmount<45) return 100-40;
        else if(purchaseAmount>=45 && purchaseAmount<55) return 100-50;
        else if(purchaseAmount>=55 && purchaseAmount<65) return 100-60;
        else if(purchaseAmount>=65 && purchaseAmount<75) return 100-70;
        else if(purchaseAmount>=75 && purchaseAmount<85) return 100-80;
        else if(purchaseAmount>=85 && purchaseAmount<95) return 100-90;
        else if(purchaseAmount>=95) return 100-100;
        return -1;
    }
}