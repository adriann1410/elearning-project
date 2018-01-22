package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JList;

public class TeacherWindow {

	private JFrame frame;
	private JTextField daneUzytkownika;
	private JPanel infoPanel;
	private JPanel kartaDodajZadanie,kartaPodgladPrac,kartaKolos,kartaKontakt;
	private JButton przyciskWylogowania;
	JTabbedPane tabbedPane = new JTabbedPane();
	private JTextArea poleTrescZadania;
	private JLabel tekstTresc;
	private JButton przyciskWyslijZadanie;
	private JTextArea pole_Temat;
	private JLabel textTemat;
	private JTextArea poleNumerAlbumu;
	private JLabel tekstAlbum;
	private JLabel tekst_tresc;
	private JTextArea poleTresc;
	private JButton przyciskWyslij;
	private JTextArea poleIDKolokwium;
	private JLabel tekstIDKol;
	private JTextArea poleTrescPytania;
	private JLabel tekstPytanie;
	private JTextArea odpowiedzNumer1;
	private JTextArea odpowiedzNumer2;
	private JTextArea odpowiedzNumer3;
	private JTextArea odpowiedzNumer4;
	private JLabel tekst_odp1;
	private JLabel tekst_odp2;
	private JLabel tekst_odp3;
	private JLabel tekst_odp4;
	private JButton przyciskNastepne;
	private JButton przyciskKoniec;
	private JList list;
	private JButton przyciskPobierzWszystkie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherWindow window = new TeacherWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeacherWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 483, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//----- g�rny panel, info o u�ytkowniku
		
		infoPanel = new JPanel();
		infoPanel.setBackground(SystemColor.control);
		infoPanel.setBounds(0, 0, 477, 39);
		infoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel Uzytkownik = new JLabel("U\u017Cytkownik:");
		Uzytkownik.setBounds(10, 9, 79, 14);
		infoPanel.add(Uzytkownik);
		
		daneUzytkownika = new JTextField();
		daneUzytkownika.setBounds(99, 6, 199, 20);
		infoPanel.add(daneUzytkownika);
		daneUzytkownika.setBackground(SystemColor.control);
		daneUzytkownika.setForeground(SystemColor.control);
		daneUzytkownika.setEditable(false);
		daneUzytkownika.setBorder(null);
		daneUzytkownika.setColumns(10);
		
		przyciskWylogowania = new JButton("Wyloguj si\u0119");
		przyciskWylogowania.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		przyciskWylogowania.setForeground(SystemColor.desktop);
		przyciskWylogowania.setBounds(358, 7, 109, 19);
		infoPanel.add(przyciskWylogowania);
        
		//------ stworzenie poszczeg�lnych wygl�d�w kazdej zak�adki
		
        kartaDodajZadanie = new JPanel();
        kartaDodajZadanie.setBackground(SystemColor.control);
        kartaDodajZadanie.setBounds(0, 36, 550, 398);
        kartaDodajZadanie.setLayout(null);
        
        kartaPodgladPrac = new JPanel();
        kartaPodgladPrac.setBackground(SystemColor.control);
        kartaPodgladPrac.setBounds(0, 36, 550, 398);
        kartaPodgladPrac.setLayout(null);
        
        kartaKolos = new JPanel();
        kartaKolos.setBackground(SystemColor.control);
        kartaKolos.setBounds(0, 36, 550, 398);
        kartaKolos.setLayout(null);
        
        kartaKontakt = new JPanel();
        kartaKontakt.setBackground(SystemColor.control);
        kartaKontakt.setBounds(0, 36, 550, 398);
        kartaKontakt.setLayout(null);
        
        
        //--------------- stworzenie zak�adek i dodanie do nich kart
        
        tabbedPane.setBounds(0, 36, 478, 354);
        frame.getContentPane().add(tabbedPane);
        tabbedPane.setBorder(null);
        tabbedPane.setBackground(SystemColor.control);
        tabbedPane.addTab("Dodaj Zadanie", kartaDodajZadanie);
        tabbedPane.addTab("Dodaj Kolokwium", kartaKolos);
        tabbedPane.addTab("Podgl�d Prac", kartaPodgladPrac);
        tabbedPane.addTab("Kontakt ze studentem", kartaKontakt);
        
        
        
        //------------ komponenty do 1 zak�adki
        
        poleTrescZadania = new JTextArea();
        poleTrescZadania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        poleTrescZadania.setBounds(10, 35, 453, 237);
        poleTrescZadania.setBorder(new LineBorder(new Color(0, 0, 0)));
        poleTrescZadania.setColumns(10);
        kartaDodajZadanie.add(poleTrescZadania);
 
        tekstTresc = new JLabel("Tre\u015B\u0107 zadania");
        tekstTresc.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        tekstTresc.setHorizontalAlignment(SwingConstants.CENTER);
        tekstTresc.setBounds(135, 7, 196, 24);
        kartaDodajZadanie.add(tekstTresc);
        
        przyciskWyslijZadanie = new JButton("Wy\u015Blij zadanie");
        przyciskWyslijZadanie.setBounds(177, 283, 126, 32);
        kartaDodajZadanie.add(przyciskWyslijZadanie);
       
        
        //---------- komponenty do 2 zak�adki
        
        tekstIDKol = new JLabel("ID_Kolokwium:");
        tekstIDKol.setBounds(10, 7, 86, 14);
        kartaKolos.add(tekstIDKol);
        
