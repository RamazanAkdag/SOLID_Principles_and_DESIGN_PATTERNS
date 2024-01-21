package SoftwareDesign_and_Architecture.dersKodlar.Vize_Sonrasi_Design_Patterns.hafta_13_Bridge_Composite.Composite;

public class DesignerLeaf implements MemberComponent {
    String name;

    public DesignerLeaf(String name) {
        this.name = name;
    }

    @Override
    public void bilgiGetir() {
        System.out.println("My name is : " + name);
    }

}
