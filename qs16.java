package workshop1;

public class qs16 {
    public static void main(String[] args) {

        // --- Logical AND ---
        boolean expr1 = (5 > 3);   // true
        boolean expr2 = (8 > 5);   // true
        System.out.println("=== Logical AND ===");
        System.out.println("expr1 = (5 > 3) -> " + expr1);
        System.out.println("expr2 = (8 > 5) -> " + expr2);
        System.out.println("expr1 && expr2  -> " + (expr1 && expr2));
        System.out.println();

        // --- Logical OR ---
        boolean expr3 = (5 > 3);   // true
        boolean expr4 = (2 > 5);   // false
        System.out.println("=== Logical OR ===");
        System.out.println("expr1 = (5 > 3) -> " + expr3);
        System.out.println("expr2 = (2 > 5) -> " + expr4);
        System.out.println("expr1 || expr2  -> " + (expr3 || expr4));
        System.out.println();

        // --- Logical NOT ---
        boolean expr5 = (!(5 == 10));
        System.out.println("=== Logical NOT ===");
        System.out.println("expr1 = !(5 == 10) -> " + expr5);
        System.out.println();

        // --- Comparison Operators ---
        int x = 5;
        int y = 10;
        System.out.println("=== Comparison Operators (x = " + x + ", y = " + y + ") ===");
        System.out.println("x == y  (Equal to)              -> " + (x == y));
        System.out.println("x != y  (Not equal to)          -> " + (x != y));
        System.out.println("x >  y  (Greater than)          -> " + (x > y));
        System.out.println("x <  y  (Less than)             -> " + (x < y));
        System.out.println("x >= y  (Greater than or equal) -> " + (x >= y));
        System.out.println("x <= y  (Less than or equal)    -> " + (x <= y));
    }
}
