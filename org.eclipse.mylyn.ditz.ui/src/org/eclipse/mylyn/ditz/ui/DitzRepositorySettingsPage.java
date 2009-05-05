package org.eclipse.mylyn.ditz.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractRepositorySettingsPage;
import org.eclipse.swt.widgets.Composite;

public class DitzRepositorySettingsPage extends AbstractRepositorySettingsPage {

	public DitzRepositorySettingsPage(String title, String description,
			TaskRepository taskRepository) {
		super(title, description, taskRepository);
		setNeedsAnonymousLogin(true);
		setNeedsAdvanced(false);
		setNeedsHttpAuth(false);
		setNeedsProxy(false);
		setNeedsEncoding(false);
		setNeedsTimeZone(false);
		setNeedsValidation(true);
	}

	@Override
	protected void createAdditionalControls(Composite parent) {
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
				System.out
						.println("Runnning DitzRepositorySettingsPage.getValidator().run()...");
			}
		};
	}

	@Override
	protected boolean isValidUrl(String url) {
		if (url == null)
			return false;
		if (url.startsWith("file://"))
			return true;
		return false;
	}

}
