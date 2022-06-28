/*• Create Package StudentdataData which contains classes.
• Studentdata (enrollNo, studName, subjects) [subjects is an array of subName]
• Subject (subCode, subName, type). [type (theory or practical) ]
• One Studentdata can take max 3 Subjects.
• Use appropriate datatype and Class Structure. [3]
• Write all get and set methods and Custom exceptions for subjectCode and 
enrollNo. [4] */
package studentData;
class Subject{
	int subcode;
	String subName;
	String type;

	Subject(){
	System.out.println("Subject data");
	System.out.println(0102TK1,"Java");
	System.out.println(00102Tk2,"OOP");
	System.out.println(1002TK3,"Maths");
	}
	public static  void main(String args[] ){
	new Subject();
	}
}
