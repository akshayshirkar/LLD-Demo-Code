package StudentPackage;

public class Exam {
    public int seatNumber;
    public int startDate;
    public int enddate;
    public String examName;

    public Exam(){

    }

    public Exam (Exam ExamRef){
        this.seatNumber = ExamRef.seatNumber;
        this.startDate = ExamRef.startDate;
        this.enddate = ExamRef.enddate;
        this.examName = ExamRef.examName;
    }

}
