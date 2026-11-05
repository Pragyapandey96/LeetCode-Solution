class Solution {
    public void duplicateZeros(int[] arr) {
        int possiblezeroDups = 0;
        int lastIdx = arr.length - 1;

        for(int i=0; i<= lastIdx - possiblezeroDups; i++){
            if(arr[i] == 0){
                // edge case 
                if(i == lastIdx - possiblezeroDups){
                    arr[lastIdx] = 0;
                    lastIdx -= 1;
                    break;
                }
                possiblezeroDups++;
            }
        }

        int newlastIdx = lastIdx - possiblezeroDups;

        for(int i=newlastIdx; i>=0; i--){
            if(arr[i] == 0){
                arr[i + possiblezeroDups] = 0;
                possiblezeroDups--;
                arr[i + possiblezeroDups] = 0;
            } 
            else{
                arr[i+possiblezeroDups] = arr[i];
            }
        }
    }
}