package com.mychat.user.view;

import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import com.mychat.entity.User;
import com.mychat.message.service.ServerThread;
import com.mychat.user.service.UserServiceImpl;
import com.mychat.user.view.TreeMouseListener;
import com.mychat.message.view.ChatFrame;

public class MainFrame extends JFrame{
	
	User myself;
	List<User> friends;
	HashMap<Integer, ChatFrame> chatingFrames=new HashMap<Integer, ChatFrame>();  //用于存放每个聊天界面，并且每个界面只出现一次
	ServerThread a = null;
	
	JScrollPane userListPanel=null;
	JTree usersTree=null;
	DefaultTreeModel treeModel=null;
	DefaultMutableTreeNode rootNode=null;
	public MainFrame(){}
	
	public MainFrame(User u) {
		myself=u;
		rootNode = new DefaultMutableTreeNode("我的好友");  
		treeModel = new DefaultTreeModel(rootNode); 
		usersTree=new JTree(treeModel);
		usersTree.getSelectionModel().setSelectionMode 
	     (TreeSelectionModel.SINGLE_TREE_SELECTION);  
		usersTree.setShowsRootHandles(true);
		userListPanel=new JScrollPane(usersTree);
		
		//构造好友信息	
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		friends=userServiceImpl.listFriends(myself.getMyChatNum());
		for(User friend : friends){		
			DefaultMutableTreeNode node=new DefaultMutableTreeNode(friend.getMyChatNum()+" "+friend.getNickName());
			rootNode.add(node);
		}
		TreeMouseListener treeMouseListener = new TreeMouseListener(this, usersTree, myself);
		usersTree.addMouseListener(treeMouseListener);
//		fframes = treeMouseListener.getHashMap();
		
		this.getContentPane().add(userListPanel);
		this.setTitle(myself.getNickName());
		this.setSize(200, 500);
		this.setVisible(true);
//		a = new ServerThread(fframes);
		new Thread(a).start();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
