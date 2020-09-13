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
// Classes for practicing class relationships.

package ibcsutils;

public class ComputerStore
{
  public static void main (String[] args)
  {
    System.out.println ("Got to get business started.");
  }
}

class Order
{
}

class Warehouse
{
}

class Laptop
{
  public Laptop (String model, int price)
  {
    this.model = model;
    this.price = price;
  }
    
  public String model;
  public int price;
}
  
class Router
{
  public Router (String model, int price)
  {
    this.model = model;
    this.price = price;
  }
    
  public String model;
  public int price;
}
