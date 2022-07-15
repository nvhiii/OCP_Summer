public class eatIfHungry {
    public static void main(String[] args) {

        eatIfHungry(true);

    }
    public static void eatIfHungry(boolean hungry) {

        boolean notHungry;

        if (hungry) {
            int bitesOfCheese = 1;
            System.out.println("Yummy cheese!");
            notHungry = true;

            // ^ take notice that notHungry was defined in a scope within the method, but in a higher hierarchy
            // This means that any smaller scopes can reference more general variables in the scope of the method
            

        }

        // bitesOfCheese has a much more "exclusive" variable scope
        // find var scope from inner most brackets to outer most

    }

}
