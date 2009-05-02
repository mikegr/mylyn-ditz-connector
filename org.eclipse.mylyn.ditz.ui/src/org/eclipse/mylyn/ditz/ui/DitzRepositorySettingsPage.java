package org.eclipse.mylyn.ditz.ui;

import java.awt.GridLayout;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractRepositorySettingsPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DitzRepositorySettingsPage extends AbstractRepositorySettingsPage {


	private Text text;
	
	public DitzRepositorySettingsPage(String title, String description, TaskRepository taskRepository) {
		super(title, description, taskRepository);
	}

	@Override
	protected void createAdditionalControls(Composite parent) {
		//TODO merge with ditznewtaskwizard
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		new Label(composite, SWT.NONE).setText("Ditz localtion");

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		text = new Text(composite, SWT.BORDER);
		text.setLayoutData(gd);

	}

	@Override
	public String getConnectorKind() {
		return "ditz";
	}

	@Override
	protected Validator getValidator(TaskRepository repository) {
		// TODO Auto-generated method stub
		return new AbstractRepositorySettingsPage.Validator() {
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				System.out.println("Runnning DitzRepositorySettingsPage.getValidator().run()...");
			}
		};
	}

	@Override
	protected boolean isValidUrl(String url) {
		if (url == null) return false;
		if (url.startsWith("file://")) return true;
		return false;
	}

}
