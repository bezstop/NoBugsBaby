package student;

public class Student implements Printable {
    private String studentName;
    private int studentCardNumber;
    private int averageStudentScore;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(int studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public int getAverageStudentScore() {
        return averageStudentScore;
    }

    public void setAverageStudentScore(int averageStudentScore) {
        this.averageStudentScore = averageStudentScore;
    }

    @Override
    public void print() {
        System.out.println(this.studentName + " " + this.studentCardNumber + " " + this.averageStudentScore);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentCardNumber=" + studentCardNumber +
                ", averageStudentScore=" + averageStudentScore +
                '}';
    }
}


