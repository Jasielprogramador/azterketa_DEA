package ariketa3;

public class BinaryTreeNode<T> {
	
	private T[] balioak;
	private BinaryTreeNode<T>[] umeak;


	public T[] getBalioak() {
		return balioak;
	}

	public void setBalioak(T[] balioak) {
		this.balioak = balioak;
	}

	public BinaryTreeNode<T>[] getUmeak() {
		return umeak;
	}

	public void setUmeak(BinaryTreeNode<T>[] umeak) {
		this.umeak = umeak;
	}
}
