package myList;

public class MyList {

	private MyNode mHead = new MyNode();
	private int mListSize = 0;

	public MyNode begin() {
		return mHead;
	}

	public MyNode last() {
		MyNode temp = begin();
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	public int length() {
		return mListSize;
	}

	public void addAtFront(Object value) {
		mListSize++;
		MyNode newNode = new MyNode(value, mHead.getNext());
		mHead = newNode;
	}

	public void add(Object value) {
		mListSize++;
		MyNode newNode;
		if (mHead.getValue() == null) {
			newNode = new MyNode(value, mHead.getNext());
			mHead = newNode;
		} else {
			newNode = new MyNode(value, last().getNext());
			last().setNext(newNode);
		}
	}

	public void clear() {
		mHead.setNext(null);
		mHead.setValue(null);
		mListSize = 0;
	}

	public void remove(int index) {
		if (index < 0 || index >= mListSize) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + mListSize);
		}
		MyNode beforeNode = findeNodeAtIndex(index - 1);
		beforeNode.setNext(findeNodeAtIndex(index + 1));
		mListSize--;
	}

	public void removeValue(int i) {
		// TODO Auto-generated method stub

	}

	public void removeAllOf(Object value) {
		// TODO Auto-generated method stub

	}

	public Object getValue(int index) {
		MyNode myNode = findeNodeAtIndex(index);
		return myNode.getValue();
	}

	public Object getValue(MyNode myNode) {
		return myNode.getValue();
	}

	private MyNode findeNodeAtIndex(int index) {
		MyNode temp = begin();
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void addAtIndex(int index, Object value) {
		MyNode temp = new MyNode(value, findeNodeAtIndex(index + 1));
		findeNodeAtIndex(index - 1).setNext(temp);
		mListSize++;
	}

	public int getIndexOf(Object value) {
		int index = 0;
		MyNode temp = mHead;
		while (temp != null) {
			if (value != temp.getValue()) {
				temp = temp.getNext();
			} else {
				return index;
			}
			index++;
		}
		return -1;
	}

	public MyList getAllIndexesOf(Object value) {
		int index = 0;
		MyList out = new MyList();
		MyNode temp = begin();
		while (temp != null) {
			if (temp.getValue().equals(value)) {
				out.add(index);
			}
			temp = temp.getNext();
			index++;
		}
		return out;
	}
}
