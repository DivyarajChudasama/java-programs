/*• Create Package StudentdataData which contains classes.
• Studentdata (enrollNo, studName, subjects) [subjects is an array of subName]
• Subject (subCode, subName, type). [type (theory or practical) ]
• One Studentdata can take max 3 Subjects.
• Use appropriate datatype and Class Structure. [3]
• Write all get and set methods and Custom exceptions for subjectCode and 
enrollNo. [4] */
package studentData;
class  Studentdata
{
	int enrollNo;
	String studName;
	String subjects;

	Studentdata(){
	System.out.println("Student Data");
	System.out.println(021,"Jatan","Java");
	System.out.println(050,"Yenish","OOP");
	System.out.println(053,"Namra","Maths");
	}
	public static  void main(String args[] ){
	new Studentdata();
	}
}