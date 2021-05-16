package Menu;

public class Archivo {

    public static class Node<E> {

        private String archivos;

        private Node<E> left;
        private Node<E> right;

        public Node(String archivos) {
            this.archivos = archivos;
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

        public void insert(String archivos) {
            if (archivos.compareTo(Node.this.archivos) < 0) {
                if (this.left != null) {
                    this.left.insert(archivos);
                } else {
                    System.out.println(" Inserted " + archivos + " to left of " + this.archivos);
                    this.left = new Node(archivos);
                }
            } else if (archivos.compareTo(Node.this.archivos) > 0) {
                if (this.right != null) {
                    this.right.insert(archivos);
                } else {
                    System.out.println("  Inserted " + archivos + " to right of " + this.archivos);
                    this.right = new Node(archivos);
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
            System.out.println(archivos);
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
            System.out.println(archivos);
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
            System.out.println(archivos);
        }
    }
}
