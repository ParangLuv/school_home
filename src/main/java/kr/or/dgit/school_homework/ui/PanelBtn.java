package kr.or.dgit.school_homework.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBtn extends JPanel {

	/*PanelData불러오기*/
	PanelData pD = new PanelData();
	
	public PanelBtn() {
		setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnInput = new JButton("[입력]");
		JButton btnOutput = new JButton("[출력]");
		JButton btnDeleteAll = new JButton("[전체삭제]");
		add(btnInput);
		add(btnOutput);
		add(btnDeleteAll);

		/*입력버튼 이벤트 리스너*/
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pD.setTfClear();
			}
		});
		
		/*출력버튼 이벤트 리스너*/
		btnOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		/*전체삭제버튼 이벤트 리스너*/
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}
