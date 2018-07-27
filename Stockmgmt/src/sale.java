
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
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
public class sale extends javax.swing.JInternalFrame implements Printable {
    public sale() {
        initComponents();
        fetchcat();
        fetchbillno();  //call to user defined function fetchrefno()
        cal_total_bill();
        Date obj = new Date();
        jLabel3.setText(obj.toString());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Bill No :");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Customer Name :");

        jComboBox1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Mode", "By Cash", "By Card" }));

        jLabel13.setText("......................");

        jLabel20.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel20.setText("Mobile No. :");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Mode of Payment :");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel24.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel24.setText("Supplier Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20)
                    .addComponent(jLabel6)
                    .addComponent(jLabel24)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, 159, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Choose Variant :");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Quantity :");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Rate :");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Stock Availabiltiy :");

        jLabel11.setText(".................................");

        jLabel12.setText(".................................");

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Discount(In %) :");

        jLabel21.setText(".................................");

        jLabel22.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel22.setText("Price After Discount :");

        jLabel23.setText("...............................");

        jLabel25.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel25.setText("Product Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 32, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel21))
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 266, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 79, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 36)); // NOI18N
        jLabel1.setText("Sale Information");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Sale Date :");

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
        jButton3.setText("Add Sale");
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

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel17.setText("Grand Total : (in Rs.) :");

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel18.setText("..............................");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(35, 35, 35))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel19.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        jLabel19.setText("Your Items ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Rate", "Quantity", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // for corporation
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
    }            
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // for brand
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
        // add button
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        { 
          String proname,proid;    //proname=product name , proid= product id
          Double priafdis,tot_cost;  //rate=original rate ,priafdis=price after discount
          int qty,rate;               //quantity of product
          String larname = jComboBox4.getSelectedItem().toString();
          proid = larname.substring(larname.indexOf(",")+1);
          proname = larname.substring(0,larname.indexOf(","));
          priafdis=Double.parseDouble(jLabel23.getText());
          qty=Integer.parseInt(jTextField3.getText());
          rate=Integer.parseInt(jLabel11.getText());
          tot_cost=qty*priafdis;
          DefaultTableModel mymod = (DefaultTableModel)jTable1.getModel();
          Object myrow[] = {proid,proname,rate,qty,tot_cost};
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
        // remove product button
        DefaultTableModel mymod = (DefaultTableModel)jTable1.getModel();
        mymod.removeRow(jTable1.getSelectedRow());
        cal_total_bill();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // ADD sale button
        String myurl = "jdbc:mysql://localhost/stockmgmt";
        try
        {
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="insert into saletable values(?,?,?,?,?,?)";   //insert query is implemented,saletable is name of table
        PreparedStatement myst=myconn.prepareStatement(q);
        myst.setString(1, jLabel13.getText());        //billno
        myst.setString(2, jTextField1.getText());   //customer name
        myst.setString(3, jFormattedTextField1.getText());      //customer phone no
        myst.setString(4,jComboBox1.getSelectedItem().toString());
        myst.setString(5, jLabel18.getText());
        SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
        String doj = myformat.format(new Date());
        myst.setString(6, doj);                     //sale date
        int row=myst.executeUpdate();   //value of row gives the entries in the table
            if(row>0)
            {
                for(int i=0;i<=jTable1.getRowCount()-1;i++)
                {
             String qn="insert into saleorder(proid,proname,rate,qty,tcost,billno)values(?,?,?,?,?,?)"; 
             PreparedStatement myst1=myconn.prepareStatement(qn);
             myst1.setString(1, jTable1.getValueAt(i,0).toString());
             myst1.setString(2, jTable1.getValueAt(i,1).toString());
             myst1.setString(3, jTable1.getValueAt(i,2).toString());
             myst1.setString(4, jTable1.getValueAt(i,3).toString());
             myst1.setString(5, jTable1.getValueAt(i,4).toString());
             myst1.setString(6, jLabel13.getText()); //bill no
             int row1=myst1.executeUpdate();
             if(row1>0)
             {
                 String qm = "update managepro set stockavail=stockavail-? where productid = ?";
                 PreparedStatement myst2=myconn.prepareStatement(qm);
                 myst2.setString(1, jTable1.getValueAt(i,3).toString());   //quantity
                 myst2.setString(2, jTable1.getValueAt(i,0).toString());
                 int row2=myst2.executeUpdate();
             }
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
        // Choose product ComboBox
        if(jComboBox4.getSelectedIndex()>0)
        {
        try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from managepro where productid = ?";   
        PreparedStatement myst=myconn.prepareStatement(q);
        String larname = jComboBox4.getSelectedItem().toString();  //larname=large name
        String proid = larname.substring(larname.indexOf(",")+1);  //fetching substring out of large name
        myst.setString(1, proid);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
            int rate = myres.getInt("price");
            int discount = myres.getInt("discount");
            int tcost = rate -(rate*discount)/100; //total cost after discount
            jLabel23.setText(""+tcost);  //price after discount
            jLabel11.setText(myres.getString("price"));
            jLabel21.setText(myres.getString("discount"));
            jLabel12.setText(myres.getString("stockavail"));
        }
        else
        {
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Choose");
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
                 JOptionPane.showMessageDialog(rootPane,"The Job did not successfully complete" + e.getMessage());   
                }
            }
         }         
    }//GEN-LAST:event_jButton4ActionPerformed
    void fetchbillno()    //user defined function to fetch reference no
    {
     try
        {
        String myurl = "jdbc:mysql://localhost/stockmgmt";    
        Connection myconn = DriverManager.getConnection(myurl,"root","");  //driver is activated,as no user is made so root is taken
        try
        {
        String q="select * from saletable order by billno desc";  //desc means in descending order 
        //saletable is the name of table in database
        PreparedStatement myst=myconn.prepareStatement(q);
        ResultSet myres = myst.executeQuery();
       
        if(myres.next())
        {
         int proid = myres.getInt("billno");   //from database
         proid++;
         jLabel13.setText(String.valueOf(proid));   
        }
        else
        {
        jLabel13.setText("1");
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
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
