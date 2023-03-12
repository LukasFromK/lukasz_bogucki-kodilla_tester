public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User teddy = new User("Teddy", 21);
        User luke = new User("Luke", 29);
        User emily = new User("Emily", 17);
        User johnny = new User("Johnny", 15);
        User pablo = new User("Pablo", 35);
        User carlos = new User("Carlos", 59);
        User margherita = new User("Margherita", 11);
        User charles = new User("Charles", 41);

        User[] users = {teddy, luke, emily, johnny, pablo, carlos, margherita, charles};

        double sum = 0.0;
        for (int i = 0; i < users.length - 1; i++) {
            sum = sum + users[i].age;
        }
        double result = sum / users.length;

        for (int i = 0; i < users.length - 1; i++) {
            if (users[i].age < result) {
                System.out.println(users[i].name);
            }
        }
    }
}

