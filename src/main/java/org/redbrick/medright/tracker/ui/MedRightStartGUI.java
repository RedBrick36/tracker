/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright.tracker.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author RedBrick
 */
public class MedRightStartGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6971827176233560251L;

	/**
	 * Creates new form MedRightTopLevel
	 *
	 * @throws java.lang.ClassNotFoundException
	 * @throws java.lang.InstantiationException
	 * @throws java.lang.IllegalAccessException
	 */
	public MedRightStartGUI() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		this.initComponents();

	}

	public void closeMedStartGUI() {

		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	// GEN-BEGIN:initComponents;

	private void initComponents() {

		pillScrollPane = new javax.swing.JScrollPane();
		pillTable = new javax.swing.JTable();
		Treatments = new javax.swing.JTabbedPane();
		pills = new javax.swing.JPanel();
		pillsPane = new javax.swing.JScrollPane();
		pillsTable = new javax.swing.JTable();
		liquids = new javax.swing.JPanel();
		liquidsScrollPane = new javax.swing.JScrollPane();
		liquidsTable = new javax.swing.JTable();
		injections = new javax.swing.JPanel();
		injectionsScrollPane1 = new javax.swing.JScrollPane();
		injectionsTable = new javax.swing.JTable();
		topicals = new javax.swing.JPanel();
		topicalsScrollPanel = new javax.swing.JScrollPane();
		topicalsTable = new javax.swing.JTable();
		supplements = new javax.swing.JPanel();
		supplementsScrollPanel = new javax.swing.JScrollPane();
		SupplementsTable = new javax.swing.JTable();
		iteminfo = new javax.swing.JPanel();
		iteminfoScrollPanel = new javax.swing.JScrollPane();
		iteminfoJTree = new javax.swing.JTree();
		iteminfoScrollPane = new javax.swing.JScrollPane();
		schedule = new javax.swing.JPanel();
		scheduleScrollPane = new javax.swing.JScrollPane();
		scheduleTable = new javax.swing.JTable();
		scheduleTable.setPreferredScrollableViewportSize(new Dimension(400, 400));
		jProgressBar1 = new javax.swing.JProgressBar();
		tools = new javax.swing.JPanel();
		tools.setBackground(new Color(102, 204, 255));
		tools.setFocusable(false);
		tools.setFont(new Font("Dialog", Font.BOLD, 12));
		tools.setForeground(new Color(0, 0, 0));
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setBounds(207, 12, 653, 30);
		banner = new javax.swing.JLabel();
		version = new javax.swing.JLabel();
		creator = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		exitMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		contentsMenuItem = new javax.swing.JMenuItem();
		aboutMenuItem = new javax.swing.JMenuItem();

		pillTable
				.setModel(
						new javax.swing.table.DefaultTableModel(
								new Object[][] { { null, null, null, null }, { null, null, null, null },
										{ null, null, null, null },
										{ null, null, null, null }, { null, null, null, null }, { null, null, null,
												null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null } },
								new String[] { "Name", "Size", "Dose", "Condition" }) {
							/**
									 * 
									 */
							private static final long serialVersionUID = 6499129938262891775L;
							boolean[] canEdit = new boolean[] { false, false, false, false };

							@Override
							public boolean isCellEditable(int rowIndex, int columnIndex) {
								return canEdit[columnIndex];
							}
						});
		pillTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		pillTable.setCellSelectionEnabled(true);
		pillTable.setShowGrid(true);
		pillScrollPane.setViewportView(pillTable);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("MedRight© Treatment Tracker");
		setBounds(new java.awt.Rectangle(0, 23, 761, 540));
		setMinimumSize(new java.awt.Dimension(761, 540));
		setName("mainframe"); // NOI18N
		setSize(new java.awt.Dimension(761, 500));

		Treatments.setToolTipText("");

		pills.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		pills.setToolTipText("");

		pillsTable
				.setModel(
						new javax.swing.table.DefaultTableModel(
								new Object[][] { { null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null },
										{ null, null, null, null }, { null, null, null, null }, { null, null, null,
												null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null },
										{ null, null, null, null }, { null, null, null, null } },
								new String[] { "Name", "Dose", "Measure", "Condition" }) {

							/**
									 * 
									 */
							private static final long serialVersionUID = -4274971566552941947L;
							@SuppressWarnings("rawtypes")
							Class[] types = new Class[] { java.lang.String.class, java.lang.Double.class,
									java.lang.String.class, java.lang.String.class };
							boolean[] canEdit = new boolean[] { false, false, false, false };

							@SuppressWarnings("unchecked")
							@Override
							public Class getColumnClass(int columnIndex) {
								return types[columnIndex];
							}

							@Override
							public boolean isCellEditable(int rowIndex, int columnIndex) {
								return canEdit[columnIndex];
							}
						});
		pillsPane.setViewportView(pillsTable);

		org.jdesktop.layout.GroupLayout pillsLayout = new org.jdesktop.layout.GroupLayout(pills);
		pills.setLayout(pillsLayout);
		pillsLayout.setHorizontalGroup(
				pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 1016, Short.MAX_VALUE)
						.add(pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pillsPane,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)));
		pillsLayout.setVerticalGroup(
				pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 581, Short.MAX_VALUE)
						.add(pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(pillsPane,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)));

		Treatments.addTab("Pills", pills);

		liquids.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		liquidsTable
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null } }, new String[] { "Name", "Dose", "Measure", "Condition" }) {

					/**
							 * 
							 */
					private static final long serialVersionUID = 2890673226317132956L;
					@SuppressWarnings("rawtypes")
					Class[] types = new Class[] { java.lang.String.class, java.lang.Double.class,
							java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false };

					@SuppressWarnings("unchecked")
					@Override
					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		liquidsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		liquidsScrollPane.setViewportView(liquidsTable);

		org.jdesktop.layout.GroupLayout liquidsLayout = new org.jdesktop.layout.GroupLayout(liquids);
		liquids.setLayout(liquidsLayout);
		liquidsLayout.setHorizontalGroup(liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE));
		liquidsLayout.setVerticalGroup(liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE));

		Treatments.addTab("Liquids", liquids);

		injections.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		injectionsTable
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null } }, new String[] { "Name", "Dose", "Measure", "Condition" }) {

					/**
							 * 
							 */
					private static final long serialVersionUID = 1389078004609812551L;
					@SuppressWarnings("rawtypes")
					Class[] types = new Class[] { java.lang.String.class, java.lang.Double.class,
							java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false };

					@SuppressWarnings("unchecked")
					@Override
					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		injectionsScrollPane1.setViewportView(injectionsTable);

		org.jdesktop.layout.GroupLayout injectionsLayout = new org.jdesktop.layout.GroupLayout(injections);
		injections.setLayout(injectionsLayout);
		injectionsLayout.setHorizontalGroup(
				injectionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(injectionsScrollPane1,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE));
		injectionsLayout.setVerticalGroup(injectionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(injectionsScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE));

		Treatments.addTab("Injections", injections);

		topicals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		topicalsTable
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null } }, new String[] { "Name", "Dose", "Measure", "Condition" }) {

					/**
							 * 
							 */
					private static final long serialVersionUID = -9011958261992529438L;
					@SuppressWarnings("rawtypes")
					Class[] types = new Class[] { java.lang.String.class, java.lang.Double.class,
							java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false };

					@SuppressWarnings("unchecked")
					@Override
					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		topicalsScrollPanel.setViewportView(topicalsTable);

		org.jdesktop.layout.GroupLayout topicalsLayout = new org.jdesktop.layout.GroupLayout(topicals);
		topicals.setLayout(topicalsLayout);
		topicalsLayout.setHorizontalGroup(topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(topicalsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE));
		topicalsLayout.setVerticalGroup(topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(topicalsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE));

		Treatments.addTab("Topicals", topicals);

		supplements.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		SupplementsTable
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null },

				{ null, null, null, null } }, new String[] { "Name", "Dose", "Measure", "Condition" }) {

					/**
							 * 
							 */
					private static final long serialVersionUID = -7449754384925718819L;
					@SuppressWarnings("rawtypes")
					Class[] types = new Class[] { java.lang.String.class, java.lang.Double.class,
							java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false };

					@SuppressWarnings("unchecked")
					@Override
					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		supplementsScrollPanel.setViewportView(SupplementsTable);

		org.jdesktop.layout.GroupLayout supplementsLayout = new org.jdesktop.layout.GroupLayout(supplements);
		supplements.setLayout(supplementsLayout);
		supplementsLayout
				.setHorizontalGroup(supplementsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
						supplementsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE));
		supplementsLayout
				.setVerticalGroup(supplementsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
						supplementsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE));

		Treatments.addTab("Supplements", supplements);

		iteminfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Treatments");
		javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pills");
		treeNode1.add(treeNode2);
		treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Liquids");
		treeNode1.add(treeNode2);
		treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Injections");
		treeNode1.add(treeNode2);
		treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Topicals");
		treeNode1.add(treeNode2);
		treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fitness");
		treeNode1.add(treeNode2);
		iteminfoJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
		iteminfoJTree.setAutoscrolls(true);
		iteminfoJTree.setMinimumSize(new java.awt.Dimension(78, 72));
		iteminfoJTree.setSize(new java.awt.Dimension(78, 72));
		iteminfoScrollPanel.setViewportView(iteminfoJTree);

		org.jdesktop.layout.GroupLayout iteminfoLayout = new org.jdesktop.layout.GroupLayout(iteminfo);
		iteminfo.setLayout(iteminfoLayout);
		iteminfoLayout.setHorizontalGroup(iteminfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(iteminfoLayout.createSequentialGroup()
						.add(iteminfoScrollPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(iteminfoScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)));
		iteminfoLayout.setVerticalGroup(iteminfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(iteminfoScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
				.add(org.jdesktop.layout.GroupLayout.TRAILING, iteminfoScrollPane));

		Treatments.addTab("Treatment Info", iteminfo);

		schedule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		schedule.setPreferredSize(new Dimension(800, 340));

		scheduleTable.setAutoCreateRowSorter(true);
		scheduleTable
				.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null },

				{ null, null, null, null, null, null, null, null } },
						new String[] { "A.M.", "Mid Morning", "Noon", "Mid Afternoon", "Afternoon", "Evening",
								"Bedtime", "Middle of Night" }) {

					/**
									 * 
									 */
					private static final long serialVersionUID = -2603073668712857220L;
					@SuppressWarnings("rawtypes")
					Class[] types = new Class[] { java.lang.String.class, java.lang.String.class,
							java.lang.String.class, java.lang.String.class, java.lang.String.class,
							java.lang.String.class, java.lang.String.class, java.lang.String.class };
					boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false };

					@SuppressWarnings("unchecked")
					@Override
					public Class getColumnClass(int columnIndex) {
						return types[columnIndex];
					}

					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
		scheduleTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		scheduleTable.setColumnSelectionAllowed(true);
		scheduleTable.setEnabled(false);
		scheduleScrollPane.setViewportView(scheduleTable);

		btnTookNight = new JButton("Took Night");

		btnTookBedtime = new JButton("Took Bedtime");

		btnTookEvening = new JButton("Took Evening");

		btnTookAfternoon = new JButton("Took Afternoon");

		btnTookMidaft = new JButton("Took Mid-Aft");

		btnTookNoon = new JButton("Took Noon");

		btnTookMidmorn = new JButton("Took Mid-Morn");

		btnTookMorining = new JButton("Took Morining");

		GroupLayout scheduleLayout = new GroupLayout(schedule);
		scheduleLayout
				.setHorizontalGroup(scheduleLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(scheduleLayout.createSequentialGroup()
								.addGroup(scheduleLayout
										.createParallelGroup(
												Alignment.LEADING)
										.addGroup(
												scheduleLayout.createSequentialGroup().addContainerGap()
														.addComponent(jProgressBar1, GroupLayout.DEFAULT_SIZE, 1039,
																Short.MAX_VALUE))
										.addGroup(scheduleLayout.createSequentialGroup().addComponent(btnTookMorining)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnTookMidmorn)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnTookNoon)
												.addGap(19).addComponent(btnTookMidaft)
												.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
												.addComponent(btnTookAfternoon)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnTookEvening)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnTookBedtime)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnTookNight).addGap(18))
						.addComponent(scheduleScrollPane, GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE))
				.addContainerGap()));
		scheduleLayout
				.setVerticalGroup(
						scheduleLayout
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(scheduleLayout.createSequentialGroup()
										.addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(13)
										.addComponent(scheduleScrollPane, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(scheduleLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnTookMorining)
								.addComponent(btnTookMidmorn).addComponent(btnTookNoon).addComponent(btnTookMidaft)
								.addComponent(btnTookAfternoon).addComponent(btnTookEvening)
								.addComponent(btnTookBedtime).addComponent(btnTookNight)).addGap(14)));
		schedule.setLayout(scheduleLayout);

		Treatments.addTab("Todays Schedule", schedule);

		tools.setBorder(javax.swing.BorderFactory.createCompoundBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)),
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

		jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
		jLabel2.setText("A Security Check is Required to Unlock these Tools");

		Treatments.addTab("Tools", tools);
		tools.setLayout(null);
		tools.add(jLabel2);

		JTextPane txtpnNoticeUsingThe = new JTextPane();
		txtpnNoticeUsingThe.setForeground(Color.WHITE);
		txtpnNoticeUsingThe.setBackground(UIManager.getColor("OptionPane.errorDialog.border.background"));
		txtpnNoticeUsingThe.setFocusTraversalKeysEnabled(false);
		txtpnNoticeUsingThe.setFocusable(false);
		txtpnNoticeUsingThe.setFocusCycleRoot(false);
		txtpnNoticeUsingThe.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtpnNoticeUsingThe.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnNoticeUsingThe
				.setText("               WARNING!\n     \"Delete All Table Data\"\n          is not reversible!");
		txtpnNoticeUsingThe.setBounds(669, 249, 191, 60);
		tools.add(txtpnNoticeUsingThe);

		JButton btnNewButton = new JButton("Run Security Check!");
		btnNewButton.setBounds(207, 249, 202, 25);
		tools.add(btnNewButton);

		txtpnToolsButtonsWill = new JTextPane();
		txtpnToolsButtonsWill.setSelectedTextColor(Color.WHITE);
		txtpnToolsButtonsWill.setRequestFocusEnabled(false);
		txtpnToolsButtonsWill.setMargin(new Insets(6, 6, 6, 6));
		txtpnToolsButtonsWill.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		txtpnToolsButtonsWill.setFocusCycleRoot(false);
		txtpnToolsButtonsWill.setFocusTraversalKeysEnabled(false);
		txtpnToolsButtonsWill.setFocusable(false);
		txtpnToolsButtonsWill.setForeground(new Color(0, 0, 0));
		txtpnToolsButtonsWill.setCaretColor(Color.WHITE);
		txtpnToolsButtonsWill.setAutoscrolls(false);
		txtpnToolsButtonsWill.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtpnToolsButtonsWill.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtpnToolsButtonsWill.setBackground(new Color(0, 255, 0));
		txtpnToolsButtonsWill
				.setText("             Button Names\n        will turn BLACK  after\n     successful Security Check");
		txtpnToolsButtonsWill.setBounds(207, 169, 202, 53);
		tools.add(txtpnToolsButtonsWill);

		btnDeleteAllData = new JButton("Delete All Table Data!");
		btnDeleteAllData.setForeground(Color.RED);
		btnDeleteAllData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteAllData.setBounds(669, 206, 191, 25);
		tools.add(btnDeleteAllData);

		btnEditDatabase = new JButton("Edit Database");
		btnEditDatabase.setForeground(Color.RED);
		btnEditDatabase.setBounds(467, 208, 153, 25);
		tools.add(btnEditDatabase);

		btnBackupDatabase = new JButton("Backup Database");
		btnBackupDatabase.setForeground(Color.RED);
		btnBackupDatabase.setBounds(467, 245, 153, 25);
		tools.add(btnBackupDatabase);

		btnRestoreDatabase = new JButton("Restore Database");
		btnRestoreDatabase.setForeground(Color.RED);
		btnRestoreDatabase.setBounds(467, 284, 153, 25);
		tools.add(btnRestoreDatabase);

		btnSetTimeframeDefaults = new JButton("Set Time-Frame Defaults");
		btnSetTimeframeDefaults.setForeground(Color.RED);
		btnSetTimeframeDefaults.setBounds(669, 169, 191, 25);
		tools.add(btnSetTimeframeDefaults);

		btnCheckDatabase = new JButton("Check Database");
		btnCheckDatabase.setForeground(Color.RED);
		btnCheckDatabase.setBounds(467, 171, 153, 25);
		tools.add(btnCheckDatabase);

		txtpnThisSecurityCheck = new JTextPane();
		txtpnThisSecurityCheck.setBackground(UIManager.getColor("Button.shadow"));
		txtpnThisSecurityCheck.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		txtpnThisSecurityCheck.setEditable(false);
		txtpnThisSecurityCheck.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpnThisSecurityCheck.setText(
				"   This additional security check is required because the tools on this page are very powerful!\n\n\t          Please click the 'Run Security Check' button below to verify \n\t              your username and password and unlock these tools.");
		txtpnThisSecurityCheck.setBounds(207, 67, 653, 77);
		tools.add(txtpnThisSecurityCheck);

		banner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		banner.setText("MedRight© Treatement Tracker");
		banner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		version.setText("Ver 0.1");

		creator.setText("RedBrick.Org, 2015");

		jTextArea1.setColumns(2);
		jTextArea1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
		jTextArea1.setRows(1);
		jTextArea1.setAutoscrolls(false);
		jTextArea1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
				javax.swing.BorderFactory.createTitledBorder(null, "Time to Next Treatment",
						javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP,
						new java.awt.Font("Dialog", 1, 18)))); // NOI18N
		jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		jTextArea1.setFocusable(false);
		jTextArea1.setMinimumSize(new java.awt.Dimension(232, 60));
		jScrollPane1.setViewportView(jTextArea1);

		menuBar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

		fileMenu.setMnemonic('f');
		fileMenu.setText("File");
		fileMenu.setAlignmentX(2.5F);
		fileMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
		fileMenu.setIconTextGap(6);
		fileMenu.setMargin(new java.awt.Insets(4, 4, 4, 4));

		exitMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		exitMenuItem.setMnemonic('x');
		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		helpMenu.setMnemonic('h');
		helpMenu.setText("Help");
		helpMenu.setAlignmentX(1.5F);
		helpMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
		helpMenu.setIconTextGap(6);

		contentsMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		contentsMenuItem.setMnemonic('c');
		contentsMenuItem.setText("Contents");
		helpMenu.add(contentsMenuItem);

		aboutMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
		aboutMenuItem.setMnemonic('a');
		aboutMenuItem.setText("About");
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		btnAddNewTreatement = new JButton("Add New Treatement");

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(35).addComponent(version).addGap(37)
										.addComponent(creator))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(banner,
								GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE).addGap(89)
				.addComponent(btnAddNewTreatement).addGap(164))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(Treatments, GroupLayout.PREFERRED_SIZE, 1074, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(23, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(banner, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(version, GroupLayout.PREFERRED_SIZE, 15,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(creator))
										.addGap(10))
						.addGroup(
								layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnAddNewTreatement).addComponent(jScrollPane1,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(14)))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(Treatments,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(20)));
		getContentPane().setLayout(layout);

		Treatments.getAccessibleContext().setAccessibleName("treatmentsJTabbedPane");

		getAccessibleContext().setAccessibleName("medrightMainGUI");
		getAccessibleContext().setAccessibleDescription("");

		pack();
	}// GEN-END:initComponents

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}// GEN-LAST:event_exitMenuItemActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MedRightStartGUI.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		// </editor-fold>
		// </editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new MedRightStartGUI().setVisible(true);

				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
					Logger.getLogger(MedRightStartGUI.class.getName()).log(Level.SEVERE, null, ex);
				}

			}

		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel tools;
	private javax.swing.JTable SupplementsTable;
	private javax.swing.JTabbedPane Treatments;
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JLabel banner;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JLabel creator;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JPanel injections;
	private javax.swing.JScrollPane injectionsScrollPane1;
	private javax.swing.JTable injectionsTable;
	private javax.swing.JPanel iteminfo;
	private javax.swing.JTree iteminfoJTree;
	private javax.swing.JScrollPane iteminfoScrollPane;
	private javax.swing.JScrollPane iteminfoScrollPanel;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JPanel liquids;
	private javax.swing.JScrollPane liquidsScrollPane;
	private javax.swing.JTable liquidsTable;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JScrollPane pillScrollPane;
	private javax.swing.JTable pillTable;
	private javax.swing.JPanel pills;
	private javax.swing.JScrollPane pillsPane;
	private javax.swing.JTable pillsTable;
	private javax.swing.JPanel schedule;
	private javax.swing.JScrollPane scheduleScrollPane;
	private javax.swing.JTable scheduleTable;
	private javax.swing.JPanel supplements;
	private javax.swing.JScrollPane supplementsScrollPanel;
	private javax.swing.JPanel topicals;
	private javax.swing.JScrollPane topicalsScrollPanel;
	private javax.swing.JTable topicalsTable;
	private javax.swing.JLabel version;
	private JTextPane txtpnToolsButtonsWill;
	private JButton btnDeleteAllData;
	private JButton btnEditDatabase;
	private JButton btnBackupDatabase;
	private JButton btnRestoreDatabase;
	private JButton btnSetTimeframeDefaults;
	private JButton btnAddNewTreatement;
	private JButton btnTookNight;
	private JButton btnTookBedtime;
	private JButton btnTookEvening;
	private JButton btnTookAfternoon;
	private JButton btnTookMidaft;
	private JButton btnTookNoon;
	private JButton btnTookMidmorn;
	private JButton btnTookMorining;
	private JButton btnCheckDatabase;
	private JTextPane txtpnThisSecurityCheck;
}
