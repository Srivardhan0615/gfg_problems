class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.keySet()){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(i);
            pair.add(map.get(i));
            
            list.add(pair);
            
        }
        
        return list;
    }
}