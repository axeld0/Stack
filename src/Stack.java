import java.util.ArrayList;

public class Stack implements ICollectionInterface{

    private ArrayList<Integer> a ;

    private int counter;


    public Stack()
    {
        a = new ArrayList<Integer>();
        counter = 0;
    }

    @Override
    public boolean add(int addNumber) {
         boolean add = false;
         a.add(addNumber);
         add = true;
         counter++;
         return add;
    }

    @Override
    public int extract() {
        counter--;
        return a.remove(a.size()-1);

    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        if(a != null)
        {
            empty =  false;
        }
        return empty;
    }

    public int first()
    {
        return a.get(0);
    }

    @Override
    public String toString() {

        String tring = "";

        for (int i : a)
        {
            tring +="| "+ i +" |";
        }
        return "Stack{" + tring + "}";
    }
}
