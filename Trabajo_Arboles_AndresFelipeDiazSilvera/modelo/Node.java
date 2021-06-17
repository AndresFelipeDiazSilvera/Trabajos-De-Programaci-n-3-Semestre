package modelo.USTA.modelo;

public class Node<E>{

    private  String juegos;

    private Node<E> left;
    private Node<E> right;

    public Node(String juegos){
        this.juegos = juegos;
        left = null;
        right = null;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public void insert(String juegos) {
        if (juegos.compareTo(Node.this.juegos) < 0)
        {
            if (this.left != null)
            {
                this.left.insert(juegos);
            } else
            {
                System.out.println(" Inserted " + juegos + " to left of " + this.juegos);
                this.left = new Node(juegos);
            }
        } else if (juegos.compareTo(Node.this.juegos) > 0)
        {
            if (this.right != null) {
                this.right.insert(juegos);
            } else {
                System.out.println("  Inserted " + juegos + " to right of " + this.juegos);
                this.right = new Node(juegos);
            }
        }
    }

    public int size() {
        int size = 1;
        if (left != null) {
            size += left.size();
        }
        if (right != null) {
            size += right.size();
        }
        return size;
    }

    public int height() {
        int hl = -1;
        int hr = -1;
        if (left != null) {
            hl = left.height();
        }
        if (right != null) {
            hr = right.height();
        }
        return 1 + Math.max(hl, hr);
    }

    public void preorder() {
        System.out.println(juegos);
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.println(juegos);
        if (right != null) {
            right.inorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.postorder();
        }
        if (right != null) {
            right.postorder();
        }
        System.out.println(juegos);
    }
}
