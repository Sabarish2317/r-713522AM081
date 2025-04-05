public class FindLastDuplicate {
    public static void main(String[] args) {
        //test case 1 
        //Max repetetion of duplicates is 2 and the length of the array is 2 times its range ie (0,n)
        int[] testCase1 = {0,1,0,2,1,3,3,2};
        int[] freq = new int[testCase1.length];
        int lastFoundDuplicate = -1;
        for(int i=0; i<testCase1.length; i++){
            if(freq[testCase1[i]] == 1){
                lastFoundDuplicate = testCase1[i];
            } 
            freq[testCase1[i]] = freq[testCase1[i]]+1;
        }
        System.out.println(lastFoundDuplicate);
    }
}
