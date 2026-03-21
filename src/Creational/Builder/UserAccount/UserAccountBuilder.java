package Creational.Builder;

public class UserAccountBuilder {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;
    private boolean isPremium;
    private boolean twoFactorEnabled;
    private String profilePictureUrl;
    private String bio;

    public UserAccountBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserAccountBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserAccountBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserAccountBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserAccountBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserAccountBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserAccountBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserAccountBuilder setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
        return this;
    }

    public UserAccountBuilder setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
        return this;
    }

    public UserAccountBuilder setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
        return this;
    }

    public UserAccountBuilder setBio(String bio) {
        this.bio = bio;
        return this;
    }

    public UserAccount createUserAccount() {
        return new UserAccount(
                username,
                email,
                firstName,
                lastName,
                age,
                phoneNumber,
                address,
                isPremium,
                twoFactorEnabled,
                profilePictureUrl,
                bio
        );
    }
}