public class Mouse {

    final static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {

        if (length < MAX_LENGTH) {

            int newSize = length + inches;
            length = newSize;

        }
    }

    public static void main(String[] args) {

        Mouse mickey = new Mouse();
        mickey.length = 4;

        mickey.grow(17);
        System.out.println(mickey.length);

    }

}
