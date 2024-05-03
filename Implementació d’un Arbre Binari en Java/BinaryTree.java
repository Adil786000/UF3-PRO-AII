public class BinaryTree {

  private static int instances = 0;
  private Node root;
  private int depth;

  public BinaryTree(int depth){
    instances++;
    this.depth = depth;
  }


}