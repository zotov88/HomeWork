package LabWork6;

public class Student implements Scholar {

    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + firstName + " " + lastName +
                ", группа " + group + ", средняя оценка " + averageMark;
    }
}
