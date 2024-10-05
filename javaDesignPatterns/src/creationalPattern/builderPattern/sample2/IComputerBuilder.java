package creationalPattern.builderPattern.sample2;

interface IComputerBuilder {
    IComputerBuilder setCPU(String cpu);
    IComputerBuilder setRAM(String ram);
    IComputerBuilder setStorage(String storage);
    IComputerBuilder setGPU(String gpu);
    Computer buildComputer();
}
