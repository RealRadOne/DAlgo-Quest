class MyHashSet {

    /** Initialize your data structure here. */
    HashMap<Integer,Integer>store=new HashMap<Integer,Integer>();
    public MyHashSet() 
    {
        
    }
    
    public void add(int key) 
    {
        if(!store.containsKey(key))
            store.put(key,0);
    }
    
    public void remove(int key)
    {
        if(store.containsKey(key))
            store.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key)
    {
        if(store.containsKey(key))
            return true;
        else
            return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
