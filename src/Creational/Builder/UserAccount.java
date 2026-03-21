package Creational.Builder;

public class UserAccount {
    // required fields
    private final String username;
    private final String email;

    // optional fields
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;
    private boolean isPremium;
    private boolean twoFactorEnabled;
    private String profilePictureUrl;
    private String bio;

    public UserAccount(
            String username,
            String email,
            String firstName,
            String lastName,
            int age,
            String phoneNumber,
            String address,
            boolean isPremium,
            boolean twoFactorEnabled,
            String profilePictureUrl,
            String bio
    ) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isPremium = isPremium;
        this.twoFactorEnabled = twoFactorEnabled;
        this.profilePictureUrl = profilePictureUrl;
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", isPremium=" + isPremium +
                ", twoFactorEnabled=" + twoFactorEnabled +
                ", profilePictureUrl='" + profilePictureUrl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}