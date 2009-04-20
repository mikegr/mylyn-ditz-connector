package org.eclipse.mylyn.ditz.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import org.eclipse.jface.wizard.WizardPage;;

public class DitzNewTaskWizardPage extends org.eclipse.jface.wizard.WizardPage {

	private Text text;

	public DitzNewTaskWizardPage() {
		super("Ditz configuration pageName");
	}

	@Override
	public void createControl(Composite arg0) {
		text = new Text(arg0, SWT.SINGLE);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Ditz Configuration";
	}

	@Override
	public Control getControl() {
		return text;
	}
	@Override
	public void dispose() {
		super.dispose();
		text.dispose();
	}

	@Override
	public String getDescription() {

		return "Settings for ditz";
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

}
