public class Book
{
  
  public static boolean isValidISBN(String isbn)
  {
    
    //add your code here
    if (isbn.length()!=10)
      return false;
    for (int i = 0; i<isbn.length()-1; i++)
    {
      if (!(Character.isDigit(isbn.charAt(i))))
        return false;
    }    
    if(!(Character.isDigit(isbn.charAt(9)) || isbn.charAt(9)=='X'))
        return false;
    int sum = 0;
    for (int j = 0; j<isbn.length()-1;j++)
    {
      sum+=(Character.getNumericValue(isbn.charAt(j)) * (10-j));
    }
    if (isbn.charAt(9)=='X')
      sum+=10;
    else
      sum+=Character.getNumericValue(isbn.charAt(9));
    if (sum%11==0)
      return true;
    return false;
  }
}
