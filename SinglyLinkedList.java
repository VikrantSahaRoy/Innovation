package linkedLists;

public class SinglyLinkedList {

	protected Node start;
	protected Node end;
	int size;
	
	public SinglyLinkedList(){
		start=null;
		end=null;
		size=0;
	}
	public boolean isEmpty(){
		return start==null;
	}
	public int getSize() {
		return size;
	}
	
	public void insertAtStart(int data){
		Node ntr= new Node(data, null);
		ntr.setLink(start);
		
	}
	public void insertAtEnd(int data){
		Node ntr=new Node(data, null);
		end.setLink(ntr);
		end=ntr;
	}
	
	public void insertAtPOS(int data, Node n){
		Node ntr=new Node(data, n);
		end.setLink(ntr);
		end=ntr;
	}
	
	public void insertAtIndex(int data, int n){
		Node ntr=new Node(data, null);
		Node temp=start;
		for(int i=0;i<n;i++) {
			temp=temp.getLink();
		}
		ntr.setLink(temp.getLink());
		temp.setLink(ntr);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	
	

    class Node {
		
		int data;
		Node node;
		
		public Node(int value) {
			data=value;
			node=null;
		}
		public Node(int value, Node n) {
			data=value;
			node=n;
		}
		
		public void setLink(Node n){
			node=n;
		}
		public Node getLink(){
			return node;
		}
		public void setData(int value){
			data=value;
		}
		public int getData(){
			return data;
		}
	}

