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
		
		// 메인 프레임
		Frame main = new Frame("메인");
		main.setBounds(700, 50, 500, 800);		
		main.setLayout(null);
		main.setResizable(false);
		
		// 메인 로고 버튼
		ImageIcon mainlogo_img = new ImageIcon("mainlogo.png");
		JButton mainlogo = new JButton();
		mainlogo.setIcon(mainlogo_img);
		mainlogo.setBounds(180, 300, 120, 120);
		mainlogo.setBorderPainted(false);
		mainlogo.setFocusPainted(false);
		mainlogo.setContentAreaFilled(false);
		main.add(mainlogo);
		
		// 메인 패널
		ImageIcon main_panel = new ImageIcon("main_back.png");
		JLabel mainback = new JLabel(main_panel);
		mainback.setBounds(0, 0, 500, 800);
		main.add(mainback);
		
		// 로그인 프레임
		Frame login = new Frame("로그인");
		login.setBounds(700, 50, 500, 800);
		login.setLayout(null);// 자동배치 끄기
		login.setResizable(false);
		
		//X표 글로즈
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
        //닫기버튼으로 프레임 종료
        Xbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		login.add(Xbtn);
		
		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 16);
		login.setFont(font);

		// 로그인 패널
		ImageIcon loginpanel_img = new ImageIcon("login_panel.png");
		JLabel loginpanel = new JLabel(loginpanel_img);
		loginpanel.setBounds(50, 300, 400, 200);
		
		// 로그인 로고 패널
		ImageIcon loginlogo_img = new ImageIcon("login_logo.png");
		JLabel loginlogo = new JLabel(loginlogo_img);
		loginlogo.setBounds(0, 90, 500, 250);
		login.add(loginlogo);

		// 아이디, 암호 입력창 표시
		TextField idField = new TextField();
		idField.setBounds(180, 353, 200, 30);
		TextField pwField = new TextField();
		pwField.setEchoChar('*');
		pwField.setBounds(180, 415, 200, 30);

		// 아이디, 암호 각 부위 생성
		login.add(idField);
		login.add(pwField);
		login.add(loginpanel);

		// 로그인 버튼
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

		// 회원가입 버튼
		ImageIcon regbtn_img = new ImageIcon("regbtn.png");
		JButton regbtn = new JButton();
		regbtn.setIcon(regbtn_img);
		regbtn.setBounds(270, 530, 100, 40);
		regbtn.setBorderPainted(false);
		regbtn.setFocusPainted(false);
		regbtn.setContentAreaFilled(false);
		login.add(regbtn);
		
		//id찾기버튼
        Button idS = new Button("ID찾기");
        Font fon = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
        idS.setFont(fon);
        idS.setBounds(300, 505, 48, 20);
        login.add(idS);
        idS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String findNameText = JOptionPane.showInputDialog(null, "회원가입 시 사용한 이름을 입력해 주세요.", "ID 찾기", JOptionPane.OK_CANCEL_OPTION);
				if (findNameText.isEmpty()) {
					JOptionPane.showMessageDialog(idS, "ID를 입력해 주세요.");
					return;
				}

				for (int i = 0; i < member.size(); i++) {
					String memberName = member.get(i).getName();

					if (findNameText.equals(memberName)) {
						JOptionPane.showMessageDialog(idS, "id는" + member.get(i).getId() + "입니다.");
						return;
					}
				}

				JOptionPane.showMessageDialog(idS, "정보가 일치하지 않습니다.");
			}
		});
		
		//pw찾기버튼
        Button pwS = new Button("PW찾기");
        pwS.setFont(fon);
        pwS.setBounds(350, 505, 51, 20);
        login.add(pwS);
        pwS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String idFieldText = idField.getText().trim();
				if (idFieldText.isEmpty()) {
					JOptionPane.showMessageDialog(pwS, "ID를 입력해 주세요.");
					return;
				}

				for (int i = 0; i < member.size(); i++) {
					String memberId = member.get(i).getId();

					if (idFieldText.equals(memberId)) {
						JOptionPane.showMessageDialog(pwS, "pw는" + member.get(i).getPw() + "입니다.");
						return;
					}
				}

				JOptionPane.showMessageDialog(pwS, "정보가 일치하지 않습니다.");
			}
		});
		

		// 배경 이미지(로그인)
		ImageIcon login_img = new ImageIcon("login_back.png");
		JLabel loginimg = new JLabel(login_img);
		loginimg.setBounds(0, 0, 500, 800);
		login.add(loginimg);

		// 회원가입 프레임
		Frame reg = new Frame("회원가입");
		reg.setBounds(700, 50, 500, 800);
		reg.setLayout(null);// 자동배치 끄기
		reg.setResizable(false);

		// 폰트
		reg.setFont(font);

		// 중복확인 버튼
		JButton idcheck = new JButton();
		idcheck.setBounds(360, 399, 100, 40);
		idcheck.setBorderPainted(false);
		idcheck.setFocusPainted(false);
		idcheck.setContentAreaFilled(false);
		reg.add(idcheck);
		idcheck.setEnabled(false);
		
		// 회원가입 로고 패널
		ImageIcon reglog_img = new ImageIcon("login_logo.png");
		JLabel reglogo = new JLabel(reglog_img);
		reglogo.setBounds(0, 90, 500, 250);
		reg.add(reglogo);
		
		// 회원가입 패널
		ImageIcon regpanel_img = new ImageIcon("reg_panel.png");
		JLabel regpanel = new JLabel(regpanel_img);
		regpanel.setBounds(50, 300, 400, 240);

		// 이름, 아이디, 암호 입력창 표시
		TextField regname = new TextField();
		regname.setBounds(180, 350, 180, 30);

		TextField regid = new TextField();
		regid.setBounds(180, 406, 180, 30);
		regid.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {// ID 중복확인 버튼 활성화 유무
				if (regid.getText().trim().length() == 0) {// 빈칸 제외 입력된 값이 없으면
					idcheck.setEnabled(false);// 아무것도 입력이 안되었다면 버튼 비활성화
				} else {
					idcheck.setEnabled(true);// 무언가 입력되었다면 활성화
				}
			}
		});

		TextField regpw = new TextField();
		regpw.setEchoChar('*');
		regpw.setBounds(180, 462, 180, 30);

		// 이름, 아이디, 암호 각 부위 생성
		reg.add(regname);
		reg.add(regid);
		reg.add(regpw);
		reg.add(regpanel);

		// 회원가입 완료 버튼
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
					JOptionPane.showMessageDialog(reg, "이름을 입력해주세요.");
				} else if (regid.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(reg, "ID를 입력해주세요.");
				} else if (regpw.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(reg, "암호를 입력해주세요.");
				} else {
					j = new Join();
					j.setName(regname.getText());
					j.setId(regid.getText());
					j.setPw(regpw.getText());

					member.add(j);
					JOptionPane.showMessageDialog(reg, "회원가입이 완료되었습니다.");
					reg.setVisible(false);
					login.setVisible(true);
				}
			}
		});

		// 드로어 프레임
		Frame drawer = new Frame("드로어");
		drawer.setBounds(700, 50, 500, 800);
		drawer.setLayout(null);// 자동배치 끄기
		drawer.setResizable(false);

		// 폰트
		Font drawerfont = new Font(Font.SANS_SERIF, Font.BOLD, 16);
		drawer.setFont(drawerfont);

		// 프로필 버튼
		ImageIcon profilebtn_img = new ImageIcon("profilebtn.png");
		JButton profilebtn = new JButton();
		profilebtn.setIcon(profilebtn_img);
		profilebtn.setBounds(35, 46, 80, 80);
		profilebtn.setBorderPainted(false);
		profilebtn.setFocusPainted(false);
		profilebtn.setContentAreaFilled(false);
		drawer.add(profilebtn);

		// 프로필2 버튼
		ImageIcon drawer_profile_img = new ImageIcon("drawer_profile.png");
		JButton drawer_profile = new JButton();
		drawer_profile.setIcon(drawer_profile_img);
		drawer_profile.setBounds(135, 46, 160, 80);
		drawer_profile.setBorderPainted(false);
		drawer_profile.setFocusPainted(false);
		drawer_profile.setContentAreaFilled(false);
		drawer.add(drawer_profile);

		// 정보 패널
		ImageIcon drawertop_img = new ImageIcon("drawer_top_panel.png");
		JLabel drawertop = new JLabel(drawertop_img);
		drawertop.setBounds(0, 0, 500, 160);
		drawer.add(drawertop);

		// 이름
		JLabel name = new JLabel("이   름");
		Font namefont = new Font(Font.SANS_SERIF, Font.PLAIN, 50);
		name.setFont(namefont);
		name.setBounds(160, 56, 150, 100);
		drawer.add(name);

		// 주차권 수량
		TextField parkingticket = new TextField();
		parkingticket.setBounds(325, 305, 30, 30);
		drawer.add(parkingticket);
		
		//쿠폰 수량
		TextField coupon = new TextField();
		coupon.setBounds(325, 380, 30, 30);
		drawer.add(coupon);
		
		//충전금 액수
		TextField cash = new TextField();
		cash.setBounds(325, 450, 30, 30);
		drawer.add(cash);
		
		//적립금 액수
		TextField point = new TextField();
		point.setBounds(325, 520, 30, 30);
		drawer.add(point);

		// 정보 패널
		ImageIcon info_img = new ImageIcon("info_panel.png");
		JLabel infopanel = new JLabel(info_img);
		infopanel.setBounds(0, 230, 500, 400);
		drawer.add(infopanel);

		// 결제하기 버튼
		ImageIcon pay_img = new ImageIcon("pay.png");
		JButton pay = new JButton();
		pay.setIcon(pay_img);
		pay.setBounds(130, 615, 100, 40);
		pay.setBorderPainted(false);
		pay.setFocusPainted(false);
		pay.setContentAreaFilled(false);
		drawer.add(pay);
		
		// 문의하기 버튼
		ImageIcon question_img = new ImageIcon("question.png");
		JButton question = new JButton();
		question.setIcon(question_img);
		question.setBounds(270, 615, 100, 40);
		question.setBorderPainted(false);
		question.setFocusPainted(false);
		question.setContentAreaFilled(false);
		drawer.add(question);

		// 배경 이미지(드로어)
		ImageIcon drawer_img = new ImageIcon("drawer_back.png");
		JLabel drawerimg = new JLabel(drawer_img);
		drawerimg.setBounds(0, 0, 500, 800);
		drawer.add(drawerimg);

		// 프로필 사진 선택 프레임
		Frame choose = new Frame("프로필 사진 선택");
		choose.setBounds(700, 50, 500, 800);
		choose.setLayout(null);// 자동배치 끄기
		choose.setResizable(false);

		// 사진1 버튼
		ImageIcon pic1btn_img = new ImageIcon("pic1btn.png");
		JButton pic1btn = new JButton();
		pic1btn.setIcon(pic1btn_img);
		pic1btn.setBounds(100, 150, 80, 80);
		pic1btn.setBorderPainted(false);
		pic1btn.setFocusPainted(false);
		pic1btn.setContentAreaFilled(false);
		choose.add(pic1btn);

		// 사진2 버튼
		ImageIcon pic2btn_img = new ImageIcon("pic2btn.png");
		JButton pic2btn = new JButton();
		pic2btn.setIcon(pic2btn_img);
		pic2btn.setBounds(320, 150, 80, 80);
		pic2btn.setBorderPainted(false);
		pic2btn.setFocusPainted(false);
		pic2btn.setContentAreaFilled(false);
		choose.add(pic2btn);

		// 사진3 버튼
		ImageIcon pic3btn_img = new ImageIcon("pic3btn.png");
		JButton pic3btn = new JButton();
		pic3btn.setIcon(pic3btn_img);
		pic3btn.setBounds(320, 300, 80, 80);
		pic3btn.setBorderPainted(false);
		pic3btn.setFocusPainted(false);
		pic3btn.setContentAreaFilled(false);
		choose.add(pic3btn);

		// 사진4 버튼
		ImageIcon pic4btn_img = new ImageIcon("pic4btn.png");
		JButton pic4btn = new JButton();
		pic4btn.setIcon(pic4btn_img);
		pic4btn.setBounds(100, 300, 80, 80);
		pic4btn.setBorderPainted(false);
		pic4btn.setFocusPainted(false);
		pic4btn.setContentAreaFilled(false);
		choose.add(pic4btn);

		// 사진5 버튼
		ImageIcon pic5btn_img = new ImageIcon("pic5btn.png");
		JButton pic5btn = new JButton();
		pic5btn.setIcon(pic5btn_img);
		pic5btn.setBounds(100, 450, 80, 80);
		pic5btn.setBorderPainted(false);
		pic5btn.setFocusPainted(false);
		pic5btn.setContentAreaFilled(false);
		choose.add(pic5btn);

		// 사진6 버튼
		ImageIcon pic6btn_img = new ImageIcon("pic6btn.png");
		JButton pic6btn = new JButton();
		pic6btn.setIcon(pic6btn_img);
		pic6btn.setBounds(320, 450, 80, 80);
		pic6btn.setBorderPainted(false);
		pic6btn.setFocusPainted(false);
		pic6btn.setContentAreaFilled(false);
		choose.add(pic6btn);

		// 사진7 버튼
		ImageIcon pic7btn_img = new ImageIcon("pic7btn.png");
		JButton pic7btn = new JButton();
		pic7btn.setIcon(pic7btn_img);
		pic7btn.setBounds(320, 600, 80, 80);
		pic7btn.setBorderPainted(false);
		pic7btn.setFocusPainted(false);
		pic7btn.setContentAreaFilled(false);
		choose.add(pic7btn);

		// 사진8 버튼
		ImageIcon pic8btn_img = new ImageIcon("pic8btn.png");
		JButton pic8btn = new JButton();
		pic8btn.setIcon(pic8btn_img);
		pic8btn.setBounds(100, 600, 80, 80);
		pic8btn.setBorderPainted(false);
		pic8btn.setFocusPainted(false);
		pic8btn.setContentAreaFilled(false);
		choose.add(pic8btn);

		// 배경 이미지(프로필 선택 페이지)
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

		// 프로필 프레임
		Frame profile = new Frame("회원정보");
		profile.setBounds(700, 50, 500, 800);
		profile.setLayout(null);// 자동배치 끄기
		profile.setResizable(false);

		// 배경 이미지(회원정보)
		ImageIcon profileback_img = new ImageIcon("profile_back.png");
		JLabel profile_back = new JLabel(profileback_img);
		profile_back.setBounds(0, 0, 500, 800);
		profile.add(profile_back);

		// 배경 이미지(회원가입)
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
		
		//-----------------------------정민씨 파트--------------------------------
		//-----------------------------정민씨 파트--------------------------------

		// 중복확인 버튼 클릭 시 ID 중복 여부 판별
		idcheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				for (int i = 0; i < member.size(); i++) {
					if (member.get(i).getId().equals(regid.getText().trim())) {// 공백 제외 입력값이 member 값과 같으면 중복
						regokbtn.setEnabled(false);
						JOptionPane.showMessageDialog(reg, "이미 존재하는 ID입니다.\n다시 입력해 주십시오.");
						ok = false;
						break;
					}
				}

				if (ok) {// 같지 않으면 사용 가능
					regokbtn.setEnabled(true);
					JOptionPane.showMessageDialog(reg, "사용 가능한 ID입니다.");
					idCheck = true;
				}
			}
		});
		loginbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				if (member.size() == 0) {
					JOptionPane.showMessageDialog(login, "회원가입부터 진행해주세요.");
				}
				for (int i = 0; i < member.size(); i++) {
					if (member.get(i).getId().equals(idField.getText().trim())
							&& member.get(i).getPw().equals(pwField.getText().trim())) {

						JOptionPane.showMessageDialog(login, "환영합니다.");
						ok = true;
//						idCheck = true;
						login.setVisible(false);
						drawer.setVisible(true);
						break;
					} else if (ok) {
						JOptionPane.showMessageDialog(login, "아이디 또는 비밀번호를 확인해주세요.");
						ok = false;
					}
					;
				}
			}
		});

		// 메인로고 버튼 클릭 시
				mainlogo.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						main.setVisible(false);
						login.setVisible(true);
					}
				});
		
		// 프로필 버튼 클릭 시
		drawer_profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				drawer.setVisible(false);
				profile.setVisible(true);
			}
		});
		
		//결제하기 버튼 클릭시
		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "주차권 : "+parkingticket.getText()+"000원\n쿠폰 : "+coupon.getText()+"00원\n충전금 : "+cash.getText()+"000원\n적립금 : "+point.getText()+"000원\n\n결제가 완료되었습니다.");
			}
		});
		
		// 문의하기 버튼 클릭 시
		question.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "고객센터 : 02-123-4567\nE-mail : abc@d.com");
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
		// main 프레임 우상단 종료버튼 활성화
		main.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
			};
		});
		
		// drawer 프레임 우상단 종료버튼 활성화
		drawer.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
			};
		});

		// choose 프레임 우상단 종료버튼 활성화
		choose.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
			};
		});

		// profile 프레임 우상단 종료버튼 활성화
		profile.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
			};
		});

		// login 프레임 우상단 종료버튼 활성화
		login.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
				// frame.dispose(); --> 현재 프레임만 종료
			};
		});

		// reg 프레임 우상단 종료버튼 활성화
		reg.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 열려있는 모든 프레임을 종료
				// frame.dispose(); --> 현재 프레임만 종료
			};
		});

		main.setVisible(true);
//		login.setVisible(true);
//		drawer.setVisible(true);
	}// main

}