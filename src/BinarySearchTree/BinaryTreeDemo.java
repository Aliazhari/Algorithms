package BinarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @File BinaryTreeDemo.java
 * 
 * @author Ali Azhari

 */
public class BinaryTreeDemo extends LinkedListBinaryTree<Integer> {

	/**
	 * Add a new node with e to the tree rooted at position p
	 * 
	 * @param p
	 *            The root of the tree to which new node is added
	 * @param e
	 *            The element of the new node
	 * @return If a node with e does not exist, a new node with e is added and
	 *         reference to the node is returned. If a node with e exists, null is
	 *         returned.
	 */
	public Position<Integer> add(Position<Integer> p, Integer element) {

		if (p == null) { // this is an empty tree
			// add a root and return it.
			return addRoot(element);
		}
		Position<Integer> currentNode = p;
		Position<Integer> parent = currentNode;
		while (currentNode != null) {
			if (currentNode.getElement().equals(element))
				return null;
			else if (currentNode.getElement() > element) {
				parent = currentNode;
				currentNode = left(currentNode);
			} else {
				parent = currentNode;
				currentNode = right(currentNode);
			}
		}
		// The following line is commented because there is no need to create a new
		// node. addLeft and addRight will do that.
		// Node<Integer> temp = createNode(e, (Node<Integer>) parent(p), (Node<Integer>)
		// left(p), (Node<Integer>) right(p));

		// add the element either to the left or to the right depending on the element.
		if (parent.getElement() > element)
			return addLeft(parent, element);
		else
			return addRight(parent, element);

	}

	/**
	 * Thes methods are supposed to be implemented in AbstractBinaryTree.java
	 * AbstractBinaryTree.java in the textbook does not implement them. But the
	 * textbook does talk about them. if the professor's copy has them implemented
	 * then this ones override them
	 */

	// This method copied directly from the textbook
	private void inorderSubtree(Position<Integer> p, List<Position<Integer>> snapshot) {
		if (left(p) != null)
			inorderSubtree(left(p), snapshot);
		snapshot.add(p);
		if (right(p) != null)
			inorderSubtree(right(p), snapshot);
	}

	// This method is copied directly from the textbook
	public Iterable<Position<Integer>> inorder() {
		List<Position<Integer>> snapshot = new ArrayList<>();
		if (!isEmpty())
			inorderSubtree(root(), snapshot);
		return snapshot;
	}

	public static void main(String[] args) {

		/**
		 * main method
		 * 
		 * 1- testing the add method
		 */

		// create a new binary tree instance
		BinaryTreeDemo t = new BinaryTreeDemo();

		// add some integers
		System.out.println("Testing the method add..");
		System.out.println("Adding: 10, 50, 150, 150, 70");
		t.add(t.root, 100);
		t.add(t.root, 50);
		t.add(t.root, 150);
		t.add(t.root, 150);
		t.add(t.root, 70);

		// print all integers in the tree in increasing order
		// after adding above four integers, the following should be printed
		// 50 70 100 150

		System.out.println("printing tree inorder...");
		Iterator<Position<Integer>> it = t.inorder().iterator();
		while (it.hasNext()) {
			System.out.print(it.next().getElement() + " ");
		}
		System.out.println("\n");
		/**
		 * 
		 *
		 * experimentally determine the average height of a binary search tree
		 * clear the tree before beginning this experiment
		 * repeat 100 times
         *
		 * for (int i= 0; i<maxIteration; i++){
		 * begin with an empty tree in each iteration
		 * generate 1000 random integers in the range [0, 999999]
		 * and add them to the tree, one at a time
		 * using the add method you implemented
		 * make sure the resulting tree has 1000 distinct integers
		 * determine the height of the resulting tree
		 * print the number of nodes and the the height of the tree
		 *
		*/

		System.out.println("Creating 100 trees of 1000 elements each..\n");
		int maxIteration = 100;
		int numNodes = 1000;
		// Average height of 100 trees of 1000 elements each
		double averageHeight = 0.0;
		// a variable to store the total heights of 100 trees.
		int totalHeight = 0;
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		// loop that runs 100 times to create 100 trees
		for (int i = 0; i < maxIteration; i++) {
			int height = 0;
			// create an empty tree
			BinaryTreeDemo aTree = new BinaryTreeDemo();

			// lopp that runs 1000 times to get 1000 distincts Integers
			for (int j = 0; j < numNodes; j++) {
				Integer e = r.nextInt(1000000);
				// add the Integer to the tree by calling the method add
				Position<Integer> temp = aTree.add(aTree.root(), e);

				// keep trying untill you get a distinct Integer that is not in the tree already
				while (temp == null) {
					System.out.println(e + " already exists");
					e = r.nextInt(1000);
					// it only add if the Integer is not in the tree, otherwise temp is null.
					
					// e = (e == 999999?1:e+1);
					temp = aTree.add(aTree.root(), e);

				} // while
			} // for int j

			// get the height of tree
			height = aTree.height(aTree.root());
			// add it to the total heights of previous trees
			totalHeight += height;
            System.out.println("\nThe tree number: " + (i+1));
			System.out.println("The number of node is: " + aTree.size());
			System.out.println("The height of tree: " + height);
			// System.out.print((i==0)?"(" + height+",":(i==99)?height+")":height+",");
		} // for int i
		 averageHeight = (double) totalHeight / (double) maxIteration;
		 System.out.println("\nThe average height is: " + averageHeight);

	}

}