package windowui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JEditorPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

import java.awt.Component;

import javax.swing.JTextArea;

import cn.tyz.main.Main;
import cn.tyz.domain.News;
import cn.tyz.xml.Dom4jXmlParser;

import javax.swing.JTable;

import org.dom4j.Element;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setTitle("Lemon Reader");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setAutoscrolls(true);
		tabbedPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), new Color(0, 255, 255), Color.ORANGE, Color.ORANGE));
		JPanel panel = new JPanel();
		panel.setToolTipText("体育");
		tabbedPane.addTab("体育",panel);
		tabbedPane.setIconAt(0, new ImageIcon("/Users/xuqing/Downloads/2014101903033681_easyicon_net_214.png"));
		tabbedPane.setToolTipTextAt(0, "体育");
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.setBackgroundAt(0, Color.ORANGE);
		
		table = new JTable();
		GroupLayout gl_panel= new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(table, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(table, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("科技");
		tabbedPane.addTab("科技",panel_1);
		tabbedPane.setIconAt(1, new ImageIcon("/Users/xuqing/Downloads/20141019030412955_easyicon_net_416.png"));
		tabbedPane.setEnabledAt(1, true);
		tabbedPane.setBackgroundAt(1, Color.CYAN);
		
		JTextArea textArea_1 = new JTextArea();
		//显示当前的科技的内容
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("财经",panel_3);
		tabbedPane.setIconAt(2, new ImageIcon("/Users/xuqing/Downloads/20141019030505374_easyicon_net_40.png"));
		tabbedPane.setToolTipTextAt(2, "科技");
		tabbedPane.setEnabledAt(2, true);
		tabbedPane.setBackgroundAt(2, Color.MAGENTA);
		
		JTextArea textArea_2 = new JTextArea();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("娱乐",panel_2);
		tabbedPane.setIconAt(3, new ImageIcon("/Users/xuqing/Downloads/20141019030607525_easyicon_net_72.png"));
		tabbedPane.setToolTipTextAt(3, "娱乐");
		tabbedPane.setEnabledAt(3, true);
		tabbedPane.setBackgroundAt(3, Color.PINK);
		
		JTextArea textArea_3 = new JTextArea();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_3, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(textArea_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JButton button = new JButton("刷新");
		contentPane.add(button, BorderLayout.SOUTH);
	}
}
