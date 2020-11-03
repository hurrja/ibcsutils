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

