import java.util.ArrayList;
import java.util.LinkedList;

public class Tree<E> {
  Node<E> root;

  public Tree() {
    this.root = null;
  }

  public Tree(Node<E> root) {
    this.root = root;
  }

  public void addAtNextOpenSpot(E value) {
      Node<E> newNode = new Node<>(value, null, null);
      if (this.root == null) {
          this.root = newNode;
          return;
      }
      LinkedList<Node<E>> nodesToCheck = new LinkedList<>();
      nodesToCheck.addLast(this.root);
      while(true) {
          Node<E> current = nodesToCheck.removeFirst();
          if(current.left == null) {
              current.left = newNode;
              return;
          } else if (current.right == null) {
              current.right = newNode;
              return;
          } else {
              nodesToCheck.addLast(current.left);
              nodesToCheck.addLast(current.right);
          }
      }
  }

  public static void main(String[] args) {
    //     3
    //    / \
    //   2   6
    //  /
    // 7
    // 7, 2, 3, 6
    // Node<Integer> node7 = new Node<>(7, null, null);
    // Node<Integer> node2 = new Node<>(2, node7, null);
    
    // // note: nodes does not use the above-created nodes
    // // it's okay
    // Node<Object> nodes = new Node<>(3,
    //   new Node<>(2, 
    //     new Node<>(7, null, null),
    //     null),
    //   new Node<>(6, null, null)
    // );
    Tree<Object> t = new Tree<>();
    t.addAtNextOpenSpot(3);
    t.addAtNextOpenSpot(2);
    t.addAtNextOpenSpot(6);
    t.addAtNextOpenSpot(7);
    System.out.println(t.inorder());

    // BinarySearchTree t = new BinarySearchTree();
    // //   5
    // //  / \
    // // 3   7
    // // /
    // // 1
    // t.addRec(5);
    // t.addRec(3);
    // t.addRec(1);
    // t.addRec(7);
    // System.out.println(t.inorder());
  }

  public ArrayList<E> inorder() {
    return inorder(this.root);
  }

  private ArrayList<E> inorder(Node<E> current) {
    // base case: current node is null
    if (current == null) {
      return new ArrayList<E>();
    } else {
      ArrayList<E> leftAns = inorder(current.left);
      ArrayList<E> rightAns = inorder(current.right);

      ArrayList<E> ans = new ArrayList<>();
      ans.addAll(leftAns);
      ans.add(current.value);
      ans.addAll(rightAns);
      return ans;
    }
  }
}

class BinarySearchTree extends Tree<Integer> {
    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(int firstValue) {
        super(new Node(firstValue, null, null));
    }

    public void add(int numberToAdd) {
        if (this.root == null) {
            this.root = new Node<>(numberToAdd, null, null);
        } else {
            Node<Integer> current = this.root;
            while(current != null) {
                if(numberToAdd < current.value) {
                    // it belongs on the left
                    if(current.left == null) {
                        // put it in that spot!
                        current.left = new Node<>(numberToAdd, null, null);
                        return;
                    } else {
                        current = current.left;
                    }
                } else {
                    // it belongs on the right
                    if(current.right == null) {
                        current.right = new Node<>(numberToAdd, null, null);
                        return;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public void addRec(int numberToAdd) {
        
        this.root = addRecFruitful(this.root, numberToAdd);
    }

    public Node<Integer> addRecFruitful(Node<Integer> current, int numberToAdd) {
        if (current == null) {
            return new Node(numberToAdd, null, null);
        } else {
            if (numberToAdd < current.value) {
                current.left = addRecFruitful(current.left, numberToAdd);
            } else if (numberToAdd > current.value) {
                current.right = addRecFruitful(current.right, numberToAdd);
            } else {
                // they were equal
                // do nothing
            }
            return current;
        }
    }

    private void addRec(Node<Integer> current, int numberToAdd) {
        if (numberToAdd < current.value) {
            if (current.left == null) {
                current.left = new Node(numberToAdd, null, null);
            } else {
                addRec(current.left, numberToAdd);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(numberToAdd, null, null);
            } else {
                addRec(current.right, numberToAdd);
            }
        }
    }
}

class Node<T> {
  T value;
  Node<T> left;
  Node<T> right;

  public Node() {
    this.value = null;
    this.left = null;
    this.right = null;
  }

  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}
