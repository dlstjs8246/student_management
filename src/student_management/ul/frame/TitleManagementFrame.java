package student_management.ul.frame;

import student_management.dto.Title;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.TitlePanel;

@SuppressWarnings("serial")
public class TitleManagementFrame extends AbsManagementFrame<Title> {
	private AbsItemPanel<Title> titlePanel;
	
	public TitleManagementFrame() {

	}

	@Override
	protected AbsItemPanel<Title> createItemPanel() {
		titlePanel = new TitlePanel();
		return titlePanel;
	}

	@Override
	protected Title getItem() {
		// TODO Auto-generated method stub
		return titlePanel.getItem();
	}	
}
