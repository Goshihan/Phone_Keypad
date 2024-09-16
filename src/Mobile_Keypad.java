import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.CLabel;


public class Mobile_Keypad {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Mobile_Keypad window = new Mobile_Keypad();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(230, 230, 250));
		shell.setSize(267, 525);
		shell.setText("SWT Application");
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.setForeground(SWTResourceManager.getColor(0, 0, 0));
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				text.setText( text.getText()+"1");
			}
		});
			
			
		btn1.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn1.setBounds(31, 145, 51, 38);
		btn1.setText("1");
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"2");
			}
		});
		btn2.setText("2");
		btn2.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn2.setBounds(98, 145, 51, 38);
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"3");
			}
		});
		btn3.setText("3");
		btn3.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn3.setBounds(171, 145, 51, 38);
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"4");
			}
		});
		btn4.setText("4");
		btn4.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn4.setBounds(31, 204, 51, 38);
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"5");
			}
		});
		btn5.setText("5");
		btn5.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn5.setBounds(98, 204, 51, 38);
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"6");
			}
		});
		btn6.setText("6");
		btn6.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn6.setBounds(171, 204, 51, 38);
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"7");
			}
		});
		btn7.setText("7");
		btn7.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn7.setBounds(31, 261, 51, 38);
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"8");
			}
		});
		btn8.setText("8");
		btn8.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn8.setBounds(98, 261, 51, 38);
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"9");
			}
		});
		btn9.setText("9");
		btn9.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn9.setBounds(171, 261, 51, 38);
		
		Button btnst = new Button(shell, SWT.NONE);
		btnst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"*");
			}
		});
		btnst.setText("*");
		btnst.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btnst.setBounds(31, 320, 51, 38);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText( text.getText()+"0");
			}
		});
		btn0.setText("0");
		btn0.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btn0.setBounds(98, 320, 51, 38);
		
		Button btncs = new Button(shell, SWT.NONE);
		btncs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				text.setText( text.getText()+"#");
			}
		});
		btncs.setText("#");
		btncs.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btncs.setBounds(171, 320, 51, 38);
		
		Button btncall = new Button(shell, SWT.NONE);
		btncall.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				text.setText("Calling....");
			}
		});
		btncall.setText("CALL");
		btncall.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btncall.setBounds(31, 404, 90, 38);
		
		Button btnmute = new Button(shell, SWT.NONE);
		btnmute.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText("");
			}
		});
		btnmute.setText("MUTE");
		btnmute.setFont(SWTResourceManager.getFont("Times New Roman", 18, SWT.BOLD));
		btnmute.setBounds(127, 404, 95, 38);
		
		text = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.CENTER);
		text.setBackground(SWTResourceManager.getColor(0, 191, 255));
		text.setFont(SWTResourceManager.getFont("Times New Roman", 19, SWT.BOLD));
		text.setBounds(31, 37, 191, 58);
		
		CLabel lblNewLabel = new CLabel(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		lblNewLabel.setForeground(SWTResourceManager.getColor(230, 230, 250));
		lblNewLabel.setBackground(SWTResourceManager.getColor(0, 0, 205));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(31, 10, 191, 21);
		lblNewLabel.setText("EUSL PHONE");

	}
}
