import java.util.Comparator;

public class AssociationComparator<K,V> implements Comparator<K> {
    private Comparator<K> keyComparator;

    public AssociationComparator(Comparator<K> keyComparator) {
        this.keyComparator = keyComparator;
    }

    @Override
    public int compare(K key1, K key2) {
        return keyComparator.compare(key1, key2);
    }
}
