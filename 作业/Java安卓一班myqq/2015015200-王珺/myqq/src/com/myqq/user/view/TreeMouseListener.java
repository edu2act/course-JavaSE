package com.myqq.user.view;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.myqq.entity.Users;
import com.myqq.message.view.ChatFrame;

public class TreeMouseListener implements MouseListener {

	JTree tree;
	Users myself;
	public TreeMouseListener(JTree tree, Users myself) {
		this.tree = tree;
		this.myself=myself;
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
				ChatFrame chatFrame=new ChatFrame(myself,selNode.getUserObject().toString());
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
