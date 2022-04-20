package LabWork6;

public class Aspirant extends Student {

    private ScientificWork scientificWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, ScientificWork scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public ScientificWork getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(ScientificWork scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getFirstName() + " " + getLastName() +
                ", группа " + getGroup() + ", научная работа " + getScientificWork() + ", средняя оценка " + getAverageMark();
    }
}
