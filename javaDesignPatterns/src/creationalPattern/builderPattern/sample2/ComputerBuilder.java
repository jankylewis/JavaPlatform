package creationalPattern.builderPattern.sample2;

public class ComputerBuilder implements IComputerBuilder {

    protected String _cpu;
    protected String _ram;
    protected String _storage;
    protected String _gpu;

    @Override
    public ComputerBuilder setCPU(String cpu) {
        _cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setRAM(String ram) {
        _ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        _storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGPU(String gpu) {
        _gpu = gpu;
        return this;
    }

    @Override
    public Computer buildComputer() {
        return new Computer(this);
    }
}
