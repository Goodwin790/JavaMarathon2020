package day9.Task1;

public class Student extends Human {
    private String groupName;
    public Student (String name,String studyGroupName){
        super(name);
        this.groupName = studyGroupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());


    }
}

