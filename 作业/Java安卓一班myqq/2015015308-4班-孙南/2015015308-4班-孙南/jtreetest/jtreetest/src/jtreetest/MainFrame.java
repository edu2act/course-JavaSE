package jtreetest;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class MainFrame extends JFrame {
	JScrollPane userListPanel=null;
	JTree usersTree=null;
	DefaultTreeModel treeModel=null;
	DefaultMutableTreeNode rootNode=null;
	public MainFrame() {
		rootNode = new DefaultMutableTreeNode("我的好友");  
		treeModel = new DefaultTreeModel(rootNode); 
		usersTree=new JTree(treeModel);
		usersTree.getSelectionModel().setSelectionMode 
	     (TreeSelectionModel.SINGLE_TREE_SELECTION);  
		usersTree.setShowsRootHandles(true);
		userListPanel=new JScrollPane(usersTree);
		//构造好友信息
		for(int i=0;i<20;i++){		
			DefaultMutableTreeNode node=new DefaultMutableTreeNode("好友"+i);
			rootNode.add(node);
		}
		usersTree.addMouseListener(new TreeMouseListener(usersTree));
		
		this.getContentPane().add(userListPanel);
		this.setSize(200, 500);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
