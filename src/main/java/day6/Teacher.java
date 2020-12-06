package day6;

public class Teacher {
    private String subject;
    private String name;

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public void avaluate(Student s) {
        String appraisal;
        double a = (int) 2 + Math.random() * 3;
        if (a < 3) appraisal = "неудовлетворительно";
        else if (a < 4) appraisal = "удовлетворительно";
        else if (a < 5) appraisal = "хорошо";
        else appraisal = "отлично";
        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() +
                " по предмету " + subject + " на оценку " + appraisal);


    }


}
