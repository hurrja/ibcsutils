import java.util.Scanner;

// application class
public class NameRegistryApp
{
  public static void main (String[] args)
  {
    final int MAX_NUM_NAMES = 500;
    NameRegister nameRegister = new NameRegister (MAX_NUM_NAMES);
    
    try (DataSource dataSource = new DataSource ())
    {
      UserInterface ui = new UserInterface (dataSource, nameRegister);
      ui.run ();
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }
}

// data source for reading names
class DataSource implements AutoCloseable
{
  DataSource ()
  {
    scanner = new Scanner (System.in);
  }

  // returns next line (name), return value is empty string if no more
  // names are available
  String readName ()
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
    // application logic
    readNames ();
    printNames ();
  }

  // reads names from data source
  void readNames ()
  {
    // code to be written here
  }

  // prints names, each name on a separate line
  void printNames ()
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

  // adds a new name to register
  void addName (String name)
  {
    // code to be written here
  }

  // return the number of names in registry
  int getNumNames ()
  {
    // code to be written here
    return 0;
  }
  
  // return numNames first names from registry as an array
  String[] getNames (int numNames)
  {
    // code to be written here
    return null;
  }
}
