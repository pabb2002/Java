package brackets;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;



public class Brackets_Abbaraju {
    private final MyCanvas canvas = new MyCanvas();
   
    public Brackets_Abbaraju () {
        JFrame frame = new JFrame();
        frame.setSize(1600, 1240);
        frame.setTitle("Pranav Abbaraju - Brackets");
        frame.add(canvas);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);     
    }
    
   
    public static void main(String[] args) {
        Brackets_Abbaraju b = new Brackets_Abbaraju();
        
        

    }
   
}



class MyCanvas extends Canvas {
    
    private BufferedImage img;

    public MyCanvas() {
            try {
                img = ImageIO.read(new File("src/brackets/finalfour.jpg"));
            } catch (IOException ex) {
            }
        }

    
    @Override
    public void paint(Graphics g) {
   
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 1600, 1240);
        
        g.setColor(new Color(202, 203, 204));
        g.fillRoundRect(240+120+95+95, 563+40, 500, 50, 4, 4);
        g.fillRoundRect(240+35, 160, 1600-(275*2), 55, 4, 4);
        g.fillOval(762, 171, 80, 80);
        
        
        g.setColor(new Color(39, 32, 87));
        g.fillRoundRect(40, 30, 1600 - 80, 60, 4, 4);
        g.setColor(Color.white);
        g.setFont(new Font("Abadi MT Condensed Extra Bold", Font.BOLD + Font.ITALIC, 30));
        g.drawString("2018 NCAA DIVISION I MEN'S BASKETBALL CHAMPIONSHIP BRACKET", 280, 73);
        
        
        g.setFont(new Font("Abadi MT Condensed Extra Bold", Font.BOLD + Font.ITALIC, 16));
        g.setColor(new Color(27, 143, 156));
        g.drawString("FINAL FOUR", 750, 252+25+50+110);
        g.drawString("NATIONAL", 760, 550);
        g.drawString("CHAMPIONSHIP", 738, 567);
        
        g.setColor(Color.black);
        g.drawString("FIRST FOUR", 756, 150);
        g.drawString("#MarchMadness", 738, 820);
        g.drawLine(300, 180, 460, 180);
        g.drawLine(460, 180, 460, 206);
        g.drawLine(300, 206, 460, 206);
        g.drawLine(520, 180, 680, 180);
        g.drawLine(680, 180, 680, 206);
        g.drawLine(520, 206, 680, 206);
        
        g.drawLine(920, 180, 1080, 180);
        g.drawLine(920, 180, 920, 206);
        g.drawLine(920, 206, 1080, 206);
        g.drawLine(1140, 180, 1300, 180);
        g.drawLine(1140, 180, 1140, 206);
        g.drawLine(1140, 206, 1300, 206);
        
        
        g.setColor(new Color(39, 32, 87));
        g.drawString("SOUTH", 486, 425);
        g.drawString("WEST", 495, 830);
        g.drawString("EAST", 1060, 425);
        g.drawString("MIDWEST", 1060, 830);
        
        g.drawString("E", 465, 195);
        g.drawString("E", 685, 195);
        g.drawString("W", 901, 195);
        g.drawString("MW", 1109, 195);
        g.setColor(Color.black);
        g.setFont(new Font("Avenir", Font.PLAIN, 10));
        g.drawString("16 LIU Brooklyn (18-16)", 300, 177);
        g.drawString("16 Radford (22-12)", 300, 204);
        g.drawString("11 St. Bona. (25-7)", 520, 177);
        g.drawString("11 UCLA (21-11)", 520, 204);
        g.drawString("NC Central (19-15)16", 983, 177);
        g.drawString("Tex. Southern (15-19)16", 968, 200);
        g.drawString("Arizona St. (20-11) 11", 1203, 177);
        g.drawString("Syracuse (20-13) 11", 1210, 200);
        g.setColor(new Color(128, 128, 128));
        g.drawString("61", 445, 177);
        g.drawString("71", 445, 204);
        g.drawString("65", 665, 177);
        g.drawString("58", 665, 204);
        g.drawString("46", 925, 177);
        g.drawString("64", 925, 204);
        g.drawString("56", 1143, 177);
        g.drawString("60", 1143, 204);
        
        
        

