package com.mychat.user.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.mychat.yp.user;
import com.mychat.user.view.MainFrame;
import com.mychat.message.view.ChatFrame;

public class TreeMouseListener implements MouseListener {
	JTree tree;
	user myself;
	MainFrame mainFrame;
	public TreeMouseListener(MainFrame mainFrame, JTree tree, user myself) {
		this.tree = tree;
		this.myself=myself;
		this.mainFrame=mainFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		if (e.getModifiers() == InputEvent.BUTTON1_MASK && e.getClickCount() == 2) {
			int n = tree.getRowForLocation(e.getX(), e.getY());
			if (n < 0)
				return;
			TreePath selTree = tree.getPathForRow(n);
			DefaultMutableTreeNode selNode = (DefaultMutableTreeNode) selTree.getLastPathComponent();
			if (selNode.isLeaf()) {
				String chatNum=selNode.getUserObject().toString().split(" ")[0];
				HashMap<Integer, ChatFrame>chatFrames=mainFrame.chatingFrames;
				boolean isExit=false;
				Iterator i=chatFrames.keySet().iterator();
				while(i.hasNext()){
					if(chatNum.equals(i.next().toString())){
						isExit=true;
						break;
					}
				}
				if(!isExit){
					ChatFrame chatFrame=new ChatFrame(myself,selNode.getUserObject().toString());
					mainFrame.chatingFrames.put(Integer.parseInt(chatNum), chatFrame);
				}
			}
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

}
