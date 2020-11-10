import bean.Person;

public class App {
        public static void main(String... arg) {
                System.out.println("JavaGuru persons");
                for (String a : arg) {
                        Person person = new Person(a);
                        System.out.println(person);
                }
        }
}
