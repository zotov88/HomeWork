package LabWork6;

public class ScholarTest {

    public static void main(String[] args) {
        Scholar[] scholars = {
                new Student("Peter", "Parker", 9, 5),
                new Aspirant("Jikael", "Makson", 2, 4.4, new ScientificWork("About something"))
        };

        for (Scholar scholar : scholars) {
            System.out.println(scholar + ". Стипендия: " + scholar.getScholarship());
        }
    }
}
