package org.eclipse.mylyn.ditz.ui;

import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractRepositorySettingsPage;
import org.eclipse.swt.widgets.Composite;

public class DitzRepositorySettingsPage extends AbstractRepositorySettingsPage {

  public DitzRepositorySettingsPage(String title, String description, TaskRepository taskRepository) {
    super(title, description, taskRepository);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected void createAdditionalControls(Composite parent) {
    // TODO Auto-generated method stub

  }

  @Override
  public String getConnectorKind() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected Validator getValidator(TaskRepository repository) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected boolean isValidUrl(String url) {
    // TODO Auto-generated method stub
    return false;
  }

}
