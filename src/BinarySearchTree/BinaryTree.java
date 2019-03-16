package BinarySearchTree;

/**
 * @File BinaryTree.java
 * 
 * @author Ali Azhari

 * @param <E>
 */
public interface BinaryTree<E> extends Tree<E>{
	
	Position<E> left(Position<E> p)  throws IllegalArgumentException;
	Position<E> right(Position<E> p)  throws IllegalArgumentException;
	Position<E> sibling(Position<E> p)  throws IllegalArgumentException;

}
