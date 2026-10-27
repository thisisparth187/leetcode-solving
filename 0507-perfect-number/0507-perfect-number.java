class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp = 0;
        if(num == 1) return false;
        for(int i = 1; i*i <= num; i++){
            if(num % i == 0){
                temp += i;
                if(num/i != i && i != 1){
                    temp += (num/i);
                }
            }
        }
        System.out.println(temp);
        if(temp == num){
            return true;
        }
        return false;
    }
}