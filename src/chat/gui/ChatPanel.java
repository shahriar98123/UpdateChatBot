package chat.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import chatController.ChatBotController;

public class ChatPanel 
{
	private ChatBotController appController;
	private SpringLayout appLayout;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatBotController app)
	{
		super();
		
		this.appController = app;
		appLayout = new SpringLayout();
		
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 29, 50);
		chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupListeners() {
		// TODO Auto-generated method stub
		
	}

	private void setupLayout() {
		// TODO Auto-generated method stub
		
	}

	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setColumnHeaderView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.MAGENTA);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent click)
			                    {
			String input = chatField.getText();
			String output = "";
			output = appController.interactWithChatbot(input);
			chatArea.append(output);
			chatField.setText("");;
			chatArea.setCaretPosition(chatArea.getDoucment().getLength());
			
			private String getPath(String choice)
			{
				String path= ".";
				int result = -99;
				JFileChooser fileChooser = new JFileChooser();
				if (choice.equals("save"))
				{
					fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					result = fileChooser.showOpenDialog(this);
					if(result == JFileChooser.APPROVE_OPTION)
					{
						path = fileChooser.getCurrentDirectory().getAbsolutePath();
					}
				}
				else
				{
					result = fileChooser.showSaveDialog(this);
					if(result == JFileChooser.APPROVE_OPTION)
					{
						path = fileChooser.getSelectedFile().getAbsolutePath();
					}
				}
				
				return path;
			}
			                    
			
		}
			
	});

	private void add(JTextField chatField2) {
		// TODO Auto-generated method stub
		
	}

	private void add(JScrollPane chatPane2) {
		// TODO Auto-generated method stub
		
	}

	private void add(JButton saveButton2) {
		// TODO Auto-generated method stub
		
	}

	private void setBackground(Color magenta) {
		// TODO Auto-generated method stub
		
	}

	private void setPreferredSize(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(SpringLayout appLayout2) {
		// TODO Auto-generated method stub
		
	}
}


