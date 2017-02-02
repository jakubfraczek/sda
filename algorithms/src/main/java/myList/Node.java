package myList;

public class Node {
	
	Object mValue = null;
	Node mNext = null;
	
	public Object getValue() {
		return mValue;
	}
	public void setValue(Object mValue) {
		this.mValue = mValue;
	}
	public Node getNext() {
		return mNext;
	}
	public void setNext(Node mNext) {
		this.mNext = mNext;
	}

}
