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
        //@TODO format ResultSet to MemberReport, then write to file
    }

    private void createManagerReport(ResultSet rs) {
        //@TODO format ResultSet to ManagerReport, then write to file
    }

    private void createProviderReport(ResultSet rs) {
        //TODO format ResultSet to ProviderReport, then write to file
    }


}
