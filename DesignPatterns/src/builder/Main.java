package builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("FirstName1", "LastName1")
                .age(30)
                .address("Address1")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("FirstName2", "LastName2")
                .phone("Phone1")
                .build();
    }
}