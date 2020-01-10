package student_management.ul.frame;

import student_management.dto.Student;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.StudentPanel;

@SuppressWarnings("serial")
public class StudentManagementFrame extends AbsManagementFrame<Student> {
	private AbsItemPanel<Student> stdPanel;
	
	public StudentManagementFrame() {

	}

	@Override
	protected AbsItemPanel<Student> createItemPanel() {
		stdPanel = new StudentPanel();
		return stdPanel;
	}

	@Override
	protected Student getItem() {
		// TODO Auto-generated method stub
		return stdPanel.getItem();
	}	
}
