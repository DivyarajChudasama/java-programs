import java.io.*;
import java.util.*;
 
class TelephoneDirectory
{
    String name;
	int number;
    String city;

	TelephoneDirectory(String a,int b,String c)
	{
		this.name = a;
        this.number = b;
        this.city = c;
	}
	public String toString()
	{
		return this.name + "#"+this.number + "#" + this.city;
	}
    public static void main(String s[]) throws IOException
    {
		Scanner scanf= new Scanner(System.in);
		boolean a=false;
		do
		{
            char ch[] = new char[10000];
            FileReader fr = new FileReader("content.txt");
            fr.read(ch);
            fr.close();
            String records = new String(ch);
            String record[] = records.split("\n");
            String[][] arrdata = new String[record.length+1][3];
            for(int loop=0;loop<record.length-1;loop++)
            {
                String attr[] = record[loop].split("#");
                for(int i=0;i<3;i++)
                {
                    if(attr.length>1)
                    {
                        if(i==0)
                        {
                            arrdata[loop][i]=(attr[0]);
                        }
                        else if(i==1)
                        {
                            arrdata[loop][i]=("#"+attr[1]);
                        }
                        else if(i==2)
                        {
                            arrdata[loop][i]=("#"+attr[2]);
                        }
                    }
                }
            }
            System.out.println("Phone Directory");
            System.out.println("---------------------------");
			System.out.println("find by name (choice-1) ");
			System.out.println("find by number (choice-2) ");
			System.out.println("find by city (choice-3) ");
			System.out.println("print list (choice-4) ");
			System.out.println("update list (choice-5) ");
			System.out.println("add in list (choice-6) ");
			System.out.println("Exit (choice-7)");
			System.out.println("--------------------------");
			System.out.print("choice :- ");
			int choice= scanf.nextInt();
			switch(choice)
			{
				case 1:
					int loop;
					System.out.print("then enter name :- ");
					String avoid= scanf.nextLine();//for avoid String get problem
					String nameTemp= scanf.nextLine();
					nameTemp=nameTemp.toLowerCase();
					int con=0;
					for(loop=0;loop<record.length-1;loop++)
					{
                        String forcmp1 = String.valueOf(arrdata[loop][0]);
                        if(forcmp1.contains(nameTemp))
						{
							for(int i=0;i<3;i++)
                            {
                                System.out.print(arrdata[loop][i]);   
                            }
						}
						else
						{
							con++;
						}
					}
					if(con==record.length-1)
					{
						System.out.println("No record found");
					}
					break;
				case 2:
                    System.out.print("then enter number :- ");
                    int num= scanf.nextInt();
                    String strOfint=String.valueOf(num);
                    con=0;
                    for(loop=0;loop<record.length-1;loop++)
                    {
                        String datatemp = (arrdata[loop][1]).startsWith("#") ? (arrdata[loop][1]).substring(1).trim() : (arrdata[loop][1]);
                        if(datatemp.contains(strOfint))
                        {
                            for(int i=0;i<3;i++)
                            {
                                System.out.print(arrdata[loop][i]);   
                            }
                        }
                        else
                        {
                            con++;
                        }
                    }
                    if(con==record.length-1)
                    {
                        System.out.println("No record found");
                    }
                    break;
				case 3:
                System.out.print("then enter city :- ");
                String avoid2= scanf.nextLine();//for avoid String get problem
                String cityTemp= scanf.nextLine();
                cityTemp=cityTemp.toLowerCase();
                con=0;
        
                for(loop=0;loop<record.length-1;loop++)
                {
                    String datatemp1 = (arrdata[loop][2]).startsWith("#") ? (arrdata[loop][2]).substring(1).trim() : (arrdata[loop][2]);
                    if(datatemp1.contains(cityTemp))
                    {
                        for(int i=0;i<3;i++)
                        {
                            System.out.print(arrdata[loop][i]);
                        }
                    }
                    else
                    {
                        con++;
                    }
                }
                if(con==record.length-1)
                {
                    System.out.println("Invalid Entry");
                }
                break;
				case 4:
					for(loop=0;loop<record.length-1;loop++)
                    {
                        for(int i=0;i<3;i++)
                        {
                            System.out.print(arrdata[loop][i]);   
                        }
                    }
					break;
				case 5:
					con=0;
					System.out.println("Enter number which you want to Update");
					int numfind= scanf.nextInt();
					for(loop=0; loop<record.length-1; loop++)
					{
                        String datatemp = (arrdata[loop][1]).startsWith("#") ? (arrdata[loop][1]).substring(1) : (arrdata[loop][1]);
                        int fornum = Integer.valueOf(datatemp);
						if(fornum == numfind)
						{
							System.out.println("found ");
							for(int i=0;i<3;i++)
                            {
                                System.out.print(arrdata[loop][i]);   
                            }
                            System.out.println("");
							System.out.println("enter name :- ");
							String avoid3= scanf.nextLine();//for avoid String get problem
							String nameup= scanf.nextLine();

							System.out.println("enter number :- ");
							int numup= scanf.nextInt();

							System.out.println("enter city :- ");
							String avoid4= scanf.nextLine();//for avoid String get problem
							String cityup= scanf.nextLine();
							for(int i=0;i<3;i++)
                            {
                                if(i==0)
                                {
                                    arrdata[loop][i]=(nameup);
                                }
                                else if(i==1)
                                {
                                    arrdata[loop][i]=("#"+numup);
                                }
                                else if(i==2)
                                {
                                    arrdata[loop][i]=("#"+cityup);
                                }
                            }
							con=1;
						}
						else if(con!=1)
						{
							System.out.println("No record found");
						}
					}
                    FileWriter fw = new FileWriter("content.txt");
                    for(loop=0;loop<record.length-1;loop++)
                    {
                        String temp=(arrdata[loop][0]+arrdata[loop][1]+arrdata[loop][2]);
                        fw.write(temp);
                        fw.write("\n");
                    }
					fw.close();
					break;
                case 6:
					System.out.println("enter name :- ");
					String avoid3= scanf.nextLine();//for avoid String get problem
					String newname= scanf.nextLine();

					System.out.println("enter number :- ");
					int newnumber= scanf.nextInt();

					System.out.println("enter city :- ");
					String avoid4= scanf.nextLine();//for avoid String get problem
					String newcity= scanf.nextLine();
                    for(int i=0;i<3;i++)
                    {
                        if(i==0)
                        {
                            arrdata[record.length-1][i]=(newname);
                        }
                        else if(i==1)
                        {
                            arrdata[record.length-1][i]=("#"+ newnumber);
                        }
                        else if(i==2)
                        {
                            arrdata[record.length-1][i]=("#"+newcity);
                        }
                    }
					FileWriter fw1 = new FileWriter("content.txt");
                    for(loop=0;loop<record.length;loop++)
                    {
                        String temp=(arrdata[loop][0]+arrdata[loop][1]+arrdata[loop][2]);
                        fw1.write(temp);
                        fw1.write("\n");
                    }
					fw1.close();
					break;
				case 7:
					a=true;
					break;
				default:
				{
					System.out.println("enter right choice");
				}
			}
		}while(!a);
    }
}