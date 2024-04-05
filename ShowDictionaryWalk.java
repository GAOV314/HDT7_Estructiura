import java.util.List;
import java.util.ArrayList;
public class ShowDictionaryWalk<V> implements IWalk<V>{

    List<String> dictionaryShow = new ArrayList<>();
    @Override
    public void doWalk(V value) {
        Association<K,V> association1 = (Association<K,V>) value;
        for(String dictionaryValue: association1.getValue()){
            dictionaryShow.add(dictionaryValue);

        }

    }
}

