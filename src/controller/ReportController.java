package controller;

import util.FileHandler;

import java.sql.ResultSet;

public class ReportController {

    private FileHandler fh;

    private enum ReportType { MEMBER, PROVIDER, MANAGER }

    public ReportController() {
        fh = new FileHandler();
    }


    public void createReport(ReportType type, ResultSet rs) {
        switch(type) {
            case MEMBER:
                createMemberReport(rs);
                break;
            case PROVIDER:
                createProviderReport(rs);
                break;
            case MANAGER:
                createManagerReport(rs);
                break;
            default: break;
        }
    }

    private void createMemberReport(ResultSet rs) {
        //@TODO write to file
        if(!rs.next()){
          System.out.println("No report to generate.");
          return;
        }
        rs.next();
        String memberReport = rs.getString("mem.mem_name");
        memberReport += String.format("\n%d", rs.getInt("mem.mem_id"));
        memberReport += String.format("\n%s", rs.getString("mem.mem_addr"));
        memberReport += String.format("\n%s", rs.getString("mem.mem_city"));
        memberReport += String.format("\n%s", rs.getString("mem.mem_state"));
        memberReport += String.format("\n%s", rs.getInt("mem.mem_zip"));
        memberReport += "\nServices received:";
        do{
          memberReport += String.format("\n\t%s", rs.getDate("servhs.serv_dte"));
          memberReport += String.format("\n\t%s", rs.getString("prov.prov_name"));
          memberReport += String.format("\n%s", rs.getString("serv.serv_name"));
        }while(rs.next());
    }

    private void createManagerReport(ResultSet rs) {
        //@TODO format ResultSet to ManagerReport, then write to file
        if(!rs.next()){
          System.out.println("No report to generate.");
          return;
        }
        int numOfProv = 0,
            numOfConsul = 0,
            overallFeeTot = 0;
        while(rs.next()){
          String managerReport = String.format("%d", rs.getInt("prov.prov_id"));
          managerReport += String.format("\n%s", rs.getString("prov.prov_name"));
          managerReport += String.format("\n%s", rs.getInt("Consultations"));
          managerReport += String.format("\n%s", rs.getInt("TotalServFee"));
          numOfProv++;
          numOfConsul += rs.getInt("Consultations"));
          overallFeeTot += rs.getInt("TotalServFee"));
        }
        managerReport += String.format("\nTotal number of providers: %d", numOfProv);
        managerReport += String.format("\nTotal number of consultations: %d", numOfConsul);
        managerReport += String.format("\nTotal service fee: %d", overallFeeTot);
    }

    private void createProviderReport(ResultSet rs) {
        //TODO format ResultSet to ProviderReport, then write to file
        if(!rs.next()){
          System.out.println("No report to generate."));
          return;
        }
        int totalFee, totalConsultations;
        rs.next();
        String providerReport = rs.getString("prov.prov_name");
        providerReport += String.format("\n%d", rs.getInt("prov.prov_id"));
        providerReport += String.format("\n%s", rs.getString("prov.prov_addr"));
        providerReport += String.format("\n%s", rs.getString("prov.prov_city"));
        providerReport += String.format("\n%s", rs.getString("prov.prov_state"));
        providerReport += String.format("\n%s", rs.getInt("prov.prov_zip"));
        providerReport += "\nServices provided:";
        do{
          providerReport += String.format("\n\t%s", rs.getDate("servhs.serv_dte"));
          providerReport += String.format("\n\t%s", rs.getDate("servhs.tim_stmp"));
          providerReport += String.format("\n\t%s", rs.getString("mem.mem_name"));
          providerReport += String.format("\n\t%s", rs.getInt("serv.serv_id"));
          providerReport += String.format("\n\t%d", rs.getInt("servhs.serv_fee"));
          totalFee += rs.getInt("servhs.serv_fee"));
          totalConsultations++;
        }while(rs.next());
        providerReport += String.format("\nTotal number of consultations: %s", totalConsultations);
        providerReport += String.format("\nTotal fee for the week: %s", totalFee);
    }


}
