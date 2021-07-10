/*
https://www.oracle.com/technical-resources/articles/javase/systemtray.html
https://code.joejag.com/2013/move-your-mouse-pointer-with-java.html

-c4pt000

a java program to randomly relocate the mouse pointer location in order to stop the screensaver from starting, creates a tray icon of Redhat "shadowman"

(think watching progress of a program from across the room, or to watch a movie without the screensaver randomly starting, etc)

*/

import java.awt.Robot;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class MouseAntiLock {
    public static final int SIXTY_SECONDS = 60000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();


final TrayIcon trayIcon;


    SystemTray tray = SystemTray.getSystemTray();
    Image image = Toolkit.getDefaultToolkit().getImage("1.gif");

    MouseListener mouseListener = new MouseListener() {
                
        public void mouseClicked(MouseEvent e) {
            System.out.println("");                 
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("");                 
        }

        public void mouseExited(MouseEvent e) {
            System.out.println("");                 
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("");                 
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("");                 
        }
    };

    ActionListener exitListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Exiting...");
            System.exit(0);
        }
    };
            
    PopupMenu popup = new PopupMenu();
    MenuItem defaultItem = new MenuItem("Exit");
    defaultItem.addActionListener(exitListener);
    popup.add(defaultItem);

    trayIcon = new TrayIcon(image, "MouseAntiLock", popup);

    ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            trayIcon.displayMessage("Action Event", 
                "Random mouse movements enabled to prevent screensaver from starting",
                TrayIcon.MessageType.INFO);
        }
    };
            
    trayIcon.setImageAutoSize(true);
    trayIcon.addActionListener(actionListener);
    trayIcon.addMouseListener(mouseListener);

    try {
        tray.add(trayIcon);
    } catch (AWTException e) {
        System.err.println("MouseAntiLock TrayIcon could not be added.");
    }


        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(SIXTY_SECONDS);
}

        }
    }





