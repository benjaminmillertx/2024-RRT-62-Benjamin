import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleTextEditor
extends jFrame implements
ActionListener {
private JTextAreatextArea;
private JFIleChooserfileChooser;

public SimpleTextEditor()
  {
  setTitle("Simple Text Editor");
  setSize(500,500);
    setDefaultCloseOperation(EX-It_on_close);

  textArea= new JtextArea();
    JScrollPane scrollPane= new JScrollPane(textArea);
    add(scrollPane,BorderLayout.CENTER);

    JmenuBar menuBar = new JMenuBar();
    Jmenu fileMenu= new Jmenu("File');
    JmenuItem openItem= new JMenuItem("Open");
    JMenuItem saveItem= new JMenuItem("Save');

  openItem.addActionListener(this);

  Save.Item.addActionListener(this);

  fileMenu.add(openItem);

  fileMenu.add(saveItem);
          menuBar.add(fileMenu)
          setJMenuBar(menuBar);

          fileChooser= new JFileChooser();
  }
public void
  actionPerformed(ActionEvent e)
  {
      if
    (e.getActionCommand().equals("Open")){

  int returVal= fileChooser.showOpenDialog(this);

  if(renturnVal == JFileChooser.APPROve_OPTION) {
    File file = fileChooser.getSelectedFile();
    try{

  BufferedReader br =new
  BufferedReader(new FileReader(file));

  textArea.setText("");
  String line;
  while((line=br.readLine()) != null) {
  textArea.append(line +"\n");
  }
  br.close();
    }catch
  (IOException ex) {

  ex.printStackTrace();
  }
  } 
  else if 
  (e.getActionCommand().equal("Save"));
      {
  int returVal = fileChooser.Approve_Option) {
  file file=fileChooser.getSelectedFile();
    try{

  BufferedWriter bw = new
  BufferedWriter(new
  FileWriter(file));

  bw.write(textArea.getText();

  bw.close();
    } catch
  (IOexception ex) {
  ex.printStackTrace();
               } 
            }
      }
    }
    public static void
    main(String[] args) {
    
    SwingUtilities.invokeLater(() -> {
    SimpleTextEditor editor= new SimpleTextEditor();

    editor.setVisible(true);
    } );
  }
}

  
  }
} e
