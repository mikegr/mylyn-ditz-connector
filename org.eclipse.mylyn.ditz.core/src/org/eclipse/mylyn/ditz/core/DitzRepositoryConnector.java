package org.eclipse.mylyn.ditz.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.mylyn.tasks.core.AbstractRepositoryConnector;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.core.data.TaskDataCollector;
import org.eclipse.mylyn.tasks.core.sync.ISynchronizationSession;

public class DitzRepositoryConnector extends AbstractRepositoryConnector {

	public DitzRepositoryConnector() {
	}

	@Override
	public boolean canCreateNewTask(TaskRepository repository) {
		return false;
	}

	@Override
	public boolean canCreateTaskFromKey(TaskRepository repository) {
		return false;
	}

	@Override
	public String getConnectorKind() {
		return Activator.REPOSITORY_KIND;
	}

	@Override
	public String getLabel() {
		return "Ditz";
	}

	@Override
	public String getRepositoryUrlFromTaskUrl(String taskFullUrl) {
		return taskFullUrl.substring(0, taskFullUrl.lastIndexOf("/"));
	}

	@Override
	public String getTaskIdFromTaskUrl(String taskFullUrl) {
		return taskFullUrl.substring(taskFullUrl.lastIndexOf("/"));
	}


	@Override
	public TaskData getTaskData(TaskRepository taskRepository, String taskId,
			IProgressMonitor monitor) throws CoreException {
		TaskAttributeMapper tam = new TaskAttributeMapper(taskRepository);
		tam.setValue(new TaskAttribute(null, TaskAttribute.SUMMARY),
				"Hardcoded summary");
		return new TaskData(tam, taskRepository.getConnectorKind(),
				taskRepository.getRepositoryUrl(), taskId);
	}


	@Override
	public String getTaskUrl(String repositoryUrl, String taskId) {
		return repositoryUrl + "/" + taskId;
	}

	@Override
	public boolean hasTaskChanged(TaskRepository taskRepository, ITask task,
			TaskData taskData) {
		return false;
	}

	@Override
	public IStatus performQuery(TaskRepository repository,
			IRepositoryQuery query, TaskDataCollector collector,
			ISynchronizationSession session, IProgressMonitor monitor) {
		TaskAttributeMapper tam = new TaskAttributeMapper(repository);
		tam.setValue(new TaskAttribute(null, TaskAttribute.SUMMARY),
				"Hardcoded summary");
		TaskData data = new TaskData(tam, repository.getConnectorKind(),
				repository.getRepositoryUrl(), "1");
		collector.accept(data);
		return Status.OK_STATUS;
	}

	@Override
	public void updateRepositoryConfiguration(TaskRepository taskRepository,
			IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTaskFromTaskData(TaskRepository taskRepository,
			ITask task, TaskData taskData) {
		// TODO Auto-generated method stub

	}

}
