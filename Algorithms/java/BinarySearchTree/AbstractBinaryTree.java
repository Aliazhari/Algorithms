package BinarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
	
	private class ElementIterator implements Iterator<E> {
		Iterator<Position<E>> inorderIterator = positions().iterator();
		public boolean hasNext() { return inorderIterator.hasNext(); }
		public E next() { return inorderIterator.next().getElement(); }
		
	}
	
	/** Returns an iterator of the elements stored in the tree */
	public Iterator<E> iterator() { return new ElementIterator(); } 

	private void inorderSubtree(Position<E> p, List<Position<E>> snapshot) {
		if (left(p) != null)
			// if (left(p) != null)
			inorderSubtree(left(p), snapshot);
		snapshot.add(p);
		if (right(p) != null)
			inorderSubtree(right(p), snapshot);
	}
	
	

	// This method is copied directly from the textbook
	public Iterable<Position<E>> inorder() {
		List<Position<E>> snapshot = new ArrayList<>();
		if (!isEmpty())
			inorderSubtree(root(), snapshot);
		return snapshot;
	}
	
	public Iterable<Position<E>> positions() { return inorder(); }
	
	public Position<E> sibling(Position<E> p) {
		Position<E> parent = parent(p);
		if(parent == null) return null;
		if(p == left(parent)) return right(parent);
		else return left(parent);
	}
	
	public int numChildren(Position<E> p) {
		int count = 0;
		if(left(p) != null) count++;
		if(right(p) != null) count++;
		
		return count;
	}
	
	public Iterable<Position<E>> children(Position<E> p) {
		List<Position<E>> snapshot = new ArrayList<>(2);
		if(left(p) != null) snapshot.add(left(p));
		if(right(p) != null) snapshot.add(right(p));
		
		return snapshot;
		
	}
}
