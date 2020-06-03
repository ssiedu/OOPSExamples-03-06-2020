
public class Student {

    private int rno;
    private String name;
    private int marks;
    private static int totalPassed, totalFailed;
    
    public void showOverallResult(){
        System.out.println("Total Passed Candidates : "+totalPassed);
        System.out.println("Total Failed Candidates : "+totalFailed);
        System.out.println("==========================================================");
    }
    //This method will print the report card of a student
    public void printResult() {
        System.out.println("Roll Number : " + rno);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        if (marks >= 33) {
            totalPassed++;
            System.out.println("STUDENT PASSED ");
        } else {
            totalFailed++;
            System.out.println("STUDENT FAILED ");
        }
        System.out.println("________________________________________________________");
    }
                        //113       CCC       30
    public void setData(int x, String y, int z) {
        rno = x;        //here rno belongs to calling obj
        name = y;       //name belongs to calling obj
        marks = z;
    }

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setData(111, "AAA", 50);
        s2.setData(112, "BBB", 60);
        s3.setData(113, "CCC", 30);

        s1.printResult();
        s2.printResult();
        s3.printResult();
        
        s1.showOverallResult();
        //s2.showOverallResult();
        //s3.showOverallResult();
    }

}

//any instance variable used in a non-static method always refers to calling object.
