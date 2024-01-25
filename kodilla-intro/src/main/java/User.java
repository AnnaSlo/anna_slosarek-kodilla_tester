public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = new User[6];
        users[0] = new User("Anna", 20);
        users[1] = new User("Beata", 33);
        users[2] = new User("Kasper", 58);
        users[3] = new User("Dawid", 13);
        users[4] = new User("Ewa", 18);
        users[5] = new User("Franciszek", 45);

        double averageAge = calculateAverage(users);
        System.out.println("Średnia wieku: " + averageAge);
        System.out.println("Imiona użytkowników, których wiek jest poniżej średniej wieku:");

        for (User user : users) {
            if (user.getAge() < averageAge) {
                System.out.println(user.getName());
            }
        }
    }

    public static double calculateAverage(User[] users) {
        int size = users.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + users[i].getAge();
        }

        return (double) sum / size;
    }
}