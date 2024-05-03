public class BinaryTree {

  private static int instances = 0;
  private Node root;
  private int depth;

  public BinaryTree(int depth){
    instances++;
    this.depth = depth;
  }

  public static int getinstances(){
    return instances;
  }


  public void createintTree(){
    this.root = new Node(1);
    Node current = this.root;
    for (int i = 2; i <= this.depth; i++){
        current.right = new Node(i);
        current = current.right;
  }

}