class Solution {
    public static boolean helper(ArrayList<Integer> myList, int start, int end){
        if(start>=end) return true;
        if(myList.get(start)==myList.get(end)) {return helper(myList, start+1, end-1);}
        else return false;
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0 && x<10) return true;
        //121/10 = 12
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(x!=0){
            a.add(x%10);
            x/=10;
        }
        
        return helper(a, 0, a.size()-1);
        
    }
}
