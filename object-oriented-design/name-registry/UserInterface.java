public class UserInterface
{
  public UserInterface (DataSource dataSource, NameRegister nameRegister)
  {
    this.dataSource = dataSource;
    this.nameRegister = nameRegister;
  }

  public void run ()
  {
    // application logic
    readNames ();
    printNames ();
  }

  // reads names from data source
  private void readNames ()
  {
    // code to be written here
  }

  // prints names, each name on a separate line
  private void printNames ()
  {
    // code to be written here
  }

  private DataSource dataSource;
  private NameRegister nameRegister;
}
