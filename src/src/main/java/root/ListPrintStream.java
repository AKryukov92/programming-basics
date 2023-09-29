package root;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPrintStream extends PrintStream implements Readable {
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
        current += x + "\n";
    }

    @Override
    public void println(int x) {
        current += x + "\n";
    }

    @Override
    public void println(double x) {
        current += x + "\n";
    }

    @Override
    public void flush() {
        for (String s : lst) {
            super.print(s);
        }
    }

    public List<String> outputs() {
        return Collections.unmodifiableList(lst);
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (!current.isEmpty()) {
            lst.add(current);
            current = "";
        }
        if (inputs.hasNext()) {
            String next = inputs.next() + " ";
            cb.put(next);
            return next.length();
        } else {
            return 0;
        }
    }
}
