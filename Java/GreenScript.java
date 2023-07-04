
// Java program to copy content from
// one file to another
  
import java.io.*;
import java.util.*;
  
public class GreenScript {
    
    public static void copyContent(File a, File b, String profiletagname)
        throws Exception
    {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b, true);
        
        try {
  
            int n;
  
            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                out.write(n);
                if("<".equals((char)n+""))
                {
                    n = in.read();
                    out.write(n);
                    if("P".equals((char)n+""))
                    {
                        n = in.read();
                        out.write(n);
                        if("r".equals((char)n+""))
                        {
                            n = in.read();
                            out.write(n);
                            if("o".equals((char)n+""))
                            {
                                n = in.read();
                                out.write(n);
                                if("f".equals((char)n+""))
                                {
                                    n = in.read();
                                    out.write(n);
                                    if("i".equals((char)n+""))
                                    {
                                        n = in.read();
                                        out.write(n);
                                        if("l".equals((char)n+""))
                                        {
                                            n = in.read();
                                            out.write(n);
                                            if("e".equals((char)n+""))
                                            {
                                                n = in.read();
                                                out.write(n);
                                                if(" ".equals((char)n+""))
                                                {
                                                    n = in.read();
                                                    out.write(n);
                                                    if("x".equals((char)n+""))
                                                    {
                                                        n = in.read();
                                                        out.write(n);
                                                        if("m".equals((char)n+""))
                                                        {
                                                            n = in.read();
                                                            out.write(n);
                                                            if("l".equals((char)n+""))
                                                            {
                                                                while ((n = in.read()) != -1)
                                                                {
                                                                    out.write(n);
                                                                    if((char)n == '\n')
                                                                    {
                                                                        break;
                                                                    }
                                                                }
                                                                for(byte bb : profiletagname.getBytes())
                                                                {
                                                                    out.write(bb);
                                                                }
                                                            }

                                                        }

                                                    }

                                                }

                                            }
                                        }

                                    }

                                }

                            }

                        }

                    }

                }
            
                // write() function to write
                // the byte of data
                //out.write(n);
            }
        }
        finally {
            Character ch = '\n';
            out.write(ch);
            out.write(ch);
            //out.write((Byte)('n'));
            if (in != null) {
  
                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
  
    public static void main(String[] args) throws Exception
    {
        String destinationFileName = "Green All Profile Merged";  
  
        String[] listOfFiles = new String[] {"B2B Backoffice Admin.profile", "B2B Clerk.profile", "B2B Content Managers.profile", "B2B Primary Contact.profile", "B2B Store Owner.profile", "B2B Storefront Registered Users.profile", "B2B Switzerland Community Profile.profile", "B2B_Belgium_Community Profile.profile", "B2B_Chile_Community Profile.profile", "B2B_Czech_Community Profile.profile", "B2B_Denmark_Community Profile.profile", "B2B_GL_IV_ReadOnly_Case.profile", "B2B_Great_Britain_Community Profile.profile", "B2B_Hungary_Community Profile.profile", "B2B_Netherlands_Community Profile.profile", "B2B_Poland_Community Profile.profile", "B2B_Portugal_Community Profile.profile", "B2B_Spain_Community Profile.profile", "B2B_Sweden_Community Profile.profile", "B2B_Taiwan_Community Profile.profile", "B2B_Ukrainian_Community Profile.profile", "B2BItalyCommunity Profile.profile", "Batch Job API User.profile", "BATGlobalB2B Profile.profile", "BATGlobalR2 Profile.profile", "Chatter External User.profile", "Chatter Free User.profile", "Chatter Moderator User.profile", "ContractManager.profile", "CPQ_Integration_User.profile", "Customer Community Plus User.profile", "Dataloader_API_User.profile", "End_User.profile", "Executive_Sponsor.profile", "GL_IV_AbvMrk_CustomerMgmt.profile", "GL_IV_AbvMrk_GlobalOps.profile", "GL_IV_B2B_Replenishment_Agent.profile", "GL_IV_BusinessAdmin.profile", "GL_IV_Delivery Rep.profile", "GL_IV_FieldForceManager.profile", "GL_IV_FieldForceManager_Russia.profile", "GL_IV_Finance_Checker.profile", "GL_IV_MKT_Finance_Manager.profile", "GL_IV_Planner.profile", "GL_IV_Pre_Sales_Rep.profile", "GL_IV_Pricing_Manager.profile", "GL_IV_Prompt_Sales_Rep.profile", "GL_IV_ReadOnly.profile", "GL_IV_SALES_Analyst.profile", "GL_IV_SuperBusinessAdmin.profile", "GL_IV_TELE_SALES_Analyst.profile", "GL_IV_TradeMarketingRep.profile", "GL_IV_Universal_Rep.profile", "GL_IV_Web_Replenishment_Agent.profile", "GL_IV_WH_Checker.profile", "GL_IV_WH_Manager.profile", "GLT No Access.profile", "Guest License User.profile", "Identity User.profile", "Marketing Cloud - API User.profile", "MarketingProfile.profile", "Minimum Access - Salesforce.profile", "P%3ASP_IV_Application_Support.profile", "P%3ASP_IV_Data_Support.profile", "Read Only API User.profile", "Read Only.profile", "Sales Insights Integration User.profile", "SolutionManager.profile", "Standard.profile", "StandardAul.profile", "Support_Read_Only.profile", "System Administrator - Project Dev Teams.profile", "Admin.profile", "API User.profile"};
  
        for(int iteration = 0; iteration < listOfFiles.length; iteration++)
        {
            String a = listOfFiles[iteration];
            File sourceFile = new File(a);
            File destinationFile = new File(destinationFileName);
            String profiletagname = "    <ProfileName>"+a+"</ProfileName>"+"\n";
            copyContent(sourceFile, destinationFile, profiletagname);
        }
    }
}