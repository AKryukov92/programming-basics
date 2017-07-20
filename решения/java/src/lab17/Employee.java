package lab17;

/**
 * Created by Александр on 20.07.2017.
 */
public class Employee {
    private String id;
    private String lastName;
    private String firstName;
    private String fatherName;
    private String gender;
    private String birthDate;
    private boolean marriage;
    private String postalIndex;
    private String address;
    private String position;
    private String hireType;
    private String notes;

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public String getPostalIndex() {
        return postalIndex;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public String getHireType() {
        return hireType;
    }

    public String getNotes() {
        return notes;
    }

    public Employee(String id, String lastName, String firstName, String fatherName, String gender, String birthDate, boolean marriage, String postalIndex, String address, String position, String hireType, String notes) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.marriage = marriage;
        this.postalIndex = postalIndex;
        this.address = address;
        this.position = position;
        this.hireType = hireType;
        this.notes = notes;
    }
}
