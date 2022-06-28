/*• Create Class IctSubjectAllocation outssubCodee package and do as per following.
• At least create 10 objects of Students class and 6 of Subject class and wrse 
into file student.txt and subject.txt respectively. [2]
• Ask User to enter subCode from Subject Class if there is a record in 
student.txt for given subCode of subject then display all Students who have 
opted for s in Alphabetical order (studName) on Screen. [6]*/

package ICTSubjectAllocation;

class Students 
{
    int subCode;
    String name;
    Students(int a,String b)
    {
        this.subCode = a;
        this.name = b;
    }
    public String toString()
    {
        return this.subCode+"#"+this.name;
    }
    public static void main(String args[])
    {
        Students s = new Students(1,"Jatan");
        Students s = new Students(2,"Divyaraj",);
        Students s = new Students(3,"Namra");
        Students s = new Students(4,"Yenish");
        Students s = new Students(5,"Chris");
        Students s = new Students(6,"Ajay");
        Students s = new Students(7,"Messi");
        Students s = new Students(8,"Virat");
        Students s = new Students(9,"Ajay");
        Students s = new Students(10,"Sanjay");
        FileWrser fw = new FileWrser("student.txt");
        fw.wrse(s.toString());
        fw.close();

        char c[] = new char[100];
        FileReader fr = new FileReader("student.txt");
        fr.read(c);
        fr.close();

        String rec = new String(c);
        String atr[] = rec.spls("#");

        Students s1 = new Students(Integer.parseInt(atr[0]),atr[1],Double.parseDouble(atr[2]));
        System.out.println(s1);
    }
}