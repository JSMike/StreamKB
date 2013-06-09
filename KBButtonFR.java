/**
 * KBButton 1.1
 * ============
 * AZERTY keyboard layout added.
 */

/**
 * @author Mike
 *
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class KBButtonFR extends JButton{
  private static final long serialVersionUID = 2036873143L;
	protected int kbHeight;
	protected int kbWidth;
	protected int myVal;
	
	public KBButtonFR(int val){
		this(val, new Color(238,238,238));
	}

	public KBButtonFR(int val, Color bg){
		super(KeyEvent.getKeyText(val));
		setFont(new Font("sansserif",Font.PLAIN,12));
		setMargin(new Insets(0, 0, 0, 0));
		setBackground(bg);
		kbHeight = 24;
		kbWidth = 24;
		myVal = val;
		
		switch(val){
			// Echap
			case 27:	setText("Ech");
						kbHeight = 17;
						kbWidth = 21;
						setFont(new Font("sansserif",Font.PLAIN,8));
						break;
			// F1-12
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						break;
			// PrtScr	
			case 44:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Imp");
						break;
			// Pause
			case 19:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("Arial Black",Font.BOLD,8));
						setText("| |");
						break;
			// Insert
			case 45:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Ins");
						break;
			// Del
			case 46: 	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Sup");
						break;
			// ²
			case 222:	kbWidth = 12;
						setText("²");
						break;
			// )
			case 219:	setText(")");
						break;
			// =
			case 187:	setText("=");
						break;
			// Backspace
			case 8:	 	kbWidth = 44;
						setText("RA");
						break;
			// Tab
			case 9: 	kbWidth = 27;
						break;			
			// Crochet fermant
			case 221:	setText("^");
						break;
			// Point-virgule
			case 186:	setText("$");
						break;
			// Entrée
			case 13:	kbWidth = 29;
						setText("Entr");
						break;
			case 1013:	setText("ée");
						kbWidth = 16;
						break;
			// Verrouillage des majuscules
			case 20:	kbWidth = 40;
						setText("MAJ");
						break;
			// Accent grave avec chasse
			case 192:	setText("%");
						break;
			// Barre oblique inverse
			case 220:	setText("µ");
						break;
			// Maj
			case 160:	setText("Maj");
						kbWidth = 40;
						break;
			// <
			case 226:	setText("<");
						break;
			// ?
			case 188:	setText("?");			
						break;
			// .
			case 190:	setText(".");
						break;
			// /
			case 191:	setText("/");
						break;
			// §
			case 223:	setText("§");
						break;
			// Maj
			case 161:	setText("Maj");
						kbWidth = 41;
						break;
			// Ctrl left
			case 162:	kbWidth = 29;
						setText("Ctrl");
						setFont(new Font("sansserif",Font.PLAIN,12));
						break;
						
			//win
			case 91: 	kbWidth = 32;
						setText("Win");
						break;
			//Alt left
			case 164:	kbWidth = 32;
						setText("Alt");
						break;
			//space
			case 32: 	kbWidth = 90;
						setText("Espace");
						break;
			
			//Alt Greater
			case 165:	kbWidth = 32;
						setText("AltGr");
						break;
			//Context Menu
			case 93:	kbWidth = 32;
						setText("Menu");
						break;
			//ctrl right
			case 163:	kbWidth = 29;
						setText("Ctrl");
						break;
			//left arrow			
			case 37:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("G");
						break;
			//up arrow
			case 38:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("H");
						break;
			//right arrow
			case 39:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("D");
						break;
			//down arrow
			case 40: 	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("B");
						break;
		}
		setPreferredSize(new Dimension(kbWidth, kbHeight));
	}
	
	public void enlarge(){
		setFont(new Font("sansserif",Font.PLAIN,12));
		kbHeight = 24;
		kbWidth = 24;
		switch(myVal){
			// Echap
			case 27:	setText("Ech");
						kbHeight = 17;
						kbWidth = 21;
						setFont(new Font("sansserif",Font.PLAIN,8));
						break;
			// F1-12
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						break;
			// PrtScr	
			case 44:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Imp");
						break;
			// Pause
			case 19:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("Arial Black",Font.BOLD,8));
						setText("| |");
						break;
			// Insert
			case 45:	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Ins");
						break;
			// Del
			case 46: 	kbHeight = 17;
						kbWidth = 20;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("Sup");
						break;
			// ²
			case 222:	kbWidth = 12;
						setText("²");
						break;
			// )
			case 219:	setText(")");
						break;
			// =
			case 187:	setText("=");
						break;
			// Backspace
			case 8:	 	kbWidth = 44;
						setText("RA");
						break;
			// Tab
			case 9: 	kbWidth = 27;
						break;			
			// Crochet fermant
			case 221:	setText("^");
						break;
			// Point-virgule
			case 186:	setText("$");
						break;
			// Entrée
			case 13:	kbWidth = 29;
						setText("Entr");
						break;
			case 1013:	setText("ée");
						kbWidth = 16;
						break;
			// Verrouillage des majuscules
			case 20:	kbWidth = 40;
						setText("MAJ");
						break;
			// Accent grave avec chasse
			case 192:	setText("%");
						break;
			// Barre oblique inverse
			case 220:	setText("µ");
						break;
			// Maj
			case 160:	setText("Maj");
						kbWidth = 40;
						break;
			// <
			case 226:	setText("<");
						break;
			// ?
			case 188:	setText("?");			
						break;
			// .
			case 190:	setText(".");
						break;
			// /
			case 191:	setText("/");
						break;
			// §
			case 223:	setText("§");
						break;
			// Maj
			case 161:	setText("Maj");
						kbWidth = 41;
						break;
			// Ctrl left
			case 162:	kbWidth = 29;
						setText("Ctrl");
						setFont(new Font("sansserif",Font.PLAIN,12));
						break;
						
			//win
			case 91: 	kbWidth = 32;
						setText("Win");
						break;
			//Alt left
			case 164:	kbWidth = 32;
						setText("Alt");
						break;
			//space
			case 32: 	kbWidth = 90;
						setText("Espace");
						break;
			
			//Alt Greater
			case 165:	kbWidth = 32;
						setText("AltGr");
						break;
			//Context Menu
			case 93:	kbWidth = 32;
						setText("Menu");
						break;
			//ctrl right
			case 163:	kbWidth = 29;
						setText("Ctrl");
						break;
			//left arrow			
			case 37:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("G");
						break;
			//up arrow
			case 38:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("H");
						break;
			//right arrow
			case 39:	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("D");
						break;
			//down arrow
			case 40: 	kbHeight = 12;
						setFont(new Font("sansserif",Font.PLAIN,8));
						setText("B");
						break;
		}
		setPreferredSize(new Dimension(kbWidth, kbHeight));
	}
	public void shrink(){
		setFont(new Font("sansserif",Font.PLAIN,10));
		kbHeight = 20;
		kbWidth = 20;
		
		switch(myVal){
			//Echap
			case 27:	kbHeight = 15;
						kbWidth = 21;
						setFont(new Font("sansserif",Font.PLAIN,8));
						break;
			// F1-12
			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122:
			case 123:	kbHeight = 15;
						kbWidth = 17;
						setFont(new Font("sansserif",Font.PLAIN,6));
						break;
			// PrtScr	
			case 44:	kbHeight = 15;
						kbWidth = 17;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("Imp");
						break;
			// Pause
			case 19:	kbHeight = 15;
						kbWidth = 17;
						setFont(new Font("Arial Black",Font.BOLD,7));
						setText("| |");
						break;
			// Insert
			case 45:	kbHeight = 15;
						kbWidth = 17;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("Ins");
						break;
			// Del
			case 46: 	kbHeight = 15;
						kbWidth = 17;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("Sup");
						break;
			// ²
			case 222:	kbWidth = 12;
						setText("²");
						break;
			// )
			case 219:	setText(")");
						break;
			// =
			case 187:	setText("=");
						break;
			// Backspace
			case 8:	 	kbWidth = 44;
						setText("RA");
						break;
			// Tab
			case 9: 	kbWidth = 27;
						break;			
			// Crochet fermant
			case 221:	setText("^");
						break;
			// Point-virgule
			case 186:	setText("$");
						break;
			// Entrée
			case 13:	kbWidth = 29;
						setText("Entr");
						break;
			case 1013:	setText("ée");
						kbWidth = 16;
						break;
			// Verrouillage des majuscules
			case 20:	kbWidth = 40;
						setText("MAJ");
						break;
			// Accent grave avec chasse
			case 192:	setText("%");
						break;
			// Barre oblique inverse
			case 220:	setText("µ");
						break;
			// Maj
			case 160:	setText("Maj");
						kbWidth = 38;
						break;
			// <
			case 226:	setText("<");
						break;
			// ?
			case 188:	setText("?");			
						break;
			// .
			case 190:	setText(".");
						break;
			// /
			case 191:	setText("/");
						break;
			// §
			case 223:	setText("§");
						break;
			// Maj
			case 161:	setText("Maj");
						kbWidth = 39;
						break;
			// Ctrl left
			case 162:	kbWidth = 25;
						setText("Ctrl");
						setFont(new Font("sansserif",Font.PLAIN,9));
						break;
						
			//win
			case 91: 	setFont(new Font("sansserif",Font.PLAIN,9));
						kbWidth = 25;
						setText("Win");
						break;
			//Alt left
			case 164:	setFont(new Font("sansserif",Font.PLAIN,9));
						kbWidth = 25;
						setText("Alt");
						break;
			//space
			case 32: 	kbWidth = 87;
						setText("Espace");
						break;
			
			//Alt Greater
			case 165:	setFont(new Font("sansserif",Font.PLAIN,9));
						kbWidth = 28;
						setText("AltGr");
						break;
			//Context Menu
			case 93:	setFont(new Font("sansserif",Font.PLAIN,9));
						kbWidth = 25;
						setText("Menu");
						break;
			//ctrl right
			case 163:	setFont(new Font("sansserif",Font.PLAIN,9));
						kbWidth = 25;
						setText("Ctrl");
						break;
			//left arrow			
			case 37:	kbHeight = 9;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("G");
						break;
			//up arrow
			case 38:	kbHeight = 9;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("H");
						break;
			//right arrow
			case 39:	kbHeight = 9;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("D");
						break;
			//down arrow
			case 40: 	kbHeight = 9;
						setFont(new Font("sansserif",Font.PLAIN,7));
						setText("B");
						break;
		}
		setPreferredSize(new Dimension(kbWidth, kbHeight));
	}
}
