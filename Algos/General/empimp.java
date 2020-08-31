class Solution 
{
    public int getImportance(List<Employee> employees, int id) 
    {
        int sum=0;
        Queue<Integer>trav=new LinkedList<>();
        trav.add(id);
        while(!trav.isEmpty())
        {
            int cur=trav.remove();
            for(int i=0;i<employees.size();i++)
            {
                if(employees.get(i).id==cur)
                {
                    sum=sum+employees.get(i).importance;
                    List<Integer>nxt=employees.get(i).subordinates;
                    for(int j=0;j<nxt.size();j++)
                        trav.add(nxt.get(j));
                    break;
                }
            }
        }
        return sum;
    }
}
