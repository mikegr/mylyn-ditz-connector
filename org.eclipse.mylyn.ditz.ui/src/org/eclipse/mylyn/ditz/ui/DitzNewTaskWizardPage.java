package org.eclipse.mylyn.ditz.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class DitzNewTaskWizardPage extends org.eclipse.jface.wizard.WizardPage {

  private Text text;
  private Control control;

  public DitzNewTaskWizardPage() {
    super("Ditz configuration pageName");
  }

  // @Override
  public void createControl(Composite arg0) {
	  Composite composite = new Composite(arg0, SWT.NONE);

	  GridLayout gl = new GridLayout();
	  composite.setLayout(gl);
	  
	  new Label(composite, SWT.NONE).setText("Location");
	  
	  GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	  text = new Text(composite, SWT.BORDER);
	  text.setLayoutData(gd);

	  control = composite;
  }

  @Override
  public String getTitle() {
    return "DitzNewTaskWizardPage";
  }

  @Override
  public Control getControl() {
    return control;
  }

  @Override
  public void dispose() {
    super.dispose();
    control.dispose();
  }

  @Override
  public String getDescription() {
    return "Settings for ditz";
  }

  @Override
  public boolean canFlipToNextPage() {
    return false;
  }
  
  public String getURL() {
	  return text.getText();
  }

}