        g.setFont(new Font("Avenir", Font.PLAIN, 11));
        g.drawString("First Round", 45, 105);
        g.drawString("March 15-16", 45, 118);
        g.drawString("Second Round", 245, 105);
        g.drawString("March 17-18", 245, 118);
        g.drawString("Regional", 360, 105);
        g.drawString("Semifinals", 360, 118);
        g.drawString("March 22-23", 360, 131);
        g.drawString("Regional", 455, 105);
        g.drawString("Finals", 455, 118);
        g.drawString("March 24-25", 455, 131);
        g.drawString("National", 550, 105);
        g.drawString("Semifinals", 550, 118);
        g.drawString("March 31", 550, 131);
        g.drawString("First Round", 1500, 105);
        g.drawString("March 15-16", 1495, 118);
        g.drawString("Second Round", 1285, 105);
        g.drawString("March 17-18", 1295, 118);
        g.drawString("Regional", 1190, 105);
        g.drawString("Semifinals", 1185, 118);
        g.drawString("March 22-23", 1175, 131);
        g.drawString("Regional", 1090, 105);
        g.drawString("Finals", 1105, 118);
        g.drawString("March 24-25", 1075, 131);
        g.drawString("National", 990, 105);
        g.drawString("Semifinals", 985, 118);
        g.drawString("March 31", 990, 131);
                
        g.setColor(new Color(128, 128, 128));
        g.setFont(new Font("Avenir", Font.PLAIN, 11));
        g.drawString("March 31 and April 2", 753, 252+25+50+110+30);
        g.drawString("April 2", 786, 585);
        g.setFont(new Font("Avenir", Font.PLAIN, 10));
        g.drawString("March 24", 500, 455);
        g.drawString("March 24", 500, 860);
        g.drawString("March 25", 1060, 455);
        g.drawString("March 25", 1060, 860);
        
        g.setColor(new Color(105, 105, 105));
        g.setFont(new Font("Avenir", Font.BOLD, 11));
        g.drawString("DAYTON", 780, 187);
        g.drawString("March 13-14", 770, 200);
        g.drawString("SAN ANTONIO", 765, 252+25+50+110+15);
        g.drawString("ATLANTA", 495, 440);
        g.drawString("LOS ANGELES", 475, 845);
        g.drawString("BOSTON", 1060, 440);
        g.drawString("OMAHA", 1060, 845);
        
        
        g.setColor(Color.black);
        g.drawLine(570, 617, 680, 617);
        g.drawLine(570, 638, 680, 638);
        g.drawLine(570, 617, 570, 638);
        g.drawLine(680, 617, 680, 638);
        g.drawLine(920, 617, 1030, 617);
        g.drawLine(920, 638, 1030, 638);
        g.drawLine(920, 617, 920, 638);
        g.drawLine(1030, 617, 1030, 638);
        
        g.drawLine(740, 612, 860, 612);
        g.drawLine(740, 643, 860, 643);
        g.drawLine(740, 612, 740, 643);
        g.drawLine(860, 612, 860, 643);
        
     
        g.setFont(new Font("Avenir", Font.PLAIN, 10));
        g.drawString("9 Kansas St.", 470, 323);
        g.drawString("11 Loyola Chi.", 470, 525);
        g.drawString("9 Florida St.", 470, 723);
        g.drawString("3 Michigan", 470, 925);
        g.drawString("Villanova", 1100, 323);
        g.drawString("Texas Tech", 1085, 525);
        g.drawString("Kansas 1", 1100, 723);
        g.drawString("Duke", 1110, 925);
        g.drawString("11 Loyola Chi.", 560, 423);
        g.drawString("3 Michigan", 560, 823);
        g.drawString("Villanova", 1000, 423);
        g.drawString("Kansas 1", 1000, 823);

        g.setColor(Color.black);
        String[] listNum = {"1", "16", "8", "9", "5", "12", "4", "13", "6", "11", "3", "14", "7", "10", "2", "15", "1", "16", "8", "9", "5", "12", "4", "13", "6", "11", "3", "14", "7", "10", "2", "15"};
       
        
        int posx1 = 40;
        int posx2 = 240;
        int posy1 = 240;
        int posy2 = 265;
        int num = posy1 - 2;
        int num2 = posy2 - 2;
        int midpos = posy1 + (posy2 - posy1)/2;
        int newmidpos = midpos + 25;
        int anothermidpos = newmidpos + 50;
        int yetanothermidpos = anothermidpos + 100;
        int posx3 = posx2 + 120;
        int posx4 = posx3 + 95;
        int posx5 = posx4 + 95;
        int posx6 = posx5 + 95;
        
