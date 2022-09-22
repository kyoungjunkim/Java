package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;
	private final JCheckBox chk1 = new JCheckBox("등산");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 154, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 45, 105, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 69, 78, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(109, 69, 78, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(187, 69, 78, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
			
			if(answer == JOptionPane.YES_OPTION) {
				System.out.println("Yes 클릭...");
			}else {
				System.out.println("No 클릭...");
			}
			
			}
		});
		btn4.setBounds(265, 69, 78, 23);
		contentPane.add(btn4);
		
		txtf1 = new JTextField();
		txtf1.setBounds(11, 134, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(12, 159, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 190, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(196, 137, 121, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(196, 162, 121, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(196, 193, 121, 15);
		contentPane.add(lblTxtf3Result);
		
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : "+ txt);
			}
		});
		btntxtf1.setBounds(127, 133, 60, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt2 = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+ txt2);
			}
		});
		btntxtf2.setBounds(127, 158, 60, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt3 = txtf3.getText();
				lblTxtf3Result.setText("결과 : "+ txt3);
			}
		});
		btntxtf3.setBounds(127, 189, 60, 23);
		contentPane.add(btntxtf3);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("TextField 컴포넌트");
		lblNewLabel_3.setBounds(22, 109, 104, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Checkbox 컴포넌트");
		lblNewLabel_2.setBounds(22, 221, 109, 15);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(58, 272, 49, 23);
		contentPane.add(chk2);
		chk1.setBounds(8, 272, 49, 23);
		contentPane.add(chk1);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(109, 272, 49, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("러닝");
		chk4.setBounds(172, 272, 49, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(226, 272, 49, 23);
		contentPane.add(chk5);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				JLabel lblChkResult = new JLabel("결과 :");
				lblChkResult.setBounds(22, 329, 253, 15);
				contentPane.add(lblChkResult);
				
				
				lblChkResult.setText("결과 : "+chks.toString());
			}
		});
		btnChk.setBounds(315, 272, 60, 23);
		contentPane.add(btnChk);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("취미를 고르세요.");
		lblNewLabel_2_1.setBounds(32, 246, 109, 15);
		contentPane.add(lblNewLabel_2_1);
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("JRadio 컴포넌트");
		lblNewLabel_4.setBounds(12, 377, 90, 15);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 405, 49, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(92, 405, 49, 23);
		contentPane.add(rdFemale);
		
		JButton lblGenderbtn = new JButton("확인");
		lblGenderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				}
				
			
		});
		lblGenderbtn.setBounds(172, 405, 60, 23);
		contentPane.add(lblGenderbtn);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(22, 447, 253, 15);
		contentPane.add(lblGenderResult);
	}
}
