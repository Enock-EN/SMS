package mode;

import database.DatabaseOperations;

public class Student extends Person implements DatabaseOperations {
    private String course;
    private int marks;

    public Student(String name, String email, String course, int marks) {
        super(name, email);
        this.course = course;
        this.marks = marks;
    }

    // Getters and setters
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    // Implement DatabaseOperations (empty for now, handled in DAO)
    @Override
    public void add() {}
    @Override
    public void update() {}
    @Override
    public void delete() {}
    @Override
    public void search() {}
}