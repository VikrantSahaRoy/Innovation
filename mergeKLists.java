package linkedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists {

	
	public Node mergeKLists(Node[] lists) {
		
		if(lists==null || lists.length==0)
			return null;
		
		PriorityQueue<Node> queue=new PriorityQueue<Node>(
				lists.length, new Comparator<Node>() {
					public int compare(Node l1, Node l2){
						if(l1.data<l2.data)
							return -1;
						else if(l1.data==l2.data)
							return 0;
						else return 1;
					}
				});
		
		for(Node n:lists){
			if(n!=null)
			queue.add(n);
		}
		Node head=null,p=null;
		
		while(!queue.isEmpty()) {
			
			Node node=queue.poll();
			if(p==null){
				head=node;
				p=node;
			}
			else {
				p.node=node;
				p=node;
			}
			if(node.node!=null)
				queue.add(node.node);
		}
		
		return head;
	}
}
