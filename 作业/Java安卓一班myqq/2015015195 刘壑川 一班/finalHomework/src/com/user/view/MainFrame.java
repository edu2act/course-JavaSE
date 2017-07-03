package com.user.view;

import java.util.HashMap;
import java.util.List;

import javax.swing.*;
import javax.swing.tree.*;

import com.bean.User;
import com.message.service.ServerThread;
import com.message.view.ChatFrame;
import com.user.service.UserServiceImpl;

public class MainFrame extends JFrame{
	public User myself;
	public List<User> friends;
	public HashMap<Integer,ChatFrame> chatingFrames = new HashMap<Integer,ChatFrame>();
	JScrollPane userListPanel=null;
	JTree usersTree=null;
	DefaultTreeModel treeModel=null;
	DefaultMutableTreeNode rootNode=null;
	public MainFrame(){}
	public MainFrame(User u){
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
		friends=userServiceImpl.listFriends(myself.getQQNum());
		for(User friend : friends){		
			DefaultMutableTreeNode node=new DefaultMutableTreeNode(friend.getQQNum()+" "+friend.getNickName());
			rootNode.add(node);
		}
		usersTree.addMouseListener(new TreeMouseListener(this, usersTree, myself));
		
		this.getContentPane().add(userListPanel);
		this.setTitle(myself.getNickName());
		this.setSize(200, 500);
		this.setVisible(true);
		
		new Thread(new ServerThread(this)).start();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
