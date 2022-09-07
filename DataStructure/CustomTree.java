package DataStructure;

public class CustomTree {

    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static class BinaryTree{
        int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if (nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        private void preorderTraversal(Node root){
            Node node = root;
            while (node != null){
                System.out.println(node.data);
                node = node.left;
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorderTraversal(root);
    }
}