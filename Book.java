package ibcsutils;

public class Book
{
  public Book (String title, String[] authors, int publicationYear)
  {
    this.title = title;
    this.authors = authors;
    this.publicationYear = publicationYear;
  }

  public String toString ()
  {
    StringBuffer strBuffer = new StringBuffer ();
    int numAuth = authors.length;
    for (int i = 0; i < numAuth; i = i + 1)
    {
      strBuffer.append (authors [i]);
      if (i != numAuth - 1)
        strBuffer.append (" & ");
    }
    strBuffer.append (": " + title + " ");
    strBuffer.append ("(" + publicationYear + ")");

    return strBuffer.toString ();
  }
  
  public String getTitle ()
  {
    return title;
  }

  public String[] getAuthors ()
  {
    return authors;
  }

  public int getPublicationYear ()
  {
    return publicationYear;
  }

  public int numAuthors ()
  {
    return authors.length;
  }

  public boolean newerThan (Book book)
  {
    return publicationYear > book.getPublicationYear ();
  }

  private String title;
  private String[] authors;
  private int publicationYear;
}
