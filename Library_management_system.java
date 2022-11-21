import java.lang.*;
import java.util.*;
public class Library_management_system
{
    public static void main(String[] args)
    {
        int work,book_availability;
        String sub;
        String book;
        Scanner sc = new Scanner(System.in);
        B_issue B_i = new B_issue();
        Issue_counter i1 = new Issue_counter();
        return_book_counter r1 = new return_book_counter();
        book_coll_management c3 = new book_coll_management();
        c3.add_book();
        System.out.println("wellcome to Aman's pustkaalay");
        System.out.println("Please enter 1 for book issue:");
        System.out.println("Please enter 2 for book return back:");
       // System.out.println("Please enter 3 for book book exchange:");
        work = sc.nextInt();
        if(work == 1)
        {
            System.out.println("Enter the subject of the book u want to issue");
            sub = sc.nextline();
            System.out.println("Enter the name  of the book u want to issue");
            book = sc.nextline();
            book_availability = B_i.Search_book(sub,book);
            if(book_availability==1)
            {
                i1.Coustmer_name = sc.nextline();
                i1.Contact_no = sc.nextline();
                i1.Address = sc.nextline();
                i1.Book_name = book;
                i1.Book_sub = sub;
                i1.issue_days = sc.nextInt();
                i1.Advance_amt = 500;
                i1.Ch_amt_per_day = 5;
                i1.issue_process();
                i1.Final_process();
                i1.set_chargeble_amt();
            }
        }
     else if(work == 2)
     {
          r1.coustmer_name = sc.nextline();
          r1.Book_name = sc.nextline();
          r1.Contact_no = sc.nextline();
          r1.return_process();   
     }
        System.out.println("thankyou for visiting");
    }
}


class B_issue
{
    int B_index;
    book_coll_management c1 = new book_coll_management();
    public int Search_book(String sub , String Book)
    {
        if(sub.equals("Maths"))
        {
            if(c1.Math_Book.contains(Book))
            {
                System.out.println("Yes this book is available in our library");
                System.out.println("please collect the book from issue counter");
                return 1;
            }
            else
            {
                System.out.println("This book is not available in our library");
                return 0;
            }
        }
        else if(sub.equals("Computer"))
        {
            if(c1.Computer_Book.contains(Book))
            {
                System.out.println("Yes this book is available in our library");
                System.out.println("please collect the book from issue counter");
                return 1;
            }
            else
            {
                System.out.println("This book is not available in our library");
                return 0;
            }
        }
        return 2;
    }
}

class Issue_counter
{
    String Coustmer_name;
    String Contact_no;
    String Address;
    String Book_name;
    String Book_sub;
    int issue_days;
    int Advance_amt;
    int Ch_amt_per_day;
    int Chargeable_amt;
    book_coll_management c1 = new book_coll_management();
    public void set_chargeble_amt()
    {
        this.Chargeable_amt = (this.Ch_amt_per_day*this.issue_days);
    }
    ArrayList<String> AL = new ArrayList<String>();
    HashMap<String,ArrayList<String>> hm_detail  =  new HashMap<String,ArrayList<String>>();
    HashMap<String, ArrayList<Integer>> hm_payment = new HashMap<String, ArrayList<Integer>>();

    public void issue_process()
    {
        hm_detail.put(this.Coustmer_name, new ArrayList<String>());
        hm_detail.get(this.Coustmer_name).add(this.Contact_no+"-"+this.Address+"-"+this.Book_name+"-"+this.Book_sub);
    }
    public void Final_process()
    {
        hm_payment.put(this.Coustmer_name,new ArrayList<Integer>());
        hm_payment.get(this.Coustmer_name).add(Integer.valueOf(this.issue_days+"-"+this.Advance_amt+"-"+this.Chargeable_amt));
        System.out.println("plesse complete the payment process and receive the book");
        c1.update_coll_status(1,this.Book_name,this.Book_sub);
    }

}

class return_book_counter
{
   String Coustmer_name;
   String Book_name;
   String Contact_no;
   Issue_counter o2 = new Issue_counter();
   public void return_process()
   {
     if(this.Contact_no.equals(o2.hm_detail.get(this.Coustmer_name)[0]) && this.Book_name.equals(o2.hm_detail.get(this.Coustmer_name)[2]))
     {
       System.out.println("yes your details has been checket");
       System.out.println("please  return book and wait for some time while the process is going on");
       System.out.println("please collect the remaining amount and the bill");
       System.out.println("thankyou  for choosing our library and  please visit again");
     }
     else
     {
       System.out.println("please enter the correct details");
       return;
     }
     hm_detail.remove(this.Coustmer_name);
     hm_payment.remove(this.coustmer_name);
   }
}
class book_coll_management
{
    //  ArrayList<String> avail_sub = new ArrayList<String>();
    ArrayList<String> Math_Book = new ArrayList<String>();
    ArrayList<String> Computer_Book = new ArrayList<String>();
    ArrayList<String> Electronics_Book = new ArrayList<String>();
    //avail_sub.add("Maths");
    //avail_sub.add("Computer");
    public void add_book()
    {
        Math_Book.add("Ramanna");
        Math_Book.add("Das");
        Math_Book.add("Grewal");
        Computer_Book.add("Kanetkar");
        Computer_Book.add("Thareja");
        Computer_Book.add("Gamma");
    
    }
    public void update_coll_status(int operation, String book_name, String book_sub)
    {
        if(operation==1)
        {
            if(book_sub.equals("Maths"))
            {
                Math_Book.add(book_name);
            }
            else if(book_sub.equals("Computer"))
            {
                Computer_Book.add(book_name);
            }
        }
        else
        {
            if(book_sub.equals("Maths"))
            {
                Math_Book.remove(book_name);
            }
            else if(book_sub.equals("Computer"))
            {
                Computer_Book.remove(book_name);
            }
        }
    }
    public void show_coll_status(String sub)
    {
        System.out.println("The books that are available right now for your desired subject is: :");
        if(sub.equals("Maths"))
        {
            for(String book : Math_Book)
            {
                System.out.println(book);
            }
        }
        else if(sub.equals("Computer"))
        {
            for(String book : Computer_Book)
            {
                System.out.println(book);
            }
        }
    }
}