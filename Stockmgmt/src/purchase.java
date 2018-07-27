
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class purchase extends javax.swing.JInternalFrame  implements Printable {
    public purchase() {
        initComponents();
        fetchsupp();    //to fetch suppliers
        fetchrefno();  //call to user defined function fetchrefno()
        fetchcat();    //to fetch categories
        Date obj = new Date();
        jLabel3.setText(obj.toString());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Reference No :");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Choose Supplier :");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Address :");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Mobile No. :");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel8.setText("GST No. :");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Bill No. :");

        jLabel10.setText("........................");

        jLabel11.setText(".......................");

        jLabel12.setText(".........................");

        jComboBox1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Supplier" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel13.setText("......................");

        jLabel22.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel22.setText("Add Supplier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel22))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel15.setText("Choose Corporation :");

        jLabel16.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel16.setText("Choose Appliance :");

        jComboBox2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jButton1.setText("Add Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel20.setText("Choose Variant :");

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Quantity :");

        jLabel21.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel21.setText("Purchase Rate :");

        jLabel23.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel23.setText("Product Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox3, 0, 314, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Information");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Purchase Date :");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setText("..............................");

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton2.setText("Remove Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton3.setText("Add Purchase");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jButton4.setText("Receipt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel19.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel19.setText("Your Items ");

        jTable1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID.", "Product Name", "Quantity", "Rate", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel17.setText("Grand Total : (in Rs.) :");

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel18.setText("...................................");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton4)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(140, 140, 140)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // for fetching particular supplier from combobox(supplier info)
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from addsupplier where supid=?";  //desc means in descending order 
        //managepro is the name of table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        
        String larname = jComboBox1.getSelectedItem().toString();  //larname=large name
        String supid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(1, supid);
        ResultSet myres = myst.executeQuery();
        if(myres.next())
        {
            do
            {
         jLabel12.setText(myres.getString("address"));
         jLabel11.setText(myres.getString("phone"));
         jLabel10.setText(myres.getString("GSTNO"));
            } while(myres.next());
        }
        else
        {
        jLabel12.setText(myres.getString("0"));
         jLabel11.setText(myres.getString("0"));
         jLabel10.setText(myres.getString("0"));
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
    
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //combobox for subcategory selection
        if(jComboBox2.getSelectedIndex()>0)
        {
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from subcat where catid = ?";   
        PreparedStatement myst=myconn.prepareStatement(q);
        String larname = jComboBox2.getSelectedItem().toString();  //larname=large name
        String catid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(1, catid);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
            jComboBox3.removeAllItems();
            jComboBox3.addItem("Choose");
            do
            {
             jComboBox3.addItem(myres.getString("subcatname") + "," + myres.getString("subcatid"));
            }  while(myres.next());
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"No Appliance Available");
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
        
    }//GEN-LAST:event_jComboBox2ActionPerformed
    }
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        //combobox for product selection
        if(jComboBox3.getSelectedIndex()>0)
        {
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from managepro where subcatid = ?";   
        PreparedStatement myst=myconn.prepareStatement(q);
        String larname = jComboBox3.getSelectedItem().toString();  //larname=large name
        String subcatid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(1, subcatid);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
            jComboBox4.removeAllItems();
            jComboBox4.addItem("Choose");
            do
            {
             jComboBox4.addItem(myres.getString("productname") + "," + myres.getString("productid"));
            }  while(myres.next());
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"No Variant Available");
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
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // add button for product in product info
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        { 
          String proname,proid;    //proname=product name , proid= product id
          Double rate,tot_cost;  //rate=original rate , tot_cost=cost after discount
          int qty;               //quantity of product
          String larname = jComboBox4.getSelectedItem().toString();
          proid = larname.substring(larname.indexOf(",")+1);
          proname = larname.substring(0,larname.indexOf(","));
          rate=Double.parseDouble(jTextField3.getText());
          qty=Integer.parseInt(jTextField2.getText());
          tot_cost = rate*qty;
          DefaultTableModel mymod = (DefaultTableModel)jTable1.getModel();
          Object myrow[] = {proid,proname,qty,rate,tot_cost};
          mymod.addRow(myrow);
          cal_total_bill();
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // remove button to remove the product from the table
        DefaultTableModel mymod = (DefaultTableModel)jTable1.getModel();
        mymod.removeRow(jTable1.getSelectedRow());
        cal_total_bill();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // ADD PURCHASE button to add the purchase
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="insert into purchase values(?,?,?,?,?)";   //insert query is implemented,addemployee is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jLabel13.getText());        //refno
        String larname = jComboBox1.getSelectedItem().toString();
        String sid = larname.substring(larname.indexOf(",")+1);
        myst.setString(2,sid);                       //supplyid
        myst.setString(3, jTextField1.getText());   //supplybillno
        myst.setString(4, jLabel18.getText());      //total bill
        SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
        String doj = myformat.format(new Date());
        myst.setString(5, doj);                     //purchase date
        int row=myst.executeUpdate();   //value of row gives the entries in the table
            if(row>0)
            {
                for(int i=0;i<=jTable1.getRowCount()-1;i++)
                {
             String qn="insert into ordertable(refno,proid,proname,qty,rate,tcost,purchdate)values(?,?,?,?,?,?,?)"; 
             PreparedStatement myst1=myconn.prepareStatement(qn);
             myst1.setString(1, jLabel13.getText());        //refno
             myst1.setString(2, jTable1.getValueAt(i,0).toString());
             myst1.setString(3, jTable1.getValueAt(i,1).toString());
             myst1.setString(4, jTable1.getValueAt(i,2).toString());
             myst1.setString(5, jTable1.getValueAt(i,3).toString());
             myst1.setString(6, jTable1.getValueAt(i,4).toString());
             SimpleDateFormat myformat1 = new SimpleDateFormat("yyyy-MM-dd");
             String doj1 = myformat1.format(new Date());
             myst1.setString(7, doj1);
             int row1=myst1.executeUpdate();
                }
            
            }
            JOptionPane.showMessageDialog(rootPane,"Bill Generated Successfully");
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

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
      
    }//GEN-LAST:event_jComboBox4ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // print button
        PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);  //Printable will take a screenshot of the frame
         PageFormat format = job.defaultPage();       //format is the object of PageFormat
         format.setOrientation(PageFormat.PORTRAIT);  //PORTRAIT is the static variable therefore called by class name(PageFormat)
         PageFormat format1 = job.pageDialog(format); //format1 is the object of PageFormat
         if(format!=format1)
         {
         boolean done = job.printDialog();
            if(done)
            {
                try
                {
                    job.print();
                }
                catch(PrinterException e)
                {
                 JOptionPane.showMessageDialog(rootPane,"The Job did nt successfully complete" + e.getMessage());   
                }
            }
         }
    }//GEN-LAST:event_jButton4ActionPerformed
    void fetchrefno()    //user defined function to fetch reference no
    {
     try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from purchase order by refno desc";  //desc means in descending order 
        //managepro is the name of table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
         int proid = myres.getInt("refno");   //from database
         proid++;
         jLabel13.setText(String.valueOf(proid));   
        }
        else
        {
        jLabel13.setText("2001");
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
    void fetchcat()   //to fetch categories
    {
      try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from category";   
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
            do
            {
             jComboBox2.addItem(myres.getString("catname") + "," + myres.getString("catid"));
            }  while(myres.next());
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"No Corporation Available");
        }
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(rootPane,"Error Occured1 " + e.getMessage());   
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
    }
    void fetchsupp()   //to fetch suppliers
    {
      try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select supid,supname from addsupplier";   
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
        if(myres.next())
        {
            do
            {
             jComboBox1.addItem(myres.getString("supname") + "," + myres.getString("supid"));
            }  while(myres.next());
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"No Supplier Available");
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
    void cal_total_bill()    //user defined function to calculate total bill
    {
        int row = jTable1.getRowCount();
        float total=0;
        for(int i = 0 ;i<=row-1;i++)
        {
         total+=Float.parseFloat(jTable1.getValueAt(i,4).toString());   
        }
        jLabel18.setText(""+total);
    }
    void clearfields()   //to clear values of quantity and rate
    {
     jTextField2.setText(null); 
     jTextField3.setText(null);
     jComboBox2.setSelectedItem(0);
     jComboBox3.setSelectedItem(0);
     jComboBox4.setSelectedItem(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
    if(pageIndex >0)   //as printing is done of one page only
    {
        return NO_SUCH_PAGE;
    }
    Dimension d = this.getSize();  //to get bounds of the components 
    double cheight = d.getHeight();
    double cwidth = d.getWidth();
    double pheight = pageFormat.getImageableHeight(); //height of printable area
    double pwidth = pageFormat.getImageableWidth();    //width of printable area
    double pxstart = pageFormat.getImageableX(); 
    double pystart = pageFormat.getImageableY();
    double xratio = pwidth/cwidth;
    double yratio = pheight/cheight;
    
    Graphics2D g=(Graphics2D)graphics;  //Graphics2D class extends graphics class
    g.translate(pxstart,pystart);
    g.scale(xratio, yratio);
    this.paint(g);
    return Printable.PAGE_EXISTS;
}
}
