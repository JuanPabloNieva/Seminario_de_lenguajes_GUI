import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class AltaModRol extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfNombre;
	private JTextArea taDescripcion;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			//AltaModRol dialog = new AltaModRol();
			//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			//dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaModRol(ArrayList<Rol> roles) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNombre);
			}
			{
				tfNombre = new JTextField();
				tfNombre.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(tfNombre);
				tfNombre.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblDescripcion = new JLabel("Descripción:");
				panel.add(lblDescripcion);
			}
			{
				taDescripcion = new JTextArea();
				taDescripcion.setRows(3);
				taDescripcion.setColumns(25);
				panel.add(taDescripcion);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblNewLabel_2 = new JLabel("Estado: ");
				panel.add(lblNewLabel_2);
			}
			{
				JRadioButton rbActivado = new JRadioButton("Activado");
				rbActivado.setActionCommand("Activado");
				buttonGroup.add(rbActivado);
				panel.add(rbActivado);
			}
			{
				JRadioButton rdDesactivado = new JRadioButton("Desactivado");
				rdDesactivado.setActionCommand("Desactivado");
				buttonGroup.add(rdDesactivado);
				panel.add(rdDesactivado);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (buttonGroup.getSelection() != null) {
							String seleccionado = buttonGroup.getSelection().getActionCommand();
							Rol rol;
							if (seleccionado.equals("Activado")) {
								rol = new Rol(tfNombre.getText(), taDescripcion.getText(), true);
							} else {
								rol = new Rol(tfNombre.getText(), taDescripcion.getText(), false);
							}
							
							roles.add(rol);
							dispose();
						}
						
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
	}

}
