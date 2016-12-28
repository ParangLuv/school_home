package kr.or.dgit.school_homework.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class FrameIOD extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameIOD frame = new FrameIOD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameIOD() {
		setTitle("학생별 성적처리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelData panelData = new PanelData();
		panelData.setBounds(5, 5, 453, 300);
		contentPane.add(panelData);
		panelData.setLayout(null);
		
		PanelBtn panelBtn = new PanelBtn();
		panelBtn.setBounds(5, 305, 453, 100);
		contentPane.add(panelBtn);
	}

}
