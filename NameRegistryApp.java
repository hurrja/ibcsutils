import java.util.Scanner;

public class NameRegistryApp
{
  public static void main (String[] args)
  {
    final int MAX_NAMES = 500;
    NameRegister nameRegister = new NameRegister (MAX_NAMES);
    
    try (DataSource dataSource = new DataSource ())
    {
      UserInterface ui = new UserInterface (dataSource, nameRegister);
      if (ui == null)
        System.out.println ("What?");
      else
        ui.run ();
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }
}

class DataSource implements AutoCloseable
{
  DataSource ()
  {
    scanner = new Scanner (System.in);
  }

  String readInput ()
  {
    if (scanner.hasNextLine ())
      return scanner.nextLine ();
    else
      return "";
  }

  public void close ()
  {
    scanner.close ();
  }

  private Scanner scanner;
}

class UserInterface
{
  UserInterface (DataSource dataSource, NameRegister nameRegister)
  {
    this.dataSource = dataSource;
    this.nameRegister = nameRegister;
  }

  void run ()
  {
    // code to be written here
  }

  private DataSource dataSource;
  private NameRegister nameRegister;
}

class NameRegister
{
  NameRegister (int maxNames)
  {
    // code to be written here
  }

  void addName (String name)
  {
  }

  String listNames ()
  {
    return "";
  }
}
