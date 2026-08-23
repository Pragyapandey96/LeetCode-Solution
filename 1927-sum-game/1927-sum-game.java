class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;
        int leftQ = 0;
        int rightQ = 0;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < half; i++) {
          if (num.charAt(i) != '?') {
           leftSum += num.charAt(i) - '0';
           } else {
            leftQ++;
           }
        }

        for (int i = half; i < n; i++) {
          if (num.charAt(i) != '?') {
          rightSum += num.charAt(i) - '0';
          } else {
            rightQ++;
          }
        } 
         int Qdiff = leftQ - rightQ;
        int diff = leftSum - rightSum;

        

         if (Qdiff % 2 != 0) {
            return true;
        }

        return diff != -(Qdiff / 2) * 9;
        
    }
}