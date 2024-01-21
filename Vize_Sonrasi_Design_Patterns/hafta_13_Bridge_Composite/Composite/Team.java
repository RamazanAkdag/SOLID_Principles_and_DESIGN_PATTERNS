package SoftwareDesign_and_Architecture.dersKodlar.Vize_Sonrasi_Design_Patterns.hafta_13_Bridge_Composite.Composite;

import java.util.ArrayList;

public class Team implements MemberComponent {
    String name;
    public ArrayList<MemberComponent> teamMembers = new ArrayList<>();

    public Team(String name) {
        this.name = name;

    }

    @Override
    public void bilgiGetir() {
        System.out.println(name + " takımının kişileri : __________________________");
        for (MemberComponent memberComponent : teamMembers) {
            memberComponent.bilgiGetir();
        }
    }

}
