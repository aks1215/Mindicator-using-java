import java.util.*;
import java.time.*;
import java.sql.*; 
public class Central {
    public Central()throws Exception{
        Scanner sc=new Scanner(System.in);
        int ds1,ds2;
        String sname;
        LocalTime l = LocalTime.now();
        Time ts = Time.valueOf(l);          
        System.out.println("Enter Source Station:");
        sname=sc.next();
		if((sname.matches("(?i)"+"kal(.*)")))  //if src station is kalyan done
        {
            System.out.println("To:\n1.CSMT");
            ds1=sc.nextInt();
        
            switch(ds1) 
            {
            case 1:    
            System.out.println("kalyan");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
            String q="select * from tdemokc  where sst like '%"+sname+"%' ORDER BY tk";
            PreparedStatement psmt=conn.prepareStatement(q);
            ResultSet rs=psmt.executeQuery();
			while(rs.next()) 
           {
            Time tk=rs.getTime("tk");  Time tk1=rs.getTime("tk1"); Time tk2=rs.getTime("tk2"); Time tk3=rs.getTime("tk3");
            Time tk4=rs.getTime("tk4"); Time tk5=rs.getTime("tk5"); Time tk6=rs.getTime("tk6"); Time tk7=rs.getTime("tk7");
            Time tk8=rs.getTime("tk8"); Time tk9=rs.getTime("tk9"); Time tk10=rs.getTime("tk10"); Time tk11=rs.getTime("tk11");
            Time tk12=rs.getTime("tk12"); Time tk13=rs.getTime("tk13"); Time tk14=rs.getTime("tk14"); Time tk15=rs.getTime("tk15");
            Time tk16=rs.getTime("tk16"); Time tk17=rs.getTime("tk17"); Time tk18=rs.getTime("tk18"); Time tk19=rs.getTime("tk19");
            Time tk20=rs.getTime("tk20"); Time tk21=rs.getTime("tk21"); Time tk22=rs.getTime("tk22"); Time tk23=rs.getTime("tk23");
            Time tk24=rs.getTime("tk24");  Time tk25=rs.getTime("tk25");
            LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);    
            String y=rs.getString("sst"),y1=rs.getString("im1"),y2=rs.getString("im2"),y3=rs.getString("im3"),y4=rs.getString("im4"), y5=rs.getString("im5"), y6=rs.getString("im6"),y7=rs.getString("im7"),y8=rs.getString("im8"), y9=rs.getString("im9"),y10=rs.getString("im10"),y11=rs.getString("im11"),y12=rs.getString("im12"),y13=rs.getString("im13"),y14=rs.getString("im14"),y15=rs.getString("im15"),y16=rs.getString("im16"),y17=rs.getString("im17"),y18=rs.getString("im18"),y19=rs.getString("im19"),y20=rs.getString("im20"),y21=rs.getString("im21"),y22=rs.getString("im22"),y23=rs.getString("im23"),y24=rs.getString("im24"),y25=rs.getString("dst");
            if((y.matches("(?i)"+sname+"(.*)") && tk.after(t1)) || (tk1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (tk2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (tk3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(tk4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (tk5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (tk6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (tk7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && tk8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && tk9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && tk10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && tk11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && tk12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && tk13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && tk14.after(t1))||(y15.matches("(?i)"+sname+"(.*)") && tk15.after(t1))||(y16.matches("(?i)"+sname+"(.*)") && tk16.after(t1))||(y17.matches("(?i)"+sname+"(.*)") && tk17.after(t1))||(y18.matches("(?i)"+sname+"(.*)") && tk18.after(t1))||(y19.matches("(?i)"+sname+"(.*)") && tk19.after(t1))||(y20.matches("(?i)"+sname+"(.*)") && tk20.after(t1))||(y21.matches("(?i)"+sname+"(.*)") && tk21.after(t1))||(y22.matches("(?i)"+sname+"(.*)") && tk22.after(t1))||(y23.matches("(?i)"+sname+"(.*)") && tk23.after(t1))||(y24.matches("(?i)"+sname+"(.*)") && tk24.after(t1))||(y25.matches("(?i)"+sname+"(.*)") && tk25.after(t1))) 
            {
            System.out.println(rs.getString("sst")+"-"+rs.getString("dst")+" AT "+rs.getTime("tk"));
            System.out.println(rs.getString("sst")+rs.getTime("tk")+"-->"+rs.getString("im1")+rs.getTime("tk1")+"-->"+rs.getString("im2")+rs.getTime("tk2")+"-->"+rs.getString("im3")+rs.getTime("tk3")+"-->"+rs.getString("im4")+rs.getTime("tk4")+"-->"+rs.getString("im5")+rs.getTime("tk5")+"-->"+rs.getString("im6")+rs.getTime("tk6")+"-->"+rs.getString("im7")+rs.getTime("tk7")+"-->"+rs.getString("im8")+rs.getTime("tk8")+"-->"+rs.getString("im9")+rs.getTime("tk9")+"-->"+rs.getString("im10")+rs.getTime("tk10")+"-->"+rs.getString("im11")+rs.getTime("tk11")+"-->"+rs.getString("im12")+rs.getTime("tk12")+"-->"+rs.getString("im13")+rs.getTime("tk13")+"-->"+rs.getString("im14")+rs.getTime("tk14")+"-->"+rs.getString("im15")+rs.getTime("tk15")+"-->"+rs.getString("im16")+rs.getTime("tk16")+"-->"+rs.getString("im17")+rs.getTime("tk17")+"-->"+rs.getString("im18")+rs.getTime("tk18")+"-->"+rs.getString("im19")+rs.getTime("tk19")+"-->"+rs.getString("im20")+rs.getTime("tk20")+"-->"+rs.getString("im21")+rs.getTime("tk21")+"-->"+rs.getString("im22")+rs.getTime("tk22")+"-->"+rs.getString("im23")+rs.getTime("tk23")+"-->"+rs.getString("im24")+rs.getTime("tk24")+"-->"+rs.getString("dst")+rs.getTime("tk25"));
            
           }
		   }
           break;
            }}
        
/*other than kalya*/  else if((sname.matches("(?i)"+"tha(.*)"))||(sname.matches("(?i)"+"do(.*)"))||(sname.matches("(?i)"+"kop(.*)"))||(sname.matches("(?i)"+"di(.*)"))||(sname.matches("(?i)"+"mum(.*)"))||(sname.matches("(?i)"+"kalv(.*)"))||(sname.matches("(?i)"+"th(.*)"))||(sname.matches("(?i)"+"mul(.*)"))||(sname.matches("(?i)"+"na(.*)"))||(sname.matches("(?i)"+"bha(.*)"))||(sname.matches("(?i)"+"kanj(.*)"))||(sname.matches("(?i)"+"vik(.*)"))||(sname.matches("(?i)"+"gh(.*)"))||(sname.matches("(?i)"+"vid(.*)"))||(sname.matches("(?i)"+"ku(.*)"))||(sname.matches("(?i)"+"si(.*)"))||(sname.matches("(?i)"+"matu(.*)"))||(sname.matches("(?i)"+"da(.*)"))||(sname.matches("(?i)"+"pa(.*)"))||(sname.matches("(?i)"+"cu(.*)"))||(sname.matches("(?i)"+"matu(.*)"))||(sname.matches("(?i)"+"chi(.*)"))||(sname.matches("(?i)"+"by(.*)"))||(sname.matches("(?i)"+"sand(.*)"))||(sname.matches("(?i)"+"mas(.*)")))  //if src not kal
{
    
    
    System.out.println("To:\n1.CSMT\n2.Kalyan");
    ds2=sc.nextInt();
    
    switch(ds2) {
    case 1:    /*to csmt*/
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
        String q="select * from tdemokc  where sst like '%"+sname+"%' OR im1 like '%"+sname+"%'  OR im2 like '%"+sname+"%'  OR im3 like '%"+sname+"%'  OR im4 like '%"+sname+"%'  OR im5 like '%"+sname+"%'  OR im6 like '%"+sname+"%'  OR im7 like '%"+sname+"%'  OR im8 like '%"+sname+"%'  OR im9 like '%"+sname+"%'  OR im10 like '%"+sname+"%'  OR im11 like '%"+sname+"%'  OR im12 like '%"+sname+"%'  OR im13 like '%"+sname+"%'  OR im14 like '%"+sname+"%'  OR im15 like '%"+sname+"%'  OR im16 like '%"+sname+"%'  OR im17 like '%"+sname+"%'  OR im18 like '%"+sname+"%'  OR im19 like '%"+sname+"%'  OR im20 like '%"+sname+"%'  OR im20 like '%"+sname+"%'  OR im21 like '%"+sname+"%'  OR im22 like '%"+sname+"%'  OR im23 like '%"+sname+"%'  OR im24 like '%"+sname+"%' ORDER BY tk";
        PreparedStatement psmt=conn.prepareStatement(q);
        ResultSet rs=psmt.executeQuery();
        while(rs.next()) 
       {
            
        Time tk=rs.getTime("tk");  Time tk1=rs.getTime("tk1"); Time tk2=rs.getTime("tk2"); Time tk3=rs.getTime("tk3");
        Time tk4=rs.getTime("tk4"); Time tk5=rs.getTime("tk5"); Time tk6=rs.getTime("tk6"); Time tk7=rs.getTime("tk7");
        Time tk8=rs.getTime("tk8"); Time tk9=rs.getTime("tk9"); Time tk10=rs.getTime("tk10"); Time tk11=rs.getTime("tk11");
        Time tk12=rs.getTime("tk12"); Time tk13=rs.getTime("tk13"); Time tk14=rs.getTime("tk14"); Time tk15=rs.getTime("tk15");
        Time tk16=rs.getTime("tk16"); Time tk17=rs.getTime("tk17"); Time tk18=rs.getTime("tk18"); Time tk19=rs.getTime("tk19");
        Time tk20=rs.getTime("tk20"); Time tk21=rs.getTime("tk21"); Time tk22=rs.getTime("tk22"); Time tk23=rs.getTime("tk23");
        Time tk24=rs.getTime("tk24");  Time tk25=rs.getTime("tk25");
        LocalTime loc = LocalTime.now();
        Time t1 = Time.valueOf(loc);    
        if( tk.after(t1) || (tk1.after(t1)) || (tk2.after(t1)) || (tk3.after(t1)) ||(tk4.after(t1)) || (tk5.after(t1)) || (tk6.after(t1)) || tk7.after(t1)||tk8.after(t1)||tk9.after(t1)||tk10.after(t1)||tk11.after(t1)||tk12.after(t1)||tk13.after(t1)||tk14.after(t1)||tk15.after(t1)||tk16.after(t1)||tk17.after(t1)||tk18.after(t1)||tk19.after(t1)||tk20.after(t1)||tk21.after(t1)||tk22.after(t1)||tk23.after(t1)|| tk24.after(t1)||tk25.after(t1)) 
        {
        System.out.println(rs.getString("sst")+"-"+rs.getString("dst")+" AT "+rs.getTime("tk"));
        System.out.println(rs.getString("sst")+rs.getTime("tk")+"-->"+rs.getString("im1")+rs.getTime("tk1")+"-->"+rs.getString("im2")+rs.getTime("tk2")+"-->"+rs.getString("im3")+rs.getTime("tk3")+"-->"+rs.getString("im4")+rs.getTime("tk4")+"-->"+rs.getString("im5")+rs.getTime("tk5")+"-->"+rs.getString("im6")+rs.getTime("tk6")+"-->"+rs.getString("im7")+rs.getTime("tk7")+"-->"+rs.getString("im8")+rs.getTime("tk8")+"-->"+rs.getString("im9")+rs.getTime("tk9")+"-->"+rs.getString("im10")+rs.getTime("tk10")+"-->"+rs.getString("im11")+rs.getTime("tk11")+"-->"+rs.getString("im12")+rs.getTime("tk12")+"-->"+rs.getString("im13")+rs.getTime("tk13")+"-->"+rs.getString("im14")+rs.getTime("tk14")+"-->"+rs.getString("im15")+rs.getTime("tk15")+"-->"+rs.getString("im16")+rs.getTime("tk16")+"-->"+rs.getString("im17")+rs.getTime("tk17")+"-->"+rs.getString("im18")+rs.getTime("tk18")+"-->"+rs.getString("im19")+rs.getTime("tk19")+"-->"+rs.getString("im20")+rs.getTime("tk20")+"-->"+rs.getString("im21")+rs.getTime("tk21")+"-->"+rs.getString("im22")+rs.getTime("tk22")+"-->"+rs.getString("im23")+rs.getTime("tk23")+"-->"+rs.getString("im24")+rs.getTime("tk24")+"-->"+rs.getString("dst")+rs.getTime("tk25"));
        
       }
       }
        break;
        case 2:
        
            //to kalyan
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
            String q1="select * from tdemock  where sst like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%' OR im22 like '%"+sname+"%' OR im23 like '%"+sname+"%' OR im24 like '%"+sname+"%' ORDER BY tc";
            PreparedStatement psmt2=conn2.prepareStatement(q1);
            ResultSet rs3=psmt2.executeQuery();
            while(rs3.next()) 
            {
                Time tc=rs3.getTime("tc");Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
                Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
                Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
                Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
                Time tc14=rs3.getTime("tc14"); Time tc15=rs3.getTime("tc15"); Time tc16=rs3.getTime("tc16"); Time tc17=rs3.getTime("tc17");
                Time tc18=rs3.getTime("tc18"); Time tc19=rs3.getTime("tc19"); Time tc20=rs3.getTime("tc20"); Time tc21=rs3.getTime("tc21");
                Time tc22=rs3.getTime("tc22"); Time tc23=rs3.getTime("tc23"); Time tc24=rs3.getTime("tc24"); Time tc25=rs3.getTime("tc25");
                 
                LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("im14"),b15=rs3.getString("im15"),b16=rs3.getString("im16"),b17=rs3.getString("im17"),b18=rs3.getString("im18"),b19=rs3.getString("im19"),b20=rs3.getString("im20"),b21=rs3.getString("im21"),b22=rs3.getString("im22"),b23=rs3.getString("im23"),b24=rs3.getString("im24"),b25=rs3.getString("dst");
                if((b.matches("(?i)"+sname+"(.*)") && tc.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(tc14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))||(tc15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(tc16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(tc17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(tc18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(tc19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(tc20.after(t1)&& b20.matches("(?i)"+sname+"(.*)"))||(tc21.after(t1)&& b21.matches("(?i)"+sname+"(.*)"))||(tc22.after(t1)&& b22.matches("(?i)"+sname+"(.*)"))||(tc23.after(t1)&& b23.matches("(?i)"+sname+"(.*)"))||(tc24.after(t1)&& b24.matches("(?i)"+sname+"(.*)")))
                {
                   
                    System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tc"));
                    System.out.println(rs3.getString("sst")+rs3.getTime("tc")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("im6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("im14")+""+rs3.getTime("tc14")+"-->"+rs3.getString("im15")+""+rs3.getTime("tc15")+"-->"+rs3.getString("im16")+""+rs3.getTime("tc16")+"-->"+rs3.getString("im17")+""+rs3.getTime("tc17")+"-->"+rs3.getString("im18")+""+rs3.getTime("tc18")+"-->"+rs3.getString("im19")+""+rs3.getTime("tc19")+"-->"+rs3.getString("im20")+""+rs3.getTime("tc20")+"-->"+rs3.getString("im21")+""+rs3.getTime("tc21")+"-->"+rs3.getString("im22")+""+rs3.getTime("tc22")+"-->"+rs3.getString("im23")+""+rs3.getTime("tc23")+"-->"+rs3.getString("im24")+""+rs3.getTime("tc24")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc25"));
                 }
            }
            break; 
        }
        }         
                
/*csmt to kaly done*/ else if((sname.matches("(?i)"+"cs(.*)"))) {    
                    
                    //csmt to kal
                    System.out.println("To:\n1.Kalyan/Khopoli/Kasara");
                    ds1=sc.nextInt();
                    switch(ds1) {
                        //case 2:
                          //  new Harbour();
                           // break;
                        case 1:    
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                    String q1="select * from tdemock where sst like '%"+sname+"%' ORDER BY tc";
                    PreparedStatement psmt=conn.prepareStatement(q1);
                    ResultSet rs3=psmt.executeQuery();
                    while(rs3.next()) 
                    {
                        Time tc=rs3.getTime("tc");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
                        Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
                        Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
                        Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
                        Time tc14=rs3.getTime("tc14"); Time tc15=rs3.getTime("tc15"); Time tc16=rs3.getTime("tc16"); Time tc17=rs3.getTime("tc17");
                        Time tc18=rs3.getTime("tc18"); Time tc19=rs3.getTime("tc19"); Time tc20=rs3.getTime("tc20"); Time tc21=rs3.getTime("tc21");
                        Time tc22=rs3.getTime("tc22"); Time tc23=rs3.getTime("tc23"); Time tc24=rs3.getTime("tc24"); Time tc25=rs3.getTime("tc25");
                         
                        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                        String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("im14"),b15=rs3.getString("im15"),b16=rs3.getString("im16"),b17=rs3.getString("im17"),b18=rs3.getString("im18"),b19=rs3.getString("im19"),b20=rs3.getString("im20"),b21=rs3.getString("im21"),b22=rs3.getString("im22"),b23=rs3.getString("im23"),b24=rs3.getString("im24"),b25=rs3.getString("dst");
                        if((b.matches("(?i)"+sname+"(.*)") && tc.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(tc14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))||(tc15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(tc16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(tc17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(tc18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(tc19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(tc20.after(t1)&& b20.matches("(?i)"+sname+"(.*)"))||(tc21.after(t1)&& b21.matches("(?i)"+sname+"(.*)"))||(tc22.after(t1)&& b22.matches("(?i)"+sname+"(.*)"))||(tc23.after(t1)&& b23.matches("(?i)"+sname+"(.*)"))||(tc24.after(t1)&& b24.matches("(?i)"+sname+"(.*)")))
                        {
                           
                            System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tc"));
                            System.out.println(rs3.getString("sst")+rs3.getTime("tc")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("im6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("im14")+""+rs3.getTime("tc14")+"-->"+rs3.getString("im15")+""+rs3.getTime("tc15")+"-->"+rs3.getString("im16")+""+rs3.getTime("tc16")+"-->"+rs3.getString("im17")+""+rs3.getTime("tc17")+"-->"+rs3.getString("im18")+""+rs3.getTime("tc18")+"-->"+rs3.getString("im19")+""+rs3.getTime("tc19")+"-->"+rs3.getString("im20")+""+rs3.getTime("tc20")+"-->"+rs3.getString("im21")+""+rs3.getTime("tc21")+"-->"+rs3.getString("im22")+""+rs3.getTime("tc22")+"-->"+rs3.getString("im23")+""+rs3.getTime("tc23")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc24")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc25"));
                         }
                    }
                    break;             
                   
                }
                    }             
                                    
                 }                
        }