        String[] teamsLeft1 = {"Virginia (31-2)", "UMBC (24-10)", "Creighton (21-11)", "Kansas St. (22-11)", "Kentucky (24-10)", "Davidson (21-11)", "Arizona (27-2)", "Buffalo (26-8)", "Miami (Fla.)(22-9)", "Loyola Chicago (28-5)", "Tennessee (25-9)", "Wright St. (25-9)", "Nevada (27-7)", "Texas (19-14)", "Cincinnati (30-4)", "Georgia St. (24-10)", "Xavier (28-5)", "Texas Southern", "Missouri (20-12)", "Florida St. (20-11)", "Ohio St. (24-8)", "S. Dakota St. (28-6)", "Gonzaga (30-4)", "UNCG (27-7)", "Houston (26-7)", "San Diego St. (22-10)", "Michigan (28-7)", "Montana (26-7)", "Texas A&M(20-12)", "Providence (21-13)", "North Carolina(25-10)", "Lispcomb (23-9)"};
        String[] teamsLeft2 = {"16 UMBC", "9 Kansas St.", "5 Kentucky", "13 Buffalo", "11 Loyola Chi.", "3 Tennessee", "7 Nevada", "2 Cincinnati", "1 Xavier", "9 Florida St.", "5 Ohio St.", "4 Gonzaga", "6 Houston", "3 Michigan", "7 Texas A&M", "2 North Carolina"};
        String[] teamsLeft3 = {"Charlotte", "Boise", "Dallas", "Nashville", "Nashville", "Boise", "Wichita", "Charlotte"};
        int[] xValuesTeamsLeft1 = {315, 330, 325, 316, 316, 330, 322, 315};
        String[] teamsLeft4 = {"9 Kansas St.", "5 Kentucky", "11 Loyola Chi.", "7 Nevada", "9 Florida St.", "4 Gonzaga", "3 Michigan", "7 Texas A&M"};
        
