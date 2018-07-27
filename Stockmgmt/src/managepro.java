
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class managepro extends javax.swing.JInternalFrame {
    public managepro() {
        initComponents();
        fetchproid();  //call to function
        fetchcat();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Category");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Variant Name :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Price(In Rs.) :");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Discount(In %) :");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Variant ID :");

        jLabel3.setText(".....................");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Corporation :");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Stock Availability :");

        jComboBox1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Appliance :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabel1.setText("ADD VARIANT");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton4.setText("Search by Name");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBox1, 0, 159, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variant ID", "Corp. ID", "App. ID", "Variant Name", "Stock", "Price", "Discount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel11.setText("List of Variants");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(193, 193, 193))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(845, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(308, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //category combobox
        fetchsubcat();  //call to subcat function
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //add button for manage product
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        boolean give = valid();    //function call to valid() function
         if(give==true)
         {
       try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="insert into managepro values(?,?,?,?,?,?,?)";   //insert query is implemented,managepro is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jLabel3.getText());  //product id
        myst.setString(2, jTextField1.getText());   //product name
        String larname = jComboBox1.getSelectedItem().toString();  //larname=large name
        String catid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(3, catid);
        String larname1 = jComboBox2.getSelectedItem().toString();  //larname=large name
        String subcatid = larname1.substring(larname1.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(4, subcatid); 
        myst.setString(5, jTextField3.getText());    //price
        myst.setString(6, jTextField4.getText());    //discount
        myst.setString(7, jTextField2.getText());    //stock availability
        myst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"Product added Succesfully");
        clearfields();
        fetchproid();
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
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="update managepro set catid=? , subcatid=? ,productname=? ,stockavail = ? ,price=? , discount=? where productid = ? ";   //update query is implemented,managepro is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        //idno
         myst.setString(1, jTable1.getValueAt(0,1).toString());  //catid==corporation id
         myst.setString(2, jTable1.getValueAt(0,2).toString());   //subcatid=appliance id
         myst.setString(3, jTextField1.getText()); 
         myst.setString(4, jTextField2.getText());
         myst.setString(5, jTextField3.getText());
         myst.setString(6, jTextField4.getText());
         myst.setString(7, jTable1.getValueAt(0,0).toString());
        int count=myst.executeUpdate();
        if(count>0)
        {
        JOptionPane.showMessageDialog(rootPane,"Variant updated Succesfully");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Variant not updated Succesfully");    
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // search by name
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from managepro where productname like ? ";   //insert query is implemented,managepro is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,jTextField1.getText());  //product name
        ResultSet myres = myst.executeQuery();
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        if(myres.next())
        {
            mymodel.setRowCount(0);
            do                         //for table by clicking search button
            {
                String na,add,stock,idno,cid,sid,pri,dis;
                idno=myres.getString("productid");
                cid=myres.getString("catid");
                sid=myres.getString("subcatid");
                na=myres.getString("productname");
                stock=myres.getString("stockavail");
                pri=myres.getString("price");
                dis=myres.getString("discount");
                Object myrow[] = {idno,cid,sid,na,stock,pri,dis};
                mymodel.addRow(myrow);
            }
            while(myres.next());
        }
            else
            {
             JOptionPane.showMessageDialog(rootPane,"No Variants Found");
             clearfields();
             mymodel.setRowCount(0);
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured"  + e.getMessage());    
                }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // delete button
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
            int res = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete ?","Please Choose",JOptionPane.YES_OPTION,JOptionPane.WARNING_MESSAGE);
            if(res==JOptionPane.YES_OPTION)
            {
        String q="delete from managepro where productid = ? ";   //delete query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,jTable1.getValueAt(0,0).toString());
        int count=myst.executeUpdate();
        if(count>0)
        {
            JOptionPane.showMessageDialog(rootPane,"Variant deleted Succesfully");
            clearfields();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Variant not deleted Succesfully"); 
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());    
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // on search by name
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        String idno = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();  //variant id
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from managepro where productid = ? ";   //insert query is implemented,managepro is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1,idno);  //supplier id
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {  
            jTextField1.setText(myres.getString("productname"));
            jTextField2.setText(myres.getString("stockavail"));         // for showing details in text fields by cliking search button 
            jTextField3.setText(myres.getString("price"));
            jTextField4.setText(myres.getString("discount"));
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"Invalid Variant ID");
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
         
    void fetchproid()    //user defined function to fetch product id
    {
     try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from managepro order by productid desc";  //desc means in descending order 
        //managepro is the name of table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
         int proid = myres.getInt("productid");   //from database
         proid++;
         jLabel3.setText(String.valueOf(proid));   
        }
        else
        {
        jLabel3.setText("2001");
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());    
                }   
    }
     
    void fetchcat()   //a user defined function to fetch the contents of categories to further select sub categories
     {
      try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from category";   //category is the table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
            do
            {
             jComboBox1.addItem(myres.getString("catname") + "," + myres.getString("catid"));
            }  while(myres.next());
        }
        else
        {
         jComboBox1.removeAllItems();
         jComboBox1.addItem("No Corporation available");
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
                JOptionPane.showMessageDialog(rootPane,"Error Occured : " + e.getMessage());    
                }
    }

    void fetchsubcat()   //a user defined function to fetch the contents of subcategories
     {
      try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from subcat where catid = ? ";   //subcat is the table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        String larname = jComboBox1.getSelectedItem().toString();  //larname=large name
        String catid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(1, catid);
        ResultSet myres = myst.executeQuery();
        
        if(myres.next())
        {
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Choose");
         do
            {
             jComboBox2.addItem(myres.getString("subcatname") + "," + myres.getString("subcatid"));
            }  while(myres.next());
        }
        else
        {
         jComboBox2.removeAllItems();
        jComboBox2.addItem("No Brand Available");
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
    void clearfields()   //user defined function to clear details after insertion
        {
        //jLabel3.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jComboBox1.setSelectedItem(0);
        jComboBox2.setSelectedItem(0);
    }
     boolean valid()     //user defined function for validations applied on add button
        {
            if(jTextField1.getText().length()<2)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter the Product Name");
                return(false);
            }
            else if(jTextField3.getText().length()<0)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Price in Rs.");
                return(false);
            }
            else if(jTextField2.getText().length()<0)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Discount for Product");
                return(false);
            }
            else if(jTextField4.getText().length()<0)
            {
                JOptionPane.showMessageDialog(rootPane,"Enter Availability of Product");
                return(false);
            }
            else
            {
                return(true);
            }
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
