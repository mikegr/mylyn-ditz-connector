package org.eclipse.mylyn.ditz.ui;

import org.eclipse.jface.wizard.Wizard;

public class DitzNewTaskWizard extends Wizard {

	public DitzNewTaskWizard() {
		super();
	}

	DitzNewTaskWizardPage page;
	@Override
	public void addPages() {
		page = new DitzNewTaskWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		// TODO handle page.getUrl();
		return true;
	}

}
