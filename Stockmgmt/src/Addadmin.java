
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakshi aggarwal
 */
public class Addadmin extends javax.swing.JFrame {
      File myfile;
      String imagename = "";
      String oldpic;
    
    public Addadmin() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel1.setText("ID No. :");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Full Name :");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Pin Code :");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Address :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Password :");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth :");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabel3.setText("ADMIN PROFILE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Mobile No. :");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel10.setText("E- mail :");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/adduser.png"))); // NOI18N
        jButton1.setText("Create Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/update2.png"))); // NOI18N
        jButton3.setText("Update Admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/delete.png"))); // NOI18N
        jButton4.setText("Delete Admin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/save.png"))); // NOI18N
        jButton5.setText("Search by ID");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Job Title :");

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Date of Join :");

        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Basic Salary :");

        jLabel14.setText("                            ");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/browse.png"))); // NOI18N
        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField2)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jTextField2)
                                .addComponent(jTextField5))))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //jdbc:subprotocol:subname
         boolean give = valid();   //function call to valid() function
         if(give==true)
         {
           boolean flag=false;
 
        if(myfile!=null)
        {
        if(myfile.length()<300000)
        {
        imagename=new java.util.Date().getTime() + myfile.getName();
        int i;
        FileInputStream rd = null;
        FileOutputStream outs = null;
        try {
        rd = new FileInputStream(myfile);  //read from myfile
        outs = new FileOutputStream("projectimages\\"+imagename);//writing the new file in 'projectimages' folder, in the project
        while ((i = rd.read()) !=-1) {
        outs.write(i); //copying from pictures to projectimages byte by byte
        }
        }
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(rootPane, "Error Ocurred :" + e.getMessage());
        } 
        flag=true;
        }
        else
        {
        flag=false;
        JOptionPane.showMessageDialog(rootPane, "Please Upload Photo of less than 250kb ");
        }
        }
        else
        {
        imagename="default.jpg";
        flag=true;
        } 
   if(flag)
   {
            try
            {
                String myurl = "jdbc:mysql://localhost/stockmgmt";
                Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
                try
                {
                    String q="insert into addemployee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";   //insert query is implemented,addemployee is name of table
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1, jTextField1.getText());  //IDNO
                    myst.setString(2, jTextField3.getText());  //Full Name
                    if(jRadioButton1.isSelected())             //gender
                    {
                        myst.setString(3, "Male");
                    }
                    else if(jRadioButton2.isSelected())
                    {
                        myst.setString(3, "Female");
                    }
                    myst.setString(4, jTextArea1.getText());    //address
                    myst.setString(5, jFormattedTextField2.getText());  //pincode
                    SimpleDateFormat myformat1 = new SimpleDateFormat("yyyy-MM-dd");
                    String dob = myformat1.format(jDateChooser2.getDate());
                    myst.setString(6, dob);  //date of birth
                    myst.setString(7, jFormattedTextField1.getText());    //for phone no
                    myst.setString(8, jTextField2.getText());         //email
                    myst.setString(9,"admin");
                    myst.setString(10, jTextField4.getText());  //job title
                    SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                    String doj = myformat.format(jDateChooser1.getDate());
                    myst.setString(11, doj);
                    myst.setString(12, jPasswordField1.getText());
                    myst.setString(13, jTextField5.getText());
                    myst.setString(14, imagename);
                    int count = myst.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane,"Admin added Succesfully");
                    clearfields();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());
                }
                finally
                {
                    myconn.close();   //to close the connection
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());
            }
   }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //for update button
        //jdbc:subprotocol:subname
         boolean give = valid();    //function call to valid() function
         if(give==true)
         {
             boolean flag=false;
 
        if(myfile!=null)
        {
        if(myfile.length()<300000)
        {
        imagename=new java.util.Date().getTime() + myfile.getName();
        int i;
        FileInputStream rd = null;
        FileOutputStream outs = null;
        try {
        rd = new FileInputStream(myfile);
        outs = new FileOutputStream("projectimages\\"+imagename);//writing the new file in 'projectimages' folder, in the project
        while ((i = rd.read()) !=-1) {
        outs.write(i); //copying from pictures to projectimages byte by byte
        }
        }
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(rootPane, "Error Ocurred :" + e.getMessage());
        } 
        flag=true;
        }
        else
        {
        flag=false;
        JOptionPane.showMessageDialog(rootPane, "Please Upload Photo of less than 250kb ");
        }
        }
        else
        {
        imagename=jLabel14.getIcon().toString();
        flag=true;
        } 
   if(flag)
   {
            try
            {
                String myurl = "jdbc:mysql://localhost/stockmgmt";
                Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
                try
                {
                    String q="update addemployee set name=? , gender=? , address=? , pcode=? , dob=? , phone = ? , email = ? , usertype = ? ,"
                + " jobtit = ?, doj = ? , password = ? ,bsal = ? ,image = ? where IDNO = ? ";   //update query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jTextField3.getText());    //full name
        if(jRadioButton1.isSelected())
        {
        myst.setString(2, "Male");
        }
        else if(jRadioButton2.isSelected())
        {
        myst.setString(2, "Female");  //gender
        }
        myst.setString(3, jTextArea1.getText());  //address
        myst.setString(4, jFormattedTextField2.getText());  //pin code
        SimpleDateFormat myformat1 = new SimpleDateFormat("yyyy-MM-dd");
        String dob = myformat1.format(jDateChooser2.getDate());
        myst.setString(5, dob);  //date of birth
        myst.setString(6, jFormattedTextField1.getText());  //mobile no
        myst.setString(7, jTextField2.getText());  //email
        myst.setString(8, "admin");  //usertype
        myst.setString(9, jTextField4.getText());  //job title
        SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
        String doj = myformat.format(jDateChooser1.getDate());
        myst.setString(10, doj);  //date of join 
        myst.setString(11, jPasswordField1.getText());  //password
        myst.setString(12, jTextField5.getText());   //basic salary
        myst.setString(13,imagename);
        myst.setString(14, jTextField1.getText());
                    int count=myst.executeUpdate();
                    if(count>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Admin updated Succesfully");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"Admin not updated");
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());
                }
                finally
                {
                    myconn.close();   //to close the connection
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //for delete button
        //jdbc:subprotocol:subname
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
            Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
            try
            {
                int res = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete ?","Please Choose",JOptionPane.YES_OPTION,JOptionPane.WARNING_MESSAGE);
                if(res==JOptionPane.YES_OPTION)
                {
                    String q="delete from addemployee where IDNO = ? ";   //delete query is implemented,addemployee is name of table
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1, jTextField1.getText());
                   
                    int count=myst.executeUpdate();
                    if(count>0)
                    {
                         File myfile = new File("projectimages\\" + oldpic);
                         myfile.delete();
                        JOptionPane.showMessageDialog(null,"Admin deleted Succesfully");
                        clearfields();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"Admin not deleted");
                        jButton4.setEnabled(false);
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());
            }
            finally
            {
                myconn.close();   //to close the connection
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage()); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // browse button
        JFileChooser obj=new JFileChooser();
        obj.setFileFilter(new FileFilter() {  //dont show all files but image files only
        @Override
        public boolean accept(File f) {  //accept method has object of file class
        if(f.isDirectory()) 
            return true;
            String extension;
            extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
            String allowed[]={"jpg","png","gif","jpeg"};
            for(String a:allowed)
            {
            if(a.equalsIgnoreCase(extension))
            {
            return true;
            }
            }
            return false;
            }
        @Override
        public String getDescription() {
        return "All Image Files";
        }
        });
            if(obj.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
            {
            try
            { 
            myfile=obj.getSelectedFile();
            Image simg = ImageIO.read( new File(obj.getSelectedFile().getAbsolutePath())).getScaledInstance( jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_AREA_AVERAGING);
            //anonymous object of ImageIO is created
            jLabel14.setIcon(new ImageIcon(simg));
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // search button
         String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addemployee where IDNO = ? ";   //insert query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,jTextField1.getText());  //IDNO
        ResultSet myres = myst.executeQuery();
        if(myres.next())
        {
            jTextField3.setText(myres.getString("name"));          //for showing details in text fields by cliking search button 
            if(myres.getString("gender").equalsIgnoreCase("male"))
            {
                jRadioButton1.setSelected(true);
            }
            else if(myres.getString("gender").equalsIgnoreCase("female"))
            {
                jRadioButton2.setSelected(true);
            }
            jTextArea1.setText(myres.getString("address"));
            jFormattedTextField2.setText(myres.getString("pcode"));
            jDateChooser2.setDate(myres.getDate("dob"));
            jFormattedTextField1.setText(myres.getString("phone"));
            jTextField2.setText(myres.getString("email"));
            jTextField4.setText(myres.getString("jobtit"));
            jDateChooser1.setDate(myres.getDate("doj"));
            jPasswordField1.setText(myres.getString("password"));
            jTextField5.setText(myres.getString("bsal"));
            jLabel14.setIcon(new ImageIcon(ImageIO.read(new File("projectimages/"+myres.getString("image")))));
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"Invalid Admin ID");
        clearfields();
        }
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());   
        }
        finally
        {
         myconn.close();   //to close the connection  
        }
        }
        catch(Exception e)
                {
                JOptionPane.showMessageDialog(rootPane,"Error Occured2 " + e.getMessage());    
                }
    }//GEN-LAST:event_jButton5ActionPerformed
