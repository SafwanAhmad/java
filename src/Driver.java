import javax.swing.text.Position;
import java.io.*;

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

        BinaryTree leftLeft = new BinaryTree(3);
        BinaryTree leftRight = new BinaryTree(4);

        BinaryTree rightLeft = new BinaryTree(5);
        BinaryTree rightRight = new BinaryTree(6);

        root.setLeft(left);
        root.setRight(right);

        left.setLeft(leftLeft);
        left.setRight(leftRight);

        right.setLeft(rightLeft);
        right.setRight(rightRight);

        traverse(root);
        root.serialize("obj.txt");

        BinaryTree newTree = BinaryTree.deSerialize("obj.txt");
        traverse(newTree);

    }

    public static void traverse(BinaryTree obj)
    {
        if(obj != null)
        {
            System.out.print(obj.toString() + " ");
            traverse(obj.getLeft());
            traverse(obj.getRight());
        }
    }


}
