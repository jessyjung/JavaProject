package parking_lot_management;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Drawer {
	public static void main(String[] args) {
		//��ξ� ������
		Frame drawer = new Frame("��ξ�");
		drawer.setBounds(1500, 50, 500, 800);
		drawer.setLayout(null);//�ڵ���ġ ����
		drawer.setResizable(false);
				
		//��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 16); 
		drawer.setFont(font);
				
		//������ ��ư
		ImageIcon profilebtn_img = new ImageIcon("profilebtn.png");
		JButton profilebtn = new JButton();
		profilebtn.setIcon(profilebtn_img);
		profilebtn.setBounds(35, 46, 80, 80);
		profilebtn.setBorderPainted(false);
		profilebtn.setFocusPainted(false);
		profilebtn.setContentAreaFilled(false);
		drawer.add(profilebtn);
		
		//������2 ��ư
		ImageIcon drawer_profile_img = new ImageIcon("drawer_profile.png");
		JButton drawer_profile = new JButton();
		drawer_profile.setIcon(drawer_profile_img);
		drawer_profile.setBounds(135, 46, 160, 80);
		drawer_profile.setBorderPainted(false);
		drawer_profile.setFocusPainted(false);
		drawer_profile.setContentAreaFilled(false);
		drawer.add(drawer_profile);
		
		//���� �г�
		ImageIcon drawertop_img = new ImageIcon("drawer_top_panel.png");
		JLabel drawertop = new JLabel(drawertop_img);
		drawertop.setBounds(0, 0, 500, 160);
		drawer.add(drawertop);
		
		//�̸�
		JLabel name = new JLabel("��   ��");
		Font namefont = new Font(Font.SANS_SERIF, Font.PLAIN, 50);
		name.setFont(namefont);
		name.setBounds(160, 56, 150, 100);
		drawer.add(name);
		
		
		//������ ��ư
		ImageIcon ticket1_img = new ImageIcon("drawer.progile.png");
		JButton ticket1 = new JButton("1");
		ticket1.setIcon(ticket1_img);
		Font TicketButtonFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);
		ticket1.setFont(TicketButtonFont);
		ticket1.setBounds(320, 296, 55, 55);
		ticket1.setBorderPainted(false);
		ticket1.setFocusPainted(false);
		ticket1.setContentAreaFilled(false);
		drawer.add(ticket1);
		
		//���� �г�
		ImageIcon info_img = new ImageIcon("info_panel.png");
		JLabel infopanel = new JLabel(info_img);
		infopanel.setBounds(0, 230, 500, 400);
		drawer.add(infopanel);
		
		//�����ϱ� ��ư
		ImageIcon question_img = new ImageIcon("question.png");
		JButton question = new JButton();
		question.setIcon(question_img);
		question.setBounds(150, 650, 180, 50);
		question.setBorderPainted(false);
		question.setFocusPainted(false);
		question.setContentAreaFilled(false);
		drawer.add(question);
		
		//��� �̹���(�α���)
		ImageIcon drawer_img = new ImageIcon("drawer_back.png");
		JLabel drawerimg = new JLabel(drawer_img);
		drawerimg.setBounds(0, 0, 500, 800);
		drawer.add(drawerimg);
		//-------------------------------------------------------
		//������ ���� ���� ������
		Frame choose = new Frame("������ ���� ����");
		choose.setBounds(1500, 50, 500, 800);
		choose.setLayout(null);//�ڵ���ġ ����
		choose.setResizable(false);
		
		//����1 ��ư
		ImageIcon pic1btn_img = new ImageIcon("pic1btn.png");
		JButton pic1btn = new JButton();
		pic1btn.setIcon(pic1btn_img);
		pic1btn.setBounds(100, 150, 80, 80);
		pic1btn.setBorderPainted(false);
		pic1btn.setFocusPainted(false);
		pic1btn.setContentAreaFilled(false);
		choose.add(pic1btn);
		
		//����2 ��ư
		ImageIcon pic2btn_img = new ImageIcon("pic2btn.png");
		JButton pic2btn = new JButton();
		pic2btn.setIcon(pic2btn_img);
		pic2btn.setBounds(320, 150, 80, 80);
		pic2btn.setBorderPainted(false);
		pic2btn.setFocusPainted(false);
		pic2btn.setContentAreaFilled(false);
		choose.add(pic2btn);
		
		//����3 ��ư
		ImageIcon pic3btn_img = new ImageIcon("pic3btn.png");
		JButton pic3btn = new JButton();
		pic3btn.setIcon(pic3btn_img);
		pic3btn.setBounds(320, 300, 80, 80);
		pic3btn.setBorderPainted(false);
		pic3btn.setFocusPainted(false);
		pic3btn.setContentAreaFilled(false);
		choose.add(pic3btn);
		
		//����4 ��ư
		ImageIcon pic4btn_img = new ImageIcon("pic4btn.png");
		JButton pic4btn = new JButton();
		pic4btn.setIcon(pic4btn_img);
		pic4btn.setBounds(100, 300, 80, 80);
		pic4btn.setBorderPainted(false);
		pic4btn.setFocusPainted(false);
		pic4btn.setContentAreaFilled(false);
		choose.add(pic4btn);
		
		//����5 ��ư
		ImageIcon pic5btn_img = new ImageIcon("pic5btn.png");
		JButton pic5btn = new JButton();
		pic5btn.setIcon(pic5btn_img);
		pic5btn.setBounds(100, 450, 80, 80);
		pic5btn.setBorderPainted(false);
		pic5btn.setFocusPainted(false);
		pic5btn.setContentAreaFilled(false);
		choose.add(pic5btn);
		
		//����6 ��ư
		ImageIcon pic6btn_img = new ImageIcon("pic6btn.png");
		JButton pic6btn = new JButton();
		pic6btn.setIcon(pic6btn_img);
		pic6btn.setBounds(320, 450, 80, 80);
		pic6btn.setBorderPainted(false);
		pic6btn.setFocusPainted(false);
		pic6btn.setContentAreaFilled(false);
		choose.add(pic6btn);
		
		//����7 ��ư
		ImageIcon pic7btn_img = new ImageIcon("pic7btn.png");
		JButton pic7btn = new JButton();
		pic7btn.setIcon(pic7btn_img);
		pic7btn.setBounds(320, 600, 80, 80);
		pic7btn.setBorderPainted(false);
		pic7btn.setFocusPainted(false);
		pic7btn.setContentAreaFilled(false);
		choose.add(pic7btn);
		
		//����8 ��ư
		ImageIcon pic8btn_img = new ImageIcon("pic8btn.png");
		JButton pic8btn = new JButton();
		pic8btn.setIcon(pic8btn_img);
		pic8btn.setBounds(100, 600, 80, 80);
		pic8btn.setBorderPainted(false);
		pic8btn.setFocusPainted(false);
		pic8btn.setContentAreaFilled(false);
		choose.add(pic8btn);
		
		//��� �̹���(������ ���� ������)
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
		
		//������  ������
				Frame profile = new Frame("ȸ������");
				profile.setBounds(1500, 50, 500, 800);
				profile.setLayout(null);//�ڵ���ġ ����
				profile.setResizable(false);
		
		//��� �̹���(ȸ������)
		ImageIcon profileback_img = new ImageIcon("profile_back.png");
		JLabel profile_back = new JLabel(profileback_img);
		profile_back.setBounds(0, 0, 500, 800);
		profile.add(profile_back);
		
		
		//������ ��ư Ŭ�� ��
		drawer_profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				drawer.setVisible(false);
			    profile.setVisible(true);
			}
		});
		
		//�����ǹ�ư Ŭ�� ��
				ticket1.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						ticket1.setText("2");	
					}
				});
		
		//�����ϱ� ��ư Ŭ�� ��
		question.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "������ : 02-123-4567\nE-mail : abc@d.com");
			}
		});
		
//		-----------------choosebtn click--------------------
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
//		-----------------choosebtn click--------------------
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
		
		drawer.setVisible(true);
	}//main

}
