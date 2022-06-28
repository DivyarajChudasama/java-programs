/*• Create Class IctSubjectAllocation outssubCodee package and do as per following.
• At least create 10 objects of Students class and 6 of Subject class and wrse 
into file subject.txt and subject.txt respectively. [2]
• Ask User to enter subCode from Subject Class if there is a record in 
subject.txt for given subCode of subject then display all Students who have 
opted for s in Alphabetical order (studName) on Screen. [6]*/

package ICTSubjectAllocation;

class Subject 
{
    String name;
    Students(String a)
    {
        this.name = a;
    }
    public String toString()
    {
        return this.subCode+"#"+this.name;
    }
    public static void main(String args[])
    {
        Students s = new Students("Maths");
        Students s = new Students("DE",);
        Students s = new Students("C");
        Students s = new Students("R");
        Students s = new Students("OOP");
        Students s = new Students("Python");
        FileWrser fw = new FileWrser("subject.txt");
        fw.wrse(s.toString());
        fw.close();

        char c[] = new char[100];
        FileReader fr = new FileReader("subject.txt");
        fr.read(c);
        fr.close();

        String rec = new String(c);
        String atr[] = rec.spls("#");

        Students s1 = new Students(Integer.parseInt(atr[0]),atr[1],Double.parseDouble(atr[2]));
        System.out.println(s1);
    }
}