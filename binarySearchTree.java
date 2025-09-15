class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class binaryTree{
	Node root;
	
	public binaryTree(){
		this.root=null;
	}
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public Node insert(Node cNode,int data){
		if(cNode==null){
			cNode=new Node(data);
			return cNode;
		}
		
		if(data<cNode.data){
			cNode.left=insert(cNode.left,data);
		}else if(data>cNode.data){
			cNode.right=insert(cNode.right,data);
		}
		return cNode;
		
	}
	
	public void inorderTraversal(Node cNode){
		if (cNode !=null){
			inorderTraversal(cNode.left);
			System.out.print(cNode.data+" ");
			inorderTraversal(cNode.right);
		}
		
	}
	
	public void preorderTraversal(Node cNode){
		if(cNode !=null){
			System.out.print(cNode.data+" ");
			preorderTraversal(cNode.left);
			preorderTraversal(cNode.right);
		}
	}
	
	public void postorderTraversal(Node cNode){
		if(cNode !=null){
			preorderTraversal(cNode.left);
			preorderTraversal(cNode.right);
			System.out.print(cNode.data+" ");
		}
	}
	
	public boolean search(Node cNode,int data){
		if(cNode==null){
			return false;
	    }
			
		if(data==cNode.data){
			return true;
		}
		else if(data<cNode.data){
			return search(cNode.left,data);
		}
		else{
			return search(cNode.right,data);
		}
   }
   
   public Node searchNode(Node cNode,int data){
		if(cNode==null){
			return cNode;
	    }
			
		if(data==cNode.data){
			return cNode;
		}
		else if(data<cNode.data){
			return searchNode(cNode.left,data);
		}
		else{
			return searchNode(cNode.right,data);
		}
   }
   
   public int findMin(Node cNode){
	   int minValue=cNode.data;
	   while(cNode.left!=null){
		   minValue=cNode.left.data;
		   cNode=cNode.left;
	   }
	   return minValue;
   }
   
   public Node delete(Node cNode,int data){
	 if(cNode==null){
		 return cNode;
	 }
	 if(data<cNode.data){
		 cNode.left=delete(cNode.left,data);
	 }
	 else if(data>cNode.data){
		 cNode.right=delete(cNode.right,data);
	 } 
	 else{
		 //case1:node is a leaf
		 if(cNode.left==null && cNode.right==null){
			 cNode=null;
		 }
		 //case2:node has one child
		 else if(cNode.left==null){
			 cNode=cNode.right;
		 }else if(cNode.right==null){
			 cNode=cNode.left;
		 }
		 //case3:Node has two children
		 else{
			 int minValue=findMin(cNode.right);
			 cNode.data=minValue;
			 cNode.right=delete(cNode.right,minValue);
		 }
	 }
	 return cNode;
   }
}

public class binarySearchTree{
	public static void main(String[] args){
		binaryTree bst=new binaryTree();
		bst.root=bst.insert(bst.root,50);
		bst.root=bst.insert(bst.root,30);
		bst.root=bst.insert(bst.root,70);
		bst.root=bst.insert(bst.root,40);
		bst.root=bst.insert(bst.root,60);
		bst.root=bst.insert(bst.root,80);
		bst.root=bst.insert(bst.root,10);
		bst.root=bst.insert(bst.root,25);
		bst.inorderTraversal(bst.root);
		System.out.println();
		bst.preorderTraversal(bst.root);
		System.out.println();
		bst.postorderTraversal(bst.root);
		System.out.println();
	    System.out.println(bst.search(bst.root,80));
		System.out.println();
		System.out.println(bst.search(bst.root,15));
		System.out.println(bst.searchNode(bst.root,80));
		System.out.println(bst.delete(bst.root,80));
	}
}