void clearfields()   //user defined function
        {
         jTextField1.setText(null);
        jTextField3.setText(null);
        jFormattedTextField1.setText(null);
        buttonGroup1.clearSelection();
        jTextArea1.setText(null);
        jPasswordField1.setText(null);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jTextField2.setText(null);
        jTextField5.setText(null);
        jTextField4.setText(null);
        jLabel14.setIcon(null);
        }

        boolean valid()     //user defined function for validations applied on save button and update button
        {
            if(jTextField1.getText().length()<0)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter your ID");
                return(false);
            }
            else if(jTextField3.getText().length()<5)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter your Full Name");
                return(false);
            }
            else if((jFormattedTextField1.getText().length()<10) || (jFormattedTextField1.getText().length()>10))
            {
                JOptionPane.showMessageDialog(rootPane,"Enter your Mobile no");
                return(false);
            }
            else if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)
            {
                 JOptionPane.showMessageDialog(rootPane,"Enter your Gender");
                return(false);
            }
            else if(jTextArea1.getText().length()<4)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter your Address");
                return(false);
            }
            else if(jPasswordField1.getText().length()<6)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter a valid password");
                return(false);  
            }
            else if(jFormattedTextField2.getText().length()<6)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter Pin Code");
                return(false);  
            }
            else if(jTextField2.getText().length()<6 ||  jTextField2.getText().contains("@")==false)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter correct e-mail");
                return(false);  
            }
            else if(jTextField4.getText().length()<2)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter valid Job Title");
                return(false);  
            }
            else if(jTextField5.getText().length()<2)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter Basic Salary");
                return(false);  
            }
            else
            {
                return(true);
            }
            
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
