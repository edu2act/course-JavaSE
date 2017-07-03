package com.myqq.user.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.myqq.entity.Message;
import com.myqq.entity.User;
import com.myqq.message.service.MessageServiceImpl;
import com.myqq.message.service.SStaic;
import com.myqq.message.service.ServerThread;
import com.myqq.message.view.ChatFrame;

public class TreeMouseListener implements MouseListener{
	JTree tree;
	User myself;
	MainFrame mainFrame;
	
	public TreeMouseListener(MainFrame mainFrame,JTree tree,User myself){
		this.tree = tree;
		this.myself=myself;
		this.mainFrame=mainFrame;
	}
	
	
	//	当发生点击事件时
	public void mouseClicked(MouseEvent e) {
		// 这里面我不知道这些方法的意思。。。┑(￣Д ￣)┍
		if (e.getModifiers() == InputEvent.BUTTON1_MASK && e.getClickCount() == 2) {
			int n = tree.getRowForLocation(e.getX(), e.getY());
			if (n < 0)
				return;
			TreePath selTree = tree.getPathForRow(n);
			//	一个TreePath是由一个TreeModel提供的对象数组，	数组元素是有序的，根是数组的第一个元素。
			DefaultMutableTreeNode selNode = (DefaultMutableTreeNode) selTree.getLastPathComponent();
			//	找到树中最后一个选择的结点。就是用户选中的那个结点
			
			if(selNode.isLeaf()){
				//	如果selNode是叶子结点
				//	获取用户的QQ号，这里代码一气呵成
				String qqNum=selNode.getUserObject().toString().split(" ")[0];
				HashMap<Integer, ChatFrame>chatFrames=mainFrame.chatingFrames;
				boolean isExit = false;
				Iterator i = chatFrames.keySet().iterator();
				while(i.hasNext()){
					
					//	QQ号相等 说明存在这个聊天界面 更改状态值
					if(qqNum.equals(i.next().toString())){
						isExit = true;
						break;
					}
				}
				if(!isExit){
					// 如果不存在跟对应好友的聊天界面,新建聊天界面
					ChatFrame chatFrame=new ChatFrame(myself,selNode.getUserObject().toString());
					mainFrame.chatingFrames.put(Integer.parseInt(qqNum), chatFrame);
					SStaic.fuck.add(chatFrame);
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
