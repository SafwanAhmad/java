/**
 * Created by safwanx on 11/28/15.
 */
public class BinaryTree <T> {

    private BinaryTree<T>  left;
    private BinaryTree<T> right;
    private T data;

    public BinaryTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }


    public BinaryTree(BinaryTree<T> left, BinaryTree<T> right, T data)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }


    public BinaryTree(T data)
    {
        this(null,null,data);
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

}
