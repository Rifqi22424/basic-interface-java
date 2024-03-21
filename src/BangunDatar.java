

abstract public class BangunDatar {
    protected String name;

    public abstract double luas();
    public abstract double keliling();

    public void setName(String name) {
        this.name = name;
    }

    protected BangunDatar(String name) {
        this.setName(name);
    }

    public void getInfo(){
        System.out.println("Nama: " + name);
        System.out.println("Luas " + luas());
        System.out.println("Keliling " + keliling());
    }
}