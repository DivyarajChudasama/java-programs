import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Voting_System extends Applet
{
 public int count1;
 public int count2;
 public int count3;
 public int count4;
 public int count5;
 public int count6;
 public int count7;
 public int count8;
 public Button vote;
 TextField anc;
 TextField np;
 TextField ifp;
 TextField azapo;
 TextField udm;
 TextField dp;
 TextField kiss;
 TextField pac;
public void init()
 {
  count1 = 0;
  count2 = 0;
  count3 = 0;
  count4 = 0;
  count5 = 0;
  count6 = 0;
  count7 = 0;
  count8 = 0;
  this.setBackground(Color.yellow);
  setLayout(new BorderLayout());
     Panel p1 =new Panel();
	 p1.setBackground(Color.lightGray);
         p1.setLayout(new GridLayout(8,2,3,2));
	 Checkbox ch1 =new Checkbox("ICT");     
         Checkbox ch2 =new Checkbox("AI");     
         Checkbox ch3 =new Checkbox("CE");
	 Checkbox ch4 =new Checkbox("EE");
	 Checkbox ch5 =new Checkbox("IT");
	 Checkbox ch6 =new Checkbox("MEC");
	 Checkbox ch7 =new Checkbox("CIV");
	 Checkbox ch8=new Checkbox("DC");
        anc = new TextField("Anc:"  + String.valueOf(count1));
	anc.setEditable(false);
        np = new TextField("Np:" + String.valueOf(count2));
	np.setEditable(false);
        dp = new TextField("Dp"  + String.valueOf(count3));
	dp.setEditable(false);
        ifp = new TextField("Ifp:" +  String.valueOf(count4));
	ifp.setEditable(false);
        pac = new TextField("Pac:" +  String.valueOf(count5));
	pac.setEditable(false);
        azapo = new TextField("Azapo:" + String.valueOf(count6));
	azapo.setEditable(false);
        kiss = new TextField("FF:"  + String.valueOf(count7));
	kiss.setEditable(false);
        udm = new TextField("Udm:"  + String.valueOf(count8));
	udm.setEditable(false);
        handlenp npp = new handlenp();
	p1.add(ch1);
	ch1.addItemListener(npp);
        p1.add(np);
        handleanc ancc = new handleanc();
	p1.add(ch2);
        ch2.addItemListener(ancc);
        p1.add(anc);
        handledp dpp = new handledp();
 	p1.add(ch3);
	ch3.addItemListener(dpp);
        p1.add(dp);
        handleifp ifpp = new handleifp();
	p1.add(ch4);
	ch4.addItemListener(ifpp);
	p1.add(ifp);
        handleudm udmm = new handleudm();
	p1.add(ch5);
	ch5.addItemListener(udmm);
        p1.add(udm);
        handlepac pacc = new handlepac();
 	p1.add(ch6);
	ch6.addItemListener(pacc);
        p1.add(pac);
        handleazapo azapoo = new handleazapo();
	p1.add(ch7);
	ch7.addItemListener(azapoo);
        p1.add(azapo);
        handlekiss kisses = new handlekiss();
 	p1.add(ch8);
	ch8.addItemListener(kisses);
        p1.add(kiss);
        add("North",p1);
	Label l =new Label("Click choose the Party");
	Font f = new Font("Helvetica",Font.BOLD,32);
	l.setFont(f);
        add("Center",l);
        SingleAction sa = new SingleAction();
	vote =new Button("Count number of votes");
	vote.addActionListener(sa);
	add("South",vote);
}
class  handleanc implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{
  if(ie.getStateChange()==ItemEvent.SELECTED)
  count1++;
}
}
class  handlenp implements ItemListener
{
  public void itemStateChanged(ItemEvent ie)
{
  if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count2;
}
}
class  handlepac implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{
  if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count3;
}
}
class  handledp implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{
if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count4;
}
}
class  handleudm implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{

if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count5;
}
}
class  handlekiss implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{

if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count6;
}
}
class  handleifp implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{

if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count7;
}
}
class  handleazapo implements ItemListener
{
public void itemStateChanged(ItemEvent ie)
{
if(ie.getStateChange()==ItemEvent.SELECTED)
  ++count8;
}
}
class SingleAction implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		anc.setText("Anc :" + String.valueOf(count1));
		np.setText("Np :" + String.valueOf(count2)); 
		pac.setText("Pac :" + String.valueOf(count3)); 
		dp.setText("Dp :" + String.valueOf(count4)); 
		udm.setText("Udm :" + String.valueOf(count5)); 
		kiss.setText("FF :" + String.valueOf(count6)); 
		ifp.setText("Ifp :" + String.valueOf(count7)); 
		azapo.setText("Azapo :" + String.valueOf(count8)); 
	}
}
}