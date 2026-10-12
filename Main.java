public class Main {
    // The grader compiles with JDK 13, which has no `record` keyword.
    // Write, by hand, the class a record would have generated: final,
    // private final fields, a constructor taking both components, and a
    // toString() that produces exactly Person[name=..., age=...]
    //
    // static final class Person { ... }

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        // Build a Person and print it.
        //
        Person person = new Person(name, age);

        System.out.println(person.toString());

    }

    static final class Person {

        private final int age;
        private final String name;

        public Person(String name, int age) {

            this.age = age;
            this.name = name;
        }

        public String name() {

            return this.name;
        }

        public int age() {

            return this.age;
        }

        public String toString() {

            StringBuilder string = new StringBuilder();

            string.append("Person[")
                    .append("name=").append(this.name)
                    .append(", ")
                    .append("age=").append(this.age)
                    .append("]");

            return string.toString();

        }
    }
}
