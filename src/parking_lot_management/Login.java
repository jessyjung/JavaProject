package parking_lot_management;

import java.awt.Button;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login {
	static boolean idCheck = false;
	static ArrayList<Join> member = new ArrayList<Join>();
	static Join j;

	public static void main(String[] args) {
		
		// ���� ������
		Frame main = new Frame("����");
		main.setBounds(700, 50, 500, 800);		
		main.setLayout(null);
		main.setResizable(false);
		
		// ���� �ΰ� ��ư
		ImageIcon mainlogo_img = new ImageIcon("mainlogo.png");
		JButton mainlogo = new JButton();
		mainlogo.setIcon(mainlogo_img);
		mainlogo.setBounds(180, 300, 120, 120);
		mainlogo.setBorderPainted(false);
		mainlogo.setFocusPainted(false);
		mainlogo.setContentAreaFilled(false);
		main.add(mainlogo);
		
		// ���� �г�
		ImageIcon main_panel = new ImageIcon("main_back.png");
		JLabel mainback = new JLabel(main_panel);
		mainback.setBounds(0, 0, 500, 800);
		main.add(mainback);
		
		// �α��� ������
		Frame login = new Frame("�α���");
		login.setBounds(700, 50, 500, 800);
		login.setLayout(null);// �ڵ���ġ ����
		login.setResizable(false);
		
		//Xǥ �۷���
		ImageIcon login_close_button = new ImageIcon("login_close_button.png");
		JButton Xbtn = new JButton();
		Xbtn.setIcon(login_close_button);
        Font fo = new Font(Font.SANS_SERIF, Font.BOLD, 27);
        Xbtn.setBounds(25, 45, 60, 60);
        Xbtn.setFont(fo);
        Xbtn.setEnabled(true);
        Xbtn.setBorderPainted(false);
        Xbtn.setFocusPainted(false);
        Xbtn.setContentAreaFilled(false);
        //�ݱ��ư���� ������ ����
        Xbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		login.add(Xbtn);
		
		// ��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 16);
		login.setFont(font);

		// �α��� �г�
		ImageIcon loginpanel_img = new ImageIcon("login_panel.png");
		JLabel loginpanel = new JLabel(loginpanel_img);
		loginpanel.setBounds(50, 300, 400, 200);
		
		// �α��� �ΰ� �г�
		ImageIcon loginlogo_img = new ImageIcon("login_logo.png");
		JLabel loginlogo = new JLabel(loginlogo_img);
		loginlogo.setBounds(0, 90, 500, 250);
		login.add(loginlogo);

		// ���̵�, ��ȣ �Է�â ǥ��
		TextField idField = new TextField();
		idField.setBounds(180, 353, 200, 30);
		TextField pwField = new TextField();
		pwField.setEchoChar('*');
		pwField.setBounds(180, 415, 200, 30);

		// ���̵�, ��ȣ �� ���� ����
		login.add(idField);
		login.add(pwField);
		login.add(loginpanel);

		// �α��� ��ư
		ImageIcon loginbtn_img = new ImageIcon("loginbtn.png");
		JButton loginbtn = new JButton();
		loginbtn.setIcon(loginbtn_img);
		loginbtn.setBounds(130, 530, 100, 40);
		loginbtn.setBorderPainted(false);
		loginbtn.setFocusPainted(false);
		loginbtn.setContentAreaFilled(false);
		loginbtn.setEnabled(false);
		login.add(loginbtn);

		idField.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (!idField.getText().equals("")) {
					loginbtn.setEnabled(true);
				}
			}
		});

		// ȸ������ ��ư
		ImageIcon regbtn_img = new ImageIcon("regbtn.png");
		JButton regbtn = new JButton();
		regbtn.setIcon(regbtn_img);
		regbtn.setBounds(270, 530, 100, 40);
		regbtn.setBorderPainted(false);
		regbtn.setFocusPainted(false);
		regbtn.setContentAreaFilled(false);
		login.add(regbtn);
		
		//idã���ư
        Button idS = new Button("IDã��");
        Font fon = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
        idS.setFont(fon);
        idS.setBounds(300, 505, 48, 20);
        login.add(idS);
        idS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String findNameText = JOptionPane.showInputDialog(null, "ȸ������ �� ����� �̸��� �Է��� �ּ���.", "ID ã��", JOptionPane.OK_CANCEL_OPTION);
				if (findNameText.isEmpty()) {
					JOptionPane.showMessageDialog(idS, "ID�� �Է��� �ּ���.");
					return;
				}

				for (int i = 0; i < member.size(); i++) {
					String memberName = member.get(i).getName();

					if (findNameText.equals(memberName)) {
						JOptionPane.showMessageDialog(idS, "id��" + member.get(i).getId() + "�Դϴ�.");
						return;
					}
				}

				JOptionPane.showMessageDialog(idS, "������ ��ġ���� �ʽ��ϴ�.");
			}
		});
		
		//pwã���ư
        Button pwS = new Button("PWã��");
        pwS.setFont(fon);
        pwS.setBounds(350, 505, 51, 20);
        login.add(pwS);
        pwS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String idFieldText = idField.getText().trim();
				if (idFieldText.isEmpty()) {
					JOptionPane.showMessageDialog(pwS, "ID�� �Է��� �ּ���.");
					return;
				}

				for (int i = 0; i < member.size(); i++) {
					String memberId = member.get(i).getId();

					if (idFieldText.equals(memberId)) {
						JOptionPane.showMessageDialog(pwS, "pw��" + member.get(i).getPw() + "�Դϴ�.");
						return;
					}
				}

				JOptionPane.showMessageDialog(pwS, "������ ��ġ���� �ʽ��ϴ�.");
			}
		});
		

		// ��� �̹���(�α���)
		ImageIcon login_img = new ImageIcon("login_back.png");
		JLabel loginimg = new JLabel(login_img);
		loginimg.setBounds(0, 0, 500, 800);
		login.add(loginimg);

		// ȸ������ ������
		Frame reg = new Frame("ȸ������");
		reg.setBounds(700, 50, 500, 800);
		reg.setLayout(null);// �ڵ���ġ ����
		reg.setResizable(false);

		// ��Ʈ
		reg.setFont(font);

		// �ߺ�Ȯ�� ��ư
		JButton idcheck = new JButton();
		idcheck.setBounds(360, 399, 100, 40);
		idcheck.setBorderPainted(false);
		idcheck.setFocusPainted(false);
		idcheck.setContentAreaFilled(false);
		reg.add(idcheck);
		idcheck.setEnabled(false);
		
		// ȸ������ �ΰ� �г�
		ImageIcon reglog_img = new ImageIcon("login_logo.png");
		JLabel reglogo = new JLabel(reglog_img);
		reglogo.setBounds(0, 90, 500, 250);
		reg.add(reglogo);
		
		// ȸ������ �г�
		ImageIcon regpanel_img = new ImageIcon("reg_panel.png");
		JLabel regpanel = new JLabel(regpanel_img);
		regpanel.setBounds(50, 300, 400, 240);

		// �̸�, ���̵�, ��ȣ �Է�â ǥ��
		TextField regname = new TextField();
		regname.setBounds(180, 350, 180, 30);

		TextField regid = new TextField();
		regid.setBounds(180, 406, 180, 30);
		regid.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {// ID �ߺ�Ȯ�� ��ư Ȱ��ȭ ����
				if (regid.getText().trim().length() == 0) {// ��ĭ ���� �Էµ� ���� ������
					idcheck.setEnabled(false);// �ƹ��͵� �Է��� �ȵǾ��ٸ� ��ư ��Ȱ��ȭ
				} else {
					idcheck.setEnabled(true);// ���� �ԷµǾ��ٸ� Ȱ��ȭ
				}
			}
		});

		TextField regpw = new TextField();
		regpw.setEchoChar('*');
		regpw.setBounds(180, 462, 180, 30);

		// �̸�, ���̵�, ��ȣ �� ���� ����
		reg.add(regname);
		reg.add(regid);
		reg.add(regpw);
		reg.add(regpanel);

		// ȸ������ �Ϸ� ��ư
		ImageIcon regokbtn_img = new ImageIcon("regokbtn.png");
		JButton regokbtn = new JButton();
		regokbtn.setIcon(regokbtn_img);
		regokbtn.setBounds(200, 550, 100, 40);
		regokbtn.setBorderPainted(false);
		regokbtn.setFocusPainted(false);
		regokbtn.setContentAreaFilled(false);
		regokbtn.setEnabled(false);
		reg.add(regokbtn);

		regokbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (regname.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(reg, "�̸��� �Է����ּ���.");
				} else if (regid.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(reg, "ID�� �Է����ּ���.");
				} else if (regpw.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(reg, "��ȣ�� �Է����ּ���.");
				} else {
					j = new Join();
					j.setName(regname.getText());
					j.setId(regid.getText());
					j.setPw(regpw.getText());

					member.add(j);
					JOptionPane.showMessageDialog(reg, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
					reg.setVisible(false);
					login.setVisible(true);
				}
			}
		});

		// ��ξ� ������
		Frame drawer = new Frame("��ξ�");
		drawer.setBounds(700, 50, 500, 800);
		drawer.setLayout(null);// �ڵ���ġ ����
		drawer.setResizable(false);

		// ��Ʈ
		Font drawerfont = new Font(Font.SANS_SERIF, Font.BOLD, 16);
		drawer.setFont(drawerfont);

		// ������ ��ư
		ImageIcon profilebtn_img = new ImageIcon("profilebtn.png");
		JButton profilebtn = new JButton();
		profilebtn.setIcon(profilebtn_img);
		profilebtn.setBounds(35, 46, 80, 80);
		profilebtn.setBorderPainted(false);
		profilebtn.setFocusPainted(false);
		profilebtn.setContentAreaFilled(false);
		drawer.add(profilebtn);

		// ������2 ��ư
		ImageIcon drawer_profile_img = new ImageIcon("drawer_profile.png");
		JButton drawer_profile = new JButton();
		drawer_profile.setIcon(drawer_profile_img);
		drawer_profile.setBounds(135, 46, 160, 80);
		drawer_profile.setBorderPainted(false);
		drawer_profile.setFocusPainted(false);
		drawer_profile.setContentAreaFilled(false);
		drawer.add(drawer_profile);

		// ���� �г�
		ImageIcon drawertop_img = new ImageIcon("drawer_top_panel.png");
		JLabel drawertop = new JLabel(drawertop_img);
		drawertop.setBounds(0, 0, 500, 160);
		drawer.add(drawertop);

		// �̸�
		JLabel name = new JLabel("��   ��");
		Font namefont = new Font(Font.SANS_SERIF, Font.PLAIN, 50);
		name.setFont(namefont);
		name.setBounds(160, 56, 150, 100);
		drawer.add(name);

		// ������ ����
		TextField parkingticket = new TextField();
		parkingticket.setBounds(325, 305, 30, 30);
		drawer.add(parkingticket);
		
		//���� ����
		TextField coupon = new TextField();
		coupon.setBounds(325, 380, 30, 30);
		drawer.add(coupon);
		
		//������ �׼�
		TextField cash = new TextField();
		cash.setBounds(325, 450, 30, 30);
		drawer.add(cash);
		
		//������ �׼�
		TextField point = new TextField();
		point.setBounds(325, 520, 30, 30);
		drawer.add(point);

		// ���� �г�
		ImageIcon info_img = new ImageIcon("info_panel.png");
		JLabel infopanel = new JLabel(info_img);
		infopanel.setBounds(0, 230, 500, 400);
		drawer.add(infopanel);

		// �����ϱ� ��ư
		ImageIcon pay_img = new ImageIcon("pay.png");
		JButton pay = new JButton();
		pay.setIcon(pay_img);
		pay.setBounds(130, 615, 100, 40);
		pay.setBorderPainted(false);
		pay.setFocusPainted(false);
		pay.setContentAreaFilled(false);
		drawer.add(pay);
		
		// �����ϱ� ��ư
		ImageIcon question_img = new ImageIcon("question.png");
		JButton question = new JButton();
		question.setIcon(question_img);
		question.setBounds(270, 615, 100, 40);
		question.setBorderPainted(false);
		question.setFocusPainted(false);
		question.setContentAreaFilled(false);
		drawer.add(question);

		// ��� �̹���(��ξ�)
		ImageIcon drawer_img = new ImageIcon("drawer_back.png");
		JLabel drawerimg = new JLabel(drawer_img);
		drawerimg.setBounds(0, 0, 500, 800);
		drawer.add(drawerimg);

		// ������ ���� ���� ������
		Frame choose = new Frame("������ ���� ����");
		choose.setBounds(700, 50, 500, 800);
		choose.setLayout(null);// �ڵ���ġ ����
		choose.setResizable(false);

		// ����1 ��ư
		ImageIcon pic1btn_img = new ImageIcon("pic1btn.png");
		JButton pic1btn = new JButton();
		pic1btn.setIcon(pic1btn_img);
		pic1btn.setBounds(100, 150, 80, 80);
		pic1btn.setBorderPainted(false);
		pic1btn.setFocusPainted(false);
		pic1btn.setContentAreaFilled(false);
		choose.add(pic1btn);

		// ����2 ��ư
		ImageIcon pic2btn_img = new ImageIcon("pic2btn.png");
		JButton pic2btn = new JButton();
		pic2btn.setIcon(pic2btn_img);
		pic2btn.setBounds(320, 150, 80, 80);
		pic2btn.setBorderPainted(false);
		pic2btn.setFocusPainted(false);
		pic2btn.setContentAreaFilled(false);
		choose.add(pic2btn);

		// ����3 ��ư
		ImageIcon pic3btn_img = new ImageIcon("pic3btn.png");
		JButton pic3btn = new JButton();
		pic3btn.setIcon(pic3btn_img);
		pic3btn.setBounds(320, 300, 80, 80);
		pic3btn.setBorderPainted(false);
		pic3btn.setFocusPainted(false);
		pic3btn.setContentAreaFilled(false);
		choose.add(pic3btn);

		// ����4 ��ư
		ImageIcon pic4btn_img = new ImageIcon("pic4btn.png");
		JButton pic4btn = new JButton();
		pic4btn.setIcon(pic4btn_img);
		pic4btn.setBounds(100, 300, 80, 80);
		pic4btn.setBorderPainted(false);
		pic4btn.setFocusPainted(false);
		pic4btn.setContentAreaFilled(false);
		choose.add(pic4btn);

		// ����5 ��ư
		ImageIcon pic5btn_img = new ImageIcon("pic5btn.png");
		JButton pic5btn = new JButton();
		pic5btn.setIcon(pic5btn_img);
		pic5btn.setBounds(100, 450, 80, 80);
		pic5btn.setBorderPainted(false);
		pic5btn.setFocusPainted(false);
		pic5btn.setContentAreaFilled(false);
		choose.add(pic5btn);

		// ����6 ��ư
		ImageIcon pic6btn_img = new ImageIcon("pic6btn.png");
		JButton pic6btn = new JButton();
		pic6btn.setIcon(pic6btn_img);
		pic6btn.setBounds(320, 450, 80, 80);
		pic6btn.setBorderPainted(false);
		pic6btn.setFocusPainted(false);
		pic6btn.setContentAreaFilled(false);
		choose.add(pic6btn);

		// ����7 ��ư
		ImageIcon pic7btn_img = new ImageIcon("pic7btn.png");
		JButton pic7btn = new JButton();
		pic7btn.setIcon(pic7btn_img);
		pic7btn.setBounds(320, 600, 80, 80);
		pic7btn.setBorderPainted(false);
		pic7btn.setFocusPainted(false);
		pic7btn.setContentAreaFilled(false);
		choose.add(pic7btn);

		// ����8 ��ư
		ImageIcon pic8btn_img = new ImageIcon("pic8btn.png");
		JButton pic8btn = new JButton();
		pic8btn.setIcon(pic8btn_img);
		pic8btn.setBounds(100, 600, 80, 80);
		pic8btn.setBorderPainted(false);
		pic8btn.setFocusPainted(false);
		pic8btn.setContentAreaFilled(false);
		choose.add(pic8btn);

		// ��� �̹���(������ ���� ������)
		ImageIcon choose_img = new ImageIcon("drawer_back.png");
		JLabel chooseimg = new JLabel(choose_img);
		chooseimg.setBounds(0, 0, 500, 800);
		choose.add(chooseimg);

		profilebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				drawer.setVisible(false);
				choose.setVisible(true);
			}
		});

		// ������ ������
		Frame profile = new Frame("ȸ������");
		profile.setBounds(700, 50, 500, 800);
		profile.setLayout(null);// �ڵ���ġ ����
		profile.setResizable(false);

		// ��� �̹���(ȸ������)
		ImageIcon profileback_img = new ImageIcon("profile_back.png");
		JLabel profile_back = new JLabel(profileback_img);
		profile_back.setBounds(0, 0, 500, 800);
		profile.add(profile_back);

		// ��� �̹���(ȸ������)
		ImageIcon reg_img = new ImageIcon("login_back.png");
		JLabel regimg = new JLabel(reg_img);
		regimg.setBounds(0, 0, 500, 800);
		reg.add(regimg);

		regbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				login.setVisible(false);
				reg.setVisible(true);
			}
		});
		
		//-----------------------------���ξ� ��Ʈ--------------------------------
		//-----------------------------���ξ� ��Ʈ--------------------------------

		// �ߺ�Ȯ�� ��ư Ŭ�� �� ID �ߺ� ���� �Ǻ�
		idcheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				for (int i = 0; i < member.size(); i++) {
					if (member.get(i).getId().equals(regid.getText().trim())) {// ���� ���� �Է°��� member ���� ������ �ߺ�
						regokbtn.setEnabled(false);
						JOptionPane.showMessageDialog(reg, "�̹� �����ϴ� ID�Դϴ�.\n�ٽ� �Է��� �ֽʽÿ�.");
						ok = false;
						break;
					}
				}

				if (ok) {// ���� ������ ��� ����
					regokbtn.setEnabled(true);
					JOptionPane.showMessageDialog(reg, "��� ������ ID�Դϴ�.");
					idCheck = true;
				}
			}
		});
		loginbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				if (member.size() == 0) {
					JOptionPane.showMessageDialog(login, "ȸ�����Ժ��� �������ּ���.");
				}
				for (int i = 0; i < member.size(); i++) {
					if (member.get(i).getId().equals(idField.getText().trim())
							&& member.get(i).getPw().equals(pwField.getText().trim())) {

						JOptionPane.showMessageDialog(login, "ȯ���մϴ�.");
						ok = true;
//						idCheck = true;
						login.setVisible(false);
						drawer.setVisible(true);
						break;
					} else if (ok) {
						JOptionPane.showMessageDialog(login, "���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���.");
						ok = false;
					}
					;
				}
			}
		});

		// ���ηΰ� ��ư Ŭ�� ��
				mainlogo.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						main.setVisible(false);
						login.setVisible(true);
					}
				});
		
		// ������ ��ư Ŭ�� ��
		drawer_profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				drawer.setVisible(false);
				profile.setVisible(true);
			}
		});
		
		//�����ϱ� ��ư Ŭ����
		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "������ : "+parkingticket.getText()+"000��\n���� : "+coupon.getText()+"00��\n������ : "+cash.getText()+"000��\n������ : "+point.getText()+"000��\n\n������ �Ϸ�Ǿ����ϴ�.");
			}
		});
		
		// �����ϱ� ��ư Ŭ�� ��
		question.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "������ : 02-123-4567\nE-mail : abc@d.com");
			}
		});

