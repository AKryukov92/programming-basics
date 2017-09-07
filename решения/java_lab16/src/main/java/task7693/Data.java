package task7693;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akryukov
 *         06.09.2017
 */
public class Data {
    private List<Entry> data;
    public Data(int size){
        data = new ArrayList<Entry>(size);
    }
    public void add(Entry p){
        data.add(p);
    }
}
