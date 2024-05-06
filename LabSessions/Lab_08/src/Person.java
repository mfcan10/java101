public class Person {

    private String idNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String profession;

    public Person(String idNumber, String firstName, String lastName, String gender, int birthYear, String profession) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.profession = profession;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return String.format("%-11s %-14s %-14s (%s %d) %s", idNumber, firstName, lastName, gender, birthYear, profession);
    }
}