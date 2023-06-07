package Lesson25;

public class BSTMain {
    public static void main(String[] args) {
        BST tree = new BST(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        BST.print(tree.root);
        System.out.println(tree.search(5));

        System.out.println(BST.leaves(tree.root));
        System.out.println(BST.height(tree.root));

        tree.sum(8);
        

    }
}
