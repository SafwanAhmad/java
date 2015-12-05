import java.io.*;

/**
 * Created by safwanx on 11/28/15.
 */
public class BinaryTree <T> implements Serializable {

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

    public BinaryTree(String fileName)
    {
        deSerialize(fileName);
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
    public String toString()
    {
        return data.toString();
    }

    public void serialize(String fileName)
    {
        try {
            FileOutputStream fOut = new FileOutputStream(fileName);
            ObjectOutputStream Obj = new ObjectOutputStream(fOut);

            Obj.writeObject(this);
            Obj.flush();
            Obj.close();
            fOut.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public BinaryTree deSerialize(String fileName)
    {
        //Deserialize tree
        BinaryTree dObj =  null;
        try {
            FileInputStream fin = new FileInputStream("obj.txt");
            ObjectInputStream obj = new ObjectInputStream(fin);
            dObj = (BinaryTree)obj.readObject();
            fin.close();
            obj.close();
        }
        catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return dObj;
    }

}
