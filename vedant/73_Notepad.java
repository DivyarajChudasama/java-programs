import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
class Notepad extends JFrame implements ActionListener 
{
	JFrame f;
	JTextArea main;
	Notepad()
	{

		f = new JFrame("Notepad ++");


		main = new JTextArea();
		Font f1 = new Font("Times New Roman", Font.BOLD, 20);
		main.setFont(f1);


		JMenuBar menu = new JMenuBar();


		JMenu m1 = new JMenu("File");


		JMenuItem mi1 = new JMenuItem("New");
		JMenuItem mi2 = new JMenuItem("Open");
		JMenuItem mi3 = new JMenuItem("Save");

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);

		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		
		JMenu m2 = new JMenu("View");
		
		JMenu subMenu1Ofm2 = new JMenu("Font Size");
		
		JMenuItem sub10 = new JMenuItem("20"); subMenu1Ofm2.add(sub10);
		JMenuItem sub11 = new JMenuItem("22"); subMenu1Ofm2.add(sub11);
		JMenuItem sub12 = new JMenuItem("24"); subMenu1Ofm2.add(sub12);
		JMenuItem sub13 = new JMenuItem("26"); subMenu1Ofm2.add(sub13);
		JMenuItem sub14 = new JMenuItem("28"); subMenu1Ofm2.add(sub14);
		JMenuItem sub15 = new JMenuItem("30"); subMenu1Ofm2.add(sub15);
		JMenuItem sub16 = new JMenuItem("32"); subMenu1Ofm2.add(sub16);
		JMenuItem sub17 = new JMenuItem("34"); subMenu1Ofm2.add(sub17);
		JMenuItem sub18 = new JMenuItem("36"); subMenu1Ofm2.add(sub18);
		JMenuItem sub19 = new JMenuItem("38"); subMenu1Ofm2.add(sub19);
		JMenuItem sub20 = new JMenuItem("40"); subMenu1Ofm2.add(sub20);
		JMenuItem sub21 = new JMenuItem("42"); subMenu1Ofm2.add(sub21);
		JMenuItem sub22 = new JMenuItem("44"); subMenu1Ofm2.add(sub22);
		JMenuItem sub23 = new JMenuItem("46"); subMenu1Ofm2.add(sub23);
		JMenuItem sub24 = new JMenuItem("48"); subMenu1Ofm2.add(sub24);
		JMenuItem sub25 = new JMenuItem("50"); subMenu1Ofm2.add(sub25);
		m2.add(subMenu1Ofm2);
		
		sub10.addActionListener(this);sub11.addActionListener(this);sub12.addActionListener(this);sub13.addActionListener(this);sub14.addActionListener(this);
		sub15.addActionListener(this);sub16.addActionListener(this);sub17.addActionListener(this);sub18.addActionListener(this);sub19.addActionListener(this);
		sub20.addActionListener(this);sub21.addActionListener(this);sub22.addActionListener(this);sub23.addActionListener(this);sub24.addActionListener(this);
		sub25.addActionListener(this);

		
		menu.add(m1);
		menu.add(m2);

		f.setJMenuBar(menu);
		
