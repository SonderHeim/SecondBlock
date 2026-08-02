package task2_1.firsttask;

public class StudentProfile {
    byte mark = 5;
    short studentTicket = 127;
    int birthDate = 1042005;
    long phoneNumber = 79201242692L;
    float averageMark = 4.5f;
    double finalMark = 4.642;
    boolean isPayment = true;
    char firstLetterOfName = 'Д';

    @Override
    public String toString() {
        return "StudentProfile{" +
                "mark=" + mark +
                ", studentTicket=" + studentTicket +
                ", birthDate=" + birthDate +
                ", phoneNumber=" + phoneNumber +
                ", averageMark=" + averageMark +
                ", finalMark=" + finalMark +
                ", isPayment=" + isPayment +
                ", firstLetterOfName=" + firstLetterOfName +
                '}';
    }

    public static void main(String[] args) {
        StudentProfile studentProfile = new StudentProfile();
        System.out.println(studentProfile.toString());
    }
}