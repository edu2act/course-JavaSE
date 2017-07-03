package com.myqq.user.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.myqq.entity.User;
import com.myqq.message.view.ChatFrame;

public class TreeMouseListener implements MouseListener {
	JTree tree;
	User myself;
	MainFrame mainFrame;
	public TreeMouseListener(MainFrame mainFrame, JTree tree, User myself) {
		this.tree = tree;
		this.myself=myself;
		this.mainFrame=mainFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getModifiers() == InputEvent.BUTTON1_MASK && e.getClickCount() == 2) {
			int n = tree.getRowForLocation(e.getX(), e.getY());
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
