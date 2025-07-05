
package inventoryjava;

public class HomeForm extends javax.swing.JFrame {

    public HomeForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProductButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CustomerButton = new javax.swing.JLabel();
        customer = new javax.swing.JLabel();
        Product = new javax.swing.JLabel();
        UserButton = new javax.swing.JLabel();
        order = new javax.swing.JLabel();
        OrderButton = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        categor = new javax.swing.JLabel();
        CategoryButton = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventory Management System");

        Close.setBackground(new java.awt.Color(255, 255, 255));
        Close.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Main Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(224, 224, 224)
                        .addComponent(Close)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(424, 424, 424))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        ProductButton.setBackground(new java.awt.Color(255, 255, 255));
        ProductButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        ProductButton.setForeground(new java.awt.Color(51, 153, 255));
        ProductButton.setText("PRODUCT");
        ProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductButtonMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aman Industries ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(369, 369, 369))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        CustomerButton.setBackground(new java.awt.Color(255, 255, 255));
        CustomerButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(51, 153, 255));
        CustomerButton.setText("CUSTOMER");

        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
        });

        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMouseClicked(evt);
            }
        });

        UserButton.setBackground(new java.awt.Color(255, 255, 255));
        UserButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        UserButton.setForeground(new java.awt.Color(51, 153, 255));
        UserButton.setText("USER");

        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });

        OrderButton.setBackground(new java.awt.Color(255, 255, 255));
        OrderButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(51, 153, 255));
        OrderButton.setText("ORDER");

        User.setBackground(new java.awt.Color(204, 255, 204));
        User.setForeground(new java.awt.Color(51, 255, 204));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        categor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorMouseClicked(evt);
            }
        });

        CategoryButton.setBackground(new java.awt.Color(255, 255, 255));
        CategoryButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        CategoryButton.setForeground(new java.awt.Color(51, 153, 255));
        CategoryButton.setText("CATAGORY");

        LogoutButton.setBackground(new java.awt.Color(51, 102, 255));
        LogoutButton.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("LogOut");
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(categor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProductButton)
                                .addGap(0, 613, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrderButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CategoryButton)
                                .addGap(194, 194, 194)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductButton)
                            .addComponent(UserButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(CategoryButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CustomerButton)
                    .addComponent(OrderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseClicked
        new Product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductMouseClicked

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        new User().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
new Order().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseClicked

    private void categorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorMouseClicked
new Category().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_categorMouseClicked

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
      new Login().setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CategoryButton;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel CustomerButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel OrderButton;
    private javax.swing.JLabel Product;
    private javax.swing.JLabel ProductButton;
    private javax.swing.JLabel User;
    private javax.swing.JLabel UserButton;
    private javax.swing.JLabel categor;
    private javax.swing.JLabel customer;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel order;
    // End of variables declaration//GEN-END:variables
}
