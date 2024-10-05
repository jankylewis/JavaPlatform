package creationalPattern.builderPattern.sample2;

public class ClientComputer {

    public static void main(String[] args) {

        Computer gamingPC = new ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM("64GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .buildComputer();

        System.out.println(gamingPC);
    }
}
