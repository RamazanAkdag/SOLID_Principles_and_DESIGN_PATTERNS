package SoftwareDesign_and_Architecture.dersKodlar.Vize_Sonrasi_Design_Patterns.hafta_13_Bridge_Composite.Composite;

public class Test {
    public static void main(String[] args) {
        Team team = new Team("Root takim");
        team.teamMembers.add(new DevLeaf("Ramazan"));
        team.teamMembers.add(new DesignerLeaf("Selami"));
        team.teamMembers.add(new ManagerLeaf("Öykü"));
        Team team2 = new Team("Rootun cocugu tekim");
        team2.teamMembers.add(new DesignerLeaf("Mahmut"));
        team.teamMembers.add(team2);
        Team team3 = new Team("Rootun torunu takim");
        team3.teamMembers.add(new DesignerLeaf("Crazy"));
        team3.teamMembers.add(new DevLeaf("Beko"));
        team2.teamMembers.add(team3);

        team.bilgiGetir();

    }
}
