import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int start = 0, end = 0, size = 0;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
    }

    public void insert(int val) {
        buffer[end] = val;
        end = (end + 1) % buffer.length;
        if (size < buffer.length) size++;
        else start = (start + 1) % buffer.length;
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) result.add(buffer[(start + i) % buffer.length]);
        return result;
    }
}