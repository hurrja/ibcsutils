// Copyright (C) 2020 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

// ---------------------------------------------------------------------
// Class for single class practice.

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
