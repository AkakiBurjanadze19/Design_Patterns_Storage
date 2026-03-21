package Creational.Builder;

public class Usage {
    public static void main(String[] args) {
        UserAccountBuilder userAccountBuilder = new UserAccountBuilder();

        UserAccount acc1 = userAccountBuilder
                .setUsername("gordon_freeman")
                .setEmail("black_mesa@gmail.com")
                .createUserAccount();

        UserAccount acc2 = userAccountBuilder
                .setUsername("time_travel_lover")
                .setEmail("animus@gmail.com")
                .setBio("At animus, we love time travel.")
                .setAge(32)
                .createUserAccount();

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
