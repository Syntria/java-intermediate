public class Main {

    static public class Pair<A, B> {

        private A first;
        private B second;

        public Pair(A first, B second) {

            this.first = first;
            this.second = second;
        }

        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("(");
            stringBuilder.append(this.first);
            stringBuilder.append(", ");
            stringBuilder.append(this.second);
            stringBuilder.append(")");

            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Ada", 36);
        System.out.println(p);
    }
}
