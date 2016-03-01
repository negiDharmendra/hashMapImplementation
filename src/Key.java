
public class Key<K extends String> {
    private final K key;
    private boolean collision = false;
    private int probedIndex = -23;

    public Key(K key) {
        this.key = key;
    }

    public boolean isKey(K key) {
        return this.key == key;
    }

    public boolean getCollision() {
        return collision;
    }

    public int getProbedIndex() {
        return probedIndex;
    }

    public void setProbedIndex(int probedIndex) {
        collision = true;
        this.probedIndex = probedIndex;
    }
}
