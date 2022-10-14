package builder;

public class UserMain {
    public static void main(String[] args) {
        User user = User.UserBuilder.UserBuilder()
                        .name("준일")
                        .username("junil")
                        .password("1234")
                        .build();


    }
}
