import java.util.*;
class bookshopmethods
{
     Scanner in = new Scanner(System.in);
     int n=2;
     String[] title = new String[n];
     String[] author = new String[n];
     String[] publisher = new String[n];
     int[] cost = new int[n];
     int[] count = new int[n];
     void setdata()
      {
        for(int i=0;i < n;i++)
         {
            System.out.println("Enter the title of the " + (i+1) +" book:");
            title[i] = in.nextLine();
            System.out.println("Enter the author of the " + (i+1) +" book:");
            author[i] = in.nextLine();
            System.out.println("Enter the publisher of the " + (i+1) +" book:");
            publisher[i] = in.nextLine();
            System.out.println("Enter the cost of the " + (i+1) + " book:");
            cost[i]=in.nextInt();
            System.out.println("Enter the number of books present in the Book shop:");
            count[i]=in.nextInt();
            in.nextLine();
         }//end of for loop
      }//end of setdata function
      void search()
      {
        int i;
        System.out.println("***********Books present in the Book shop are*************"); 
        for(i=0;i<n;i++)
         {
           System.out.println((i+1) + ". Title of the book:" +title[i]);
          }
        System.out.println("Enter the title of the book needed:");
        String titkey;
        titkey = in.nextLine(); 
        int flag=0;
        for(i=0;i<n;i++)
        {
           
           if(titkey.equals(title[i]))
             {
               flag++;
               break;
             }// end of if condition
         }// end of for loop
         if(flag != 0)
         {
              System.out.println("******Details of the book you needed is*****");
              System.out.println("Title of the book:"+title[i]);
              System.out.println("Author of the book:"+author[i]);
              System.out.println("Publisher of the book:"+publisher[i]);
              System.out.println("Cost of the book:"+cost[i]);
              System.out.println("Number of books presernt in the Book shop:"+count[i]);
         }//end of if condition
        else
             System.out.println("Book not present in the store");
   }//end of search function
}//end of class
class cc3
{
  public static void main(String arg[])
    {
          int ch;
          bookshopmethods ob = new bookshopmethods();
          Scanner in = new Scanner(System.in);
          while(true)
            {
              System.out.println("********************MENU IS****************");
              System.out.println("\t\t1.To enter the data\n\t\t2.To search a book\n\t\t3.Exit"); 

             System.out.println("Enter your choice from the above menu:");
              ch = in.nextInt();
              switch(ch)
               {
                  case 1: ob.setdata();
                              break;
                  case 2: ob.search();
                           break;
                  case 3: System.exit(0);
               }//end of switch case
             }// end of while loop
 }//end of main function
}// end of class

/*
********************MENU IS****************
                1.To enter the data
                2.To search a book
                3.Exit
Enter your choice from the above menu:
1
Enter the title of the 1 book:
merchant of venice
Enter the author of the 1 book:
shakespare
Enter the publisher of the 1 book:
balbharti
Enter the cost of the 1 book:
354
Enter the number of books present in the Book shop:
34
Enter the title of the 2 book:
the alchemist
Enter the author of the 2 book:
shivang
Enter the publisher of the 2 book:
neon
Enter the cost of the 2 book:
200
Enter the number of books present in the Book shop:
12
********************MENU IS****************
                1.To enter the data
                2.To search a book
                3.Exit
Enter your choice from the above menu:
2
***********Books present in the Book shop are*************
1. Title of the book:merchant of venice
2. Title of the book:the alchemist
Enter the title of the book needed:
the alchemist
******Details of the book you needed is*****
Title of the book:the alchemist
Author of the book:shivang
Publisher of the book:neon
Cost of the book:200
Number of books presernt in the Book shop:12
********************MENU IS****************
                1.To enter the data
                2.To search a book
                3.Exit
Enter your choice from the above menu:
3

*/
