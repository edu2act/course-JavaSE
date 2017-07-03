package com.user.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTree;
import javax.swing.tree.*;

import com.bean.User;
import com.message.view.ChatFrame;

public class TreeMouseListener implements MouseListener{
	JTree tree;
	private User myself;
	private MainFrame mainFrame;
	public TreeMouseListener(MainFrame mainFrame,JTree tree,User myself){
		this.tree = tree;
		this.myself = myself;
		this.mainFrame = mainFrame;
	}
	public void mouseClicked(MouseEvent m){
		if (m.getModifiers() == InputEvent.BUTTON1_MASK && m.getClickCount() == 2) {
			int n = tree.getRowForLocation(m.getX(), m.getY());
			if (n < 0)
				return;
			TreePath selTree = tree.getPathForRow(n);
			DefaultMutableTreeNode selNode = (DefaultMutableTreeNode) selTree.getLastPathComponent();
			if (selNode.isLeaf()) {
				String qqNum=selNode.getUserObject().toString().split(" ")[0];
				HashMap<Integer, ChatFrame>chatFrames=mainFrame.chatingFrames;
				boolean isExit=false;
				Iterator i=chatFrames.keySet().iterator();
				while(i.hasNext()){
					if(qqNum.equals(i.next().toString())){
						isExit=true;
						break;
					}
				}
				if(!isExit){
					ChatFrame chatFrame=new ChatFrame(myself,selNode.getUserObject().toString());
					mainFrame.chatingFrames.put(Integer.parseInt(qqNum), chatFrame);
				}
			}
		}
	}
	public void mousePressed(MouseEvent m) {

	}

	public void mouseReleased(MouseEvent m) {

	}

	public void mouseEntered(MouseEvent m) {

	}

	public void mouseExited(MouseEvent m) {

	}
}
