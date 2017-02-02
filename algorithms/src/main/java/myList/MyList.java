package myList;

public class MyList {
	
	MyNode mHead;
	int mListSize = 0;
	
	public void addAtFront(Object value) {
		MyNode newNode = new MyNode(value, mHead.getNext());
		mHead = newNode;
	}
	
	public void add(Object value) {
		MyNode newNode;
		if (mHead == null) {
			newNode = new MyNode(value, mHead);
			mHead = newNode;
		} else {
			MyNode tempNode = new MyNode(value, mHead.getNext());
			while (tempNode.getNext() != null) {
				tempNode.setNext(tempNode.getNext());
			}
			newNode = tempNode;
		}
	}
	
	public MyNode begin() {
		return mHead;
	}
	
	public void wypisz() {
		MyNode temp = begin();
		while (temp.getNext() != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
		
	}
	

}
