package kr.or.dgit.school_homework.ui;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelData extends JPanel {
	private JTextField tfNo;
	private JTextField tfEng;
	private JTextField tfKor;
	private JTextField tfMath;
	private JTextField tfName;
	
	/*getter method*/
	public JTextField getTfNo() {
		return tfNo;
	}
	
	public JTextField getTfEng() {
		return tfEng;
	}
	
	public JTextField getTfKor() {
		return tfKor;
	}
	
	public JTextField getTfMath() {
		return tfMath;
	}

	public JTextField getTfName() {
		return tfName;
	}


	/*setter method*/
	public void setTfClear() {
			tfNo.setText("");
			tfName.setText("");
			tfKor.setText("");
			tfEng.setText("");
			tfMath.setText("");
	}
	
	public void setTfNo(JTextField tfNo) {
		this.tfNo = tfNo;
	}

	public void setTfEng(JTextField tfEng) {
		this.tfEng = tfEng;
	}

	public void setTfKor(JTextField tfKor) {
		this.tfKor = tfKor;
	}

	public void setTfMath(JTextField tfMath) {
		this.tfMath = tfMath;
	}
	
	public void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	/** Create the panel. */
	public PanelData() {
		setLayout(null);

		JLabel jLStdNo = new JLabel("학   번 : ");
		JLabel jLStdName = new JLabel("성   명 : ");
		JLabel jLKor = new JLabel("국어점수 : ");
		JLabel jLEng = new JLabel("영어점수 : ");
		JLabel jLMath = new JLabel("수학점수 : ");
		
		jLStdNo.setHorizontalAlignment(SwingConstants.CENTER);
		jLStdName.setHorizontalAlignment(SwingConstants.CENTER);
		jLKor.setHorizontalAlignment(SwingConstants.CENTER);
		jLEng.setHorizontalAlignment(SwingConstants.CENTER);
		jLMath.setHorizontalAlignment(SwingConstants.CENTER);
		
		jLStdNo.setBounds(1, 0, 112, 75);
		jLStdName.setBounds(225, 0, 112, 75);
		jLKor.setBounds(1, 75, 112, 75);
		jLEng.setBounds(1, 150, 112, 75);
		jLMath.setBounds(1, 225, 112, 75);
		
		add(jLStdNo);
		add(jLStdName);
		add(jLKor);
		add(jLEng);
		add(jLMath);

		tfNo = new JTextField();
		tfName = new JTextField();
		tfKor = new JTextField();
		tfEng = new JTextField();
		tfMath = new JTextField();
		
		tfNo.setBounds(113, 0, 112, 75);
		tfName.setBounds(337, 0, 112, 75);
		tfKor.setBounds(113, 75, 112, 75);
		tfEng.setBounds(113, 150, 112, 75);
		tfMath.setBounds(113, 225, 112, 75);
		
		add(tfNo);
		add(tfName);
		add(tfKor);
		add(tfEng);
		add(tfMath);
		
		tfNo.setColumns(10);
		tfName.setColumns(10);
		tfKor.setColumns(10);
		tfEng.setColumns(10);
		tfMath.setColumns(10);
	}

}
