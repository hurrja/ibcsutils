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
// Static function for reading text (words) from the web via a given
// url.

package ibcsutils;

import java.util.Scanner;
import java.net.URL; 
import java.util.ArrayList;

public class ReadViaURL
{
  public static String[] readWords (String urlAddress)
  {
    ArrayList<String> wordList = new ArrayList<> ();
    try
    {
      URL url = new URL (urlAddress);

      try (Scanner input = new Scanner (url.openStream ()))
      {
        while (input.hasNext ())
          wordList.add (input.next ());
               
      }
      catch (Exception e)
      {
        System.out.println ("got exception: " + e);
        System.exit (1);
      }
    }
    catch (Exception e)
    {
      System.out.println ("got exception: " + e);
      System.exit (1);
    }
    return wordList.toArray (new String [0]);
  }
}
