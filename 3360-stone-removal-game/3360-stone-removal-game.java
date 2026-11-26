class Solution {
    public boolean canAliceWin(int n) {
        int turn =  1;
        int rem = 10;
        while(n>=rem){
            n = n -rem;
            turn++;
            rem--;
        }
        if(turn%2==0){
            return true;
        }
        return false;
    }
}