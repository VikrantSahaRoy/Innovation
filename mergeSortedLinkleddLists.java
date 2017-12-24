package linkedLists;

public class mergeSortedLinkleddLists {

	
	
	public Node mergeTwoLists(Node l1, Node l2) {
	
		
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.data<=l2.data) {
			l1.node=mergeTwoLists(l1.node, l2);
			return l1;
		}
			else {
				l2.node=mergeTwoLists(l1, l2.node);
				return l2;
			}
		
	}
}

