package enums;

public enum CONTACT {
    BURKAY("burkay","gul","burkaygul96@gmail.com","017682285995","enum")
    ;
    private String firstName;
    private String surname;
    private String email;
    private String number;
    private String yourMessage;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getYourMessage() {
        return yourMessage;
    }

    CONTACT(String firstName, String surname, String email, String number, String yourMessage) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.number = number;
        this.yourMessage = yourMessage;
    }
}
