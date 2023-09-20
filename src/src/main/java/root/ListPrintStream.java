package root;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrintStream extends PrintStream {
    List<String> lst = new ArrayList<>();

    public ListPrintStream(PrintStream out) {
        super(out);
    }

    @Override
    public void println(String x) {
        lst.add(x);
    }

    @Override
    public void println(int x) {
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
}