		f.setResizable(false);
		f.add(main);
		f.setSize(1700, 850);
		f.setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{
		
		
		if(e.getActionCommand().equals("Save")) 
		{

			JFileChooser j = new JFileChooser("C:");


			int r = j.showSaveDialog(null);

			if (r == JFileChooser.APPROVE_OPTION) 
			{
				File fi = new File(j.getSelectedFile().getAbsolutePath());
				try 
				{
					FileWriter wr = new FileWriter(fi, false);
					
					BufferedWriter w = new BufferedWriter(wr);
					
					w.write(main.getText());
					w.flush();
					w.close();
				}
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
			}

			else
			{
				JOptionPane.showMessageDialog(f, "Data is not Saved ");
			}
		}
		
		
		else if(e.getActionCommand().equals("Open")) 
		{
			
			String temp1 = main.getText().trim();
			if(temp1!=null)
			{
				int input = JOptionPane.showConfirmDialog(null, "Do you want to save?");
				if(input==0)
				{
					
					JFileChooser j = new JFileChooser("C:");
					int r = j.showSaveDialog(null);

					if (r == JFileChooser.APPROVE_OPTION) 
					{
						File fi = new File(j.getSelectedFile().getAbsolutePath());
						try 
						{
							FileWriter wr = new FileWriter(fi, false);
							
							BufferedWriter w = new BufferedWriter(wr);
							
							w.write(main.getText());
							w.flush();
							w.close();
						}
						catch (Exception ex) 
						{
							System.out.println(ex);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(f, "Data is not Saved");
					}
					JFileChooser j1 = new JFileChooser("D:");

					int r1 = j1.showOpenDialog(null);


					if (r1 == JFileChooser.APPROVE_OPTION) 
					{
						File fi = new File(j1.getSelectedFile().getAbsolutePath());
						
						try 
						{
							String s1 = "", sl = "";

							FileReader fr = new FileReader(fi);

							BufferedReader br = new BufferedReader(fr);

							sl = br.readLine();

							while ((s1 = br.readLine()) != null) 
							{
								sl = sl + "\n" + s1;
							}
							main.setText(sl);
						}
						catch (Exception evt) 
						{
							JOptionPane.showMessageDialog(f, evt.getMessage());
						}
					}

					else
					{
						JOptionPane.showMessageDialog(f, "the user cancelled the operation");
					}
					
				}
				else if(input==1)
				{
					JFileChooser j = new JFileChooser("C:");

					int r = j.showOpenDialog(null);


					if (r == JFileChooser.APPROVE_OPTION) 
					{
						File fi = new File(j.getSelectedFile().getAbsolutePath());
						
						try 
						{
							String s1 = "", sl = "";

							FileReader fr = new FileReader(fi);

							BufferedReader br = new BufferedReader(fr);

							sl = br.readLine();

							while ((s1 = br.readLine()) != null) 
							{
								sl = sl + "\n" + s1;
							}
							main.setText(sl);
						}
						catch (Exception evt) 
						{
							JOptionPane.showMessageDialog(f, evt.getMessage());
						}
					}

					else
					{
						JOptionPane.showMessageDialog(f, "the user cancelled the operation");
					}
				}
				
			}
		}
		
		else if(e.getActionCommand().equals("New")) 
		{
			String temp = main.getText().trim();
			if(temp!=null)
			{
				int input = JOptionPane.showConfirmDialog(null, "Do you want to save");
				if(input==0)
				{
					JFileChooser j = new JFileChooser("C:");
					int r = j.showSaveDialog(null);

					if (r == JFileChooser.APPROVE_OPTION) 
					{
						File fi = new File(j.getSelectedFile().getAbsolutePath());
						try 
						{
							FileWriter wr = new FileWriter(fi, false);
							
							BufferedWriter w = new BufferedWriter(wr);
							
							w.write(main.getText());
							w.flush();
							w.close();
						}
						catch (Exception ev) 
						{
							System.out.println(ev);
						}
					}

					else
					{
						JOptionPane.showMessageDialog(f, "Data is not Saved");
					}
				}
				else if(input==1)
				{
					main.setText("");
				}
			}
			else
			{
				main.setText("");
			}
			
		}
		
		
		else if(e.getActionCommand().equals("20"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 20));
		}
		else if(e.getActionCommand().equals("22"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 22));
		}
		else if(e.getActionCommand().equals("24"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 24));
		}
		else if(e.getActionCommand().equals("26"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 26));
		}
		else if(e.getActionCommand().equals("28"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 28));
		}
		else if(e.getActionCommand().equals("30"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 30));
		}
		else if(e.getActionCommand().equals("32"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 32));
		}
		else if(e.getActionCommand().equals("34"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 34));
		}
		else if(e.getActionCommand().equals("36"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 36));
		}
		else if(e.getActionCommand().equals("38"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 38));
		}
		else if(e.getActionCommand().equals("40"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 40));
		}
		else if(e.getActionCommand().equals("42"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 42));
		}
		else if(e.getActionCommand().equals("44"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 44));
		}
		else if(e.getActionCommand().equals("46"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 46));
		}
		else if(e.getActionCommand().equals("48"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 48));
		}
		else if(e.getActionCommand().equals("50"))
		{
			main.setFont(new Font("Times New Roman", Font.BOLD, 50));
		}
	}
	
	public static void main(String args[])
	{
		Notepad e = new Notepad();
	}
}