package tk.boaxylnetwork.boaxylclass.Models;

import javax.persistence.*;

@Entity(name = "BoaxylClassRegister")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    @Column(name = "Surname")
    private String lastName;
    private long phoneNumber;
    private String location;
    private String gender;
    private String courseSelection;

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", location='" + location + '\'' +
                ", gender=" + gender +
                ", courseSelection='" + courseSelection + '\'' +
                '}';
    }

    public Student(String firstName, String lastName, long phoneNumber, String location, String gender, String courseSelection) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.courseSelection = courseSelection;
        this.gender=gender;
        this.location=location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourseSelection() {
        return courseSelection;
    }

    public void setCourseSelection(String courseSelection) {
        this.courseSelection = courseSelection;
    }
}


