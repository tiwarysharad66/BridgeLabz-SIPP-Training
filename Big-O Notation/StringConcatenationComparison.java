public class StringConcatenationComparison {
    public static void main(String[] args) {
        int N = 1_000_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) s += "a";
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1e6 + " ms");
    }
}