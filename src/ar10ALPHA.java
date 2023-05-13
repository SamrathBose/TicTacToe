
import java.util.*;
public class ar10ALPHA
{
    Scanner sc=new Scanner(System.in);
    int i;
    int j;
    int a[][]=new int[3][3];
    char b[][]=new char[3][3];
    char win;
    ar10ALPHA()
    { i=0;
      j=0;
      win='\u0000';
    }
    void tutorial()
    { 
        System.out.println("Welcome to TTT");
        System.out.println("Positions on board are");
        int n=1;
        for(i=0;i<3;i++)
        {  for(j=0;j<3;j++)
            { a[i][j]=n;
                if(j==2)
                System.out.print(a[i][j]+"\n");
                else
                System.out.print(a[i][j]+"\t");
                n=n+1;
            }
        }
        System.out.println("X starts first");
        
    }
    void play()
    {   char x='_';
        int flag=0;
        System.out.println("Board looks like this");
        for(i=0;i<3;i++)
        {  for(j=0;j<3;j++)
            { b[i][j]=x;
                if(j==2)
                System.out.print(b[i][j]+"\n");
                else
                System.out.print(b[i][j]+"\t");
                
            }
        }
        
        for(int q=0;q<9;q++)
        {  if(q%2==0)
            { 
        System.out.println("Enter positional value for player X ");
        System.out.println("Enter 10 to end the game");
        int p=sc.nextInt();
        char win;
          switch(p)
          {   case 1:
                     b[0][0]='X';
                     break;
               case 2:
                     b[0][1]='X';
                     break;
               case 3:
                     b[0][2]='X';
                     break;      
               case 4:
                     b[1][0]='X';
                     break;
               case 5:
                     b[1][1]='X';
                     break;
               case 6:
                     b[1][2]='X';
                     break;
               case 7:
                     b[2][0]='X';
                     break;
               case 8:
                     b[2][1]='X';
                     break;
               case 9:
                     b[2][2]='X';
                     break;
               case 10: win='n';
                       if(b[0][0]==b[0][1]&& b[0][1]==b[0][2])
                        {  flag=1;
                        win=b[0][0];}
                        else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[2][0]==b[2][1]&& b[2][1]==b[2][2])
                        {  flag=1;
                        win=b[2][0];}
                         else if(b[0][0]==b[1][1]&& b[1][1]==b[2][2])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[1][2]==b[1][1]&& b[1][1]==b[2][0])
                        {  flag=1;
                        win=b[1][2];}
                         else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[0][0]==b[1][0]&& b[1][0]==b[2][0])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[0][1]==b[1][1]&& b[1][1]==b[2][1])
                        {  flag=1;
                        win=b[0][1];}
                         else if(b[0][2]==b[1][2]&& b[1][2]==b[2][2])
                        {  flag=1;
                        win=b[0][2];}
                        if(flag==1)
                        { System.out.println(win+"  is the winner ;))))");
                        }
                        else System.out.println("Good game, try again <)");
                        System.exit(0);
           }}
           
           else
           {  System.out.println("Enter positional value for O");
        System.out.println("Enter 10 to end the game");
        int p=sc.nextInt();
        char win;
          switch(p)
          {   case 1:
                     b[0][0]='O';
                     break;
               case 2:
                     b[0][1]='O';
                     break;
               case 3:
                     b[0][2]='O';
                     break;      
               case 4:
                     b[1][0]='O';
                     break;
               case 5:
                     b[1][1]='O';
                     break;
               case 6:
                     b[1][2]='O';
                     break;
               case 7:
                     b[2][0]='O';
                     break;
               case 8:
                     b[2][1]='O';
                     break;
               case 9:
                       b[2][2]='O';
                     break;
               case 10: win='n';
                       if(b[0][0]==b[0][1]&& b[0][1]==b[0][2])
                        {  flag=1;
                        win=b[0][0];}
                        else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[2][0]==b[2][1]&& b[2][1]==b[2][2])
                        {  flag=1;
                        win=b[2][0];}
                         else if(b[0][0]==b[1][1]&& b[1][1]==b[2][2])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[1][2]==b[1][1]&& b[1][1]==b[2][0])
                        {  flag=1;
                        win=b[1][2];}
                         else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[0][0]==b[1][0]&& b[1][0]==b[2][0])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[0][1]==b[1][1]&& b[1][1]==b[2][1])
                        {  flag=1;
                        win=b[0][1];}
                         else if(b[0][2]==b[1][2]&& b[1][2]==b[2][2])
                        {  flag=1;
                        win=b[0][2];}
                        if(flag==1)
                        { System.out.println(win+"  is the winner ;))))");
                        }
                        else System.out.println("Good game, try again <)");
                        System.exit(0);
           }}
           System.out.println("New board state");
        for(i=0;i<3;i++)
        {  for(j=0;j<3;j++)
            { 
                if(j==2)
                System.out.print(b[i][j]+"\n");
                else
                System.out.print(b[i][j]+"\t");
                
            }
        }
        }
        if(b[0][0]==b[0][1]&& b[0][1]==b[0][2])
                        {  flag=1;
                        win=b[0][0];}
                        else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[2][0]==b[2][1]&& b[2][1]==b[2][2])
                        {  flag=1;
                        win=b[2][0];}
                         else if(b[0][0]==b[1][1]&& b[1][1]==b[2][2])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[1][2]==b[1][1]&& b[1][1]==b[2][0])
                        {  flag=1;
                        win=b[1][2];}
                         else if(b[1][0]==b[1][1]&& b[1][1]==b[1][2])
                        {  flag=1;
                        win=b[1][0];}
                         else if(b[0][0]==b[1][0]&& b[1][0]==b[2][0])
                        {  flag=1;
                        win=b[0][0];}
                         else if(b[0][1]==b[1][1]&& b[1][1]==b[2][1])
                        {  flag=1;
                        win=b[0][1];}
                         else if(b[0][2]==b[1][2]&& b[1][2]==b[2][2])
                        {  flag=1;
                        win=b[0][2];}
                        if(flag==1)
                        { System.out.println(win+"  is the winner ;))))");
                        }
                        else System.out.println("Good game, try again <)");
                        System.exit(0);
           }
  
  void winner()
  {    
      
      
      
      
  }
    public static void main()
    {  
       ar10ALPHA obj=new ar10ALPHA();
       obj.tutorial();
       obj.play();
       obj.winner();
    }
}
                
                
