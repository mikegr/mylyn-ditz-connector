package org.eclipse.mylyn.ditz.ui;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITaskMapping;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.AbstractRepositoryConnectorUi;
import org.eclipse.mylyn.tasks.ui.wizards.ITaskRepositoryPage;

public class DitzRepositoryConnectorUi extends AbstractRepositoryConnectorUi {

  public DitzRepositoryConnectorUi() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public String getConnectorKind() {
    return "ditz";
  }

  @Override
  public IWizard getNewTaskWizard(TaskRepository taskRepository, ITaskMapping selection) {
    Wizard w = new DitzNewTaskWizard();
    return w;
  }

  @Override
  public IWizard getQueryWizard(TaskRepository taskRepository, IRepositoryQuery queryToEdit) {
    return new DitzQueryWizard();
  }

  @Override
  public ITaskRepositoryPage getSettingsPage(TaskRepository taskRepository) {
    return new DitzRepositorySettingsPage("Ditz Mylyn Connector", "Settings for Ditz repository", taskRepository);
  }

  @Override
  public boolean hasSearchPage() {
    return false;
  }

}
