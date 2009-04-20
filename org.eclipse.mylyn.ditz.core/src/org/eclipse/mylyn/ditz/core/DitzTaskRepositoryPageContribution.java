package org.eclipse.mylyn.ditz.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractTaskRepositoryPageContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class DitzTaskRepositoryPageContribution extends AbstractTaskRepositoryPageContribution {

  public DitzTaskRepositoryPageContribution(String title, String description) {
    super(title, description);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void applyTo(TaskRepository repository) {
    repository.setRepositoryUrl(text.getText());
  }

  @Override
  public boolean canFlipToNextPage() {
    return false;
  }

  @Override
  public boolean isPageComplete() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public IStatus validate() {
    // TODO Auto-generated method stub
    return Status.OK_STATUS;
  }

  private Text text;

  @Override
  public Control createControl(Composite parent) {
    text = new org.eclipse.swt.widgets.Text(parent, SWT.SINGLE);
    return text;
  }

}
