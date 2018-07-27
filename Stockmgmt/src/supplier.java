
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class supplier extends javax.swing.JInternalFrame implements myinterf5 {

    public supplier() {
        initComponents();
//        jButton3.setEnabled(true);  during enabled button
//        jButton4.setEnabled(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
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
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Supplier ID :");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Supplier Name :");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No. :");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Address :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel3.setText("GST NO. :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabel8.setText("ADD SUPPLIER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(79, 79, 79)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(77, 77, 77)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jRadioButton1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jRadioButton2))
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(239, 239, 239))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 420, 620);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/adduser.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/update2.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/save.png"))); // NOI18N
        jButton2.setText("Search by ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectimages/save.png"))); // NOI18N
        jButton5.setText("Search by Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(460, 420, 640, 60);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel6.setText("List of Suppliers");

        jTable1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID.", "Supplier Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(460, 10, 640, 380);

        setBounds(0, 0, 1135, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //jdbc:subprotocol:subname 
         boolean give = valid();   //function call to valid() function
         if(give==true)
         {
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
        String q="insert into addsupplier values(?,?,?,?,?,?)";   //insert query is implemented,addsupplier is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jTextField1.getText());
        myst.setString(2, jTextField3.getText());
        
        myst.setString(3, jFormattedTextField1.getText());    //for phone no
        if(jRadioButton1.isSelected())
        {
        myst.setString(4, "Male");
        }
        else if(jRadioButton2.isSelected())
        {
        myst.setString(4, "Female");
        }
        myst.setString(5, jTextArea1.getText());
        myst.setString(6, jTextField4.getText());
        myst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"Supplier added Succesfully");
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());    
                }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //search button in front of supplier id
          //jdbc:subprotocol:subname 
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addsupplier where supid = ? ";   //insert query is implemented,addsupplier is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,jTextField1.getText());  //supplier ID
        ResultSet myres = myst.executeQuery();
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        if(myres.next())
        {
            jTextField3.setText(myres.getString("supname"));          //for showing details in text fields by cliking search button 
            
            jFormattedTextField1.setText(myres.getString("phone"));
            if(myres.getString("gender").equalsIgnoreCase("male"))
            {
                jRadioButton1.setSelected(true);
            }
            else if(myres.getString("gender").equalsIgnoreCase("female"))
            {
                jRadioButton2.setSelected(true);
            }
            jTextArea1.setText(myres.getString("address"));
            jTextField4.setText(myres.getString("GSTNO"));
            
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"Invalid Supplier ID");
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());    
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //for update button
        //jdbc:subprotocol:subname 
        boolean give = valid();    //function call to valid() function
         if(give==true)
         {
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
        String q="update addsupplier set supname=? ,phone=? , gender=? , address=? ,GSTNO= ? where supid = ? ";   //update query is implemented,addsupplier is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        
        myst.setString(1, jTextField3.getText());
        myst.setString(2, jFormattedTextField1.getText());
        if(jRadioButton1.isSelected())
        {
        myst.setString(3, "Male");
        }
        else if(jRadioButton2.isSelected())
        {
        myst.setString(3, "Female");
        }
       
        myst.setString(4, jTextArea1.getText());
        myst.setString(5, jTextField4.getText());
        myst.setString(6, jTextField1.getText());
        int count=myst.executeUpdate();
        if(count>0)
        {
        JOptionPane.showMessageDialog(rootPane,"Supplier Info updated Succesfully");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Supplier Info not Updated");    
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());    
                }
        
         } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //for delete button
          //jdbc:subprotocol:subname 
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
            int res = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete ?","Please Choose",JOptionPane.YES_OPTION,JOptionPane.WARNING_MESSAGE);
            if(res==JOptionPane.YES_OPTION)
            {
        String q="delete from addsupplier where supid = ? ";   //delete query is implemented,addsupplier is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jTextField1.getText());
        int count=myst.executeUpdate();
        if(count>0)
        {
        JOptionPane.showMessageDialog(rootPane,"Supplier deleted Succesfully");
        clearfields();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Supplier not deleted"); 
            jButton4.setEnabled(false);
                }
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());    
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //search button in front of supplier name
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addsupplier where supname like ? ";   //select query is implemented,addsupplier is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,jTextField3.getText() + "%");  //supplier name
        ResultSet myres = myst.executeQuery();
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        if(myres.next())
        {
            mymodel.setRowCount(0);
            do                         //for table by clicking search button
            {
                String na,add,phn,sid,gst,gen;
                na=myres.getString("supname");
                add=myres.getString("address");
                phn=myres.getString("phone");
                sid=myres.getString("supid");
                gst=myres.getString("GSTNO");
                Object myrow[] = {sid,na,phn,add,gst};
                mymodel.addRow(myrow);
            }
            while(myres.next());
        }
            else
            {
             JOptionPane.showMessageDialog(rootPane,"No Records Found");
             clearfields();
             mymodel.setRowCount(0);
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured :" + e.getMessage());    
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //search by name
        String idno = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,dbuser,dpass);  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addsupplier where supid = ? ";   //insert query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,idno);  //supplier id
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {  
            jTextField1.setText(myres.getString("supid"));
            jTextField3.setText(myres.getString("supname"));         // for showing details in text fields by cliking search button 
            jFormattedTextField1.setText(myres.getString("phone"));
            if(myres.getString("gender").equalsIgnoreCase("male"))
            {
                jRadioButton1.setSelected(true);
            }
            else if(myres.getString("gender").equalsIgnoreCase("female"))
            {
                jRadioButton2.setSelected(true);
            }
            jTextArea1.setText(myres.getString("address"));
            jTextField4.setText(myres.getString("GSTNO"));
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"Invalid Supplier ID");
        clearfields();
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
    }//GEN-LAST:event_jTable1MouseClicked
void clearfields()   //user defined function
        {
         jTextField1.setText(null);
        jTextField3.setText(null);
       
        jFormattedTextField1.setText(null);
        buttonGroup1.clearSelection();
        jTextArea1.setText(null);
       
        jTextField4.setText(null);
     
        }

        boolean valid()     //user defined function for validations applied on save button and update button
        {
            if(jTextField1.getText().length()<2)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Supplier ID");
                return(false);
            }
            else if(jTextField3.getText().length()<3)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Supplier Name");
                return(false);
            }
            
            else if((jFormattedTextField1.getText().length()<10) || (jFormattedTextField1.getText().length()>10))
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Supplier's phone no");
                return(false);
            }
            else if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)
            {
                 JOptionPane.showMessageDialog(rootPane,"Enter Gender");
                return(false);
            }
            else if(jTextArea1.getText().length()<10)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Supplier's Address");
                return(false);
            }
            else if(jTextField4.getText().length()<4)
            {
              JOptionPane.showMessageDialog(rootPane,"Enter Supplier's GST NO.");
                return(false);  
            }
            else
            {
                return(true);
            }
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}












































































































