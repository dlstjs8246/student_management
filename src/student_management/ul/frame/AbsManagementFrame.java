package student_management.ul.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import student_management.dto.Department;
import student_management.ui.panel.AbsItemPanel;

@SuppressWarnings("serial")
public abstract class AbsManagementFrame<T> extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JPanel pSouth;
	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnUpdate;
	private AbsItemPanel<T> pCenter;

	public AbsManagementFrame() {
		initialize();
	}

	protected abstract AbsItemPanel<T> createItemPanel(); 

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		pCenter = createItemPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pSouth.add(btnAdd);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pSouth.add(btnCancel);
		
		btnUpdate = new JButton("수정");
		pSouth.add(btnUpdate);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			btnCancelActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, getItem());
	}
	protected void btnCancelActionPerformed(ActionEvent e) {
		pCenter.tfClear();
	}

	protected abstract T getItem();
}
