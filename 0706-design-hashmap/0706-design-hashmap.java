class MyHashMap {
     HashMap<Integer,Integer> MyHashMap=new HashMap<>();
    public MyHashMap() {
       
        
    }
    
    public void put(int key, int value) {
         MyHashMap.put(key,value);
    }
    
    public int get(int key) {
        return MyHashMap.getOrDefault(key,-1);
    }
    
    public void remove(int key) {
         MyHashMap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */