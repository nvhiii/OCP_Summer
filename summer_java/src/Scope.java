public class Scope {

    public static void main(String[] args) {

        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;

        String three = one;
        one = null;

    }

}

/*
 * Good example of scope because suppose one -> "a", two -> "b", one -> "b", therefore one does not point to "a"
 * Then three refers to one, which points to "b", then one -> null
 * Therefore "a" is eligible for garbage pickup after line 8
 * one, two, and three are all in scope until one turns null and the next curly brackets
 *
 */
