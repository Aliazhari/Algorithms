package BinarySearchTree;

/**
 * @File AbstractTree.java
 * 
 * @author Ali Azhari

 * @param <E>
 */
public abstract class AbstractTree<E> implements Tree<E>{
	
	public boolean isInternal(Position<E> p) { return numChildren(p) > 0; }
	public boolean isExternal(Position<E> p) { return numChildren(p) == 0; }
	public boolean isRoot(Position<E> p) { return p == root(); }
	public boolean isEmpty() { return size() == 0; }
	
	
	/**
	 * @param p
	 * @return
	 * 
	 * If p is the root,the depth of p is 0.
	 * Otherwise, the depth of p is one plus the depth of its parent.
	 */
	public int depth(Position<E> p) {
		if (isRoot(p))
			return 0;
		else
			return 1 + depth(parent(p));
	}
	
	/**
	 * @param p
	 * @return
	 * 
	 * The height of a tree is the length of the longest path from the root downward to an external node.
	 */
	public int height(Position<E> p) {
		int h = 0;
		for(Position<E> c : children(p))
			h = Math.max(h,  1+ height(c));
		return h;
	}

}
