package ibcsutils;

public class Rot13
{ 
  public static char rotate (char c)
  {

    int mult = 0;
    
    if (c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M')
      mult = 1;
    else if  (c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z')
      mult = -1;

    return (char) (c + mult * 13);
  }
}
