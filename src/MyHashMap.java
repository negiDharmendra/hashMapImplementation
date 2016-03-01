///**
// * Created by dharmenn on 29/02/16.
// */
//public class MyHashMap<K extends String,V> {
//
//    private final LinkedList<Object>[] keys;
//    private final Object [] values;
//    private final int size = 13;
//
//    public MyHashMap() {
//        this.keys = new LinkedList<>();
//        this.values = new Object[(int)Math.pow(2,size)];
//    }
//    public int hashFun(Object key) {
//        int keyHash = key.hashCode();
//        int x = (int) ((65079 & keyHash) % Math.pow(2, 16));
//        int y = x >> (16 - size);
//        return y;
//    }
//    public void put(K key,V value){
//        int hasValue = hashFun(key);
//        if(!keys.){
//            keys.add(key);
//            values[hasValue] = value;
//        }
//        else
//            throw new RuntimeException("Cant map given value to this key");
//    }
//}
