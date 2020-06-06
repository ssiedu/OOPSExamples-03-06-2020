public class Student {

    private int rno;
    private String name;
    private int marks;
    private static int totalPassed, totalFailed;

    public static void showAvg(Student st1, Student st2, Student st3){
            System.out.println("Avg of 3 : "+(st1.marks+st2.marks+st3.marks)/3);
    }
    //this method should print the avg marks of any two students.
    public  static void showAvg(Student st1, Student st2){
            System.out.println("Avg of 2 : "+(st1.marks+st2.marks)/2);
    }
    
    //to display the grade of a student using this method.(A,B,C,D)
    //to compute the grade we need marks (instance variable)
    public static void showGrade(Student st){
        if(st.marks>=90){
            System.out.println("GRADE OF "+st.rno+" IS A");
        }else if(st.marks>=80){
            System.out.println("GRADE OF "+st.rno+" IS B");
        }else{
            System.out.println("GRADE OF "+st.rno+" IS C");
        }
    }
    
    //displaying the overall result of the class
    public static void showOverallResult(){
        System.out.println("Total Passed Candidates : "+totalPassed);
        System.out.println("Total Failed Candidates : "+totalFailed);
        System.out.println("==========================================================");
    }
    //displaying the result of a student and maintaining the overall result also
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
                  
    //intializing the details of  a student object.
    public void setData(int x, String y, int z) {
        rno = x;        //here rno belongs to calling obj
        name = y;       //name belongs to calling obj
        marks = z;
    }
    
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setData(111, "AAA", 90);
        s2.setData(112, "BBB", 80);
        s3.setData(113, "CCC", 30);
        
        Student.showAvg(s1,s2,s3);
        
        //s3.showAvg(s1);
        //s1.showAvg(s2);
        
        //Student.showGrade(s1);
        //Student.showGrade(s2);
        //Student.showGrade(s3);
        //s1.showGrade();
        //s2.showGrade();
        //s3.showGrade();
        /*
        s1.printResult();
        s2.printResult();
        s3.printResult();
        
        Student.showOverallResult();
        */
    }

}

//any instance variable used in a non-static method always refers to calling object.
