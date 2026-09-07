import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaModUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfUsuario;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaModUsuario dialog = new AltaModUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public AltaModUsuario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println(e);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(0, 1, 0, 0));
			{
				JPanel panel_1 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				flowLayout.setVgap(15);
				flowLayout.setHgap(40);
				panel.add(panel_1);
				{
					JLabel lblUsuario = new JLabel("Usuario");
					lblUsuario.setPreferredSize(new Dimension(70, 14));
					lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
					panel_1.add(lblUsuario);
				}
				{
					tfUsuario = new JTextField();
					tfUsuario.setColumns(15);
					panel_1.add(tfUsuario);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				flowLayout.setVgap(15);
				flowLayout.setHgap(40);
				panel.add(panel_1);
				{
					JLabel lblContrasenia = new JLabel("Contraseña");
					lblContrasenia.setPreferredSize(new Dimension(70, 14));
					lblContrasenia.setHorizontalAlignment(SwingConstants.LEFT);
					panel_1.add(lblContrasenia);
				}
				{
					textField_1 = new JTextField();
					textField_1.setColumns(15);
					panel_1.add(textField_1);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				flowLayout.setVgap(15);
				flowLayout.setHgap(40);
				panel.add(panel_1);
				{
					JLabel lblNombre = new JLabel("Nombre");
					lblNombre.setPreferredSize(new Dimension(70, 14));
					lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
					panel_1.add(lblNombre);
				}
				{
					textField_2 = new JTextField();
					textField_2.setColumns(15);
					panel_1.add(textField_2);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				flowLayout.setVgap(15);
				flowLayout.setHgap(40);
				panel.add(panel_1);
				{
					JLabel lblEmail = new JLabel("Email");
					lblEmail.setPreferredSize(new Dimension(70, 14));
					lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
					panel_1.add(lblEmail);
				}
				{
					textField_3 = new JTextField();
					textField_3.setColumns(15);
					panel_1.add(textField_3);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				flowLayout.setVgap(15);
				flowLayout.setHgap(40);
				panel.add(panel_1);
				{
					JLabel lblRol = new JLabel("Rol");
					lblRol.setPreferredSize(new Dimension(70, 14));
					lblRol.setHorizontalAlignment(SwingConstants.LEFT);
					panel_1.add(lblRol);
				}
				{
					JComboBox cbRol = new JComboBox();
					cbRol.setPreferredSize(new Dimension(125, 22));
					panel_1.add(cbRol);
				}
			}
		}
	}

}
