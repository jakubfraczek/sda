package myList;

public class MyList {

	MyNode mHead = new MyNode();
	int mListSize = 0;
	
	private MyNode begin() {
		return mHead;
	}
	
	public MyNode last() {
		MyNode temp = begin();
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
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

	public void wypisz() {
		System.out.println("--------------------");
		MyNode temp = begin();
		for (int i = 1; i <= mListSize; i++) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}

	}

}