        poleIDKolokwium = new JTextArea();
        poleIDKolokwium.setBounds(10, 23, 86, 20);
        poleIDKolokwium.setBorder(new LineBorder(new Color(0, 0, 0)));
        poleIDKolokwium.setColumns(10);
        kartaKolos.add(poleIDKolokwium);
        
        poleTrescPytania = new JTextArea();
        poleTrescPytania.setBounds(10, 66, 453, 44);
        poleTrescPytania.setBorder(new LineBorder(new Color(0, 0, 0)));
        poleTrescPytania.setColumns(10);
        kartaKolos.add(poleTrescPytania);
     
        
        tekstPytanie = new JLabel("Tre\u015B\u0107 Pytania");
        tekstPytanie.setBounds(10, 48, 86, 14);
        kartaKolos.add(tekstPytanie);
        
        odpowiedzNumer1 = new JTextArea();
        odpowiedzNumer1.setBounds(10, 130, 453, 20);
        odpowiedzNumer1.setBorder(new LineBorder(new Color(0, 0, 0)));
        odpowiedzNumer1.setColumns(10);
        kartaKolos.add(odpowiedzNumer1);
      
        
        odpowiedzNumer2 = new JTextArea();
        odpowiedzNumer2.setBounds(10, 170, 453, 20);
        odpowiedzNumer2.setBorder(new LineBorder(new Color(0, 0, 0)));
        odpowiedzNumer2.setColumns(10);
        kartaKolos.add(odpowiedzNumer2);
        
        
        odpowiedzNumer3 = new JTextArea();
        odpowiedzNumer3.setBounds(10, 210, 453, 20);
        odpowiedzNumer3.setBorder(new LineBorder(new Color(0, 0, 0)));
        odpowiedzNumer3.setColumns(10);
        kartaKolos.add(odpowiedzNumer3);
     
        
        odpowiedzNumer4 = new JTextArea();
        odpowiedzNumer4.setBounds(10, 250, 453, 20);
        odpowiedzNumer4.setBorder(new LineBorder(new Color(0, 0, 0)));
        odpowiedzNumer4.setColumns(10);
        kartaKolos.add(odpowiedzNumer4);

        
        tekst_odp1 = new JLabel("Odpowied\u017A 1");
        tekst_odp1.setBounds(10, 115, 86, 14);
        kartaKolos.add(tekst_odp1);
        
        tekst_odp2 = new JLabel("Odpowied\u017A 2");
        tekst_odp2.setBounds(10, 155, 86, 14);
        kartaKolos.add(tekst_odp2);
        
        tekst_odp3 = new JLabel("Odpowied\u017A 3");
        tekst_odp3.setBounds(10, 195, 110, 14);
        kartaKolos.add(tekst_odp3);
        
        tekst_odp4 = new JLabel("Odpowied\u017A 4");
        tekst_odp4.setBounds(10, 235, 133, 14);
        kartaKolos.add(tekst_odp4);
        
        przyciskNastepne = new JButton("Nast\u0119pne");
        przyciskNastepne.setBounds(249, 281, 110, 34);
        kartaKolos.add(przyciskNastepne);
        
        przyciskKoniec = new JButton("Koniec");
        przyciskKoniec.setBounds(110, 281, 110, 34);
        kartaKolos.add(przyciskKoniec);
     
        
        //------ komponenty do 3 zak�adki
        
        list = new JList();
        list.setBounds(10, 11, 453, 262);
        kartaPodgladPrac.add(list);
        
        przyciskPobierzWszystkie = new JButton("Pobierz wszystkie");
        przyciskPobierzWszystkie.setBounds(157, 292, 148, 23);
        kartaPodgladPrac.add(przyciskPobierzWszystkie);
       
      //------ komponenty do 4 zak�adki
        
        pole_Temat = new JTextArea();
        pole_Temat.setBounds(10, 69, 453, 20);
        pole_Temat.setBorder(new LineBorder(new Color(0, 0, 0)));
        pole_Temat.setColumns(10);
        kartaKontakt.add(pole_Temat);
        
        textTemat = new JLabel("Temat:");
        textTemat.setBounds(10, 50, 46, 14);
        kartaKontakt.add(textTemat);
        
        poleNumerAlbumu = new JTextArea();
        poleNumerAlbumu.setBounds(10, 25, 131, 20);
        poleNumerAlbumu.setBorder(new LineBorder(new Color(0, 0, 0)));
        poleNumerAlbumu.setColumns(10);
        kartaKontakt.add(poleNumerAlbumu);

        tekstAlbum = new JLabel("Numer Albumu");
        tekstAlbum.setBounds(10, 8, 91, 14);
        kartaKontakt.add(tekstAlbum);
        
        tekst_tresc = new JLabel("Tre\u015B\u0107:");
        tekst_tresc.setBounds(10, 100, 46, 14);
        kartaKontakt.add(tekst_tresc);
        
        poleTresc = new JTextArea();
        poleTresc.setBorder(new LineBorder(new Color(0, 0, 0)));
        poleTresc.setBounds(10, 117, 453, 160);
     
        kartaKontakt.add(poleTresc);
        poleTresc.setColumns(10);
        
        przyciskWyslij = new JButton("Wy\u015Blij");
        przyciskWyslij.setBounds(178, 288, 112, 27);
        kartaKontakt.add(przyciskWyslij);
        
        
	}
}