package root;

import java.io.PrintStream;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPrintStream extends PrintStream implements Readable {
    List<Either> outputs = new ArrayList<>();
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
    public void print(int x) {
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
        for (Either s : outputs) {
            super.print(s);
        }
    }

    public List<Either> outputs() {
        if (!current.isEmpty()) {
            outputs.add(Either.right(current));
            current = "";
        }
        while (inputs.hasNext()) {
            outputs.add(Either.left(inputs.next()));
        }
        return Collections.unmodifiableList(outputs);
    }

    @Override
    public int read(CharBuffer cb) {
        if (!current.isEmpty()) {
            outputs.add(Either.right(current));
            current = "";
        }
        if (inputs.hasNext()) {
            String next = inputs.next() + " ";
            outputs.add(Either.left(next));
            cb.put(next);
            return next.length();
        } else {
            return -1;
        }
    }

    public static class Either {
        public String left;
        public String right;

        public boolean isLeft() {
            return left != null;
        }

        public boolean isRight() {
            return right != null;
        }

        public static Either left(String val) {
            Either e = new Either();
            e.left = val;
            return e;
        }

        public static Either right(String val) {
            Either e = new Either();
            e.right = val;
            return e;
        }

        @Override
        public String toString() {
            if (left == null) {
                return right;
            } else {
                return left;
            }
        }
    }
}
