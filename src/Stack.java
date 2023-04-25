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
        int i = 0;
            counter--;
            if(a.size() != 0) {
                i = a.remove(a.size()-1);
            }
        return i;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if(a.size() == 0)
        {
            empty = true;
        }
        return empty;
    }

    public int first()
    {
        int i  = 0;
        if( a.size() != 0) {
            i = a.get(a.size()-1);
        }
        return i;
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
