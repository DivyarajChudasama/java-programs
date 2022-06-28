import java.util.*;
import java.io.*;
class Telephone 
{
	long no;
	String name;
	String city;
	
	Telephone(long a,String b,String c)
	{
		this.no = a;
		this.name = b;
		this.city = c;
	}
	public String toString()
	{
		return this.no+"#"+this.name+"#"+this.city;
	}
	
	public static void main(String s[]) throws Exception
	{
			int counter=0;
			try
				{
					File f=new File("content.txt");
					Scanner f1=new Scanner(f);
					while(f1.hasNextLine())  //hasNext():- Returns true if the iteration has more elements.
					{
						f1.nextLine();
						counter++;
					}
				}
		
		catch(Exception e)
		{
			e.getStackTrace();
		}
			Scanner sc = new Scanner(System.in);	
			boolean exit = false;
			Telephone t[] = new Telephone[30];
			BufferedReader br=new BufferedReader(new FileReader("content.txt"))  //Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method
			ArrayList<Telephone> content=new ArrayList<Telephone>();  // Arraylist has no size limit,We can add or remove elements anytime.
			Iterator<Telephone> ir = content.iterator();  //iterator is to allow a user to process every element of a container while isolating the user from the internal structure of the container. This allows the container to store elements in any manner it wishes while allowing the user to treat it as if it were a simple sequence or list.
			for(int i=0;i<counter;i++)
			{
				String st1=br.readLine();
				String arr[] = st1.split("#");
				t[i] =new Telephone(Long.parseLong(arr[0]),arr[1],arr[2]);  //
				content.add(t[i]);
			}			
			do
		{
			System.out.println("**********************************");
			System.out.println("Display (choice-1) ");
			System.out.println("find by no (choice-2) ");
			System.out.println("find by name (choice-3) ");
			System.out.println("find by city (choice-4) ");
			System.out.println("update by name (choice-5) ");
			System.out.println("update by city (choice-6) ");
			System.out.println("Exit (choice-7) ");
			System.out.println("*************************************");
			System.out.print("Waiting for an Input :- ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					for(int i=0;i<counter;i++)
					{
						System.out.println(content.get(i));
					}
					break;
				}	
				case 2:
				{
					System.out.println("Enter no:");
					long num= sc.nextLong();
					for(int i=0;i<counter;i++) 
					{
						long i1=content.get(i).no;
					 	if(i1==num)
					 	{
					 		System.out.println(content.get(i));
					 	}
					}
					break;
				}	
				case 3:
				{
					System.out.println("Enter Name:");
					sc.nextLine();
					String myName= sc.nextLine();
					for(int i=0;i<counter;i++) 
					{
						String s1 = content.get(i).name;
						if(s1.equalsIgnoreCase(myName))  //equalsIgnoreCase is used to compare two strings and ignoring case differences.If the strings are equal, equalsIgnoreCase() returns true. If not, it returns false.
					 	{
					 	{
					 		System.out.println(content.get(i));
					 	}
					}
					 break;
				}			
				case 4:
				{
					System.out.println("Enter City name:");
					sc.nextLine(); 
					String myCity= sc.nextLine();
					for(int i=0;i<counter;i++) 
					{
						String s1 = content.get(i).city;
						if(s1.equalsIgnoreCase(myCity))  //equalsIgnoreCase is used to compare two strings and ignoring case differences.If the strings are equal, equalsIgnoreCase() returns true. If not, it returns false.
					 	{
					 		System.out.println(content.get(i));
					 	}
					}
					 break;
					
				}	
				case 5: 
				{
					System.out.println("Enter No which Name you want to changed : ");
					long chnum= sc.nextLong();
					System.out.println("Enter Name which you want to update:");
					String changename= sc.next();
					for(int i=0;i<counter;i++)
					{
						long chnum1 = content.get(i).no;
						if(chnum1==chnum)
					 	{
							String st3 = changename;
							String st4 = content.get(i).city;
							content.set(i,new Telephone(chnum1,st3,st4));	
						}	
					}
					FileWriter fw = new FileWriter("content.txt");	
					for(int i=0;i<counter;i++)
					{
						String store = (content.get(i)).toString();
						fw.write(store);
						fw.write("\n");
					}
					fw.close();
					break;
				}
				case 6:
				{
					System.out.println("Enter no you want to be change by city: ");
					long chnum2= sc.nextLong();
					System.out.println("Enter Name which you want to update:");
					sc.nextLine();
					String changeCity= sc.nextLine();
					for(int i=0;i<counter;i++)
					{
						long chnum3 = content.get(i).no; 
						if(chnum3==chnum2)
						{
							String st5 = changeCity;
							String st6 = content.get(i).name;
							content.set(i,new Telephone(chnum3,st6,st5));	
						}
						FileWriter fw = new FileWriter("content.txt");
						for(int j=0;j<counter;j++)
						{
							String store2 = (content.get(j)).toString();
							fw.write(store2);
							fw.write("\n");
						}
						fw.close();
					}
					break;
				}	
				case 7:
				{
					exit=true;
				}
				break;
				default:
				{
					System.out.println("Record Not Found");
				}
			}
			
		}while(!exit);  
	}
}