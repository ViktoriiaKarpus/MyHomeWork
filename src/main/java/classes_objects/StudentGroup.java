package classes_objects;

public class StudentGroup {
    /**Создайте класс classes_objects. StudentGroup
     * с полями groupName и studentCount.
     * Реализуйте конструктор, геттеры и сеттеры,
     * и метод printInfo(), выводящий информацию о группе и количестве студентов.
     * В main измените число студентов и выведите информацию.*/

    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String newGroupName) {
        groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("GroupName: " + groupName + " " + "StudentCount: " + studentCount);
    }

}
