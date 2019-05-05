package edu.erciyes.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

public class GenericStack<E>
{

    ArrayList<E> list = new ArrayList<E>();

    public int getSize()
    {
        return this.list.size();
    }

    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }

    public void push(E item)
    {
        this.list.add(item);
    }

    public E peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public E pop()
    {
        E item = peek();
        list.remove(list.size() - 1);
        return item;
    }

    public static void print(GenericStack<?> stack)
    {
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    public void pushAll(ArrayList<? extends E> src)
    {
        for (E e : src)
        {
            push(e);
        }
    }
    public void popAll(Collection<? super E> dst)
    {
        while(!isEmpty())
        {
            dst.add(pop());
        }
    }
    /*

    genericMatrix


    */
}
