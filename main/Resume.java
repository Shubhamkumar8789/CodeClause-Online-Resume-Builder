import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
    
class Resume extends JFrame implements ActionListener {
     
    // textfield to enter 
    JTextField namee=null, gender=null, fathernamee=null, cityy=null,
                emaill=null,skills=null,college=null,degree=null,linkedln=null,
                github = null,hackerrnk=null,contact=null,experience=null;
    JPasswordField  password=null,cpassword=null;
    // panel
    JFrame p=new JFrame("Created By Shubham Kumar- Online Resume Builder");
    JComboBox cb;
    // constructor
    Resume()
    {
        super("Resume");
        p.getContentPane().setBackground(Color.orange);
        // p.setBackground(Color.yellow);
        // create textfield
        String[] optionsToChoose = {"Male", "Female"};
        cb  = new JComboBox(optionsToChoose);
        cb.setBounds(200, 60, 200, 30);
        p.add(cb);
 
        namee = new JTextField(3);
        fathernamee = new JTextField(3);
        password = new JPasswordField(3);
        cpassword = new JPasswordField(3);
        cityy = new JTextField(3);
        emaill = new JTextField(3);
        skills = new JTextField(3);
        college = new JTextField(3);
        degree = new JTextField(3);
        linkedln = new JTextField(3);
        github = new JTextField(3);
        hackerrnk = new JTextField(3);
        contact = new JTextField(3);
        experience = new JTextField(3);
        
        namee.setBounds(200,10, 200,30);  
        fathernamee.setBounds(200,110, 200,30);  
        password.setBounds(200,160, 200,30);  
        cpassword.setBounds(200,210, 200,30);  
        cityy.setBounds(200,260, 200,30);  
        emaill.setBounds(200,310, 200,30);  
        skills.setBounds(200,360, 200,30);  

        college.setBounds(700,10, 200,30);  
        degree.setBounds(700,60, 200,30);  
        experience.setBounds(700,110, 200,30);  

        linkedln.setBounds(200,510, 200,30);  
        github.setBounds(200,560, 200,30);  
        hackerrnk.setBounds(200,610, 200,30);  
        contact.setBounds(200,660, 200,30);
        


 
        p.add(namee);
        p.add(fathernamee);
        p.add(password);
        p.add(cpassword);
        p.add(cityy);
        p.add(emaill);
        p.add(skills);
        p.add(college);
        p.add(degree);
        p.add(linkedln);
        p.add(github);
        p.add(hackerrnk);
        p.add(contact);
        p.add(experience);
        // p.add(experience);

        // create labels
        JLabel nameJLabel= new JLabel("NAME");
        JLabel genderJLabel= new JLabel("GENDER");
        JLabel fathernameJLabel= new JLabel("FATHERNAME");
        JLabel passwordJLabel= new JLabel("PASSWORD");
        JLabel cpasswordJLabel= new JLabel("CONFIRM PASSWORD");
        JLabel cityJLabel= new JLabel("CITY");
        JLabel emailJLabel= new JLabel("Email");
        JLabel emailJLabe= new JLabel("");
        JLabel skilJLabel= new JLabel("Skills");
        JLabel collegeJLabel= new JLabel("College");
        JLabel degreeJLabel= new JLabel("Degree");
        JLabel linkedlnJLabel= new JLabel("Linkedin link");
        JLabel githubJLabel= new JLabel("Github link");
        JLabel hackerJLabel= new JLabel("HackerRank link");
        JLabel contactJLabel= new JLabel("Contact");
        JLabel experienceLabel= new JLabel("Experience");
        // set location
		nameJLabel.setBounds(10, 10, 150, 30);
		genderJLabel.setBounds(10, 60, 150, 30);
		fathernameJLabel.setBounds(10, 110, 150, 30);
		passwordJLabel.setBounds(10, 160, 150, 30);
		cpasswordJLabel.setBounds(10, 210, 150, 30);
		cityJLabel.setBounds(10, 260, 150, 30);
		emailJLabel.setBounds(10, 310, 150, 30);
		emailJLabe.setBounds(10, 310, 150, 30);
        skilJLabel.setBounds(10, 360, 150, 30);

        linkedlnJLabel.setBounds(10, 510, 150, 30);
        githubJLabel.setBounds(10, 560, 150, 30);
        hackerJLabel.setBounds(10, 610, 150, 30);
        contactJLabel.setBounds(10, 660, 150, 30);

        experienceLabel.setBounds(500, 110, 150, 30);
        collegeJLabel.setBounds(500, 10, 150, 30);
        degreeJLabel.setBounds(500, 60, 150, 30);

        p.add(nameJLabel);
        p.add(genderJLabel);
        p.add(fathernameJLabel);
        p.add(passwordJLabel);
        p.add(cpasswordJLabel);
        p.add(cityJLabel);
        p.add(emailJLabel);
        p.add(emailJLabe);
        p.add(skilJLabel);
        p.add(collegeJLabel);
        p.add(degreeJLabel);
        p.add(hackerJLabel);
        p.add(linkedlnJLabel);
        p.add(githubJLabel);
        p.add(collegeJLabel);
        p.add(contactJLabel);
        p.add(experienceLabel);
     
        // create a panel
        
        // create button
        JButton b = new JButton("REGISTER");
        JButton b1 = new JButton("RESET");
        b.setBounds(500, 400,100,30);
        b1.setBounds(700, 400,100,30);
        // add ActionListener
        p.add(b);
        p.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
        
        // setSize(800, 800);
        // add(p);  
        p.setLayout(null);  
        p.setVisible(true);
        p.setSize(1000, 1000);
    }
     
