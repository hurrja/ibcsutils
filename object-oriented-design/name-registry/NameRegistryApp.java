// application class
public class NameRegistryApp
{
  public static void main (String[] args)
  {
    NameRegister nameRegister = new NameRegister ();
    
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

