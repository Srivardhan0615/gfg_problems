class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i : a){
            set1.add(i);
        }
        
         for(int i : b){
            set2.add(i);
        }
        
        for(int i : set1){
            if(set2.contains(i)){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
        
        // code here
        
    }
}