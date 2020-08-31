class Solution 
{
    public void trav(int start,int end,int[][] graph,List<Integer>cur,List<List<Integer>>store)
    {
        if(start==end)
            store.add(cur);
        cur.add(start);
        for(int i=0;i<graph[start].length;i++)
        {
            if(!cur.contains(graph[start][i]))
            {
                List<Integer> copyList = new ArrayList<>(cur);
                trav(graph[start][i],end,graph,copyList,store);
            }
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) 
    {
        List<List<Integer>>store=new ArrayList<List<Integer>>();
        List<Integer>cur=new ArrayList<Integer>();
        trav(0,graph.length-1,graph,cur,store);
        return store;
    }
}
