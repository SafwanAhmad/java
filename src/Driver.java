/**
 * Created by safwanx on 11/28/15.
 */
public class Driver {

    public static void main(String... args)
    {
        BinaryTree root = new BinaryTree(0); //Autoboxing by java compiler for int type to Integer Object.

        //Add one children
        BinaryTree left = new BinaryTree(1);

        //Add second child
        BinaryTree right = new BinaryTree(2);

        root.setLeft(left);
        root.setRight(right);
    }
}
