package Trabalho1;

public class LinkedListOfAcidente {
	private class Node {
		public Acidente acidente;
		public Node next;
		
		 public Node(Acidente acidente) {
	            this.acidente = acidente;
	            next = null;
	     }
		 
		 public Node(Acidente acidente, Node next) {
	            this.acidente = acidente;
	            this.next = next;
	     }
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	 public LinkedListOfAcidente() {
	        head = null;
	        tail = null;
	        count = 0;
	    }
	 
	 public boolean isEmpty() {
	        return (head == null);
	 }
	 
	 public int size() {
	        return count;
	 }
	 
	 public void add(Acidente acidente) {
	 }
	 
	 public void add(int index, Acidente acidente) {
	 }
	 
	 
	 public Integer get(int index) {
		 return 0;
	 }
	 
	 public Integer set(int index, Acidente acidente) {
		 return 0;
	 }
	 
	 public boolean remove(Integer element) {
		 return false;
	 }
	 
	 public Integer removeByIndex(int index) {
		 return 0;
	 }
	 
	 public int indexOf(Acidente acidente) {
		 return 0;
	 }
	 
	 public boolean contains(Acidente acidente) {
		 return false;
	 }
	 
	 public void clear() {
	 }
}
