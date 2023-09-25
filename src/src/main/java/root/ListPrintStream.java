package root;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPrintStream extends PrintStream implements Iterator<String> {
    List<String> lst = new ArrayList<>();
    Iterator<String> inputs;
    String current = "";

    public ListPrintStream(PrintStream out, Iterator<String> inputs) {
        super(out);
        this.inputs = inputs;
    }

    @Override
    public void print(String x) {
        current += x;
    }

    @Override
    public void println(String x) {
        current += x;
    }

    @Override
    public void println(int x) {
        throw new NotImplementedException();
        lst.add(String.valueOf(x));
    }

    @Override
    public void println(double x) {
        lst.add(String.valueOf(x));
    }

    @Override
    public void flush() {
        for(String s : lst) {
            super.println(s);
        }
    }
    public List<String> elements() {
        return Collections.unmodifiableList(lst);
    }

    @Override
    public boolean hasNext() {
        return inputs.hasNext();
    }

    @Override
    public String next() {
        addToPrevious = false;
        return inputs.next();
    }
}