    // if button is pressed
    public void actionPerformed(ActionEvent evt)
    {
        String s = evt.getActionCommand();
        String password1 = password.getText();
        String password2 = cpassword.getText();
        String name = namee.getText();
        String fathername = fathernamee.getText();
        String city = cityy.getText();
        String email = emaill.getText();
        String gender = (String)cb.getSelectedItem();
        String uskills = skills.getText();
        String ucollege = college.getText();
        String udegree = degree.getText();
        String ulinkdln = linkedln.getText();
        String ugithub = github.getText();
        String ucontact = contact.getText();
        String uexperience = experience.getText();

        if (s.equals("REGISTER")) 
        {
            JFrame f;
            if(name.equals("")||fathername.equals("")||city.equals("")||
            email.equals("")||gender.equals("")|| password1.equals("")||
             password2.equals("")||ucollege.equals("")||udegree.equals("")||
             ucontact.equals("")||ulinkdln.equals("")||ugithub.equals("")||uexperience.equals(""))
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Enter all details");  
            }
            else if(password1.equals(password2))
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Data Registered Successfully");  
                try
                {
                    FileOutputStream filee = new FileOutputStream(name+"_Resume.pdf",true);
                    String in = "Name: "+name+"\nGender: "+gender+"\nFather name: "+fathername+"\nPassword: "+password1+"\nCity: "+city+"\nEmail: "+email+
                                "\nSkills: "+uskills+"\nCollege: "+ucollege+"\nDegree: "+udegree+"\nLinkedin: "+ulinkdln+"\nGithub: "+ugithub+"\nContact: "+ucontact+
                                "\nExperience: "+uexperience;
                    char ch[] =in.toCharArray();
                    for(int i=0;i<in.length();i++)
                    {
                        filee.write(ch[i]);
                    }
                    filee.close();
                }
                catch(Exception e){}
            }
            else
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Password did not match");  
            }
        }
        else if(s.equals("RESET"))
        {
            namee.setText("");
            fathernamee.setText("");
            password.setText("");
            cpassword.setText("");
            emaill.setText("");
            cityy.setText("");
            skills.setText("");
            linkedln.setText("");
            experience.setText("");
            degree.setText("");
            github.setText("");
            contact.setText("");
        }
    }
     
    // Main Method
    public static void main(String args[])
    {
        Resume r = new Resume();
    }
}