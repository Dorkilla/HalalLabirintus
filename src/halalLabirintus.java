import java.awt.HeadlessException;
import java.awt.List;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class halalLabirintus extends javax.swing.JFrame {
    //String elsozsoveg = ("")
    
    int felugroSzamolo = 0;
    int gombSzamolo = 1;
    
    String oldal11 = "Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal "+System.lineSeparator()+"oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. "+System.lineSeparator()+"Ha kiakarod nyitni a dobozt, lapozz a 270-re. "+System.lineSeparator()+"Ha inkább tovább haladsz észak felé, lapozz a 66-ra.";
    String oldal56 = "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve "+System.lineSeparator()+"tapasztalod, hogy lágy, szivacsszerű. Ha át szeretnél mászni rajta, lapozz a 373-ra. "+System.lineSeparator()+"Ha ketté akarod vágni a kardoddal, lapozz a 215-re.";
    String oldal66 = "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat."+System.lineSeparator()+" A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani,"+System.lineSeparator()+" de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. "+System.lineSeparator()+"Ha nyugat felé kívánsz menni, lapozz a 293-ra. "+System.lineSeparator()+"Ha keletnek, lapozz a 56-re.";
    String oldal137 = "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.";  
    String oldal215 = "Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. "+System.lineSeparator()+"Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon,"+System.lineSeparator()+" és a bőröd mintha égne. "+System.lineSeparator()+"2 ÉLETERŐ pontot veszítesz. "+System.lineSeparator()+"Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.";
    String oldal270 = "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól."+System.lineSeparator()+"Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: "+System.lineSeparator()+"- „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, "+System.lineSeparator()+"hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” "+System.lineSeparator()+"Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, "+System.lineSeparator()+"és tovább mészészak felé.";
    String oldal293 = "A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. "+System.lineSeparator()+"Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re. "+System.lineSeparator()+"Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.";
    String oldal373 = "Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, "+System.lineSeparator()+"mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. "+System.lineSeparator()+"Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.";
    String oldal387 = "Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. "+System.lineSeparator()+"Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, "+System.lineSeparator()+"és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, "+System.lineSeparator()+"hogy megküzdj a Barlangi Emberrel.";
    
    ArrayList<Oldal> oldalLista;
    Oldal jelenlegi = null;
    
    public halalLabirintus() {
        oldalLista = new ArrayList<Oldal>();
        oldalLista.add(new Oldal(
                "Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal "+System.lineSeparator()+"oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. "+System.lineSeparator()+"Ha kiakarod nyitni a dobozt, lapozz a 270-re. "+System.lineSeparator()+"Ha inkább tovább haladsz észak felé, lapozz a 66-ra.",
                1, 66, "Kinyitod a dobozt",
                270, "Tovább haladok"));
        oldalLista.add(new Oldal(
                "Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat."+System.lineSeparator()+" A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani,"+System.lineSeparator()+" de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. "+System.lineSeparator()+"Ha nyugat felé kívánsz menni, lapozz a 293-ra. "+System.lineSeparator()+"Ha keletnek, lapozz a 56-re.",
                66, 293, "elsőt",
                56, "második"));
        oldalLista.add(new Oldal(
                "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól."+System.lineSeparator()+"Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: "+System.lineSeparator()+"- „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, "+System.lineSeparator()+"hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” "+System.lineSeparator()+"Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, "+System.lineSeparator()+"és tovább mészészak felé.",
                270, 78, "első",
                79, "masodik"));
        initComponents();
        jelenlegi = getOldalByOldalszam(1);
        txtaElso.setText(jelenlegi.GetSzoveg());
        btnElsoLehetoseg.setText(jelenlegi.getElsoLehetosegSzoveg());
        btnMasodikLehetoseg.setText(jelenlegi.getMasodikLehetosegSzoveg());
        //String[] szovegek = {""}
    }

    public Oldal getOldalByOldalszam(int oldalszam) {
        for (int i = 0; i < oldalLista.size(); ++i) {
            if (oldalszam == oldalLista.get(i).GetOldalszam()) {
                return oldalLista.get(i);
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlKezdes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaBevezeto = new javax.swing.JTextArea();
        txtfNev = new javax.swing.JTextField();
        lblJatekosnev = new javax.swing.JLabel();
        btnKezdes = new javax.swing.JButton();
        pnlKarakter = new javax.swing.JPanel();
        cmbKaszt = new javax.swing.JComboBox<>();
        cmbFaj = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaKarakter = new javax.swing.JTextArea();
        btnKesz = new javax.swing.JButton();
        cmbNem = new javax.swing.JComboBox<>();
        pnlJatek = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaElso = new javax.swing.JTextArea();
        btnElsoLehetoseg = new javax.swing.JButton();
        btnMasodikLehetoseg = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblHatter = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(768, 432));
        getContentPane().setLayout(null);

        pnlKezdes.setBackground(new java.awt.Color(0, 0, 0));

        txtaBevezeto.setColumns(20);
        txtaBevezeto.setRows(5);
        txtaBevezeto.setText("Egy versenyre nevezel, aminek a lényege, hogy át kell kelni a halállabirintuson. A labirintusban \ntárgyakat találhatsz és szörnyekkel kell harcoljál.");
        jScrollPane1.setViewportView(txtaBevezeto);

        txtfNev.setText("Add meg a neved!");

        lblJatekosnev.setForeground(new java.awt.Color(255, 255, 255));
        lblJatekosnev.setText("Kérlek add meg a játékosnevedet!");

        btnKezdes.setText("Kezdés");
        btnKezdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKezdesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKezdesLayout = new javax.swing.GroupLayout(pnlKezdes);
        pnlKezdes.setLayout(pnlKezdesLayout);
        pnlKezdesLayout.setHorizontalGroup(
            pnlKezdesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKezdesLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(pnlKezdesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKezdesLayout.createSequentialGroup()
                        .addComponent(lblJatekosnev)
                        .addGap(48, 48, 48)
                        .addComponent(txtfNev, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKezdesLayout.createSequentialGroup()
                        .addComponent(btnKezdes)
                        .addGap(57, 57, 57))))
            .addGroup(pnlKezdesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlKezdesLayout.setVerticalGroup(
            pnlKezdesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKezdesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(pnlKezdesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJatekosnev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnKezdes)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Kezdés", pnlKezdes);

        pnlKarakter.setBackground(new java.awt.Color(0, 0, 0));

        cmbKaszt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz kasztot!", "Mágus", "Harcos", "Pap" }));

        cmbFaj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz fajt!", "Ember", "Törpe", "Góliát" }));

        txtaKarakter.setColumns(20);
        txtaKarakter.setRows(5);
        jScrollPane2.setViewportView(txtaKarakter);

        btnKesz.setText("Kész");

        cmbNem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz nemet!", "Nő", "Férfi", "Egyéb" }));

        javax.swing.GroupLayout pnlKarakterLayout = new javax.swing.GroupLayout(pnlKarakter);
        pnlKarakter.setLayout(pnlKarakterLayout);
        pnlKarakterLayout.setHorizontalGroup(
            pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKarakterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbFaj, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKaszt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlKarakterLayout.setVerticalGroup(
            pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKarakterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlKarakterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(pnlKarakterLayout.createSequentialGroup()
                        .addComponent(cmbKaszt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cmbFaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cmbNem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKesz)
                        .addGap(26, 26, 26))))
        );

        jTabbedPane1.addTab("Karakter", pnlKarakter);

        pnlJatek.setBackground(new java.awt.Color(0, 0, 0));

        txtaElso.setColumns(20);
        txtaElso.setRows(5);
        txtaElso.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, \namely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. \n\nHa kiakarod nyitni a dobozt, lapozz a 270-re. \nHa inkább tovább haladsz észak felé, lapozz a 66-ra.");
        jScrollPane3.setViewportView(txtaElso);

        btnElsoLehetoseg.setText("Kinyitom a dobozt");
        btnElsoLehetoseg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElsoLehetosegMouseClicked(evt);
            }
        });

        btnMasodikLehetoseg.setText("Tovább haladok");
        btnMasodikLehetoseg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasodikLehetosegMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlJatekLayout = new javax.swing.GroupLayout(pnlJatek);
        pnlJatek.setLayout(pnlJatekLayout);
        pnlJatekLayout.setHorizontalGroup(
            pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJatekLayout.createSequentialGroup()
                .addGap(74, 74, 74)
<<<<<<< HEAD
                .addComponent(btnElsoLehetoseg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnMasodikLehetoseg)
=======
                .addComponent(btnElsoKinyitom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(btnElsoTovabb)
>>>>>>> fb0444093b5a3221bd2f0e917661f09eaa5fddf2
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJatekLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        pnlJatekLayout.setVerticalGroup(
            pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJatekLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElsoLehetoseg)
                    .addComponent(btnMasodikLehetoseg))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Játék", pnlJatek);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(60, 60, 610, 280);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1045, 6, 0, 625);

        lblHatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halallabirintus/kepek/halal.jpg"))); // NOI18N
        getContentPane().add(lblHatter);
        lblHatter.setBounds(0, 0, 768, 432);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKezdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKezdesActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnKezdesActionPerformed

<<<<<<< HEAD
    private void btnElsoLehetosegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElsoLehetosegMouseClicked
        jelenlegi = getOldalByOldalszam(jelenlegi.GetElsoLehetoseg());
        txtaElso.setText(jelenlegi.GetSzoveg());
        btnElsoLehetoseg.setText(jelenlegi.getElsoLehetosegSzoveg());
        btnMasodikLehetoseg.setText(jelenlegi.getMasodikLehetosegSzoveg());
        /*
        Integer gombSzamolo=0;
      gombSzamolo+=1;
      felugroSzamolo+=1;
        if (felugroSzamolo == 1){
            int ikonTipus = JOptionPane.INFORMATION_MESSAGE;
=======
    private void btnElsoKinyitomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElsoKinyitomMouseClicked
//      int gombSzamolo=1;
//      gombSzamolo+=1;
//      felugroSzamolo+=1;
//        if (felugroSzamolo == 1){
//            int ikonTipus = JOptionPane.INFORMATION_MESSAGE;
//            JOptionPane.showMessageDialog(null,oldal270);
//        }  
        
        
        
        
//        if (gombSzamolo == oldal66) {
//            btnElsoKinyitom.setText("Nyugat fele");
//            btnElsoTovabb.setText("Kelet fele");
//        } else if (currentPage == 122) {
//            nextPageButton.setText("Different Next Page");
//            backButton.setText("Different Previous Page");
//        }
//       
        
//11=1
//56=2
//66=3
//137=4
//215=5
//270=6
//293=7
//373=8
//387=9

//            txtaElso.setText(oldal11);
//            btnElsoKinyitom.setText("Kinyitom a dobozt");
//            btnElsoTovabb.setText("Tovább haladok");
//            gombSzamolo+=1;

        if (gombSzamolo == 1) {
           
>>>>>>> fb0444093b5a3221bd2f0e917661f09eaa5fddf2
            JOptionPane.showMessageDialog(null,oldal270);
            gombSzamolo+=2;
//            if (btnElsoKinyitom.isSelected()){
//                
//                felugroSzamolo+=1;
//                if (felugroSzamolo == 1){
//                    int ikonTipus = JOptionPane.INFORMATION_MESSAGE;
//                    
//                }                    
//            }
        }

        else if (gombSzamolo == 3) {
            txtaElso.setText(oldal66);
<<<<<<< HEAD
           btnElsoLehetoseg.setText("Nyugat fele");
           btnMasodikLehetoseg.setText("Kelet fele");
         }   
                
        else if (gombSzamolo == 2) {
            txtaElso.setText(oldal293);
            btnElsoLehetoseg.setText("Nyugat fele");
            btnMasodikLehetoseg.setText("Észak fele");
      
=======
            btnElsoKinyitom.setText("Nyugat fele");
            btnElsoTovabb.setText("Kelet fele");
            gombSzamolo+=4;
//            if (btnElsoKinyitom.isSelected()){
//                gombSzamolo+=4;
//            }
        }
        
        
        else if (gombSzamolo == 7) {
            txtaElso.setText(oldal293);
            btnElsoKinyitom.setText("Nyugat fele");
            btnElsoTovabb.setText("Észak fele");
            JOptionPane.showMessageDialog(null,oldal137);
            System.exit(0); 
//            if (btnElsoKinyitom.isSelected()){
//                //vége
//            }
>>>>>>> fb0444093b5a3221bd2f0e917661f09eaa5fddf2
        }
        */
        
        else if (gombSzamolo == 2) {
            txtaElso.setText(oldal56);
            btnElsoKinyitom.setText("Átmászom");
            btnElsoTovabb.setText("Kettévágom");
            JOptionPane.showMessageDialog(null,oldal373);
            System.exit(0); 
//            if (btnElsoKinyitom.isSelected()){
//                gombSzamolo+=6;
//                if (gombSzamolo == 8) {
//                    int ikonTipus = JOptionPane.INFORMATION_MESSAGE;
//                    JOptionPane.showMessageDialog(null,oldal373);
//                    //  vége
//                }
//            }
        }
        
        
        
        
        
        
        
        
//        gombSzamolo+=1;
//        if (gombSzamolo == 2){ 
//            txtaElso.setText(oldal66);
//            btnElsoKinyitom.setText("Nyugat fele");
//            btnElsoTovabb.setText("Kelet fele");
//        }
        
        
        
//        else if (gombSzamolo == 1){
//            txtaElso.setText(oldal66);
//           btnElsoKinyitom.setText("Nyugat fele");
//           btnElsoTovabb.setText("Kelet fele");
//         }   
//                
//        else if (gombSzamolo == 2) {
//            txtaElso.setText(oldal293);
//            btnElsoKinyitom.setText("Nyugat fele");
//            btnElsoTovabb.setText("Észak fele");
//      
//        }
        
      
        
//        while (btnElsoKinyitom.isSelected()){
//            txtaElso.setText(oldal66);
//            btnElsoKinyitom.setText("Nyugat fele");
//            btnElsoTovabb.setText("Kelet fele");
//        }
//        
        
        
        
            
       
        
       
            
        
        
        
    }//GEN-LAST:event_btnElsoLehetosegMouseClicked

<<<<<<< HEAD
    private void btnMasodikLehetosegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasodikLehetosegMouseClicked
        jelenlegi = getOldalByOldalszam(jelenlegi.GetMasodikLehetoseg());
        txtaElso.setText(jelenlegi.GetSzoveg());
        btnElsoLehetoseg.setText(jelenlegi.getElsoLehetosegSzoveg());
        btnMasodikLehetoseg.setText(jelenlegi.getMasodikLehetosegSzoveg());
        
        /*
        txtaElso.setText(oldal66);
        btnElsoLehetoseg.setText("Nyugat fele");
        btnMasodikLehetoseg.setText("Kelet fele");
        
        txtaElso.setText(oldal56);
        btnElsoLehetoseg.setText("Átmászom");
        btnMasodikLehetoseg.setText("Kettévágom");
        */
=======
    private void btnElsoTovabbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElsoTovabbMouseClicked
//        int gombSzamolo=1;
//        gombSzamolo+=1;
        
//            txtaElso.setText(oldal11);
//            btnElsoKinyitom.setText("Kinyitom a dobozt");
//            btnElsoTovabb.setText("Tovább haladok");    
//            gombSzamolo+=1;

        if (gombSzamolo == 1) {
//            txtaElso.setText(oldal11);
//            btnElsoKinyitom.setText("Kinyitom a dobozt");
//            btnElsoTovabb.setText("Tovább haladok");
            gombSzamolo+=2;
//            if (btnElsoTovabb.isSelected()){
//                    gombSzamolo+=2;
//                }
        }
        
        else if (gombSzamolo == 3) {
            txtaElso.setText(oldal66);
            btnElsoKinyitom.setText("Nyugat fele");
            btnElsoTovabb.setText("Kelet fele");
            gombSzamolo-=1;
//            if (btnElsoTovabb.isSelected()){
//                gombSzamolo-=1;
//            }
        }
        
        else if (gombSzamolo == 2) {
            txtaElso.setText(oldal56);
            btnElsoKinyitom.setText("Átmászom");
            btnElsoTovabb.setText("Kettévágom");
            JOptionPane.showMessageDialog(null,oldal215);
            System.exit(0);
//            if (btnElsoTovabb.isSelected()){
//                gombSzamolo+=3;
//            }
        }
        
//        else if (gombSzamolo == 5) {
//            txtaElso.setText(oldal215);
//            //vége
//        }
         
        else if (gombSzamolo == 7) {
            txtaElso.setText(oldal293);
            btnElsoKinyitom.setText("Nyugat fele");
            btnElsoTovabb.setText("Észak fele");
            gombSzamolo+=2;
//            if (btnElsoKinyitom.isSelected()){
//                //vége
//            }
        }
        
        else if (gombSzamolo == 9) {
            txtaElso.setText(oldal387);
            
//            if (btnElsoKinyitom.isSelected()){
//                //vége
//            }
        }
        
//        txtaElso.setText(oldal66);
//        btnElsoKinyitom.setText("Nyugat fele");
//        btnElsoTovabb.setText("Kelet fele");
//        
//        txtaElso.setText(oldal56);
//        btnElsoKinyitom.setText("Átmászom");
//        btnElsoTovabb.setText("Kettévágom");
>>>>>>> fb0444093b5a3221bd2f0e917661f09eaa5fddf2
        
        
        
    }//GEN-LAST:event_btnMasodikLehetosegMouseClicked
    /*
    private void tovabb() throws HeadlessException {
       String uzenet = "A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól.\"+System.lineSeparator()+\"Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet:\"+System.lineSeparator()+ \"- „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.”\"+System.lineSeparator()+ \"Az aláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mész észak felé.";
       String cim = "Tovább";
       int gombTipusa = JOptionPane.OK_OPTION;
       
       int gomb = JOptionPane.showConfirmDialog(rootPane, uzenet, cim, gombTipusa);
       if (gomb == JOptionPane.OK_OPTION) {
           
       }
    }
    */
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
            java.util.logging.Logger.getLogger(halalLabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halalLabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halalLabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halalLabirintus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halalLabirintus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElsoLehetoseg;
    private javax.swing.JButton btnKesz;
    private javax.swing.JButton btnKezdes;
    private javax.swing.JButton btnMasodikLehetoseg;
    private javax.swing.JComboBox<String> cmbFaj;
    private javax.swing.JComboBox<String> cmbKaszt;
    private javax.swing.JComboBox<String> cmbNem;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHatter;
    private javax.swing.JLabel lblJatekosnev;
    private javax.swing.JPanel pnlJatek;
    private javax.swing.JPanel pnlKarakter;
    private javax.swing.JPanel pnlKezdes;
    private javax.swing.JTextArea txtaBevezeto;
    private javax.swing.JTextArea txtaElso;
    private javax.swing.JTextArea txtaKarakter;
    private javax.swing.JTextField txtfNev;
    // End of variables declaration//GEN-END:variables

    private static class Jpanel {

        public Jpanel() {
        }
    }
}
