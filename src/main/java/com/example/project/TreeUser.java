package com.example.project;

public class TreeUser {
	public static<T> int count(BT<T> tree){
	int c=0;
	if(tree.empty())
		return 0;
	if(tree.isLeaf())
		return 1;
	if(tree.find(Relative.LeftChild)){
	c+=count(tree);
	tree.find(Relative.Parent);
	}
	if(tree.find(Relative.LeftChild)){
	c+=count(tree);
	tree.find(Relative.Parent);
	}
	return count;
	}
    public static <T> int countLeaves(BT<T> bt) {
	bt.find(Relative.Root);
    	return count(bt);
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
    }
}
