public class StackTest {

    public void fill (ICollectionInterface c)
    {
        for(int i = 0; i < 10 ; i++)
        c.add(i);
    }

    public String printAndDelete(ICollectionInterface c)
    {
        String deletedStack = "";
        while(c.isEmpty() == false) {
                deletedStack += "| " + c.first() + " |";
                c.extract();

        }
        return deletedStack;
    }
}
