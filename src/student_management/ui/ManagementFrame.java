package student_management.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import student_management.ul.frame.DepartmentManagementFrame;
import student_management.ul.frame.StudentManagementFrame;
import student_management.ul.frame.TitleManagementFrame;

@SuppressWarnings("serial")
public class ManagementFrame extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagementFrame stdFrame = new StudentManagementFrame();
					stdFrame.setVisible(true);
					DepartmentManagementFrame deptFrame = new DepartmentManagementFrame();
					deptFrame.setVisible(true);
					TitleManagementFrame titleFrame = new TitleManagementFrame();
					titleFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}