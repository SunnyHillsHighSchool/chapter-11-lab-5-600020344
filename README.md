# Chapter-11-Lab-5


An ISBN (International Standard Book Number) has ten digits. The first
nine digits may have values from “O' to ‘9'; they identify the country in
which the book was printed, the publisher, and the individual book. The
tenth digit is a “check digit” assigned in such a way that the number
d(1)d(2)d(3)d(4)d(5)d(6)d(7)d(8)d(9)d(10) has the property:

(10d(1)+9d(2)+8d(3)+7d(4)+6d(5)+5d(6)+4d(7)+3d(8)+2d(9)+d(10) mod 11 = 0

“mod” stands for modulo division (same as % in Java). If d10 needs the value
10 to balance the check digit equation, then the character ‘X’ is used. For
example, 096548534X is a valid ISBN.

Note that if we simply took the sum of all the digits, the check digit would
remain valid for any permutation of the digits. Different coefficients make
the number invalid when any two digits are swapped, catching a common
typo.

Write a method

public static boolean isValidISBN (String isbn)

that returns true if isbn represents a valid ISBN, false otherwise. Test
your method in a simple applet or application. Hint: the Character class
has the static int method digit(char ch, int base) that returns the
numeric value of the digit in the specified base. For example,
Character.digit('7',10) returns 7. 
