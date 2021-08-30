import java.util.Scanner;
class Election1
{
int votesCount1=0, votesCount2=0, votesCount3=0, votesCount4=0,votesCount5=0, spoiledtvotes=0;
Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
int i;
int choice;
Election1 E=new Election1();
Scanner sc=new Scanner(System.in);
do
{
System.out.println("\n ******* Welcome to Election/Voting *******");
System.out.println("\n 1. Cast the Vote");
System.out.println("\n 2. Find Vote Count");
System.out.println("\n 3. Find leading Candidate");
System.out.println("\n 4. Exit");

System.out.print("\n\n Please enter your choice : ");
choice=sc.nextInt();
switch(choice)
{
case 1: 
E.castVote();
break;
case 2: 
E.votesCount();
break;
case 3: 
E.getLeadingCandidate();
break;
case 4:
System.exit(0);
default: 
System.out.println("\n Error: Invalid Choice");
}
}while(choice!=0);
}

void castVote()
{
int choice;    
System.out.println("***** Please choose your Candidate *****");
System.out.println(" 1. Nahida ");
System.out.println(" 2. Nahidu");
System.out.println(" 3. Mahira");
System.out.println(" 4. Nida");
System.out.println(" 5. Nafisa");
System.out.println(" 6. None of These");
System.out.println(" Whom you want to vote");
System.out.println(" Enter your choice(1 - 5) : ");
choice=sc.nextInt();

switch(choice)
{
    case 1: 
	votesCount1++; 
	break;
    case 2: 
	votesCount2++; 
	break;
    case 3: 	
	votesCount3++; 
	break;
    case 4: 
	votesCount4++; 
	break;
    case 5: 
	votesCount5++; 
	break;
    	
    case 6: 
	spoiledtvotes++; 
	break;
    default: 
	System.out.println("\n Error: Wrong Choice !! Please retry");
}
System.out.println("Thanks for vote !!");
}

void votesCount()
{
System.out.println(" ***** Voting Statics *****");
System.out.println("\n Nahida\n\n" +votesCount1);
System.out.println("\nNahidu\n\n" +votesCount2);
System.out.println("\n Mahira\n\n" +votesCount3);
System.out.println("\n Nida\n\n" +votesCount4);
System.out.println("\n Nafisa\n\n" +votesCount5);
//System.out.println(" Nota" +votesCount6);

System.out.println("Invalid choice"+spoiledtvotes); 
}

void getLeadingCandidate()
{
 System.out.println(" **** Leading Candiate ****");
if(votesCount1>votesCount2 && votesCount1>votesCount3 && votesCount1 >votesCount4 && votesCount1 >votesCount5 )
    System.out.println("\n\nThe winner is:Nahida");
    else if (votesCount2>votesCount3 && votesCount2>votesCount4 && votesCount2 >votesCount1 && votesCount2 >votesCount5 )
    System.out.println("\n\nThe winner is:Nahidu");
    else if(votesCount3>votesCount4 && votesCount3>votesCount2 && votesCount3 >votesCount1 && votesCount3 >votesCount5 )
    System.out.println("\n\nThe winner is:Mahira");
    else if(votesCount4>votesCount1 && votesCount4>votesCount2 && votesCount4 >votesCount3 && votesCount4 >votesCount5 )
    System.out.println("\n\nThe winner is:Nida");
    else if(votesCount5>votesCount1 && votesCount5>votesCount2 && votesCount5 >votesCount3 && votesCount5 >votesCount4)
    System.out.println("\n\nThe winner is:Nafisa");
    else
    System.out.println("----- Warning !!! No-win situation----");    
       
}

}