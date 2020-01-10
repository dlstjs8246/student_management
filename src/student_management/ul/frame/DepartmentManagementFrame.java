
package student_management.ul.frame;

import student_management.dto.Department;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.DepartmentPanel;

@SuppressWarnings("serial")
public class DepartmentManagementFrame extends AbsManagementFrame<Department> {
	private AbsItemPanel<Department> deptPanel;
	
	public DepartmentManagementFrame() {

	}

	@Override
	protected AbsItemPanel<Department> createItemPanel() {
		deptPanel = new DepartmentPanel();
		return deptPanel;
	}

	@Override
	protected Department getItem() {
		// TODO Auto-generated method stub
		return deptPanel.getItem();
	}
	
	
}