//				-----------------choosebtn click--------------------
		pic1btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic1btn.getIcon());
				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic2btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic2btn.getIcon());
				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic3btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic3btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic4btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic4btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic5btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic5btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic6btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic6btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic7btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic7btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});

		pic8btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				profilebtn.setIcon(pic8btn.getIcon());

				JButton profilebtn = new JButton();
				profilebtn.setBounds(100, 250, 80, 80);
				profilebtn.setBorderPainted(false);
				profilebtn.setFocusPainted(false);
				profilebtn.setContentAreaFilled(false);
				drawer.add(profilebtn);
				drawer.setVisible(true);
				choose.setVisible(false);
			}
		});
//				-----------------choosebtn click--------------------
		// main ������ ���� �����ư Ȱ��ȭ
		main.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});
		
		// drawer ������ ���� �����ư Ȱ��ȭ
		drawer.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});

		// choose ������ ���� �����ư Ȱ��ȭ
		choose.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});

		// profile ������ ���� �����ư Ȱ��ȭ
		profile.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
			};
		});

		// login ������ ���� �����ư Ȱ��ȭ
		login.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
				// frame.dispose(); --> ���� �����Ӹ� ����
			};
		});

		// reg ������ ���� �����ư Ȱ��ȭ
		reg.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// �����ִ� ��� �������� ����
				// frame.dispose(); --> ���� �����Ӹ� ����
			};
		});

		main.setVisible(true);
//		login.setVisible(true);
//		drawer.setVisible(true);
	}// main

}