package myList;

public class MyNode {

	Object mValue = null;
	MyNode mNext = null;

	MyNode() {
	}

	MyNode(Object value, MyNode next) {
		mValue = value;
		mNext = next;
	}

	Object getValue() {
		return mValue;
	}

	void setValue(Object mValue) {
		this.mValue = mValue;
	}

	MyNode getNext() {
		return mNext;
	}

	void setNext(MyNode mNext) {
		this.mNext = mNext;
	}

}
