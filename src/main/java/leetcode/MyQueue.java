package leetcode;

class MyQueue {
	Element element;

	// Push element x to the back of queue.
	public void push(int x) {
		Element topElement = new Element(x);
		topElement.next = element;
		element = topElement;
	}

	// Removes the element from in front of queue.
	public void pop() {
        if (!empty())  {
        	if (element.next == null) {
        		element = null;
        	} else {
        		Element previous = element;
        		Element lastElement = element.next;
        		while (lastElement.next != null) {
        			previous = lastElement;
        			lastElement = lastElement.next;
        		}
        		previous.next = null;
        	}
        }
    }

	// Get the front element.
	public int peek() {
		if (empty()) {
			return 0;
		} else {
			Element cursor = element;
			while (cursor.next != null) {
				cursor = cursor.next;
			}
			return cursor.value;
		}

	}

	// Return whether the queue is empty.
	public boolean empty() {
		return element == null;
	}
}

class Element {
	public Element next;
	public int value;

	public Element(
			int value) {
		this.value = value;
		this.next = null;
	}
}