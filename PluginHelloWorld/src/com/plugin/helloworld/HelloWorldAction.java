package com.plugin.helloworld;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class HelloWorldAction implements IWorkbenchWindowActionDelegate {
	IWorkbenchWindow window;

	@Override
	public void run(IAction action) {
		MessageDialog.openInformation(window.getShell(), "My First Plugin", "Welcome to Hello World!");

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;

	}

}
