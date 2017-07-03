package com.myqq.user.view;

import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import com.myqq.entity.User;
import com.myqq.message.service.ServerThread;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.service.UserServiceImpl;

public class MainFrame extends JFrame {
	
	User myself;	//登录用户
	List<User> friends;		//登录用户的好友
	public HashMap<Integer, ChatFrame> chatingFrames=new HashMap<Integer, ChatFrame>();  //用于存放每个聊天界面，并且每个界面只出现一次
	
	ServerThread a = null;
	
	JScrollPane userListPanel = null;
	JTree usersTree=null;
	DefaultTreeModel treeModel = null;
	DefaultMutableTreeNode rootNode = null;
	
	public MainFrame(User u){
		myself = u;
		rootNode = new DefaultMutableTreeNode("我的好友");  
		treeModel = new DefaultTreeModel(rootNode); 
		usersTree=new JTree(treeModel);
		usersTree.getSelectionModel().setSelectionMode 
	     (TreeSelectionModel.SINGLE_TREE_SELECTION);
		usersTree.setShowsRootHandles(true);
		userListPanel=new JScrollPane(usersTree);
		
		//	构造好友信息
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		friends=userServiceImpl.listFriends(myself.getQqNum());
		for(User friend : friends){		
			DefaultMutableTreeNode node=new DefaultMutableTreeNode(friend.getQqNum()+" "+friend.getNickName());
			rootNode.add(node);
		}
	
		
		TreeMouseListener treeMouseListener = new TreeMouseListener(this, usersTree, myself);
		usersTree.addMouseListener(treeMouseListener);
		
		this.getContentPane().add(userListPanel);
		this.setTitle(myself.getNickName());
		this.setSize(200, 500);
		this.setVisible(true);
		
	
		ServerThread a = new ServerThread(this); 
		new Thread(a).start();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}