package accident;

public class Application
{
        public static void main(String[] args)
        {

                AccidentFrame myApp=new AccidentFrame();
                myApp.setVisible(true);
                myApp.setSize(880, 500);
                myApp.setResizable(false);
                //myApp.setDefaultCloseOperation(AccidentPanel.EXIT_ON_CLOSE);
               
        }
    
}
