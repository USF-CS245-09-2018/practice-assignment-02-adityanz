public class LinearSearch implements Practice2Search{
    @Override
    public int search(int[] arrayz, int target)
    {
        for (int i=0; i<arrayz.length; i++)
        {
            if (target == arrayz[i])
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String searchName() {
        return "LinearSearch";
    }
}
