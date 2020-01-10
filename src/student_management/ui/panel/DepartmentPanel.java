package student_management.ui.panel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import student_management.dto.Department;

@SuppressWarnings("serial")
public class DepartmentPanel extends AbsItemPanel<Department> {
	private JLabel lblDeptNo;
	private JTextField tfDeptNo;
	private JLabel lblDeptName;
	private JTextField tfDeptName;
	private JLabel lblFloor;
	private JTextField tfFloor;

	/**
	 * Create the panel.
	 */
	public DepartmentPanel() {
		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uD559\uACFC\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblDeptNo = new JLabel("학과번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		tfDeptNo.setColumns(10);
		add(tfDeptNo);
		
		lblDeptName = new JLabel("학과이름");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);
		
		lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}
	@Override
	public void tfClear() {
		tfDeptNo.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
	}
	@Override
	public Department getItem() {
		int deptNo = Integer.parseInt(tfDeptNo.getText().trim());
		String deptName = tfDeptName.getText().trim();
		int floor = Integer.parseInt(tfFloor.getText().trim());
		return new Department(deptNo, deptName, floor);
	}
	@Override
	public void setItem(Department dept) {
		tfDeptNo.setText(dept.getDeptNo()+ "");
		tfDeptName.setText(dept.getDeptName());
		tfFloor.setText(dept.getFloor()+"");
	}

}
