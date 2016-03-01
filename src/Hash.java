
public class Hash {
    public Hash() {
    }

    public int hashCode(Object key) {
        int keyHash = key.hashCode();
        int x = (int) ((65079 & keyHash) % Math.pow(2, 16));
        return x >> (16 - 13);
    }

    public static void main(String[] args) {
        Hash hash = new Hash();
        for (String arg : args)
            System.out.println(arg + "===>  " + hash.hashCode(arg));
    }
}