        String[] teamsLeftNums1 = {"54", "74", "59", "69", "78", "73", "68", "89", "62", "64", "73", "47", "87", "83", "68", "53", "102", "83", "54", "67", "81", "73", "68", "64", "67", "65", "61", "47", "73", "69", "84", "66"};
        String[] teamsLeftNums2 = {"43", "50", "95", "75", "63", "62", "75", "73", "70", "75", "84", "90", "63", "64", "86", "65"};
        
        
        int a = 0;
        while (a < 32){
            g.setFont(new Font("Avenir", Font.PLAIN, 11));
            g.drawString(listNum[a], posx1, num);
            g.drawString(listNum[a + 1], posx1, num2);
            g.setFont(new Font("Avenir", Font.PLAIN, 12));
            g.drawString(teamsLeft1[a], posx1+20, num);
            g.drawString(teamsLeft1[a + 1], posx1+20, num2);
            g.setColor(new Color(169, 169, 169));
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsLeftNums1[a], posx2-15, num);
            g.drawString(teamsLeftNums1[a + 1], posx2-15, num2);
            g.setColor(Color.black);
            g.drawLine(posx1, posy1, posx2, posy1);
            g.drawLine(posx2, posy1, posx2, posy2);
            g.drawLine(posx1, posy2, posx2, posy2);
            posy1+=50;
            posy2+=50;
            num = posy1 - 2;
            num2 = posy2 - 2;
            a += 2;
        }
        int b = 0;
        while (b < 16){
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsLeft2[b], posx2+10, midpos-2);
            g.drawString(teamsLeft2[b + 1], posx2+10, midpos+48);
            g.setColor(new Color(169, 169, 169));
            g.drawString(teamsLeftNums2[b], posx3-15, midpos-2);
            g.drawString(teamsLeftNums2[b + 1], posx3-15, midpos+48);
            g.drawLine(posx2, midpos, posx3, midpos);
            g.setColor(Color.black);
            g.drawLine(posx3, midpos, posx3, midpos + 50);
            g.drawLine(posx2, midpos + 50, posx3, midpos + 50);
            midpos += 100;
            b += 2;
        }
        int c = 0;
        while (c < 8){
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsLeft3[c], xValuesTeamsLeft1[c], newmidpos-5);
            g.drawString(teamsLeft4[c], posx3+10, newmidpos-2);
            g.drawString(teamsLeft3[c + 1], xValuesTeamsLeft1[c + 1], newmidpos+100-5);
            g.drawString(teamsLeft4[c + 1], posx3+10, newmidpos+100-2);
            g.setColor(new Color(169, 169, 169));
            g.drawString("Mar 22", posx4-35, newmidpos+15);
            g.setColor(Color.black);
            g.drawLine(posx3, newmidpos, posx4, newmidpos);
            g.drawLine(posx4, newmidpos, posx4, newmidpos + 100);
            g.drawLine(posx3, newmidpos + 100, posx4, newmidpos + 100);
            newmidpos += 200;
            c += 2;
        }
        int d = 0;
        while (d < 2){
            g.drawLine(posx4, anothermidpos, posx5, anothermidpos);
            g.drawLine(posx5, anothermidpos, posx5, anothermidpos + 200);
            g.drawLine(posx4, anothermidpos + 200, posx5, anothermidpos + 200);
            anothermidpos += 400;
            d += 1;
        }
        g.drawLine(posx5, yetanothermidpos, posx6, yetanothermidpos);
        g.drawLine(posx6, yetanothermidpos, posx6, yetanothermidpos + 400);
        g.drawLine(posx5, yetanothermidpos + 400, posx6, yetanothermidpos + 400);
        g.setColor(new Color(169, 169, 169));
        g.drawString("March 31", posx6-50, yetanothermidpos+15);
        g.setColor(Color.black);
        
        
        
        
        
        posx1 = 1560;
        posx2 = 1360;
        posy1 = 240;
        posy2 = 265;
        num = posy1 - 2;
        num2 = posy2 - 2;
        midpos = posy1 + (posy2 - posy1)/2;
        newmidpos = midpos + 25;
        anothermidpos = newmidpos + 50;
        yetanothermidpos = anothermidpos + 100;
        posx3 = posx2 - 120;
        posx4 = posx3 - 95;
        posx5 = posx4 - 95;
        posx6 = posx5 - 95;
        
        String[] teamsRight1 = {"Villanova (30-4)", "Radford", "Virginia Tech (21-11)", "Alabama (19-15)", "West Virginia (24-10)", "Murray St. (26-5)", "Wichita St. (25-7)", "Marshall (24-10)", "Florida (20-12)", "St. Bonaventure", "Texas Tech (24-9)", "S.F. Austin (28-6)", "Arkansas (23-11)", "Butler (20-13)", "Purdue (28-6)", "CSU Fullerton (20-11)", "Kansas (27-7)", "Penn (24-8)", "Seton Hall (21-11)", "NC St. (21-11)", "Clemson (23-9)", "New Mexico St. (28-5)", "Auburn (25-7)", "Charleston (26-7)", "TCU (21-11)", "Syracuse", "Michigan St. (29-4)", "Bucknell (25-9)", "Rhode Island (25-7)", "Oklahoma (18-13)", "Duke (26-7)", "Iona (20-13)"};
        int[] xValuesTeamsRight1 = {1460, 1496, 1433, 1453, 1430, 1452, 1450, 1454, 1462, 1455, 1449, 1451, 1454, 1466, 1466, 1426, 1468, 1478, 1446, 1465, 1460, 1425, 1468, 1450, 1478, 1493, 1441, 1462, 1439, 1436, 1478, 1478};
        String[] teamsRight2 = {"Villanova 1", "Alabama 9", "West Virginia 5", "Marshall 13", "Florida 6", "Texas Tech 3", "Butler 10", "Purdue 2", "Kansas 1", "Seton Hall 8", "Clemson 5", "Auburn 4", "Syracuse 11", "Michigan St. 3", "Oklahoma 10", "Duke 2"};
        int[] xValuesTeamsRight2 = {1304, 1305, 1284, 1300, 1312, 1290, 1310, 1310, 1312, 1297, 1305, 1310, 1298, 1287, 1286, 1318};
        String[] teamsRight3 = {"Pittsburgh", "San Diego", "Dallas", "Detroit", "Wichita", "San Diego", "Detroit", "Pittsburgh"};
        String[] teamsRight4 = {"Villanova 1", "West Virginia 5", "Texas Tech 3", "Purdue 2", "Kansas 1", "Clemson 5", "Syracuse 11", "Duke 2"};
        int[] xValuesTeamsRight3 = {1180, 1162, 1165, 1185, 1190, 1182, 1177, 1200};
        
        String[] teamsRightNums1 = {"87", "61", "83", "86", "85", "68", "75", "81", "77", "62", "70", "60", "62", "79", "74", "48", "76", "60", "94", "83", "79", "68", "62", "58", "52", "57", "82", "78", "83", "78", "89", "67"}; 
        String[] teamsRightNums2 = {"81", "58", "94", "71", "66", "69", "73", "76", "83", "79", "84", "53", "55", "53", "62", "87"};
        
        int e = 0;
        while (e < 32){
            g.setColor(Color.black);
            g.setFont(new Font("Avenir", Font.PLAIN, 11));
            g.drawString(listNum[e], posx1 - 12, num);
            g.drawString(listNum[e + 1], posx1 - 12, num2-2);
            g.setFont(new Font("Avenir", Font.PLAIN, 12));
            g.drawString(teamsRight1[e], xValuesTeamsRight1[e], num);
            g.drawString(teamsRight1[e + 1], xValuesTeamsRight1[e + 1], num2);
            g.setColor(new Color(169, 169, 169));
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsRightNums1[e], posx2+2, num);
            g.drawString(teamsRightNums1[e + 1], posx2+2, num2);
            g.setColor(Color.black);
            g.drawLine(posx2, posy1, posx1, posy1);
            g.drawLine(posx2, posy1, posx2, posy2);
            g.drawLine(posx2, posy2, posx1, posy2);
            posy1 += 50;
            posy2 += 50;
            num = posy1 - 2;
            num2 = posy2 - 2;
            e += 2;
        }
        int f = 0;
        while (f < 16){
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsRight2[f], xValuesTeamsRight2[f], midpos-2);
            g.drawString(teamsRight2[f + 1], xValuesTeamsRight2[f + 1], midpos+48);
            g.setColor(new Color(169, 169, 169));
            g.drawString(teamsRightNums2[f], posx3+2, midpos-2);
            g.drawString(teamsRightNums2[f + 1], posx3+2, midpos+48);
            g.setColor(Color.black);
            g.drawLine(posx3, midpos, posx2, midpos);
            g.drawLine(posx3, midpos, posx3, midpos + 50);
            g.drawLine(posx3, midpos + 50, posx2, midpos + 50);
            midpos += 100;
            f += 2;
        }
        int h = 0;
        while (h < 8){
            g.setFont(new Font("Avenir", Font.PLAIN, 10));
            g.drawString(teamsRight3[h], posx3+2, newmidpos-5);
            g.drawString(teamsRight4[h], xValuesTeamsRight3[h], newmidpos-2);
            g.drawString(teamsRight3[h + 1], posx3+2, newmidpos+100-5);
            g.drawString(teamsRight4[h + 1], xValuesTeamsRight3[h + 1], newmidpos+100-2);
            g.setColor(new Color(169, 169, 169));
            g.drawString("Mar 23", posx4+2, newmidpos+15);
            g.setColor(Color.black);
            g.drawLine(posx4, newmidpos, posx3, newmidpos);
            g.drawLine(posx4, newmidpos, posx4, newmidpos + 100);
            g.drawLine(posx4, newmidpos + 100, posx3, newmidpos + 100);
            newmidpos += 200;
            h += 2;
        }
        int i = 0;
        while (i < 2){
            g.drawLine(posx5, anothermidpos, posx4, anothermidpos);
            g.drawLine(posx5, anothermidpos, posx5, anothermidpos + 200);
            g.drawLine(posx5, anothermidpos + 200, posx4, anothermidpos + 200);
            anothermidpos += 400;
            i += 1;
        }
        g.drawLine(posx6, yetanothermidpos, posx5, yetanothermidpos);
        g.drawLine(posx6, yetanothermidpos, posx6, yetanothermidpos + 400);
        g.drawLine(posx6, yetanothermidpos + 400, posx5, yetanothermidpos + 400);
        g.setColor(new Color(169, 169, 169));
        g.drawString("March 31", posx6+5, yetanothermidpos+15);
        g.setColor(Color.black);
        
        

        g.setColor(Color.white);
        g.fillRect(571, 618, 109, 20);
        g.fillRect(921, 618, 109, 20);
        g.fillRect(741, 613, 119, 30);
        
        g.setColor(Color.black);
        g.setFont(new Font("Avenir", Font.PLAIN, 10));
        g.drawString("Michigan", 600, 632);
        g.drawString("Villanova", 955, 632);
        g.setFont(new Font("Avenir", Font.PLAIN, 12));
        g.drawString("Villanova", 775, 631);
        
        
        g.drawImage(img, 725, 260, 150, 150, null);
        
        
    } 
}