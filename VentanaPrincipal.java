import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class VentanaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Rol[] createRoles() {
		Rol[] roles = new Rol[] {
				new Rol("ADMIN", "Permisos Totales", 1),
				new Rol("USUARIO", "Permisos Básicos", 2)
		};
		return roles;
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuarios");
		menuBar.add(mnNewMenu);
	
		Rol[] roles = createRoles();
 		JMenuItem mntmNewMenuItem = new JMenuItem("Alta / Modificación");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaModUsuario ventanaAltaMod = new AltaModUsuario(roles);
				ventanaAltaMod.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ventanaAltaMod.setVisible(true);
			}
		});
		mntmNewMenuItem.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listado");
		mntmNewMenuItem_1.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem_1);
	}

}
